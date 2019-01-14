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
import com.namsor.sdk2.model.APIKeyOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Simple metrics on a classifier, for a given source
 */
@ApiModel(description = "Simple metrics on a classifier, for a given source")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T09:54:19.925+01:00[Europe/Berlin]")
public class SourceMetricsOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private APIKeyOut source = null;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_TOTAL = "aiEstimateTotal";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_TOTAL)
  private Long aiEstimateTotal;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_PRECISION = "aiEstimatePrecision";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_PRECISION)
  private Double aiEstimatePrecision;

  public static final String SERIALIZED_NAME_AI_ESTIMATE_RECALL = "aiEstimateRecall";
  @SerializedName(SERIALIZED_NAME_AI_ESTIMATE_RECALL)
  private Double aiEstimateRecall;

  public static final String SERIALIZED_NAME_METRIC_TIME_STAMP = "metricTimeStamp";
  @SerializedName(SERIALIZED_NAME_METRIC_TIME_STAMP)
  private Long metricTimeStamp;

  public static final String SERIALIZED_NAME_AI_START_TIME = "aiStartTime";
  @SerializedName(SERIALIZED_NAME_AI_START_TIME)
  private Long aiStartTime;

  public static final String SERIALIZED_NAME_AI_LEARN_TOTAL = "aiLearnTotal";
  @SerializedName(SERIALIZED_NAME_AI_LEARN_TOTAL)
  private Long aiLearnTotal;

  public static final String SERIALIZED_NAME_SNAPSHOT_DATE = "snapshotDate";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_DATE)
  private Long snapshotDate;

  public SourceMetricsOut classifierName(String classifierName) {
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

  public SourceMetricsOut source(APIKeyOut source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public APIKeyOut getSource() {
    return source;
  }

  public void setSource(APIKeyOut source) {
    this.source = source;
  }

  public SourceMetricsOut aiEstimateTotal(Long aiEstimateTotal) {
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

  public SourceMetricsOut aiEstimatePrecision(Double aiEstimatePrecision) {
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

  public SourceMetricsOut aiEstimateRecall(Double aiEstimateRecall) {
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

  public SourceMetricsOut metricTimeStamp(Long metricTimeStamp) {
    this.metricTimeStamp = metricTimeStamp;
    return this;
  }

   /**
   * Get metricTimeStamp
   * @return metricTimeStamp
  **/
  @ApiModelProperty(value = "")
  public Long getMetricTimeStamp() {
    return metricTimeStamp;
  }

  public void setMetricTimeStamp(Long metricTimeStamp) {
    this.metricTimeStamp = metricTimeStamp;
  }

  public SourceMetricsOut aiStartTime(Long aiStartTime) {
    this.aiStartTime = aiStartTime;
    return this;
  }

   /**
   * Get aiStartTime
   * @return aiStartTime
  **/
  @ApiModelProperty(value = "")
  public Long getAiStartTime() {
    return aiStartTime;
  }

  public void setAiStartTime(Long aiStartTime) {
    this.aiStartTime = aiStartTime;
  }

  public SourceMetricsOut aiLearnTotal(Long aiLearnTotal) {
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

  public SourceMetricsOut snapshotDate(Long snapshotDate) {
    this.snapshotDate = snapshotDate;
    return this;
  }

   /**
   * Get snapshotDate
   * @return snapshotDate
  **/
  @ApiModelProperty(value = "")
  public Long getSnapshotDate() {
    return snapshotDate;
  }

  public void setSnapshotDate(Long snapshotDate) {
    this.snapshotDate = snapshotDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceMetricsOut sourceMetricsOut = (SourceMetricsOut) o;
    return Objects.equals(this.classifierName, sourceMetricsOut.classifierName) &&
        Objects.equals(this.source, sourceMetricsOut.source) &&
        Objects.equals(this.aiEstimateTotal, sourceMetricsOut.aiEstimateTotal) &&
        Objects.equals(this.aiEstimatePrecision, sourceMetricsOut.aiEstimatePrecision) &&
        Objects.equals(this.aiEstimateRecall, sourceMetricsOut.aiEstimateRecall) &&
        Objects.equals(this.metricTimeStamp, sourceMetricsOut.metricTimeStamp) &&
        Objects.equals(this.aiStartTime, sourceMetricsOut.aiStartTime) &&
        Objects.equals(this.aiLearnTotal, sourceMetricsOut.aiLearnTotal) &&
        Objects.equals(this.snapshotDate, sourceMetricsOut.snapshotDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierName, source, aiEstimateTotal, aiEstimatePrecision, aiEstimateRecall, metricTimeStamp, aiStartTime, aiLearnTotal, snapshotDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceMetricsOut {\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    aiEstimateTotal: ").append(toIndentedString(aiEstimateTotal)).append("\n");
    sb.append("    aiEstimatePrecision: ").append(toIndentedString(aiEstimatePrecision)).append("\n");
    sb.append("    aiEstimateRecall: ").append(toIndentedString(aiEstimateRecall)).append("\n");
    sb.append("    metricTimeStamp: ").append(toIndentedString(metricTimeStamp)).append("\n");
    sb.append("    aiStartTime: ").append(toIndentedString(aiStartTime)).append("\n");
    sb.append("    aiLearnTotal: ").append(toIndentedString(aiLearnTotal)).append("\n");
    sb.append("    snapshotDate: ").append(toIndentedString(snapshotDate)).append("\n");
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
