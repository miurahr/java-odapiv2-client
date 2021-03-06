/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tokyo.northside.odapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import tokyo.northside.odapi.model.DomainClassesList;
import tokyo.northside.odapi.model.DomainsList;
import tokyo.northside.odapi.model.RegionsList;
import tokyo.northside.odapi.model.RegistersList;
import tokyo.northside.odapi.model.SemanticClassesList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element
 */
@ApiModel(description = "A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element")
@JsonPropertyOrder({
  ThesaurusSense.JSON_PROPERTY_ANTONYMS,
  ThesaurusSense.JSON_PROPERTY_DOMAIN_CLASSES,
  ThesaurusSense.JSON_PROPERTY_DOMAINS,
  ThesaurusSense.JSON_PROPERTY_EXAMPLES,
  ThesaurusSense.JSON_PROPERTY_ID,
  ThesaurusSense.JSON_PROPERTY_REGIONS,
  ThesaurusSense.JSON_PROPERTY_REGISTERS,
  ThesaurusSense.JSON_PROPERTY_SEMANTIC_CLASSES,
  ThesaurusSense.JSON_PROPERTY_SUBSENSES,
  ThesaurusSense.JSON_PROPERTY_SYNONYMS
})
@JsonTypeName("ThesaurusSense")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class ThesaurusSense {
  public static final String JSON_PROPERTY_ANTONYMS = "antonyms";
  private List<Object> antonyms = null;

  public static final String JSON_PROPERTY_DOMAIN_CLASSES = "domainClasses";
  private DomainClassesList domainClasses;

  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private DomainsList domains;

  public static final String JSON_PROPERTY_EXAMPLES = "examples";
  private List<Object> examples = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private RegionsList regions;

  public static final String JSON_PROPERTY_REGISTERS = "registers";
  private RegistersList registers;

  public static final String JSON_PROPERTY_SEMANTIC_CLASSES = "semanticClasses";
  private SemanticClassesList semanticClasses;

  public static final String JSON_PROPERTY_SUBSENSES = "subsenses";
  private List<ThesaurusSense> subsenses = null;

  public static final String JSON_PROPERTY_SYNONYMS = "synonyms";
  private List<Object> synonyms = null;

  public ThesaurusSense() { 
  }

  public ThesaurusSense antonyms(List<Object> antonyms) {
    
    this.antonyms = antonyms;
    return this;
  }

  public ThesaurusSense addAntonymsItem(Object antonymsItem) {
    if (this.antonyms == null) {
      this.antonyms = new ArrayList<>();
    }
    this.antonyms.add(antonymsItem);
    return this;
  }

   /**
   * Get antonyms
   * @return antonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANTONYMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAntonyms() {
    return antonyms;
  }


  @JsonProperty(JSON_PROPERTY_ANTONYMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAntonyms(List<Object> antonyms) {
    this.antonyms = antonyms;
  }


  public ThesaurusSense domainClasses(DomainClassesList domainClasses) {
    
    this.domainClasses = domainClasses;
    return this;
  }

   /**
   * Get domainClasses
   * @return domainClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DomainClassesList getDomainClasses() {
    return domainClasses;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainClasses(DomainClassesList domainClasses) {
    this.domainClasses = domainClasses;
  }


  public ThesaurusSense domains(DomainsList domains) {
    
    this.domains = domains;
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DomainsList getDomains() {
    return domains;
  }


  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomains(DomainsList domains) {
    this.domains = domains;
  }


  public ThesaurusSense examples(List<Object> examples) {
    
    this.examples = examples;
    return this;
  }

  public ThesaurusSense addExamplesItem(Object examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * A list of written or spoken rendering of examples of use of a word or text
   * @return examples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of written or spoken rendering of examples of use of a word or text")
  @JsonProperty(JSON_PROPERTY_EXAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getExamples() {
    return examples;
  }


  @JsonProperty(JSON_PROPERTY_EXAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExamples(List<Object> examples) {
    this.examples = examples;
  }


  public ThesaurusSense id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the sense that is required for the delete procedure
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the sense that is required for the delete procedure")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ThesaurusSense regions(RegionsList regions) {
    
    this.regions = regions;
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegionsList getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(RegionsList regions) {
    this.regions = regions;
  }


  public ThesaurusSense registers(RegistersList registers) {
    
    this.registers = registers;
    return this;
  }

   /**
   * Get registers
   * @return registers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RegistersList getRegisters() {
    return registers;
  }


  @JsonProperty(JSON_PROPERTY_REGISTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegisters(RegistersList registers) {
    this.registers = registers;
  }


  public ThesaurusSense semanticClasses(SemanticClassesList semanticClasses) {
    
    this.semanticClasses = semanticClasses;
    return this;
  }

   /**
   * Get semanticClasses
   * @return semanticClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEMANTIC_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SemanticClassesList getSemanticClasses() {
    return semanticClasses;
  }


  @JsonProperty(JSON_PROPERTY_SEMANTIC_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSemanticClasses(SemanticClassesList semanticClasses) {
    this.semanticClasses = semanticClasses;
  }


  public ThesaurusSense subsenses(List<ThesaurusSense> subsenses) {
    
    this.subsenses = subsenses;
    return this;
  }

  public ThesaurusSense addSubsensesItem(ThesaurusSense subsensesItem) {
    if (this.subsenses == null) {
      this.subsenses = new ArrayList<>();
    }
    this.subsenses.add(subsensesItem);
    return this;
  }

   /**
   * subsenses of word
   * @return subsenses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "subsenses of word")
  @JsonProperty(JSON_PROPERTY_SUBSENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ThesaurusSense> getSubsenses() {
    return subsenses;
  }


  @JsonProperty(JSON_PROPERTY_SUBSENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsenses(List<ThesaurusSense> subsenses) {
    this.subsenses = subsenses;
  }


  public ThesaurusSense synonyms(List<Object> synonyms) {
    
    this.synonyms = synonyms;
    return this;
  }

  public ThesaurusSense addSynonymsItem(Object synonymsItem) {
    if (this.synonyms == null) {
      this.synonyms = new ArrayList<>();
    }
    this.synonyms.add(synonymsItem);
    return this;
  }

   /**
   * Get synonyms
   * @return synonyms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNONYMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSynonyms() {
    return synonyms;
  }


  @JsonProperty(JSON_PROPERTY_SYNONYMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSynonyms(List<Object> synonyms) {
    this.synonyms = synonyms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThesaurusSense thesaurusSense = (ThesaurusSense) o;
    return Objects.equals(this.antonyms, thesaurusSense.antonyms) &&
        Objects.equals(this.domainClasses, thesaurusSense.domainClasses) &&
        Objects.equals(this.domains, thesaurusSense.domains) &&
        Objects.equals(this.examples, thesaurusSense.examples) &&
        Objects.equals(this.id, thesaurusSense.id) &&
        Objects.equals(this.regions, thesaurusSense.regions) &&
        Objects.equals(this.registers, thesaurusSense.registers) &&
        Objects.equals(this.semanticClasses, thesaurusSense.semanticClasses) &&
        Objects.equals(this.subsenses, thesaurusSense.subsenses) &&
        Objects.equals(this.synonyms, thesaurusSense.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antonyms, domainClasses, domains, examples, id, regions, registers, semanticClasses, subsenses, synonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThesaurusSense {\n");
    sb.append("    antonyms: ").append(toIndentedString(antonyms)).append("\n");
    sb.append("    domainClasses: ").append(toIndentedString(domainClasses)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    semanticClasses: ").append(toIndentedString(semanticClasses)).append("\n");
    sb.append("    subsenses: ").append(toIndentedString(subsenses)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

