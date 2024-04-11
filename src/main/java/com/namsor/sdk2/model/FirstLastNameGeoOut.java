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
 * Represents the output of inferring the LIKELY country of Origin from a personal name.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY country of Origin from a personal name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class FirstLastNameGeoOut {
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

  public static final String SERIALIZED_NAME_COUNTRIES_TOP = "countriesTop";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_TOP)
  private List<String> countriesTop = new ArrayList<String>();

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

  public FirstLastNameGeoOut script(String script) {
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

  public FirstLastNameGeoOut id(String id) {
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

  public FirstLastNameGeoOut explanation(String explanation) {
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

  public FirstLastNameGeoOut firstName(String firstName) {
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

  public FirstLastNameGeoOut lastName(String lastName) {
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

  public FirstLastNameGeoOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Higher score is better, but score is not normalized. Use calibratedProbability if available. 
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @ApiModelProperty(value = "Higher score is better, but score is not normalized. Use calibratedProbability if available. ")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public FirstLastNameGeoOut country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Most likely country 
   * @return country
  **/
  @ApiModelProperty(value = "Most likely country ")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public FirstLastNameGeoOut countryAlt(String countryAlt) {
    this.countryAlt = countryAlt;
    return this;
  }

   /**
   * Second best alternative : country 
   * @return countryAlt
  **/
  @ApiModelProperty(value = "Second best alternative : country ")
  public String getCountryAlt() {
    return countryAlt;
  }

  public void setCountryAlt(String countryAlt) {
    this.countryAlt = countryAlt;
  }

  public FirstLastNameGeoOut region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Most likely region (based on country ISO2 code)
   * @return region
  **/
  @ApiModelProperty(value = "Most likely region (based on country ISO2 code)")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public FirstLastNameGeoOut topRegion(String topRegion) {
    this.topRegion = topRegion;
    return this;
  }

   /**
   * Most likely top region (based on country ISO2 code)
   * @return topRegion
  **/
  @ApiModelProperty(value = "Most likely top region (based on country ISO2 code)")
  public String getTopRegion() {
    return topRegion;
  }

  public void setTopRegion(String topRegion) {
    this.topRegion = topRegion;
  }

  public FirstLastNameGeoOut subRegion(String subRegion) {
    this.subRegion = subRegion;
    return this;
  }

   /**
   * Most likely sub region (based on country ISO2 code)
   * @return subRegion
  **/
  @ApiModelProperty(value = "Most likely sub region (based on country ISO2 code)")
  public String getSubRegion() {
    return subRegion;
  }

  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }

  public FirstLastNameGeoOut countriesTop(List<String> countriesTop) {
    this.countriesTop = countriesTop;
    return this;
  }

  public FirstLastNameGeoOut addCountriesTopItem(String countriesTopItem) {
    if (this.countriesTop == null) {
      this.countriesTop = new ArrayList<String>();
    }
    this.countriesTop.add(countriesTopItem);
    return this;
  }

   /**
   * List countries (top 10)
   * @return countriesTop
  **/
  @ApiModelProperty(value = "List countries (top 10)")
  public List<String> getCountriesTop() {
    return countriesTop;
  }

  public void setCountriesTop(List<String> countriesTop) {
    this.countriesTop = countriesTop;
  }

  public FirstLastNameGeoOut probabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for country to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityCalibrated() {
    return probabilityCalibrated;
  }

  public void setProbabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
  }

  public FirstLastNameGeoOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityAltCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for country OR countryAlt to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityAltCalibrated() {
    return probabilityAltCalibrated;
  }

  public void setProbabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
  }

  public FirstLastNameGeoOut religionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
    return this;
  }

  public FirstLastNameGeoOut addReligionStatsItem(ReligionStatOut religionStatsItem) {
    if (this.religionStats == null) {
      this.religionStats = new ArrayList<ReligionStatOut>();
    }
    this.religionStats.add(religionStatsItem);
    return this;
  }

   /**
   * Geographic religious statistics, assuming country is correctly predicted.
   * @return religionStats
  **/
  @ApiModelProperty(value = "Geographic religious statistics, assuming country is correctly predicted.")
  public List<ReligionStatOut> getReligionStats() {
    return religionStats;
  }

  public void setReligionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
  }

  public FirstLastNameGeoOut religionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    this.religionStatsAlt = religionStatsAlt;
    return this;
  }

  public FirstLastNameGeoOut addReligionStatsAltItem(ReligionStatOut religionStatsAltItem) {
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
    FirstLastNameGeoOut firstLastNameGeoOut = (FirstLastNameGeoOut) o;
    return Objects.equals(this.script, firstLastNameGeoOut.script) &&
        Objects.equals(this.id, firstLastNameGeoOut.id) &&
        Objects.equals(this.explanation, firstLastNameGeoOut.explanation) &&
        Objects.equals(this.firstName, firstLastNameGeoOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameGeoOut.lastName) &&
        Objects.equals(this.score, firstLastNameGeoOut.score) &&
        Objects.equals(this.country, firstLastNameGeoOut.country) &&
        Objects.equals(this.countryAlt, firstLastNameGeoOut.countryAlt) &&
        Objects.equals(this.region, firstLastNameGeoOut.region) &&
        Objects.equals(this.topRegion, firstLastNameGeoOut.topRegion) &&
        Objects.equals(this.subRegion, firstLastNameGeoOut.subRegion) &&
        Objects.equals(this.countriesTop, firstLastNameGeoOut.countriesTop) &&
        Objects.equals(this.probabilityCalibrated, firstLastNameGeoOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, firstLastNameGeoOut.probabilityAltCalibrated) &&
        Objects.equals(this.religionStats, firstLastNameGeoOut.religionStats) &&
        Objects.equals(this.religionStatsAlt, firstLastNameGeoOut.religionStatsAlt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, firstName, lastName, score, country, countryAlt, region, topRegion, subRegion, countriesTop, probabilityCalibrated, probabilityAltCalibrated, religionStats, religionStatsAlt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameGeoOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryAlt: ").append(toIndentedString(countryAlt)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    topRegion: ").append(toIndentedString(topRegion)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
    sb.append("    countriesTop: ").append(toIndentedString(countriesTop)).append("\n");
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
