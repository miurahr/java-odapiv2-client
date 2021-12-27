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
import org.openapitools.client.model.HeadwordEntry;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Schema for the &#39;entries&#39; endpoints
 */
@ApiModel(description = "Schema for the 'entries' endpoints")
@JsonPropertyOrder({
  RetrieveEntry.JSON_PROPERTY_METADATA,
  RetrieveEntry.JSON_PROPERTY_RESULTS
})
@JsonTypeName("RetrieveEntry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T11:23:50.379+09:00[Asia/Tokyo]")
public class RetrieveEntry {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<HeadwordEntry> results = null;

  public RetrieveEntry() { 
  }

  public RetrieveEntry metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional Information provided by OUP
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional Information provided by OUP")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RetrieveEntry results(List<HeadwordEntry> results) {
    
    this.results = results;
    return this;
  }

  public RetrieveEntry addResultsItem(HeadwordEntry resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * A list of entries and all the data related to them
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of entries and all the data related to them")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HeadwordEntry> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<HeadwordEntry> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntry retrieveEntry = (RetrieveEntry) o;
    return Objects.equals(this.metadata, retrieveEntry.metadata) &&
        Objects.equals(this.results, retrieveEntry.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntry {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

