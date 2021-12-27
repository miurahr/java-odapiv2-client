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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Description of found word
 */
@ApiModel(description = "Description of found word")
@JsonPropertyOrder({
  WordlistResults.JSON_PROPERTY_ID,
  WordlistResults.JSON_PROPERTY_MATCH_STRING,
  WordlistResults.JSON_PROPERTY_MATCH_TYPE,
  WordlistResults.JSON_PROPERTY_REGION,
  WordlistResults.JSON_PROPERTY_WORD
})
@JsonTypeName("Wordlist_results")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T11:23:50.379+09:00[Asia/Tokyo]")
public class WordlistResults {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MATCH_STRING = "matchString";
  private String matchString;

  public static final String JSON_PROPERTY_MATCH_TYPE = "matchType";
  private String matchType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_WORD = "word";
  private String word;

  public WordlistResults() { 
  }

  public WordlistResults id(String id) {
    
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


  public WordlistResults matchString(String matchString) {
    
    this.matchString = matchString;
    return this;
  }

   /**
   * Get matchString
   * @return matchString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchString() {
    return matchString;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchString(String matchString) {
    this.matchString = matchString;
  }


  public WordlistResults matchType(String matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchType() {
    return matchType;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }


  public WordlistResults region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Name of region.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of region.")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public WordlistResults word(String word) {
    
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
    WordlistResults wordlistResults = (WordlistResults) o;
    return Objects.equals(this.id, wordlistResults.id) &&
        Objects.equals(this.matchString, wordlistResults.matchString) &&
        Objects.equals(this.matchType, wordlistResults.matchType) &&
        Objects.equals(this.region, wordlistResults.region) &&
        Objects.equals(this.word, wordlistResults.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchString, matchType, region, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordlistResults {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchString: ").append(toIndentedString(matchString)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

