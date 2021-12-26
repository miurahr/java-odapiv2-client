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
 * Link to a sense
 */
@ApiModel(description = "Link to a sense")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class SenseLink {
  public static final String SERIALIZED_NAME_ENTRY_ID = "entry_id";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private String entryId;

  public static final String SERIALIZED_NAME_SENSE_ID = "sense_id";
  @SerializedName(SERIALIZED_NAME_SENSE_ID)
  private String senseId;

  public SenseLink() { 
  }

  public SenseLink entryId(String entryId) {
    
    this.entryId = entryId;
    return this;
  }

   /**
   * identifier of a word
   * @return entryId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "identifier of a word")

  public String getEntryId() {
    return entryId;
  }


  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }


  public SenseLink senseId(String senseId) {
    
    this.senseId = senseId;
    return this;
  }

   /**
   * identifier of a sense
   * @return senseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "identifier of a sense")

  public String getSenseId() {
    return senseId;
  }


  public void setSenseId(String senseId) {
    this.senseId = senseId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenseLink senseLink = (SenseLink) o;
    return Objects.equals(this.entryId, senseLink.entryId) &&
        Objects.equals(this.senseId, senseLink.senseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, senseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenseLink {\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    senseId: ").append(toIndentedString(senseId)).append("\n");
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

