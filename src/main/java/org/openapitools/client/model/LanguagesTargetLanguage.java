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
 * Translation language of the results
 */
@ApiModel(description = "Translation language of the results")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T13:13:15.302+09:00[Asia/Tokyo]")
public class LanguagesTargetLanguage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public LanguagesTargetLanguage() { 
  }

  public LanguagesTargetLanguage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * IANA language code
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IANA language code")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LanguagesTargetLanguage language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language label.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language label.")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguagesTargetLanguage languagesTargetLanguage = (LanguagesTargetLanguage) o;
    return Objects.equals(this.id, languagesTargetLanguage.id) &&
        Objects.equals(this.language, languagesTargetLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguagesTargetLanguage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

