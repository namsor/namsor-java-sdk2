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
 * RomanizedNameOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-23T08:48:45.717+01:00[Europe/Berlin]")
public class RomanizedNameOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LATIN_NAME = "latinName";
  @SerializedName(SERIALIZED_NAME_LATIN_NAME)
  private String latinName;

  public static final String SERIALIZED_NAME_ORIGINAL_NAME = "originalName";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
  private String originalName;

  public static final String SERIALIZED_NAME_SOURCE_LANGUAGE = "sourceLanguage";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANGUAGE)
  private String sourceLanguage;

  public static final String SERIALIZED_NAME_TARGET_LANGUAGE = "targetLanguage";
  @SerializedName(SERIALIZED_NAME_TARGET_LANGUAGE)
  private String targetLanguage;

  public static final String SERIALIZED_NAME_SOURCE_SCRIPT = "sourceScript";
  @SerializedName(SERIALIZED_NAME_SOURCE_SCRIPT)
  private String sourceScript;

  public static final String SERIALIZED_NAME_TARGET_SCRIPT = "targetScript";
  @SerializedName(SERIALIZED_NAME_TARGET_SCRIPT)
  private String targetScript;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public RomanizedNameOut id(String id) {
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

  public RomanizedNameOut latinName(String latinName) {
    this.latinName = latinName;
    return this;
  }

   /**
   * Get latinName
   * @return latinName
  **/
  @ApiModelProperty(value = "")
  public String getLatinName() {
    return latinName;
  }

  public void setLatinName(String latinName) {
    this.latinName = latinName;
  }

  public RomanizedNameOut originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @ApiModelProperty(value = "")
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public RomanizedNameOut sourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

   /**
   * Get sourceLanguage
   * @return sourceLanguage
  **/
  @ApiModelProperty(value = "")
  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }

  public RomanizedNameOut targetLanguage(String targetLanguage) {
    this.targetLanguage = targetLanguage;
    return this;
  }

   /**
   * Get targetLanguage
   * @return targetLanguage
  **/
  @ApiModelProperty(value = "")
  public String getTargetLanguage() {
    return targetLanguage;
  }

  public void setTargetLanguage(String targetLanguage) {
    this.targetLanguage = targetLanguage;
  }

  public RomanizedNameOut sourceScript(String sourceScript) {
    this.sourceScript = sourceScript;
    return this;
  }

   /**
   * Get sourceScript
   * @return sourceScript
  **/
  @ApiModelProperty(value = "")
  public String getSourceScript() {
    return sourceScript;
  }

  public void setSourceScript(String sourceScript) {
    this.sourceScript = sourceScript;
  }

  public RomanizedNameOut targetScript(String targetScript) {
    this.targetScript = targetScript;
    return this;
  }

   /**
   * Get targetScript
   * @return targetScript
  **/
  @ApiModelProperty(value = "")
  public String getTargetScript() {
    return targetScript;
  }

  public void setTargetScript(String targetScript) {
    this.targetScript = targetScript;
  }

  public RomanizedNameOut score(Double score) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RomanizedNameOut romanizedNameOut = (RomanizedNameOut) o;
    return Objects.equals(this.id, romanizedNameOut.id) &&
        Objects.equals(this.latinName, romanizedNameOut.latinName) &&
        Objects.equals(this.originalName, romanizedNameOut.originalName) &&
        Objects.equals(this.sourceLanguage, romanizedNameOut.sourceLanguage) &&
        Objects.equals(this.targetLanguage, romanizedNameOut.targetLanguage) &&
        Objects.equals(this.sourceScript, romanizedNameOut.sourceScript) &&
        Objects.equals(this.targetScript, romanizedNameOut.targetScript) &&
        Objects.equals(this.score, romanizedNameOut.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latinName, originalName, sourceLanguage, targetLanguage, sourceScript, targetScript, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RomanizedNameOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latinName: ").append(toIndentedString(latinName)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
    sb.append("    sourceScript: ").append(toIndentedString(sourceScript)).append("\n");
    sb.append("    targetScript: ").append(toIndentedString(targetScript)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

