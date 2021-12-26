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
import org.openapitools.client.model.InflectionLexicalEntry;

/**
 * Description of an inflected form of a word
 */
@ApiModel(description = "Description of an inflected form of a word")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class HeadwordInflection {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LEXICAL_ENTRIES = "lexicalEntries";
  @SerializedName(SERIALIZED_NAME_LEXICAL_ENTRIES)
  private List<InflectionLexicalEntry> lexicalEntries = new ArrayList<InflectionLexicalEntry>();

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public HeadwordInflection() { 
  }

  public HeadwordInflection id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of a word
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of a word")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HeadwordInflection language(String language) {
    
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


  public HeadwordInflection lexicalEntries(List<InflectionLexicalEntry> lexicalEntries) {
    
    this.lexicalEntries = lexicalEntries;
    return this;
  }

  public HeadwordInflection addLexicalEntriesItem(InflectionLexicalEntry lexicalEntriesItem) {
    this.lexicalEntries.add(lexicalEntriesItem);
    return this;
  }

   /**
   * A grouping of various senses in a specific language, and a lexical category that relates to a word
   * @return lexicalEntries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A grouping of various senses in a specific language, and a lexical category that relates to a word")

  public List<InflectionLexicalEntry> getLexicalEntries() {
    return lexicalEntries;
  }


  public void setLexicalEntries(List<InflectionLexicalEntry> lexicalEntries) {
    this.lexicalEntries = lexicalEntries;
  }


  public HeadwordInflection text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * A given written or spoken realisation of an entry.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A given written or spoken realisation of an entry.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadwordInflection headwordInflection = (HeadwordInflection) o;
    return Objects.equals(this.id, headwordInflection.id) &&
        Objects.equals(this.language, headwordInflection.language) &&
        Objects.equals(this.lexicalEntries, headwordInflection.lexicalEntries) &&
        Objects.equals(this.text, headwordInflection.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, lexicalEntries, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadwordInflection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lexicalEntries: ").append(toIndentedString(lexicalEntries)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

