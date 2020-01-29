/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.8
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
 * Simple metrics on a classifier, for a given expected class
 */
@ApiModel(description = "Simple metrics on a classifier, for a given expected class")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-29T15:57:30.954+01:00[Europe/Berlin]")
public class ExpectedClassMetricsOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_EXPECTED_CLASS = "expectedClass";
  @SerializedName(SERIALIZED_NAME_EXPECTED_CLASS)
  private String expectedClass;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_TOTAL = "aiEstimateTotal";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_TOTAL)
  private Long aiEstimateTotal;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_PRECISION = "aiEstimatePrecision";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_PRECISION)
  private Double aiEstimatePrecision;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_RECALL = "aiEstimateRecall";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_RECALL)
  private Double aiEstimateRecall;

  public static final String SERIALIZED_NAME_AI_LEARN_TOTAL = "aiLearnTotal";
  @SerializedName(SERIALIZED_NAME_AI_LEARN_TOTAL)
  private Long aiLearnTotal;

  public ExpectedClassMetricsOut classifierName(String classifierName) {
    this.classifierName = classifierName;
    return this;
  }

   /**
   * Get classifierName
   * @return classifierName
  **/
  @ApiModelProperty(value = "")
  public String getClassifierName() {
    return classifierName;
  }

  public void setClassifierName(String classifierName) {
    this.classifierName = classifierName;
  }

  public ExpectedClassMetricsOut expectedClass(String expectedClass) {
    this.expectedClass = expectedClass;
    return this;
  }

   /**
   * Get expectedClass
   * @return expectedClass
  **/
  @ApiModelProperty(value = "")
  public String getExpectedClass() {
    return expectedClass;
  }

  public void setExpectedClass(String expectedClass) {
    this.expectedClass = expectedClass;
  }

  public ExpectedClassMetricsOut aiEstimateTotal(Long aiEstimateTotal) {
    this.aiEstimateTotal = aiEstimateTotal;
    return this;
  }

   /**
   * Get aiEstimateTotal
   * @return aiEstimateTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiEstimateTotal() {
    return aiEstimateTotal;
  }

  public void setAiEstimateTotal(Long aiEstimateTotal) {
    this.aiEstimateTotal = aiEstimateTotal;
  }

  public ExpectedClassMetricsOut aiEstimatePrecision(Double aiEstimatePrecision) {
    this.aiEstimatePrecision = aiEstimatePrecision;
    return this;
  }

   /**
   * Get aiEstimatePrecision
   * @return aiEstimatePrecision
  **/
  @ApiModelProperty(value = "")
  public Double getAiEstimatePrecision() {
    return aiEstimatePrecision;
  }

  public void setAiEstimatePrecision(Double aiEstimatePrecision) {
    this.aiEstimatePrecision = aiEstimatePrecision;
  }

  public ExpectedClassMetricsOut aiEstimateRecall(Double aiEstimateRecall) {
    this.aiEstimateRecall = aiEstimateRecall;
    return this;
  }

   /**
   * Get aiEstimateRecall
   * @return aiEstimateRecall
  **/
  @ApiModelProperty(value = "")
  public Double getAiEstimateRecall() {
    return aiEstimateRecall;
  }

  public void setAiEstimateRecall(Double aiEstimateRecall) {
    this.aiEstimateRecall = aiEstimateRecall;
  }

  public ExpectedClassMetricsOut aiLearnTotal(Long aiLearnTotal) {
    this.aiLearnTotal = aiLearnTotal;
    return this;
  }

   /**
   * Get aiLearnTotal
   * @return aiLearnTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiLearnTotal() {
    return aiLearnTotal;
  }

  public void setAiLearnTotal(Long aiLearnTotal) {
    this.aiLearnTotal = aiLearnTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpectedClassMetricsOut expectedClassMetricsOut = (ExpectedClassMetricsOut) o;
    return Objects.equals(this.classifierName, expectedClassMetricsOut.classifierName) &&
        Objects.equals(this.expectedClass, expectedClassMetricsOut.expectedClass) &&
        Objects.equals(this.aiEstimateTotal, expectedClassMetricsOut.aiEstimateTotal) &&
        Objects.equals(this.aiEstimatePrecision, expectedClassMetricsOut.aiEstimatePrecision) &&
        Objects.equals(this.aiEstimateRecall, expectedClassMetricsOut.aiEstimateRecall) &&
        Objects.equals(this.aiLearnTotal, expectedClassMetricsOut.aiLearnTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierName, expectedClass, aiEstimateTotal, aiEstimatePrecision, aiEstimateRecall, aiLearnTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpectedClassMetricsOut {\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    expectedClass: ").append(toIndentedString(expectedClass)).append("\n");
    sb.append("    aiEstimateTotal: ").append(toIndentedString(aiEstimateTotal)).append("\n");
    sb.append("    aiEstimatePrecision: ").append(toIndentedString(aiEstimatePrecision)).append("\n");
    sb.append("    aiEstimateRecall: ").append(toIndentedString(aiEstimateRecall)).append("\n");
    sb.append("    aiLearnTotal: ").append(toIndentedString(aiLearnTotal)).append("\n");
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

