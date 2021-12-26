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
import org.openapitools.client.model.InflectedForm;
import org.openapitools.client.model.LexicalCategory;

/**
 * Description of an entry for a particular part of speech and grammatical features
 */
@ApiModel(description = "Description of an entry for a particular part of speech and grammatical features")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class InflectionLexicalEntry {
  public static final String SERIALIZED_NAME_GRAMMATICAL_FEATURES = "grammaticalFeatures";
  @SerializedName(SERIALIZED_NAME_GRAMMATICAL_FEATURES)
  private List<Object> grammaticalFeatures = null;

  public static final String SERIALIZED_NAME_INFLECTIONS = "inflections";
  @SerializedName(SERIALIZED_NAME_INFLECTIONS)
  private List<InflectedForm> inflections = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LEXICAL_CATEGORY = "lexicalCategory";
  @SerializedName(SERIALIZED_NAME_LEXICAL_CATEGORY)
  private LexicalCategory lexicalCategory;

  public InflectionLexicalEntry() { 
  }

  public InflectionLexicalEntry grammaticalFeatures(List<Object> grammaticalFeatures) {
    
    this.grammaticalFeatures = grammaticalFeatures;
    return this;
  }

  public InflectionLexicalEntry addGrammaticalFeaturesItem(Object grammaticalFeaturesItem) {
    if (this.grammaticalFeatures == null) {
      this.grammaticalFeatures = new ArrayList<Object>();
    }
    this.grammaticalFeatures.add(grammaticalFeaturesItem);
    return this;
  }

   /**
   * The different forms are correlated with meanings or functions which we text as &#39;features&#39;
   * @return grammaticalFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The different forms are correlated with meanings or functions which we text as 'features'")

  public List<Object> getGrammaticalFeatures() {
    return grammaticalFeatures;
  }


  public void setGrammaticalFeatures(List<Object> grammaticalFeatures) {
    this.grammaticalFeatures = grammaticalFeatures;
  }


  public InflectionLexicalEntry inflections(List<InflectedForm> inflections) {
    
    this.inflections = inflections;
    return this;
  }

  public InflectionLexicalEntry addInflectionsItem(InflectedForm inflectionsItem) {
    if (this.inflections == null) {
      this.inflections = new ArrayList<InflectedForm>();
    }
    this.inflections.add(inflectionsItem);
    return this;
  }

   /**
   * A list of inflected forms for a lexicalEntry.
   * @return inflections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of inflected forms for a lexicalEntry.")

  public List<InflectedForm> getInflections() {
    return inflections;
  }


  public void setInflections(List<InflectedForm> inflections) {
    this.inflections = inflections;
  }


  public InflectionLexicalEntry language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * IANA language code
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IANA language code")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public InflectionLexicalEntry lexicalCategory(LexicalCategory lexicalCategory) {
    
    this.lexicalCategory = lexicalCategory;
    return this;
  }

   /**
   * Get lexicalCategory
   * @return lexicalCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LexicalCategory getLexicalCategory() {
    return lexicalCategory;
  }


  public void setLexicalCategory(LexicalCategory lexicalCategory) {
    this.lexicalCategory = lexicalCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InflectionLexicalEntry inflectionLexicalEntry = (InflectionLexicalEntry) o;
    return Objects.equals(this.grammaticalFeatures, inflectionLexicalEntry.grammaticalFeatures) &&
        Objects.equals(this.inflections, inflectionLexicalEntry.inflections) &&
        Objects.equals(this.language, inflectionLexicalEntry.language) &&
        Objects.equals(this.lexicalCategory, inflectionLexicalEntry.lexicalCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grammaticalFeatures, inflections, language, lexicalCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InflectionLexicalEntry {\n");
    sb.append("    grammaticalFeatures: ").append(toIndentedString(grammaticalFeatures)).append("\n");
    sb.append("    inflections: ").append(toIndentedString(inflections)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lexicalCategory: ").append(toIndentedString(lexicalCategory)).append("\n");
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

