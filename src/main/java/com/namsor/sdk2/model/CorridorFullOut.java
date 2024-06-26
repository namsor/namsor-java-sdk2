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
import com.namsor.sdk2.model.PersonalNameDiasporaedOut;
import com.namsor.sdk2.model.PersonalNameGenderedOut;
import com.namsor.sdk2.model.PersonalNameGeoOut;
import com.namsor.sdk2.model.PersonalNameOriginedOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represent multiple classifications for corridor sender and receiver (gender, country, origin, diaspora)
 */
@ApiModel(description = "Represent multiple classifications for corridor sender and receiver (gender, country, origin, diaspora)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class CorridorFullOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_GEO_FROM_GENDER = "personalNameGeoFromGender";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_GEO_FROM_GENDER)
  private PersonalNameGenderedOut personalNameGeoFromGender = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_GEO_TO_GENDER = "personalNameGeoToGender";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_GEO_TO_GENDER)
  private PersonalNameGenderedOut personalNameGeoToGender = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_ORIGINED_OUT = "PersonalNameOriginedOut";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_ORIGINED_OUT)
  private PersonalNameOriginedOut personalNameOriginedOut = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_GEO_FROM_COUNTRY = "personalNameGeoFromCountry";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_GEO_FROM_COUNTRY)
  private PersonalNameGeoOut personalNameGeoFromCountry = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_GEO_TO_COUNTRY = "personalNameGeoToCountry";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_GEO_TO_COUNTRY)
  private PersonalNameGeoOut personalNameGeoToCountry = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_DIASPORAED_OUT = "PersonalNameDiasporaedOut";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_DIASPORAED_OUT)
  private PersonalNameDiasporaedOut personalNameDiasporaedOut = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO_COUNTRY = "firstLastNameGeoToCountry";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO_COUNTRY)
  private PersonalNameGeoOut firstLastNameGeoToCountry = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM_COUNTRY = "firstLastNameGeoFromCountry";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM_COUNTRY)
  private PersonalNameGeoOut firstLastNameGeoFromCountry = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM_GENDER = "firstLastNameGeoFromGender";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM_GENDER)
  private PersonalNameGenderedOut firstLastNameGeoFromGender = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO_GENDER = "firstLastNameGeoToGender";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO_GENDER)
  private PersonalNameGenderedOut firstLastNameGeoToGender = null;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public CorridorFullOut id(String id) {
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

  public CorridorFullOut personalNameGeoFromGender(PersonalNameGenderedOut personalNameGeoFromGender) {
    this.personalNameGeoFromGender = personalNameGeoFromGender;
    return this;
  }

   /**
   * Get personalNameGeoFromGender
   * @return personalNameGeoFromGender
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGenderedOut getPersonalNameGeoFromGender() {
    return personalNameGeoFromGender;
  }

  public void setPersonalNameGeoFromGender(PersonalNameGenderedOut personalNameGeoFromGender) {
    this.personalNameGeoFromGender = personalNameGeoFromGender;
  }

  public CorridorFullOut personalNameGeoToGender(PersonalNameGenderedOut personalNameGeoToGender) {
    this.personalNameGeoToGender = personalNameGeoToGender;
    return this;
  }

   /**
   * Get personalNameGeoToGender
   * @return personalNameGeoToGender
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGenderedOut getPersonalNameGeoToGender() {
    return personalNameGeoToGender;
  }

  public void setPersonalNameGeoToGender(PersonalNameGenderedOut personalNameGeoToGender) {
    this.personalNameGeoToGender = personalNameGeoToGender;
  }

  public CorridorFullOut personalNameOriginedOut(PersonalNameOriginedOut personalNameOriginedOut) {
    this.personalNameOriginedOut = personalNameOriginedOut;
    return this;
  }

   /**
   * Get personalNameOriginedOut
   * @return personalNameOriginedOut
  **/
  @ApiModelProperty(value = "")
  public PersonalNameOriginedOut getPersonalNameOriginedOut() {
    return personalNameOriginedOut;
  }

  public void setPersonalNameOriginedOut(PersonalNameOriginedOut personalNameOriginedOut) {
    this.personalNameOriginedOut = personalNameOriginedOut;
  }

  public CorridorFullOut personalNameGeoFromCountry(PersonalNameGeoOut personalNameGeoFromCountry) {
    this.personalNameGeoFromCountry = personalNameGeoFromCountry;
    return this;
  }

   /**
   * Get personalNameGeoFromCountry
   * @return personalNameGeoFromCountry
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGeoOut getPersonalNameGeoFromCountry() {
    return personalNameGeoFromCountry;
  }

  public void setPersonalNameGeoFromCountry(PersonalNameGeoOut personalNameGeoFromCountry) {
    this.personalNameGeoFromCountry = personalNameGeoFromCountry;
  }

  public CorridorFullOut personalNameGeoToCountry(PersonalNameGeoOut personalNameGeoToCountry) {
    this.personalNameGeoToCountry = personalNameGeoToCountry;
    return this;
  }

   /**
   * Get personalNameGeoToCountry
   * @return personalNameGeoToCountry
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGeoOut getPersonalNameGeoToCountry() {
    return personalNameGeoToCountry;
  }

  public void setPersonalNameGeoToCountry(PersonalNameGeoOut personalNameGeoToCountry) {
    this.personalNameGeoToCountry = personalNameGeoToCountry;
  }

  public CorridorFullOut personalNameDiasporaedOut(PersonalNameDiasporaedOut personalNameDiasporaedOut) {
    this.personalNameDiasporaedOut = personalNameDiasporaedOut;
    return this;
  }

   /**
   * Get personalNameDiasporaedOut
   * @return personalNameDiasporaedOut
  **/
  @ApiModelProperty(value = "")
  public PersonalNameDiasporaedOut getPersonalNameDiasporaedOut() {
    return personalNameDiasporaedOut;
  }

  public void setPersonalNameDiasporaedOut(PersonalNameDiasporaedOut personalNameDiasporaedOut) {
    this.personalNameDiasporaedOut = personalNameDiasporaedOut;
  }

  public CorridorFullOut firstLastNameGeoToCountry(PersonalNameGeoOut firstLastNameGeoToCountry) {
    this.firstLastNameGeoToCountry = firstLastNameGeoToCountry;
    return this;
  }

   /**
   * Get firstLastNameGeoToCountry
   * @return firstLastNameGeoToCountry
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGeoOut getFirstLastNameGeoToCountry() {
    return firstLastNameGeoToCountry;
  }

  public void setFirstLastNameGeoToCountry(PersonalNameGeoOut firstLastNameGeoToCountry) {
    this.firstLastNameGeoToCountry = firstLastNameGeoToCountry;
  }

  public CorridorFullOut firstLastNameGeoFromCountry(PersonalNameGeoOut firstLastNameGeoFromCountry) {
    this.firstLastNameGeoFromCountry = firstLastNameGeoFromCountry;
    return this;
  }

   /**
   * Get firstLastNameGeoFromCountry
   * @return firstLastNameGeoFromCountry
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGeoOut getFirstLastNameGeoFromCountry() {
    return firstLastNameGeoFromCountry;
  }

  public void setFirstLastNameGeoFromCountry(PersonalNameGeoOut firstLastNameGeoFromCountry) {
    this.firstLastNameGeoFromCountry = firstLastNameGeoFromCountry;
  }

  public CorridorFullOut firstLastNameGeoFromGender(PersonalNameGenderedOut firstLastNameGeoFromGender) {
    this.firstLastNameGeoFromGender = firstLastNameGeoFromGender;
    return this;
  }

   /**
   * Get firstLastNameGeoFromGender
   * @return firstLastNameGeoFromGender
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGenderedOut getFirstLastNameGeoFromGender() {
    return firstLastNameGeoFromGender;
  }

  public void setFirstLastNameGeoFromGender(PersonalNameGenderedOut firstLastNameGeoFromGender) {
    this.firstLastNameGeoFromGender = firstLastNameGeoFromGender;
  }

  public CorridorFullOut firstLastNameGeoToGender(PersonalNameGenderedOut firstLastNameGeoToGender) {
    this.firstLastNameGeoToGender = firstLastNameGeoToGender;
    return this;
  }

   /**
   * Get firstLastNameGeoToGender
   * @return firstLastNameGeoToGender
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGenderedOut getFirstLastNameGeoToGender() {
    return firstLastNameGeoToGender;
  }

  public void setFirstLastNameGeoToGender(PersonalNameGenderedOut firstLastNameGeoToGender) {
    this.firstLastNameGeoToGender = firstLastNameGeoToGender;
  }

  public CorridorFullOut script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(value = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorridorFullOut corridorFullOut = (CorridorFullOut) o;
    return Objects.equals(this.id, corridorFullOut.id) &&
        Objects.equals(this.personalNameGeoFromGender, corridorFullOut.personalNameGeoFromGender) &&
        Objects.equals(this.personalNameGeoToGender, corridorFullOut.personalNameGeoToGender) &&
        Objects.equals(this.personalNameOriginedOut, corridorFullOut.personalNameOriginedOut) &&
        Objects.equals(this.personalNameGeoFromCountry, corridorFullOut.personalNameGeoFromCountry) &&
        Objects.equals(this.personalNameGeoToCountry, corridorFullOut.personalNameGeoToCountry) &&
        Objects.equals(this.personalNameDiasporaedOut, corridorFullOut.personalNameDiasporaedOut) &&
        Objects.equals(this.firstLastNameGeoToCountry, corridorFullOut.firstLastNameGeoToCountry) &&
        Objects.equals(this.firstLastNameGeoFromCountry, corridorFullOut.firstLastNameGeoFromCountry) &&
        Objects.equals(this.firstLastNameGeoFromGender, corridorFullOut.firstLastNameGeoFromGender) &&
        Objects.equals(this.firstLastNameGeoToGender, corridorFullOut.firstLastNameGeoToGender) &&
        Objects.equals(this.script, corridorFullOut.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personalNameGeoFromGender, personalNameGeoToGender, personalNameOriginedOut, personalNameGeoFromCountry, personalNameGeoToCountry, personalNameDiasporaedOut, firstLastNameGeoToCountry, firstLastNameGeoFromCountry, firstLastNameGeoFromGender, firstLastNameGeoToGender, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorridorFullOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personalNameGeoFromGender: ").append(toIndentedString(personalNameGeoFromGender)).append("\n");
    sb.append("    personalNameGeoToGender: ").append(toIndentedString(personalNameGeoToGender)).append("\n");
    sb.append("    personalNameOriginedOut: ").append(toIndentedString(personalNameOriginedOut)).append("\n");
    sb.append("    personalNameGeoFromCountry: ").append(toIndentedString(personalNameGeoFromCountry)).append("\n");
    sb.append("    personalNameGeoToCountry: ").append(toIndentedString(personalNameGeoToCountry)).append("\n");
    sb.append("    personalNameDiasporaedOut: ").append(toIndentedString(personalNameDiasporaedOut)).append("\n");
    sb.append("    firstLastNameGeoToCountry: ").append(toIndentedString(firstLastNameGeoToCountry)).append("\n");
    sb.append("    firstLastNameGeoFromCountry: ").append(toIndentedString(firstLastNameGeoFromCountry)).append("\n");
    sb.append("    firstLastNameGeoFromGender: ").append(toIndentedString(firstLastNameGeoFromGender)).append("\n");
    sb.append("    firstLastNameGeoToGender: ").append(toIndentedString(firstLastNameGeoToGender)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

