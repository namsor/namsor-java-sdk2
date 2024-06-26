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
import com.namsor.sdk2.model.PersonalNameUSRaceEthnicityOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represent multiple classifications for community engagement (gender, country, origin, diaspora)
 */
@ApiModel(description = "Represent multiple classifications for community engagement (gender, country, origin, diaspora)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class CommunityEngageOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_DIASPORAED_OUT = "PersonalNameDiasporaedOut";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_DIASPORAED_OUT)
  private PersonalNameDiasporaedOut personalNameDiasporaedOut = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_ORIGINED_OUT = "PersonalNameOriginedOut";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_ORIGINED_OUT)
  private PersonalNameOriginedOut personalNameOriginedOut = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private PersonalNameGeoOut country = null;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private PersonalNameGenderedOut gender = null;

  public static final String SERIALIZED_NAME_PERSONAL_NAME_U_S_RACE_ETHNICITY_OUT = "PersonalNameUSRaceEthnicityOut";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAME_U_S_RACE_ETHNICITY_OUT)
  private PersonalNameUSRaceEthnicityOut personalNameUSRaceEthnicityOut = null;

  public static final String SERIALIZED_NAME_PRIME = "prime";
  @SerializedName(SERIALIZED_NAME_PRIME)
  private Boolean prime;

  public static final String SERIALIZED_NAME_SCOPED = "scoped";
  @SerializedName(SERIALIZED_NAME_SCOPED)
  private Boolean scoped;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public CommunityEngageOut id(String id) {
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

  public CommunityEngageOut personalNameDiasporaedOut(PersonalNameDiasporaedOut personalNameDiasporaedOut) {
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

  public CommunityEngageOut personalNameOriginedOut(PersonalNameOriginedOut personalNameOriginedOut) {
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

  public CommunityEngageOut country(PersonalNameGeoOut country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGeoOut getCountry() {
    return country;
  }

  public void setCountry(PersonalNameGeoOut country) {
    this.country = country;
  }

  public CommunityEngageOut gender(PersonalNameGenderedOut gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public PersonalNameGenderedOut getGender() {
    return gender;
  }

  public void setGender(PersonalNameGenderedOut gender) {
    this.gender = gender;
  }

  public CommunityEngageOut personalNameUSRaceEthnicityOut(PersonalNameUSRaceEthnicityOut personalNameUSRaceEthnicityOut) {
    this.personalNameUSRaceEthnicityOut = personalNameUSRaceEthnicityOut;
    return this;
  }

   /**
   * Get personalNameUSRaceEthnicityOut
   * @return personalNameUSRaceEthnicityOut
  **/
  @ApiModelProperty(value = "")
  public PersonalNameUSRaceEthnicityOut getPersonalNameUSRaceEthnicityOut() {
    return personalNameUSRaceEthnicityOut;
  }

  public void setPersonalNameUSRaceEthnicityOut(PersonalNameUSRaceEthnicityOut personalNameUSRaceEthnicityOut) {
    this.personalNameUSRaceEthnicityOut = personalNameUSRaceEthnicityOut;
  }

  public CommunityEngageOut prime(Boolean prime) {
    this.prime = prime;
    return this;
  }

   /**
   * Get prime
   * @return prime
  **/
  @ApiModelProperty(value = "")
  public Boolean getPrime() {
    return prime;
  }

  public void setPrime(Boolean prime) {
    this.prime = prime;
  }

  public CommunityEngageOut scoped(Boolean scoped) {
    this.scoped = scoped;
    return this;
  }

   /**
   * Get scoped
   * @return scoped
  **/
  @ApiModelProperty(value = "")
  public Boolean getScoped() {
    return scoped;
  }

  public void setScoped(Boolean scoped) {
    this.scoped = scoped;
  }

  public CommunityEngageOut script(String script) {
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
    CommunityEngageOut communityEngageOut = (CommunityEngageOut) o;
    return Objects.equals(this.id, communityEngageOut.id) &&
        Objects.equals(this.personalNameDiasporaedOut, communityEngageOut.personalNameDiasporaedOut) &&
        Objects.equals(this.personalNameOriginedOut, communityEngageOut.personalNameOriginedOut) &&
        Objects.equals(this.country, communityEngageOut.country) &&
        Objects.equals(this.gender, communityEngageOut.gender) &&
        Objects.equals(this.personalNameUSRaceEthnicityOut, communityEngageOut.personalNameUSRaceEthnicityOut) &&
        Objects.equals(this.prime, communityEngageOut.prime) &&
        Objects.equals(this.scoped, communityEngageOut.scoped) &&
        Objects.equals(this.script, communityEngageOut.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, personalNameDiasporaedOut, personalNameOriginedOut, country, gender, personalNameUSRaceEthnicityOut, prime, scoped, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommunityEngageOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    personalNameDiasporaedOut: ").append(toIndentedString(personalNameDiasporaedOut)).append("\n");
    sb.append("    personalNameOriginedOut: ").append(toIndentedString(personalNameOriginedOut)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    personalNameUSRaceEthnicityOut: ").append(toIndentedString(personalNameUSRaceEthnicityOut)).append("\n");
    sb.append("    prime: ").append(toIndentedString(prime)).append("\n");
    sb.append("    scoped: ").append(toIndentedString(scoped)).append("\n");
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

