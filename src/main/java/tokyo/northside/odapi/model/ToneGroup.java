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
import tokyo.northside.odapi.model.ToneGroupTones;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * One or more encodings of a distinct tonal variation for a lexical item or its translation
 */
@ApiModel(description = "One or more encodings of a distinct tonal variation for a lexical item or its translation")
@JsonPropertyOrder({
  ToneGroup.JSON_PROPERTY_TONES
})
@JsonTypeName("ToneGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class ToneGroup {
  public static final String JSON_PROPERTY_TONES = "tones";
  private List<ToneGroupTones> tones = new ArrayList<>();

  public ToneGroup() { 
  }

  public ToneGroup tones(List<ToneGroupTones> tones) {
    
    this.tones = tones;
    return this;
  }

  public ToneGroup addTonesItem(ToneGroupTones tonesItem) {
    this.tones.add(tonesItem);
    return this;
  }

   /**
   * Get tones
   * @return tones
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ToneGroupTones> getTones() {
    return tones;
  }


  @JsonProperty(JSON_PROPERTY_TONES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTones(List<ToneGroupTones> tones) {
    this.tones = tones;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToneGroup toneGroup = (ToneGroup) o;
    return Objects.equals(this.tones, toneGroup.tones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToneGroup {\n");
    sb.append("    tones: ").append(toIndentedString(tones)).append("\n");
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

