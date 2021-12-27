plugins {
    checkstyle
    jacoco
    signing
    `java-library`
    `java-library-distribution`
    `maven-publish`
    idea
    id("com.github.spotbugs") version "5.0.3"
    id("com.diffplug.spotless") version "6.0.5"
    id("com.github.kt3k.coveralls") version "2.12.0"
    id("org.sonatype.gradle.plugins.scan") version "2.2.2"
    id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id("org.openapi.generator") version "5.3.1"
}

group = "tokyo.northside"
version = "2.5.1"

java {
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger:swagger-annotations:1.5.22")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("org.apache.httpcomponents:httpmime:4.5.13")
    implementation("com.fasterxml.jackson.core:jackson-core:2.12.1")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.12.1")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.10.5.1")
    implementation("com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider:2.12.1")
    implementation("org.openapitools:jackson-databind-nullable:0.2.2")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.12.1")
    implementation("com.github.joschi.jackson:jackson-datatype-threetenbp:2.9.10")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")
    testImplementation("junit:junit:4.13.1")
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("$rootDir/odapi_v2_live.json")
    outputDir.set("$buildDir/generated/odapi_v2")
    configOptions.set(mapOf(
            "library" to "apache-httpclient",
            "apiPackage" to "tokyo.northside.odapi.v2"
    ))
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
