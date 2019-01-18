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
 * NameMatchCandidateOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-18T02:05:58.814+01:00[Europe/Berlin]")
public class NameMatchCandidateOut {
  public static final String SERIALIZED_NAME_CANDIDATE_NAME = "candidateName";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_NAME)
  private String candidateName;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;

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
        Objects.equals(this.probability, nameMatchCandidateOut.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateName, probability);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchCandidateOut {\n");
    sb.append("    candidateName: ").append(toIndentedString(candidateName)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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

