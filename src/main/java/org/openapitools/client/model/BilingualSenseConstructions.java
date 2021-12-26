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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.DomainsList;
import org.openapitools.client.model.RegionsList;
import org.openapitools.client.model.RegistersList;

/**
 * BilingualSenseConstructions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class BilingualSenseConstructions {
  public static final String SERIALIZED_NAME_DOMAINS = "domains";
  @SerializedName(SERIALIZED_NAME_DOMAINS)
  private DomainsList domains;

  public static final String SERIALIZED_NAME_EXAMPLES = "examples";
  @SerializedName(SERIALIZED_NAME_EXAMPLES)
  private List<List<String>> examples = null;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<Object> notes = null;

  public static final String SERIALIZED_NAME_REGIONS = "regions";
  @SerializedName(SERIALIZED_NAME_REGIONS)
  private RegionsList regions;

  public static final String SERIALIZED_NAME_REGISTERS = "registers";
  @SerializedName(SERIALIZED_NAME_REGISTERS)
  private RegistersList registers;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private List<Object> translations = null;

  public BilingualSenseConstructions() { 
  }

  public BilingualSenseConstructions domains(DomainsList domains) {
    
    this.domains = domains;
    return this;
  }

   /**
   * Get domains
   * @return domains
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DomainsList getDomains() {
    return domains;
  }


  public void setDomains(DomainsList domains) {
    this.domains = domains;
  }


  public BilingualSenseConstructions examples(List<List<String>> examples) {
    
    this.examples = examples;
    return this;
  }

  public BilingualSenseConstructions addExamplesItem(List<String> examplesItem) {
    if (this.examples == null) {
      this.examples = new ArrayList<List<String>>();
    }
    this.examples.add(examplesItem);
    return this;
  }

   /**
   * Get examples
   * @return examples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<String>> getExamples() {
    return examples;
  }


  public void setExamples(List<List<String>> examples) {
    this.examples = examples;
  }


  public BilingualSenseConstructions notes(List<Object> notes) {
    
    this.notes = notes;
    return this;
  }

  public BilingualSenseConstructions addNotesItem(Object notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Object>();
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

  public List<Object> getNotes() {
    return notes;
  }


  public void setNotes(List<Object> notes) {
    this.notes = notes;
  }


  public BilingualSenseConstructions regions(RegionsList regions) {
    
    this.regions = regions;
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RegionsList getRegions() {
    return regions;
  }


  public void setRegions(RegionsList regions) {
    this.regions = regions;
  }


  public BilingualSenseConstructions registers(RegistersList registers) {
    
    this.registers = registers;
    return this;
  }

   /**
   * Get registers
   * @return registers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RegistersList getRegisters() {
    return registers;
  }


  public void setRegisters(RegistersList registers) {
    this.registers = registers;
  }


  public BilingualSenseConstructions text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The construction text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The construction text")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public BilingualSenseConstructions translations(List<Object> translations) {
    
    this.translations = translations;
    return this;
  }

  public BilingualSenseConstructions addTranslationsItem(Object translationsItem) {
    if (this.translations == null) {
      this.translations = new ArrayList<Object>();
    }
    this.translations.add(translationsItem);
    return this;
  }

   /**
   * A list of written or spoken rendering of the meaning of a word or text in another language(s)
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of written or spoken rendering of the meaning of a word or text in another language(s)")

  public List<Object> getTranslations() {
    return translations;
  }


  public void setTranslations(List<Object> translations) {
    this.translations = translations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BilingualSenseConstructions bilingualSenseConstructions = (BilingualSenseConstructions) o;
    return Objects.equals(this.domains, bilingualSenseConstructions.domains) &&
        Objects.equals(this.examples, bilingualSenseConstructions.examples) &&
        Objects.equals(this.notes, bilingualSenseConstructions.notes) &&
        Objects.equals(this.regions, bilingualSenseConstructions.regions) &&
        Objects.equals(this.registers, bilingualSenseConstructions.registers) &&
        Objects.equals(this.text, bilingualSenseConstructions.text) &&
        Objects.equals(this.translations, bilingualSenseConstructions.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, examples, notes, regions, registers, text, translations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BilingualSenseConstructions {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    examples: ").append(toIndentedString(examples)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    registers: ").append(toIndentedString(registers)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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

