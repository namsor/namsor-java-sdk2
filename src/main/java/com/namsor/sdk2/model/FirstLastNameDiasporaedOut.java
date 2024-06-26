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
import com.namsor.sdk2.model.ReligionStatOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the output of inferring the LIKELY ethnicity from a personal name, given an country of residence.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY ethnicity from a personal name, given an country of residence.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class FirstLastNameDiasporaedOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

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

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public static final String SERIALIZED_NAME_RELIGION_STATS = "religionStats";
  @SerializedName(SERIALIZED_NAME_RELIGION_STATS)
  private List<ReligionStatOut> religionStats = new ArrayList<ReligionStatOut>();

  public static final String SERIALIZED_NAME_RELIGION_STATS_ALT = "religionStatsAlt";
  @SerializedName(SERIALIZED_NAME_RELIGION_STATS_ALT)
  private List<ReligionStatOut> religionStatsAlt = new ArrayList<ReligionStatOut>();

  public FirstLastNameDiasporaedOut script(String script) {
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

  public FirstLastNameDiasporaedOut explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @ApiModelProperty(value = "")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public FirstLastNameDiasporaedOut firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name (also known as given name)
   * @return firstName
  **/
  @ApiModelProperty(value = "The first name (also known as given name)")
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
   * The last name (also known as family name, or surname)
   * @return lastName
  **/
  @ApiModelProperty(value = "The last name (also known as family name, or surname)")
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
   * Compatibility to NamSor_v1 Diaspora score value. Higher score is better, but score is not normalized. Use calibratedProbability if available. 
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @ApiModelProperty(value = "Compatibility to NamSor_v1 Diaspora score value. Higher score is better, but score is not normalized. Use calibratedProbability if available. ")
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
   * The second best alternative ethnicity
   * @return ethnicityAlt
  **/
  @ApiModelProperty(example = "Japanese", value = "The second best alternative ethnicity")
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
   * The most likely ethnicity
   * @return ethnicity
  **/
  @ApiModelProperty(example = "Chinese", value = "The most likely ethnicity")
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
   * Indicates if the output ethnicity is based on machine learning only, or further lifted as a known fact by a country-specific rule. Let us know if you believe ethnicity is incorrect on a specific case where lifted is true.
   * @return lifted
  **/
  @ApiModelProperty(value = "Indicates if the output ethnicity is based on machine learning only, or further lifted as a known fact by a country-specific rule. Let us know if you believe ethnicity is incorrect on a specific case where lifted is true.")
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
   * From input data, the countryIso2 of geographic context (US,CA etc.)
   * @return countryIso2
  **/
  @ApiModelProperty(value = "From input data, the countryIso2 of geographic context (US,CA etc.)")
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
   * List most likely ethnicities (top 10)
   * @return ethnicitiesTop
  **/
  @ApiModelProperty(value = "List most likely ethnicities (top 10)")
  public List<String> getEthnicitiesTop() {
    return ethnicitiesTop;
  }

  public void setEthnicitiesTop(List<String> ethnicitiesTop) {
    this.ethnicitiesTop = ethnicitiesTop;
  }

  public FirstLastNameDiasporaedOut probabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for ethnicity to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for ethnicity to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityCalibrated() {
    return probabilityCalibrated;
  }

  public void setProbabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
  }

  public FirstLastNameDiasporaedOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for ethnicity OR ethnicityAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityAltCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for ethnicity OR ethnicityAlt to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityAltCalibrated() {
    return probabilityAltCalibrated;
  }

  public void setProbabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
  }

  public FirstLastNameDiasporaedOut religionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
    return this;
  }

  public FirstLastNameDiasporaedOut addReligionStatsItem(ReligionStatOut religionStatsItem) {
    if (this.religionStats == null) {
      this.religionStats = new ArrayList<ReligionStatOut>();
    }
    this.religionStats.add(religionStatsItem);
    return this;
  }

   /**
   * Geographic religious statistics, assuming ethnicity is correctly predicted.
   * @return religionStats
  **/
  @ApiModelProperty(value = "Geographic religious statistics, assuming ethnicity is correctly predicted.")
  public List<ReligionStatOut> getReligionStats() {
    return religionStats;
  }

  public void setReligionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
  }

  public FirstLastNameDiasporaedOut religionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    this.religionStatsAlt = religionStatsAlt;
    return this;
  }

  public FirstLastNameDiasporaedOut addReligionStatsAltItem(ReligionStatOut religionStatsAltItem) {
    if (this.religionStatsAlt == null) {
      this.religionStatsAlt = new ArrayList<ReligionStatOut>();
    }
    this.religionStatsAlt.add(religionStatsAltItem);
    return this;
  }

   /**
   * Geographic religious statistics, for country best alternative.
   * @return religionStatsAlt
  **/
  @ApiModelProperty(value = "Geographic religious statistics, for country best alternative.")
  public List<ReligionStatOut> getReligionStatsAlt() {
    return religionStatsAlt;
  }

  public void setReligionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    this.religionStatsAlt = religionStatsAlt;
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
    return Objects.equals(this.script, firstLastNameDiasporaedOut.script) &&
        Objects.equals(this.id, firstLastNameDiasporaedOut.id) &&
        Objects.equals(this.explanation, firstLastNameDiasporaedOut.explanation) &&
        Objects.equals(this.firstName, firstLastNameDiasporaedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameDiasporaedOut.lastName) &&
        Objects.equals(this.score, firstLastNameDiasporaedOut.score) &&
        Objects.equals(this.ethnicityAlt, firstLastNameDiasporaedOut.ethnicityAlt) &&
        Objects.equals(this.ethnicity, firstLastNameDiasporaedOut.ethnicity) &&
        Objects.equals(this.lifted, firstLastNameDiasporaedOut.lifted) &&
        Objects.equals(this.countryIso2, firstLastNameDiasporaedOut.countryIso2) &&
        Objects.equals(this.ethnicitiesTop, firstLastNameDiasporaedOut.ethnicitiesTop) &&
        Objects.equals(this.probabilityCalibrated, firstLastNameDiasporaedOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, firstLastNameDiasporaedOut.probabilityAltCalibrated) &&
        Objects.equals(this.religionStats, firstLastNameDiasporaedOut.religionStats) &&
        Objects.equals(this.religionStatsAlt, firstLastNameDiasporaedOut.religionStatsAlt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, firstName, lastName, score, ethnicityAlt, ethnicity, lifted, countryIso2, ethnicitiesTop, probabilityCalibrated, probabilityAltCalibrated, religionStats, religionStatsAlt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameDiasporaedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    ethnicityAlt: ").append(toIndentedString(ethnicityAlt)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    lifted: ").append(toIndentedString(lifted)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
    sb.append("    ethnicitiesTop: ").append(toIndentedString(ethnicitiesTop)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
    sb.append("    religionStats: ").append(toIndentedString(religionStats)).append("\n");
    sb.append("    religionStatsAlt: ").append(toIndentedString(religionStatsAlt)).append("\n");
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

