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
import tokyo.northside.odapi.model.LexicalCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Description of an entry for a particular part of speech
 */
@ApiModel(description = "Description of an entry for a particular part of speech")
@JsonPropertyOrder({
  SentencesLexicalEntry.JSON_PROPERTY_GRAMMATICAL_FEATURES,
  SentencesLexicalEntry.JSON_PROPERTY_LANGUAGE,
  SentencesLexicalEntry.JSON_PROPERTY_LEXICAL_CATEGORY,
  SentencesLexicalEntry.JSON_PROPERTY_SENTENCES,
  SentencesLexicalEntry.JSON_PROPERTY_TEXT
})
@JsonTypeName("SentencesLexicalEntry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class SentencesLexicalEntry {
  public static final String JSON_PROPERTY_GRAMMATICAL_FEATURES = "grammaticalFeatures";
  private List<Object> grammaticalFeatures = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LEXICAL_CATEGORY = "lexicalCategory";
  private LexicalCategory lexicalCategory;

  public static final String JSON_PROPERTY_SENTENCES = "sentences";
  private List<Object> sentences = new ArrayList<>();

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public SentencesLexicalEntry() { 
  }

  public SentencesLexicalEntry grammaticalFeatures(List<Object> grammaticalFeatures) {
    
    this.grammaticalFeatures = grammaticalFeatures;
    return this;
  }

  public SentencesLexicalEntry addGrammaticalFeaturesItem(Object grammaticalFeaturesItem) {
    if (this.grammaticalFeatures == null) {
      this.grammaticalFeatures = new ArrayList<>();
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
  @JsonProperty(JSON_PROPERTY_GRAMMATICAL_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getGrammaticalFeatures() {
    return grammaticalFeatures;
  }


  @JsonProperty(JSON_PROPERTY_GRAMMATICAL_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrammaticalFeatures(List<Object> grammaticalFeatures) {
    this.grammaticalFeatures = grammaticalFeatures;
  }


  public SentencesLexicalEntry language(String language) {
    
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


  public SentencesLexicalEntry lexicalCategory(LexicalCategory lexicalCategory) {
    
    this.lexicalCategory = lexicalCategory;
    return this;
  }

   /**
   * Get lexicalCategory
   * @return lexicalCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEXICAL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LexicalCategory getLexicalCategory() {
    return lexicalCategory;
  }


  @JsonProperty(JSON_PROPERTY_LEXICAL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLexicalCategory(LexicalCategory lexicalCategory) {
    this.lexicalCategory = lexicalCategory;
  }


  public SentencesLexicalEntry sentences(List<Object> sentences) {
    
    this.sentences = sentences;
    return this;
  }

  public SentencesLexicalEntry addSentencesItem(Object sentencesItem) {
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * A list of written or spoken rendering of examples of use of a word or text
   * @return sentences
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of written or spoken rendering of examples of use of a word or text")
  @JsonProperty(JSON_PROPERTY_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getSentences() {
    return sentences;
  }


  @JsonProperty(JSON_PROPERTY_SENTENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSentences(List<Object> sentences) {
    this.sentences = sentences;
  }


  public SentencesLexicalEntry text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * A given written or spoken realisation of an entry.
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A given written or spoken realisation of an entry.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    SentencesLexicalEntry sentencesLexicalEntry = (SentencesLexicalEntry) o;
    return Objects.equals(this.grammaticalFeatures, sentencesLexicalEntry.grammaticalFeatures) &&
        Objects.equals(this.language, sentencesLexicalEntry.language) &&
        Objects.equals(this.lexicalCategory, sentencesLexicalEntry.lexicalCategory) &&
        Objects.equals(this.sentences, sentencesLexicalEntry.sentences) &&
        Objects.equals(this.text, sentencesLexicalEntry.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grammaticalFeatures, language, lexicalCategory, sentences, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SentencesLexicalEntry {\n");
    sb.append("    grammaticalFeatures: ").append(toIndentedString(grammaticalFeatures)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lexicalCategory: ").append(toIndentedString(lexicalCategory)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
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

