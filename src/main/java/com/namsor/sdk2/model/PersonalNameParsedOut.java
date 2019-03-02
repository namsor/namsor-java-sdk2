/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 1000 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.2-beta
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
import com.namsor.sdk2.model.FirstLastNameOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersonalNameParsedOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-02T02:26:05.074+01:00[Europe/Berlin]")
public class PersonalNameParsedOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_PARSER_TYPE = "nameParserType";
  @SerializedName(SERIALIZED_NAME_NAME_PARSER_TYPE)
  private String nameParserType;

  public static final String SERIALIZED_NAME_NAME_PARSER_TYPE_ALT = "nameParserTypeAlt";
  @SerializedName(SERIALIZED_NAME_NAME_PARSER_TYPE_ALT)
  private String nameParserTypeAlt;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME = "firstLastName";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME)
  private FirstLastNameOut firstLastName = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public PersonalNameParsedOut id(String id) {
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

  public PersonalNameParsedOut name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalNameParsedOut nameParserType(String nameParserType) {
    this.nameParserType = nameParserType;
    return this;
  }

   /**
   * Get nameParserType
   * @return nameParserType
  **/
  @ApiModelProperty(value = "")
  public String getNameParserType() {
    return nameParserType;
  }

  public void setNameParserType(String nameParserType) {
    this.nameParserType = nameParserType;
  }

  public PersonalNameParsedOut nameParserTypeAlt(String nameParserTypeAlt) {
    this.nameParserTypeAlt = nameParserTypeAlt;
    return this;
  }

   /**
   * Get nameParserTypeAlt
   * @return nameParserTypeAlt
  **/
  @ApiModelProperty(value = "")
  public String getNameParserTypeAlt() {
    return nameParserTypeAlt;
  }

  public void setNameParserTypeAlt(String nameParserTypeAlt) {
    this.nameParserTypeAlt = nameParserTypeAlt;
  }

  public PersonalNameParsedOut firstLastName(FirstLastNameOut firstLastName) {
    this.firstLastName = firstLastName;
    return this;
  }

   /**
   * Get firstLastName
   * @return firstLastName
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameOut getFirstLastName() {
    return firstLastName;
  }

  public void setFirstLastName(FirstLastNameOut firstLastName) {
    this.firstLastName = firstLastName;
  }

  public PersonalNameParsedOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameParsedOut personalNameParsedOut = (PersonalNameParsedOut) o;
    return Objects.equals(this.id, personalNameParsedOut.id) &&
        Objects.equals(this.name, personalNameParsedOut.name) &&
        Objects.equals(this.nameParserType, personalNameParsedOut.nameParserType) &&
        Objects.equals(this.nameParserTypeAlt, personalNameParsedOut.nameParserTypeAlt) &&
        Objects.equals(this.firstLastName, personalNameParsedOut.firstLastName) &&
        Objects.equals(this.score, personalNameParsedOut.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nameParserType, nameParserTypeAlt, firstLastName, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameParsedOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameParserType: ").append(toIndentedString(nameParserType)).append("\n");
    sb.append("    nameParserTypeAlt: ").append(toIndentedString(nameParserTypeAlt)).append("\n");
    sb.append("    firstLastName: ").append(toIndentedString(firstLastName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
