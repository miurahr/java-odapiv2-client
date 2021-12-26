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
import org.openapitools.client.model.LanguagesResults;

/**
 * Schema for the languages endpoint.
 */
@ApiModel(description = "Schema for the languages endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class Languages {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<LanguagesResults> results = null;

  public Languages() { 
  }

  public Languages metadata(Object metadata) {
    
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


  public Languages results(List<LanguagesResults> results) {
    
    this.results = results;
    return this;
  }

  public Languages addResultsItem(LanguagesResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<LanguagesResults>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * A list of languages available.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of languages available.")

  public List<LanguagesResults> getResults() {
    return results;
  }


  public void setResults(List<LanguagesResults> results) {
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
    Languages languages = (Languages) o;
    return Objects.equals(this.metadata, languages.metadata) &&
        Objects.equals(this.results, languages.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Languages {\n");
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

