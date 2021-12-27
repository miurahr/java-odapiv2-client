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


package org.openapitools.client.model;

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
import org.openapitools.client.model.DomainClassesList;
import org.openapitools.client.model.DomainsList;
import org.openapitools.client.model.InflectedForm;
import org.openapitools.client.model.RegionsList;
import org.openapitools.client.model.RegistersList;
import org.openapitools.client.model.SemanticClassesList;
import org.openapitools.client.model.SenseConstructions;
import org.openapitools.client.model.ThesaurusLink;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element
 */
@ApiModel(description = "A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element")
@JsonPropertyOrder({
  Sense.JSON_PROPERTY_ANTONYMS,
  Sense.JSON_PROPERTY_CONSTRUCTIONS,
  Sense.JSON_PROPERTY_CROSS_REFERENCE_MARKERS,
  Sense.JSON_PROPERTY_CROSS_REFERENCES,
  Sense.JSON_PROPERTY_DEFINITIONS,
  Sense.JSON_PROPERTY_DOMAIN_CLASSES,
  Sense.JSON_PROPERTY_DOMAINS,
  Sense.JSON_PROPERTY_ETYMOLOGIES,
  Sense.JSON_PROPERTY_EXAMPLES,
  Sense.JSON_PROPERTY_ID,
  Sense.JSON_PROPERTY_INFLECTIONS,
  Sense.JSON_PROPERTY_NOTES,
  Sense.JSON_PROPERTY_PRONUNCIATIONS,
  Sense.JSON_PROPERTY_REGIONS,
  Sense.JSON_PROPERTY_REGISTERS,
  Sense.JSON_PROPERTY_SEMANTIC_CLASSES,
  Sense.JSON_PROPERTY_SHORT_DEFINITIONS,
  Sense.JSON_PROPERTY_SUBSENSES,
  Sense.JSON_PROPERTY_SYNONYMS,
  Sense.JSON_PROPERTY_THESAURUS_LINKS,
  Sense.JSON_PROPERTY_VARIANT_FORMS
})
@JsonTypeName("Sense")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T11:23:50.379+09:00[Asia/Tokyo]")
public class Sense {
  public static final String JSON_PROPERTY_ANTONYMS = "antonyms";
  private List<Object> antonyms = null;

  public static final String JSON_PROPERTY_CONSTRUCTIONS = "constructions";
  private List<SenseConstructions> constructions = null;

  public static final String JSON_PROPERTY_CROSS_REFERENCE_MARKERS = "crossReferenceMarkers";
  private List<String> crossReferenceMarkers = null;

  public static final String JSON_PROPERTY_CROSS_REFERENCES = "crossReferences";
  private List<Object> crossReferences = null;

  public static final String JSON_PROPERTY_DEFINITIONS = "definitions";
  private List<String> definitions = null;

  public static final String JSON_PROPERTY_DOMAIN_CLASSES = "domainClasses";
  private DomainClassesList domainClasses;

  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private DomainsList domains;

  public static final String JSON_PROPERTY_ETYMOLOGIES = "etymologies";
  private List<String> etymologies = null;

  public static final String JSON_PROPERTY_EXAMPLES = "examples";
  private List<Object> examples = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INFLECTIONS = "inflections";
  private List<InflectedForm> inflections = null;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private List<Object> notes = null;

  public static final String JSON_PROPERTY_PRONUNCIATIONS = "pronunciations";
  private List<Object> pronunciations = null;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private RegionsList regions;

  public static final String JSON_PROPERTY_REGISTERS = "registers";
  private RegistersList registers;

  public static final String JSON_PROPERTY_SEMANTIC_CLASSES = "semanticClasses";
  private SemanticClassesList semanticClasses;

  public static final String JSON_PROPERTY_SHORT_DEFINITIONS = "shortDefinitions";
  private List<String> shortDefinitions = null;

  public static final String JSON_PROPERTY_SUBSENSES = "subsenses";
  private List<Sense> subsenses = null;

  public static final String JSON_PROPERTY_SYNONYMS = "synonyms";
  private List<Object> synonyms = null;

  public static final String JSON_PROPERTY_THESAURUS_LINKS = "thesaurusLinks";
  private List<ThesaurusLink> thesaurusLinks = null;

