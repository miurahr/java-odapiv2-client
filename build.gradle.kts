import java.io.File
import java.io.FileInputStream
import java.util.Properties

plugins {
    groovy
    jacoco
    signing
    `java-library`
    `java-library-distribution`
    `maven-publish`
    idea
    id("com.github.spotbugs") version "5.0.9"
    id("com.diffplug.spotless") version "6.9.0"
    id("org.sonatype.gradle.plugins.scan") version "2.3.0"
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("org.openapi.generator") version "6.0.1"
    id("com.palantir.git-version") version "0.13.0"
}

fun getProps(f: File): Properties {
    val props = Properties()
    try {
        props.load(FileInputStream(f))
    } catch (t: Throwable) {
        println("Can't read $f: $t, assuming empty")
    }
    return props
}

val versionDetails: groovy.lang.Closure<com.palantir.gradle.gitversion.VersionDetails> by extra
val details = versionDetails()
val baseVersion = details.lastTag.substring(1)
if (details.isCleanTag) {  // release version
    version = baseVersion
} else {  // snapshot version
    version = baseVersion + "-" + details.commitDistance + "-" + details.gitHash + "-SNAPSHOT"
}

group = "tokyo.northside"

java {
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger:swagger-annotations:1.6.6")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("org.apache.httpcomponents:httpmime:4.5.13")
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.13.3")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.3")
    implementation("com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.13.3")
    implementation("org.openapitools:jackson-databind-nullable:0.2.4")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.3")
    implementation("com.github.joschi.jackson:jackson-datatype-threetenbp:2.9.10")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.codehaus.groovy:groovy-all:3.0.12")
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("$rootDir/odapi_v2_live.json")
    outputDir.set("$rootDir")
    configOptions.set(mapOf(
            "library" to "apache-httpclient",
            "apiPackage" to "tokyo.northside.odapi.v2",
            "modelPackage" to "tokyo.northside.odapi.model"
    ))
}
tasks.named<Test>("test") {
    useJUnitPlatform()
    onlyIf {
        project.hasProperty("oxfordKey") && project.hasProperty("oxfordId")
    }
}
publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name.set("Java ODAPI v2 client")
                description.set("Java client for Oxford Dictionaries API v2")
                url.set("https://github.com/miurahr/java-odapiv2-client")
                licenses {
                    license {
                        name.set("Apache License version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0")
                        distribution.set("repo")
                    }
                }
                developers {
                    developer {
                        id.set("miurahr")
                        name.set("Hiroshi Miura")
                        email.set("miurahr@linux.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/miurahr/java-odapiv2-client.git")
                    developerConnection.set("scm:git:git://github.com/miurahr/java-odapiv2-client.git")
                    url.set("https://github.com/miurahr/java-odapiv2-client")
                }
            }
        }
    }
}

signing {
    if (project.hasProperty("signingKey")) {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
    } else {
        useGpgCmd()
    }
    sign(publishing.publications["mavenJava"])
}
tasks.withType<Sign> {
    val hasKey = project.hasProperty("signingKey") || project.hasProperty("signing.gnupg.keyName")
    onlyIf { hasKey }
}

nexusPublishing {
    repositories {
        sonatype {
            username.set(System.getenv("SONATYPE_USER"))
            password.set(System.getenv("SONATYPE_PASS"))
        }
    }
}

spotbugs {
    excludeFilter.set(project.file("config/spotbugs/exclude.xml"))
    tasks.spotbugsMain {
        reports.create("html") {
            required.set(true)
        }
    }
    tasks.spotbugsTest {
        reports.create("html") {
            required.set(true)
        }
    }
}
