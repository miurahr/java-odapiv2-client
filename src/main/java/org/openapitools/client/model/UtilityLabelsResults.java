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

/**
 * the list of labels for an object. Every object can be a lexical category, or a register, or a domain.
 */
@ApiModel(description = "the list of labels for an object. Every object can be a lexical category, or a register, or a domain.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class UtilityLabelsResults {
  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private String en;

  public UtilityLabelsResults() { 
  }

  public UtilityLabelsResults en(String en) {
    
    this.en = en;
    return this;
  }

   /**
   * Label in English
   * @return en
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label in English")

  public String getEn() {
    return en;
  }


  public void setEn(String en) {
    this.en = en;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtilityLabelsResults utilityLabelsResults = (UtilityLabelsResults) o;
    return Objects.equals(this.en, utilityLabelsResults.en);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtilityLabelsResults {\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
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

