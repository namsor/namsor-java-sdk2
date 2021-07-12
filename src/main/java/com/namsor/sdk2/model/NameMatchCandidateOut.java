/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.14
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
 * NameMatchCandidateOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T18:00:09.597+02:00[Europe/Berlin]")
public class NameMatchCandidateOut {
  public static final String SERIALIZED_NAME_CANDIDATE_NAME = "candidateName";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_NAME)
  private String candidateName;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;

  public static final String SERIALIZED_NAME_PRED_SCORE_GIVEN_NAME = "predScoreGivenName";
  @SerializedName(SERIALIZED_NAME_PRED_SCORE_GIVEN_NAME)
  private Double predScoreGivenName;

  public static final String SERIALIZED_NAME_PRED_SCORE_FAMILY_NAME = "predScoreFamilyName";
  @SerializedName(SERIALIZED_NAME_PRED_SCORE_FAMILY_NAME)
  private Double predScoreFamilyName;

  public NameMatchCandidateOut candidateName(String candidateName) {
    this.candidateName = candidateName;
    return this;
  }

   /**
   * Get candidateName
   * @return candidateName
  **/
  @ApiModelProperty(value = "")
  public String getCandidateName() {
    return candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }

  public NameMatchCandidateOut probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Get probability
   * @return probability
  **/
  @ApiModelProperty(value = "")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }

  public NameMatchCandidateOut predScoreGivenName(Double predScoreGivenName) {
    this.predScoreGivenName = predScoreGivenName;
    return this;
  }

   /**
   * Get predScoreGivenName
   * @return predScoreGivenName
  **/
  @ApiModelProperty(value = "")
  public Double getPredScoreGivenName() {
    return predScoreGivenName;
  }

  public void setPredScoreGivenName(Double predScoreGivenName) {
    this.predScoreGivenName = predScoreGivenName;
  }

  public NameMatchCandidateOut predScoreFamilyName(Double predScoreFamilyName) {
    this.predScoreFamilyName = predScoreFamilyName;
    return this;
  }

   /**
   * Get predScoreFamilyName
   * @return predScoreFamilyName
  **/
  @ApiModelProperty(value = "")
  public Double getPredScoreFamilyName() {
    return predScoreFamilyName;
  }

  public void setPredScoreFamilyName(Double predScoreFamilyName) {
    this.predScoreFamilyName = predScoreFamilyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchCandidateOut nameMatchCandidateOut = (NameMatchCandidateOut) o;
    return Objects.equals(this.candidateName, nameMatchCandidateOut.candidateName) &&
        Objects.equals(this.probability, nameMatchCandidateOut.probability) &&
        Objects.equals(this.predScoreGivenName, nameMatchCandidateOut.predScoreGivenName) &&
        Objects.equals(this.predScoreFamilyName, nameMatchCandidateOut.predScoreFamilyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateName, probability, predScoreGivenName, predScoreFamilyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchCandidateOut {\n");
    sb.append("    candidateName: ").append(toIndentedString(candidateName)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    predScoreGivenName: ").append(toIndentedString(predScoreGivenName)).append("\n");
    sb.append("    predScoreFamilyName: ").append(toIndentedString(predScoreFamilyName)).append("\n");
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