  public static final String JSON_PROPERTY_VARIANT_FORMS = "variantForms";
  private List<Object> variantForms = null;

  public Sense() { 
  }

  public Sense antonyms(List<Object> antonyms) {
    
    this.antonyms = antonyms;
    return this;
  }

  public Sense addAntonymsItem(Object antonymsItem) {
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


  public Sense constructions(List<SenseConstructions> constructions) {
    
    this.constructions = constructions;
    return this;
  }

  public Sense addConstructionsItem(SenseConstructions constructionsItem) {
    if (this.constructions == null) {
      this.constructions = new ArrayList<>();
    }
    this.constructions.add(constructionsItem);
    return this;
  }

   /**
   * A construction provides information about typical syntax used of this sense. Each construction may optionally have one or more examples.
   * @return constructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A construction provides information about typical syntax used of this sense. Each construction may optionally have one or more examples.")
  @JsonProperty(JSON_PROPERTY_CONSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SenseConstructions> getConstructions() {
    return constructions;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstructions(List<SenseConstructions> constructions) {
    this.constructions = constructions;
  }


  public Sense crossReferenceMarkers(List<String> crossReferenceMarkers) {
    
    this.crossReferenceMarkers = crossReferenceMarkers;
    return this;
  }

  public Sense addCrossReferenceMarkersItem(String crossReferenceMarkersItem) {
    if (this.crossReferenceMarkers == null) {
      this.crossReferenceMarkers = new ArrayList<>();
    }
    this.crossReferenceMarkers.add(crossReferenceMarkersItem);
    return this;
  }

   /**
   * Get crossReferenceMarkers
   * @return crossReferenceMarkers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROSS_REFERENCE_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCrossReferenceMarkers() {
    return crossReferenceMarkers;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_REFERENCE_MARKERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossReferenceMarkers(List<String> crossReferenceMarkers) {
    this.crossReferenceMarkers = crossReferenceMarkers;
  }


  public Sense crossReferences(List<Object> crossReferences) {
    
    this.crossReferences = crossReferences;
    return this;
  }

  public Sense addCrossReferencesItem(Object crossReferencesItem) {
    if (this.crossReferences == null) {
      this.crossReferences = new ArrayList<>();
    }
    this.crossReferences.add(crossReferencesItem);
    return this;
  }

   /**
   * A reference to another word that is closely related, might provide additional information about the subject, has a variant spelling or is an abbreviated form of it.
   * @return crossReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A reference to another word that is closely related, might provide additional information about the subject, has a variant spelling or is an abbreviated form of it.")
  @JsonProperty(JSON_PROPERTY_CROSS_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getCrossReferences() {
    return crossReferences;
  }


  @JsonProperty(JSON_PROPERTY_CROSS_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossReferences(List<Object> crossReferences) {
    this.crossReferences = crossReferences;
  }


  public Sense definitions(List<String> definitions) {
    
    this.definitions = definitions;
    return this;
  }

  public Sense addDefinitionsItem(String definitionsItem) {
    if (this.definitions == null) {
      this.definitions = new ArrayList<>();
    }
    this.definitions.add(definitionsItem);
    return this;
  }

   /**
   * Get definitions
   * @return definitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDefinitions() {
    return definitions;
  }


  @JsonProperty(JSON_PROPERTY_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefinitions(List<String> definitions) {
    this.definitions = definitions;
  }


  public Sense domainClasses(DomainClassesList domainClasses) {
    
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


  public Sense domains(DomainsList domains) {
    
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


  public Sense etymologies(List<String> etymologies) {
    
    this.etymologies = etymologies;
    return this;
  }

  public Sense addEtymologiesItem(String etymologiesItem) {
    if (this.etymologies == null) {
      this.etymologies = new ArrayList<>();
    }
    this.etymologies.add(etymologiesItem);
    return this;
  }

   /**
   * Get etymologies
   * @return etymologies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ETYMOLOGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEtymologies() {
    return etymologies;
  }


  @JsonProperty(JSON_PROPERTY_ETYMOLOGIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtymologies(List<String> etymologies) {
    this.etymologies = etymologies;
  }


  public Sense examples(List<Object> examples) {
    
    this.examples = examples;
    return this;
  }

  public Sense addExamplesItem(Object examplesItem) {
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


  public Sense id(String id) {
    
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


  public Sense inflections(List<InflectedForm> inflections) {
    
    this.inflections = inflections;
    return this;
  }

  public Sense addInflectionsItem(InflectedForm inflectionsItem) {
    if (this.inflections == null) {
      this.inflections = new ArrayList<>();
    }
    this.inflections.add(inflectionsItem);
    return this;
  }

   /**
   * A list of inflected forms for a sense.
   * @return inflections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of inflected forms for a sense.")
  @JsonProperty(JSON_PROPERTY_INFLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InflectedForm> getInflections() {
    return inflections;
  }


  @JsonProperty(JSON_PROPERTY_INFLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInflections(List<InflectedForm> inflections) {
    this.inflections = inflections;
  }


  public Sense notes(List<Object> notes) {
    
    this.notes = notes;
    return this;
  }

  public Sense addNotesItem(Object notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * various types of notes that appear
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "various types of notes that appear")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getNotes() {
    return notes;
  }


  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotes(List<Object> notes) {
    this.notes = notes;
  }


  public Sense pronunciations(List<Object> pronunciations) {
    
    this.pronunciations = pronunciations;
    return this;
  }

  public Sense addPronunciationsItem(Object pronunciationsItem) {
    if (this.pronunciations == null) {
      this.pronunciations = new ArrayList<>();
    }
    this.pronunciations.add(pronunciationsItem);
    return this;
  }

   /**
   * A list of possible pronunciations of a word
   * @return pronunciations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of possible pronunciations of a word")
  @JsonProperty(JSON_PROPERTY_PRONUNCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getPronunciations() {
    return pronunciations;
  }


  @JsonProperty(JSON_PROPERTY_PRONUNCIATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPronunciations(List<Object> pronunciations) {
    this.pronunciations = pronunciations;
  }


  public Sense regions(RegionsList regions) {
    
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


  public Sense registers(RegistersList registers) {
    
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


  public Sense semanticClasses(SemanticClassesList semanticClasses) {
    
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


  public Sense shortDefinitions(List<String> shortDefinitions) {
    
    this.shortDefinitions = shortDefinitions;
    return this;
  }

  public Sense addShortDefinitionsItem(String shortDefinitionsItem) {
    if (this.shortDefinitions == null) {
      this.shortDefinitions = new ArrayList<>();
    }
    this.shortDefinitions.add(shortDefinitionsItem);
    return this;
  }

   /**
   * Get shortDefinitions
   * @return shortDefinitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHORT_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getShortDefinitions() {
    return shortDefinitions;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortDefinitions(List<String> shortDefinitions) {
    this.shortDefinitions = shortDefinitions;
  }


  public Sense subsenses(List<Sense> subsenses) {
    
    this.subsenses = subsenses;
    return this;
  }

  public Sense addSubsensesItem(Sense subsensesItem) {
    if (this.subsenses == null) {
      this.subsenses = new ArrayList<>();
    }
    this.subsenses.add(subsensesItem);
    return this;
  }

   /**
   * Ordered list of subsenses of a sense
   * @return subsenses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordered list of subsenses of a sense")
  @JsonProperty(JSON_PROPERTY_SUBSENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Sense> getSubsenses() {
    return subsenses;
  }


  @JsonProperty(JSON_PROPERTY_SUBSENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsenses(List<Sense> subsenses) {
    this.subsenses = subsenses;
  }


  public Sense synonyms(List<Object> synonyms) {
    
    this.synonyms = synonyms;
    return this;
  }

  public Sense addSynonymsItem(Object synonymsItem) {
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


  public Sense thesaurusLinks(List<ThesaurusLink> thesaurusLinks) {
    
    this.thesaurusLinks = thesaurusLinks;
    return this;
  }

  public Sense addThesaurusLinksItem(ThesaurusLink thesaurusLinksItem) {
    if (this.thesaurusLinks == null) {
      this.thesaurusLinks = new ArrayList<>();
    }
    this.thesaurusLinks.add(thesaurusLinksItem);
    return this;
  }

   /**
   * Ordered list of links to the Thesaurus Dictionary
   * @return thesaurusLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordered list of links to the Thesaurus Dictionary")
  @JsonProperty(JSON_PROPERTY_THESAURUS_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ThesaurusLink> getThesaurusLinks() {
    return thesaurusLinks;
  }


  @JsonProperty(JSON_PROPERTY_THESAURUS_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThesaurusLinks(List<ThesaurusLink> thesaurusLinks) {
    this.thesaurusLinks = thesaurusLinks;
  }


  public Sense variantForms(List<Object> variantForms) {
    
    this.variantForms = variantForms;
    return this;
  }

  public Sense addVariantFormsItem(Object variantFormsItem) {
    if (this.variantForms == null) {
      this.variantForms = new ArrayList<>();
    }
    this.variantForms.add(variantFormsItem);
    return this;
  }

   /**
   * Various words that are used interchangeably depending on the context, e.g &#39;aluminium&#39; and &#39;aluminum&#39;
   * @return variantForms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Various words that are used interchangeably depending on the context, e.g 'aluminium' and 'aluminum'")
  @JsonProperty(JSON_PROPERTY_VARIANT_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getVariantForms() {
    return variantForms;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT_FORMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariantForms(List<Object> variantForms) {
    this.variantForms = variantForms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sense sense = (Sense) o;
    return Objects.equals(this.antonyms, sense.antonyms) &&
        Objects.equals(this.constructions, sense.constructions) &&
        Objects.equals(this.crossReferenceMarkers, sense.crossReferenceMarkers) &&
        Objects.equals(this.crossReferences, sense.crossReferences) &&
        Objects.equals(this.definitions, sense.definitions) &&
        Objects.equals(this.domainClasses, sense.domainClasses) &&
        Objects.equals(this.domains, sense.domains) &&
        Objects.equals(this.etymologies, sense.etymologies) &&
        Objects.equals(this.examples, sense.examples) &&
        Objects.equals(this.id, sense.id) &&
        Objects.equals(this.inflections, sense.inflections) &&
        Objects.equals(this.notes, sense.notes) &&
        Objects.equals(this.pronunciations, sense.pronunciations) &&
        Objects.equals(this.regions, sense.regions) &&
        Objects.equals(this.registers, sense.registers) &&
        Objects.equals(this.semanticClasses, sense.semanticClasses) &&
        Objects.equals(this.shortDefinitions, sense.shortDefinitions) &&
        Objects.equals(this.subsenses, sense.subsenses) &&
        Objects.equals(this.synonyms, sense.synonyms) &&
        Objects.equals(this.thesaurusLinks, sense.thesaurusLinks) &&
        Objects.equals(this.variantForms, sense.variantForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antonyms, constructions, crossReferenceMarkers, crossReferences, definitions, domainClasses, domains, etymologies, examples, id, inflections, notes, pronunciations, regions, registers, semanticClasses, shortDefinitions, subsenses, synonyms, thesaurusLinks, variantForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sense {\n");
    sb.append("    antonyms: ").append(toIndentedString(antonyms)).append("\n");
    sb.append("    constructions: ").append(toIndentedString(constructions)).append("\n");
    sb.append("    crossReferenceMarkers: ").append(toIndentedString(crossReferenceMarkers)).append("\n");
    sb.append("    crossReferences: ").append(toIndentedString(crossReferences)).append("\n");
    sb.append("    definitions: ").append(toIndentedString(definitions)).append("\n");
    sb.append("    domainClasses: ").append(toIndentedString(domainClasses)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    etymologies: ").append(toIndentedString(etymologies)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inflections: ").append(toIndentedString(inflections)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    pronunciations: ").append(toIndentedString(pronunciations)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    semanticClasses: ").append(toIndentedString(semanticClasses)).append("\n");
    sb.append("    shortDefinitions: ").append(toIndentedString(shortDefinitions)).append("\n");
    sb.append("    subsenses: ").append(toIndentedString(subsenses)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
    sb.append("    thesaurusLinks: ").append(toIndentedString(thesaurusLinks)).append("\n");
    sb.append("    variantForms: ").append(toIndentedString(variantForms)).append("\n");
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

