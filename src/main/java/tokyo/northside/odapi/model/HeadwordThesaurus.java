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
import tokyo.northside.odapi.model.ThesaurusLexicalEntry;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * description of thesaurus information of a word
 */
@ApiModel(description = "description of thesaurus information of a word")
@JsonPropertyOrder({
  HeadwordThesaurus.JSON_PROPERTY_ID,
  HeadwordThesaurus.JSON_PROPERTY_LANGUAGE,
  HeadwordThesaurus.JSON_PROPERTY_LEXICAL_ENTRIES,
  HeadwordThesaurus.JSON_PROPERTY_TYPE,
  HeadwordThesaurus.JSON_PROPERTY_WORD
})
@JsonTypeName("HeadwordThesaurus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class HeadwordThesaurus {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LEXICAL_ENTRIES = "lexicalEntries";
  private List<ThesaurusLexicalEntry> lexicalEntries = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_WORD = "word";
  private String word;

  public HeadwordThesaurus() { 
  }

  public HeadwordThesaurus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of a word
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identifier of a word")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public HeadwordThesaurus language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * IANA language code
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IANA language code")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public HeadwordThesaurus lexicalEntries(List<ThesaurusLexicalEntry> lexicalEntries) {
    
    this.lexicalEntries = lexicalEntries;
    return this;
  }

  public HeadwordThesaurus addLexicalEntriesItem(ThesaurusLexicalEntry lexicalEntriesItem) {
    this.lexicalEntries.add(lexicalEntriesItem);
    return this;
  }

   /**
   * A grouping of various senses in a specific language, and a lexical category that relates to a word
   * @return lexicalEntries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A grouping of various senses in a specific language, and a lexical category that relates to a word")
  @JsonProperty(JSON_PROPERTY_LEXICAL_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ThesaurusLexicalEntry> getLexicalEntries() {
    return lexicalEntries;
  }


  @JsonProperty(JSON_PROPERTY_LEXICAL_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLexicalEntries(List<ThesaurusLexicalEntry> lexicalEntries) {
    this.lexicalEntries = lexicalEntries;
  }


  public HeadwordThesaurus type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The json object type. Could be &#39;headword&#39;, &#39;inflection&#39; or &#39;phrase&#39;
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The json object type. Could be 'headword', 'inflection' or 'phrase'")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public HeadwordThesaurus word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * (DEPRECATED) A given written or spoken realisation of an entry, lowercased.
   * @return word
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "(DEPRECATED) A given written or spoken realisation of an entry, lowercased.")
  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWord() {
    return word;
  }


  @JsonProperty(JSON_PROPERTY_WORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWord(String word) {
    this.word = word;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeadwordThesaurus headwordThesaurus = (HeadwordThesaurus) o;
    return Objects.equals(this.id, headwordThesaurus.id) &&
        Objects.equals(this.language, headwordThesaurus.language) &&
        Objects.equals(this.lexicalEntries, headwordThesaurus.lexicalEntries) &&
        Objects.equals(this.type, headwordThesaurus.type) &&
        Objects.equals(this.word, headwordThesaurus.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, lexicalEntries, type, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeadwordThesaurus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lexicalEntries: ").append(toIndentedString(lexicalEntries)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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

