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
 * PersonalNameGeoOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T10:34:07.082+01:00[Europe/Berlin]")
public class PersonalNameGeoOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_ALT = "countryAlt";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ALT)
  private String countryAlt;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_TOP_REGION = "topRegion";
  @SerializedName(SERIALIZED_NAME_TOP_REGION)
  private String topRegion;

  public static final String SERIALIZED_NAME_SUB_REGION = "subRegion";
  @SerializedName(SERIALIZED_NAME_SUB_REGION)
  private String subRegion;

  public PersonalNameGeoOut id(String id) {
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

  public PersonalNameGeoOut name(String name) {
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

  public PersonalNameGeoOut score(Double score) {
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

  public PersonalNameGeoOut country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public PersonalNameGeoOut countryAlt(String countryAlt) {
    this.countryAlt = countryAlt;
    return this;
  }

   /**
   * Get countryAlt
   * @return countryAlt
  **/
  @ApiModelProperty(value = "")
  public String getCountryAlt() {
    return countryAlt;
  }

  public void setCountryAlt(String countryAlt) {
    this.countryAlt = countryAlt;
  }

  public PersonalNameGeoOut region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public PersonalNameGeoOut topRegion(String topRegion) {
    this.topRegion = topRegion;
    return this;
  }

   /**
   * Get topRegion
   * @return topRegion
  **/
  @ApiModelProperty(value = "")
  public String getTopRegion() {
    return topRegion;
  }

  public void setTopRegion(String topRegion) {
    this.topRegion = topRegion;
  }

  public PersonalNameGeoOut subRegion(String subRegion) {
    this.subRegion = subRegion;
    return this;
  }

   /**
   * Get subRegion
   * @return subRegion
  **/
  @ApiModelProperty(value = "")
  public String getSubRegion() {
    return subRegion;
  }

  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameGeoOut personalNameGeoOut = (PersonalNameGeoOut) o;
    return Objects.equals(this.id, personalNameGeoOut.id) &&
        Objects.equals(this.name, personalNameGeoOut.name) &&
        Objects.equals(this.score, personalNameGeoOut.score) &&
        Objects.equals(this.country, personalNameGeoOut.country) &&
        Objects.equals(this.countryAlt, personalNameGeoOut.countryAlt) &&
        Objects.equals(this.region, personalNameGeoOut.region) &&
        Objects.equals(this.topRegion, personalNameGeoOut.topRegion) &&
        Objects.equals(this.subRegion, personalNameGeoOut.subRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, score, country, countryAlt, region, topRegion, subRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameGeoOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryAlt: ").append(toIndentedString(countryAlt)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    topRegion: ").append(toIndentedString(topRegion)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
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

