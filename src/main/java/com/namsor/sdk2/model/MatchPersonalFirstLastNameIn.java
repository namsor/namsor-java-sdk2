/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.30
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.namsor.sdk2.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.namsor.sdk2.model.FirstLastNameIn;
import com.namsor.sdk2.model.PersonalNameIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MatchPersonalFirstLastNameIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class MatchPersonalFirstLastNameIn {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME1 = "name1";
  @SerializedName(SERIALIZED_NAME_NAME1)
  private FirstLastNameIn name1 = null;

  public static final String SERIALIZED_NAME_NAME2 = "name2";
  @SerializedName(SERIALIZED_NAME_NAME2)
  private PersonalNameIn name2 = null;

  public MatchPersonalFirstLastNameIn id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MatchPersonalFirstLastNameIn name1(FirstLastNameIn name1) {
    this.name1 = name1;
    return this;
  }

   /**
   * Get name1
   * @return name1
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameIn getName1() {
    return name1;
  }

  public void setName1(FirstLastNameIn name1) {
    this.name1 = name1;
  }

  public MatchPersonalFirstLastNameIn name2(PersonalNameIn name2) {
    this.name2 = name2;
    return this;
  }

   /**
   * Get name2
   * @return name2
  **/
  @ApiModelProperty(value = "")
  public PersonalNameIn getName2() {
    return name2;
  }

  public void setName2(PersonalNameIn name2) {
    this.name2 = name2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchPersonalFirstLastNameIn matchPersonalFirstLastNameIn = (MatchPersonalFirstLastNameIn) o;
    return Objects.equals(this.id, matchPersonalFirstLastNameIn.id) &&
        Objects.equals(this.name1, matchPersonalFirstLastNameIn.name1) &&
        Objects.equals(this.name2, matchPersonalFirstLastNameIn.name2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name1, name2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchPersonalFirstLastNameIn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name1: ").append(toIndentedString(name1)).append("\n");
    sb.append("    name2: ").append(toIndentedString(name2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

