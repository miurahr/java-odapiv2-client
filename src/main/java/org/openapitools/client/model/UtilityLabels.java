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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.UtilityLabelsResults;

/**
 * Schema for lexicalcategories, registers utility endpoints.
 */
@ApiModel(description = "Schema for lexicalcategories, registers utility endpoints.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class UtilityLabels {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private Map<String, UtilityLabelsResults> results = null;

  public UtilityLabels() { 
  }

  public UtilityLabels metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Additional Information provided by OUP
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional Information provided by OUP")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public UtilityLabels results(Map<String, UtilityLabelsResults> results) {
    
    this.results = results;
    return this;
  }

  public UtilityLabels putResultsItem(String key, UtilityLabelsResults resultsItem) {
    if (this.results == null) {
      this.results = new HashMap<String, UtilityLabelsResults>();
    }
    this.results.put(key, resultsItem);
    return this;
  }

   /**
   * Mapping of labels available.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mapping of labels available.")

  public Map<String, UtilityLabelsResults> getResults() {
    return results;
  }


  public void setResults(Map<String, UtilityLabelsResults> results) {
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
    UtilityLabels utilityLabels = (UtilityLabels) o;
    return Objects.equals(this.metadata, utilityLabels.metadata) &&
        Objects.equals(this.results, utilityLabels.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilityLabels {\n");
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

