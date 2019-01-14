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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the output of inferring the LIKELY country of Origin from a personal name.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY country of Origin from a personal name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T10:14:57.526+01:00[Europe/Berlin]")
public class FirstLastNameOriginedOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_COUNTRY_ORIGIN = "countryOrigin";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ORIGIN)
  private String countryOrigin;

  public static final String SERIALIZED_NAME_COUNTRY_ORIGIN_ALT = "countryOriginAlt";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ORIGIN_ALT)
  private String countryOriginAlt;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_REGION_ORIGIN = "regionOrigin";
  @SerializedName(SERIALIZED_NAME_REGION_ORIGIN)
  private String regionOrigin;

  public static final String SERIALIZED_NAME_TOP_REGION_ORIGIN = "topRegionOrigin";
  @SerializedName(SERIALIZED_NAME_TOP_REGION_ORIGIN)
  private String topRegionOrigin;

  public static final String SERIALIZED_NAME_SUB_REGION_ORIGIN = "subRegionOrigin";
  @SerializedName(SERIALIZED_NAME_SUB_REGION_ORIGIN)
  private String subRegionOrigin;

  public FirstLastNameOriginedOut id(String id) {
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

  public FirstLastNameOriginedOut firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FirstLastNameOriginedOut lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public FirstLastNameOriginedOut countryOrigin(String countryOrigin) {
    this.countryOrigin = countryOrigin;
    return this;
  }

   /**
   * Most likely country of Origin
   * @return countryOrigin
  **/
  @ApiModelProperty(value = "Most likely country of Origin")
  public String getCountryOrigin() {
    return countryOrigin;
  }

  public void setCountryOrigin(String countryOrigin) {
    this.countryOrigin = countryOrigin;
  }

  public FirstLastNameOriginedOut countryOriginAlt(String countryOriginAlt) {
    this.countryOriginAlt = countryOriginAlt;
    return this;
  }

   /**
   * Second best alternative : country of Origin
   * @return countryOriginAlt
  **/
  @ApiModelProperty(value = "Second best alternative : country of Origin")
  public String getCountryOriginAlt() {
    return countryOriginAlt;
  }

  public void setCountryOriginAlt(String countryOriginAlt) {
    this.countryOriginAlt = countryOriginAlt;
  }

  public FirstLastNameOriginedOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Origin score value
   * @return score
  **/
  @ApiModelProperty(value = "Compatibility to NamSor_v1 Origin score value")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public FirstLastNameOriginedOut regionOrigin(String regionOrigin) {
    this.regionOrigin = regionOrigin;
    return this;
  }

   /**
   * Most likely region of Origin (based on countryOrigin ISO2 code)
   * @return regionOrigin
  **/
  @ApiModelProperty(value = "Most likely region of Origin (based on countryOrigin ISO2 code)")
  public String getRegionOrigin() {
    return regionOrigin;
  }

  public void setRegionOrigin(String regionOrigin) {
    this.regionOrigin = regionOrigin;
  }

  public FirstLastNameOriginedOut topRegionOrigin(String topRegionOrigin) {
    this.topRegionOrigin = topRegionOrigin;
    return this;
  }

   /**
   * Most likely region of Origin (based on countryOrigin ISO2 code)
   * @return topRegionOrigin
  **/
  @ApiModelProperty(value = "Most likely region of Origin (based on countryOrigin ISO2 code)")
  public String getTopRegionOrigin() {
    return topRegionOrigin;
  }

  public void setTopRegionOrigin(String topRegionOrigin) {
    this.topRegionOrigin = topRegionOrigin;
  }

  public FirstLastNameOriginedOut subRegionOrigin(String subRegionOrigin) {
    this.subRegionOrigin = subRegionOrigin;
    return this;
  }

   /**
   * Most likely region of Origin (based on countryOrigin ISO2 code)
   * @return subRegionOrigin
  **/
  @ApiModelProperty(value = "Most likely region of Origin (based on countryOrigin ISO2 code)")
  public String getSubRegionOrigin() {
    return subRegionOrigin;
  }

  public void setSubRegionOrigin(String subRegionOrigin) {
    this.subRegionOrigin = subRegionOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNameOriginedOut firstLastNameOriginedOut = (FirstLastNameOriginedOut) o;
    return Objects.equals(this.id, firstLastNameOriginedOut.id) &&
        Objects.equals(this.firstName, firstLastNameOriginedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameOriginedOut.lastName) &&
        Objects.equals(this.countryOrigin, firstLastNameOriginedOut.countryOrigin) &&
        Objects.equals(this.countryOriginAlt, firstLastNameOriginedOut.countryOriginAlt) &&
        Objects.equals(this.score, firstLastNameOriginedOut.score) &&
        Objects.equals(this.regionOrigin, firstLastNameOriginedOut.regionOrigin) &&
        Objects.equals(this.topRegionOrigin, firstLastNameOriginedOut.topRegionOrigin) &&
        Objects.equals(this.subRegionOrigin, firstLastNameOriginedOut.subRegionOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, countryOrigin, countryOriginAlt, score, regionOrigin, topRegionOrigin, subRegionOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameOriginedOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    countryOrigin: ").append(toIndentedString(countryOrigin)).append("\n");
    sb.append("    countryOriginAlt: ").append(toIndentedString(countryOriginAlt)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    regionOrigin: ").append(toIndentedString(regionOrigin)).append("\n");
    sb.append("    topRegionOrigin: ").append(toIndentedString(topRegionOrigin)).append("\n");
    sb.append("    subRegionOrigin: ").append(toIndentedString(subRegionOrigin)).append("\n");
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

