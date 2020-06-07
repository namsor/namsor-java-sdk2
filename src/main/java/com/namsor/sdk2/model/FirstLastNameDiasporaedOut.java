/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.10
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
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the output of inferring the LIKELY ethnicity from a personal name, given an country of residence.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY ethnicity from a personal name, given an country of residence.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-07T20:31:24.687+02:00[Europe/Berlin]")
public class FirstLastNameDiasporaedOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_ETHNICITY_ALT = "ethnicityAlt";
  @SerializedName(SERIALIZED_NAME_ETHNICITY_ALT)
  private String ethnicityAlt;

  public static final String SERIALIZED_NAME_ETHNICITY = "ethnicity";
  @SerializedName(SERIALIZED_NAME_ETHNICITY)
  private String ethnicity;

  public static final String SERIALIZED_NAME_LIFTED = "lifted";
  @SerializedName(SERIALIZED_NAME_LIFTED)
  private Boolean lifted;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public static final String SERIALIZED_NAME_ETHNICITIES_TOP = "ethnicitiesTop";
  @SerializedName(SERIALIZED_NAME_ETHNICITIES_TOP)
  private List<String> ethnicitiesTop = new ArrayList<String>();

  public FirstLastNameDiasporaedOut id(String id) {
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

  public FirstLastNameDiasporaedOut firstName(String firstName) {
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

  public FirstLastNameDiasporaedOut lastName(String lastName) {
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

  public FirstLastNameDiasporaedOut score(Double score) {
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

  public FirstLastNameDiasporaedOut ethnicityAlt(String ethnicityAlt) {
    this.ethnicityAlt = ethnicityAlt;
    return this;
  }

   /**
   * Get ethnicityAlt
   * @return ethnicityAlt
  **/
  @ApiModelProperty(value = "")
  public String getEthnicityAlt() {
    return ethnicityAlt;
  }

  public void setEthnicityAlt(String ethnicityAlt) {
    this.ethnicityAlt = ethnicityAlt;
  }

  public FirstLastNameDiasporaedOut ethnicity(String ethnicity) {
    this.ethnicity = ethnicity;
    return this;
  }

   /**
   * Get ethnicity
   * @return ethnicity
  **/
  @ApiModelProperty(value = "")
  public String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(String ethnicity) {
    this.ethnicity = ethnicity;
  }

  public FirstLastNameDiasporaedOut lifted(Boolean lifted) {
    this.lifted = lifted;
    return this;
  }

   /**
   * Get lifted
   * @return lifted
  **/
  @ApiModelProperty(value = "")
  public Boolean getLifted() {
    return lifted;
  }

  public void setLifted(Boolean lifted) {
    this.lifted = lifted;
  }

  public FirstLastNameDiasporaedOut countryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * Get countryIso2
   * @return countryIso2
  **/
  @ApiModelProperty(value = "")
  public String getCountryIso2() {
    return countryIso2;
  }

  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }

  public FirstLastNameDiasporaedOut ethnicitiesTop(List<String> ethnicitiesTop) {
    this.ethnicitiesTop = ethnicitiesTop;
    return this;
  }

  public FirstLastNameDiasporaedOut addEthnicitiesTopItem(String ethnicitiesTopItem) {
    if (this.ethnicitiesTop == null) {
      this.ethnicitiesTop = new ArrayList<String>();
    }
    this.ethnicitiesTop.add(ethnicitiesTopItem);
    return this;
  }

   /**
   * List ethnicities (top 10)
   * @return ethnicitiesTop
  **/
  @ApiModelProperty(value = "List ethnicities (top 10)")
  public List<String> getEthnicitiesTop() {
    return ethnicitiesTop;
  }

  public void setEthnicitiesTop(List<String> ethnicitiesTop) {
    this.ethnicitiesTop = ethnicitiesTop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNameDiasporaedOut firstLastNameDiasporaedOut = (FirstLastNameDiasporaedOut) o;
    return Objects.equals(this.id, firstLastNameDiasporaedOut.id) &&
        Objects.equals(this.firstName, firstLastNameDiasporaedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameDiasporaedOut.lastName) &&
        Objects.equals(this.score, firstLastNameDiasporaedOut.score) &&
        Objects.equals(this.ethnicityAlt, firstLastNameDiasporaedOut.ethnicityAlt) &&
        Objects.equals(this.ethnicity, firstLastNameDiasporaedOut.ethnicity) &&
        Objects.equals(this.lifted, firstLastNameDiasporaedOut.lifted) &&
        Objects.equals(this.countryIso2, firstLastNameDiasporaedOut.countryIso2) &&
        Objects.equals(this.ethnicitiesTop, firstLastNameDiasporaedOut.ethnicitiesTop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, score, ethnicityAlt, ethnicity, lifted, countryIso2, ethnicitiesTop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameDiasporaedOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    ethnicityAlt: ").append(toIndentedString(ethnicityAlt)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    lifted: ").append(toIndentedString(lifted)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
    sb.append("    ethnicitiesTop: ").append(toIndentedString(ethnicitiesTop)).append("\n");
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

