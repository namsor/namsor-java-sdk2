/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.26
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
 * Caste group-coded names
 */
@ApiModel(description = "Caste group-coded names")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T20:11:11.018+02:00[Europe/Berlin]")
public class PersonalNameCastegroupOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_CASTEGROUP = "castegroup";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP)
  private String castegroup;

  public static final String SERIALIZED_NAME_CASTEGROUP_ALT = "castegroupAlt";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP_ALT)
  private String castegroupAlt;

  public static final String SERIALIZED_NAME_CASTEGROUP_TOP = "castegroupTop";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP_TOP)
  private List<String> castegroupTop = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public PersonalNameCastegroupOut script(String script) {
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

  public PersonalNameCastegroupOut id(String id) {
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

  public PersonalNameCastegroupOut explanation(String explanation) {
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

  public PersonalNameCastegroupOut name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The input name.
   * @return name
  **/
  @ApiModelProperty(value = "The input name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalNameCastegroupOut score(Double score) {
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

  public PersonalNameCastegroupOut castegroup(String castegroup) {
    this.castegroup = castegroup;
    return this;
  }

   /**
   * Most likely caste group
   * @return castegroup
  **/
  @ApiModelProperty(value = "Most likely caste group")
  public String getCastegroup() {
    return castegroup;
  }

  public void setCastegroup(String castegroup) {
    this.castegroup = castegroup;
  }

  public PersonalNameCastegroupOut castegroupAlt(String castegroupAlt) {
    this.castegroupAlt = castegroupAlt;
    return this;
  }

   /**
   * Second best alternative : caste group 
   * @return castegroupAlt
  **/
  @ApiModelProperty(value = "Second best alternative : caste group ")
  public String getCastegroupAlt() {
    return castegroupAlt;
  }

  public void setCastegroupAlt(String castegroupAlt) {
    this.castegroupAlt = castegroupAlt;
  }

  public PersonalNameCastegroupOut castegroupTop(List<String> castegroupTop) {
    this.castegroupTop = castegroupTop;
    return this;
  }

  public PersonalNameCastegroupOut addCastegroupTopItem(String castegroupTopItem) {
    if (this.castegroupTop == null) {
      this.castegroupTop = new ArrayList<String>();
    }
    this.castegroupTop.add(castegroupTopItem);
    return this;
  }

   /**
   * List caste group (top 10)
   * @return castegroupTop
  **/
  @ApiModelProperty(value = "List caste group (top 10)")
  public List<String> getCastegroupTop() {
    return castegroupTop;
  }

  public void setCastegroupTop(List<String> castegroupTop) {
    this.castegroupTop = castegroupTop;
  }

  public PersonalNameCastegroupOut probabilityCalibrated(Double probabilityCalibrated) {
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

  public PersonalNameCastegroupOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameCastegroupOut personalNameCastegroupOut = (PersonalNameCastegroupOut) o;
    return Objects.equals(this.script, personalNameCastegroupOut.script) &&
        Objects.equals(this.id, personalNameCastegroupOut.id) &&
        Objects.equals(this.explanation, personalNameCastegroupOut.explanation) &&
        Objects.equals(this.name, personalNameCastegroupOut.name) &&
        Objects.equals(this.score, personalNameCastegroupOut.score) &&
        Objects.equals(this.castegroup, personalNameCastegroupOut.castegroup) &&
        Objects.equals(this.castegroupAlt, personalNameCastegroupOut.castegroupAlt) &&
        Objects.equals(this.castegroupTop, personalNameCastegroupOut.castegroupTop) &&
        Objects.equals(this.probabilityCalibrated, personalNameCastegroupOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameCastegroupOut.probabilityAltCalibrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, score, castegroup, castegroupAlt, castegroupTop, probabilityCalibrated, probabilityAltCalibrated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameCastegroupOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    castegroup: ").append(toIndentedString(castegroup)).append("\n");
    sb.append("    castegroupAlt: ").append(toIndentedString(castegroupAlt)).append("\n");
    sb.append("    castegroupTop: ").append(toIndentedString(castegroupTop)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
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

