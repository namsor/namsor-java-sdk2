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
import com.namsor.sdk2.model.ExpectedClassMetricsOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple metrics on a classifier
 */
@ApiModel(description = "Simple metrics on a classifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T10:34:07.082+01:00[Europe/Berlin]")
public class ClassifierMetricsOut {
  public static final String SERIALIZED_NAME_LEARN_QUEUE_SIZE = "learnQueueSize";
  @SerializedName(SERIALIZED_NAME_LEARN_QUEUE_SIZE)
  private Integer learnQueueSize;

  public static final String SERIALIZED_NAME_BUFFER_SIZE = "bufferSize";
  @SerializedName(SERIALIZED_NAME_BUFFER_SIZE)
  private Integer bufferSize;

  public static final String SERIALIZED_NAME_PRE_CLASSIFY_QUEUE_SIZE = "preClassifyQueueSize";
  @SerializedName(SERIALIZED_NAME_PRE_CLASSIFY_QUEUE_SIZE)
  private Integer preClassifyQueueSize;

  public static final String SERIALIZED_NAME_FACT_KEYS_SIZE = "factKeysSize";
  @SerializedName(SERIALIZED_NAME_FACT_KEYS_SIZE)
  private Integer factKeysSize;

  public static final String SERIALIZED_NAME_FACTS_LEARNED = "factsLearned";
  @SerializedName(SERIALIZED_NAME_FACTS_LEARNED)
  private Long factsLearned;

  public static final String SERIALIZED_NAME_CLASSIFY_DURATIONS_CURRENT = "classifyDurationsCurrent";
  @SerializedName(SERIALIZED_NAME_CLASSIFY_DURATIONS_CURRENT)
  private Double classifyDurationsCurrent;

  public static final String SERIALIZED_NAME_CLASSIFY_DURATIONS_SUMMARY = "classifyDurationsSummary";
  @SerializedName(SERIALIZED_NAME_CLASSIFY_DURATIONS_SUMMARY)
  private Double classifyDurationsSummary;

  public static final String SERIALIZED_NAME_LEARN_DURATIONS_CURRENT = "learnDurationsCurrent";
  @SerializedName(SERIALIZED_NAME_LEARN_DURATIONS_CURRENT)
  private Double learnDurationsCurrent;

  public static final String SERIALIZED_NAME_LEARN_DURATIONS_SUMMARY = "learnDurationsSummary";
  @SerializedName(SERIALIZED_NAME_LEARN_DURATIONS_SUMMARY)
  private Double learnDurationsSummary;

  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_FEATURES_SIZE = "featuresSize";
  @SerializedName(SERIALIZED_NAME_FEATURES_SIZE)
  private Long featuresSize;

  public static final String SERIALIZED_NAME_AI_VETTED_ESTIMATE_TOTAL = "aiVettedEstimateTotal";
  @SerializedName(SERIALIZED_NAME_AI_VETTED_ESTIMATE_TOTAL)
  private Long aiVettedEstimateTotal;

  public static final String SERIALIZED_NAME_AI_VETTED_ESTIMATE_PRECISION = "aiVettedEstimatePrecision";
  @SerializedName(SERIALIZED_NAME_AI_VETTED_ESTIMATE_PRECISION)
  private Double aiVettedEstimatePrecision;

  public static final String SERIALIZED_NAME_AI_VETTED_ESTIMATE_RECALL = "aiVettedEstimateRecall";
  @SerializedName(SERIALIZED_NAME_AI_VETTED_ESTIMATE_RECALL)
  private Double aiVettedEstimateRecall;

  public static final String SERIALIZED_NAME_AI_VETTED_LEARN_TOTAL = "aiVettedLearnTotal";
  @SerializedName(SERIALIZED_NAME_AI_VETTED_LEARN_TOTAL)
  private Long aiVettedLearnTotal;

  public static final String SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_TOTAL = "aiNonVettedEstimateTotal";
  @SerializedName(SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_TOTAL)
  private Long aiNonVettedEstimateTotal;

  public static final String SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_PRECISION = "aiNonVettedEstimatePrecision";
  @SerializedName(SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_PRECISION)
  private Double aiNonVettedEstimatePrecision;

  public static final String SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_RECALL = "aiNonVettedEstimateRecall";
  @SerializedName(SERIALIZED_NAME_AI_NON_VETTED_ESTIMATE_RECALL)
  private Double aiNonVettedEstimateRecall;

  public static final String SERIALIZED_NAME_AI_NON_VETTED_LEARN_TOTAL = "aiNonVettedLearnTotal";
  @SerializedName(SERIALIZED_NAME_AI_NON_VETTED_LEARN_TOTAL)
  private Long aiNonVettedLearnTotal;

  public static final String SERIALIZED_NAME_METRIC_TIME_STAMP = "metricTimeStamp";
  @SerializedName(SERIALIZED_NAME_METRIC_TIME_STAMP)
  private Long metricTimeStamp;

  public static final String SERIALIZED_NAME_AI_START_TIME = "aiStartTime";
  @SerializedName(SERIALIZED_NAME_AI_START_TIME)
  private Long aiStartTime;

  public static final String SERIALIZED_NAME_AI_VETTED_EXPECTED_CLASS_METRICS = "aiVettedExpectedClassMetrics";
  @SerializedName(SERIALIZED_NAME_AI_VETTED_EXPECTED_CLASS_METRICS)
  private List<ExpectedClassMetricsOut> aiVettedExpectedClassMetrics = new ArrayList<ExpectedClassMetricsOut>();

  public static final String SERIALIZED_NAME_AI_NON_VETTED_EXPECTED_CLASS_METRICS = "aiNonVettedExpectedClassMetrics";
  @SerializedName(SERIALIZED_NAME_AI_NON_VETTED_EXPECTED_CLASS_METRICS)
  private List<ExpectedClassMetricsOut> aiNonVettedExpectedClassMetrics = new ArrayList<ExpectedClassMetricsOut>();

  public ClassifierMetricsOut learnQueueSize(Integer learnQueueSize) {
    this.learnQueueSize = learnQueueSize;
    return this;
  }

   /**
   * Get learnQueueSize
   * @return learnQueueSize
  **/
  @ApiModelProperty(value = "")
  public Integer getLearnQueueSize() {
    return learnQueueSize;
  }

  public void setLearnQueueSize(Integer learnQueueSize) {
    this.learnQueueSize = learnQueueSize;
  }

  public ClassifierMetricsOut bufferSize(Integer bufferSize) {
    this.bufferSize = bufferSize;
    return this;
  }

   /**
   * Get bufferSize
   * @return bufferSize
  **/
  @ApiModelProperty(value = "")
  public Integer getBufferSize() {
    return bufferSize;
  }

  public void setBufferSize(Integer bufferSize) {
    this.bufferSize = bufferSize;
  }

  public ClassifierMetricsOut preClassifyQueueSize(Integer preClassifyQueueSize) {
    this.preClassifyQueueSize = preClassifyQueueSize;
    return this;
  }

   /**
   * Get preClassifyQueueSize
   * @return preClassifyQueueSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPreClassifyQueueSize() {
    return preClassifyQueueSize;
  }

  public void setPreClassifyQueueSize(Integer preClassifyQueueSize) {
    this.preClassifyQueueSize = preClassifyQueueSize;
  }

  public ClassifierMetricsOut factKeysSize(Integer factKeysSize) {
    this.factKeysSize = factKeysSize;
    return this;
  }

   /**
   * Get factKeysSize
   * @return factKeysSize
  **/
  @ApiModelProperty(value = "")
  public Integer getFactKeysSize() {
    return factKeysSize;
  }

  public void setFactKeysSize(Integer factKeysSize) {
    this.factKeysSize = factKeysSize;
  }

  public ClassifierMetricsOut factsLearned(Long factsLearned) {
    this.factsLearned = factsLearned;
    return this;
  }

   /**
   * Get factsLearned
   * @return factsLearned
  **/
  @ApiModelProperty(value = "")
  public Long getFactsLearned() {
    return factsLearned;
  }

  public void setFactsLearned(Long factsLearned) {
    this.factsLearned = factsLearned;
  }

  public ClassifierMetricsOut classifyDurationsCurrent(Double classifyDurationsCurrent) {
    this.classifyDurationsCurrent = classifyDurationsCurrent;
    return this;
  }

   /**
   * Get classifyDurationsCurrent
   * @return classifyDurationsCurrent
  **/
  @ApiModelProperty(value = "")
  public Double getClassifyDurationsCurrent() {
    return classifyDurationsCurrent;
  }

  public void setClassifyDurationsCurrent(Double classifyDurationsCurrent) {
    this.classifyDurationsCurrent = classifyDurationsCurrent;
  }

  public ClassifierMetricsOut classifyDurationsSummary(Double classifyDurationsSummary) {
    this.classifyDurationsSummary = classifyDurationsSummary;
    return this;
  }

   /**
   * Get classifyDurationsSummary
   * @return classifyDurationsSummary
  **/
  @ApiModelProperty(value = "")
  public Double getClassifyDurationsSummary() {
    return classifyDurationsSummary;
  }

  public void setClassifyDurationsSummary(Double classifyDurationsSummary) {
    this.classifyDurationsSummary = classifyDurationsSummary;
  }

  public ClassifierMetricsOut learnDurationsCurrent(Double learnDurationsCurrent) {
    this.learnDurationsCurrent = learnDurationsCurrent;
    return this;
  }

   /**
   * Get learnDurationsCurrent
   * @return learnDurationsCurrent
  **/
  @ApiModelProperty(value = "")
  public Double getLearnDurationsCurrent() {
    return learnDurationsCurrent;
  }

  public void setLearnDurationsCurrent(Double learnDurationsCurrent) {
    this.learnDurationsCurrent = learnDurationsCurrent;
  }

  public ClassifierMetricsOut learnDurationsSummary(Double learnDurationsSummary) {
    this.learnDurationsSummary = learnDurationsSummary;
    return this;
  }

   /**
   * Get learnDurationsSummary
   * @return learnDurationsSummary
  **/
  @ApiModelProperty(value = "")
  public Double getLearnDurationsSummary() {
    return learnDurationsSummary;
  }

  public void setLearnDurationsSummary(Double learnDurationsSummary) {
    this.learnDurationsSummary = learnDurationsSummary;
  }

  public ClassifierMetricsOut classifierName(String classifierName) {
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

  public ClassifierMetricsOut featuresSize(Long featuresSize) {
    this.featuresSize = featuresSize;
    return this;
  }

   /**
   * Get featuresSize
   * @return featuresSize
  **/
  @ApiModelProperty(value = "")
  public Long getFeaturesSize() {
    return featuresSize;
  }

  public void setFeaturesSize(Long featuresSize) {
    this.featuresSize = featuresSize;
  }

  public ClassifierMetricsOut aiVettedEstimateTotal(Long aiVettedEstimateTotal) {
    this.aiVettedEstimateTotal = aiVettedEstimateTotal;
    return this;
  }

   /**
   * Get aiVettedEstimateTotal
   * @return aiVettedEstimateTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiVettedEstimateTotal() {
    return aiVettedEstimateTotal;
  }

  public void setAiVettedEstimateTotal(Long aiVettedEstimateTotal) {
    this.aiVettedEstimateTotal = aiVettedEstimateTotal;
  }

  public ClassifierMetricsOut aiVettedEstimatePrecision(Double aiVettedEstimatePrecision) {
    this.aiVettedEstimatePrecision = aiVettedEstimatePrecision;
    return this;
  }

   /**
   * Get aiVettedEstimatePrecision
   * @return aiVettedEstimatePrecision
  **/
  @ApiModelProperty(value = "")
  public Double getAiVettedEstimatePrecision() {
    return aiVettedEstimatePrecision;
  }

  public void setAiVettedEstimatePrecision(Double aiVettedEstimatePrecision) {
    this.aiVettedEstimatePrecision = aiVettedEstimatePrecision;
  }

  public ClassifierMetricsOut aiVettedEstimateRecall(Double aiVettedEstimateRecall) {
    this.aiVettedEstimateRecall = aiVettedEstimateRecall;
    return this;
  }

   /**
   * Get aiVettedEstimateRecall
   * @return aiVettedEstimateRecall
  **/
  @ApiModelProperty(value = "")
  public Double getAiVettedEstimateRecall() {
    return aiVettedEstimateRecall;
  }

  public void setAiVettedEstimateRecall(Double aiVettedEstimateRecall) {
    this.aiVettedEstimateRecall = aiVettedEstimateRecall;
  }

  public ClassifierMetricsOut aiVettedLearnTotal(Long aiVettedLearnTotal) {
    this.aiVettedLearnTotal = aiVettedLearnTotal;
    return this;
  }

   /**
   * Get aiVettedLearnTotal
   * @return aiVettedLearnTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiVettedLearnTotal() {
    return aiVettedLearnTotal;
  }

  public void setAiVettedLearnTotal(Long aiVettedLearnTotal) {
    this.aiVettedLearnTotal = aiVettedLearnTotal;
  }

  public ClassifierMetricsOut aiNonVettedEstimateTotal(Long aiNonVettedEstimateTotal) {
    this.aiNonVettedEstimateTotal = aiNonVettedEstimateTotal;
    return this;
  }

   /**
   * Get aiNonVettedEstimateTotal
   * @return aiNonVettedEstimateTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiNonVettedEstimateTotal() {
    return aiNonVettedEstimateTotal;
  }

  public void setAiNonVettedEstimateTotal(Long aiNonVettedEstimateTotal) {
    this.aiNonVettedEstimateTotal = aiNonVettedEstimateTotal;
  }

  public ClassifierMetricsOut aiNonVettedEstimatePrecision(Double aiNonVettedEstimatePrecision) {
    this.aiNonVettedEstimatePrecision = aiNonVettedEstimatePrecision;
    return this;
  }

   /**
   * Get aiNonVettedEstimatePrecision
   * @return aiNonVettedEstimatePrecision
  **/
  @ApiModelProperty(value = "")
  public Double getAiNonVettedEstimatePrecision() {
    return aiNonVettedEstimatePrecision;
  }

  public void setAiNonVettedEstimatePrecision(Double aiNonVettedEstimatePrecision) {
    this.aiNonVettedEstimatePrecision = aiNonVettedEstimatePrecision;
  }

  public ClassifierMetricsOut aiNonVettedEstimateRecall(Double aiNonVettedEstimateRecall) {
    this.aiNonVettedEstimateRecall = aiNonVettedEstimateRecall;
    return this;
  }

   /**
   * Get aiNonVettedEstimateRecall
   * @return aiNonVettedEstimateRecall
  **/
  @ApiModelProperty(value = "")
  public Double getAiNonVettedEstimateRecall() {
    return aiNonVettedEstimateRecall;
  }

  public void setAiNonVettedEstimateRecall(Double aiNonVettedEstimateRecall) {
    this.aiNonVettedEstimateRecall = aiNonVettedEstimateRecall;
  }

  public ClassifierMetricsOut aiNonVettedLearnTotal(Long aiNonVettedLearnTotal) {
    this.aiNonVettedLearnTotal = aiNonVettedLearnTotal;
    return this;
  }

   /**
   * Get aiNonVettedLearnTotal
   * @return aiNonVettedLearnTotal
  **/
  @ApiModelProperty(value = "")
  public Long getAiNonVettedLearnTotal() {
    return aiNonVettedLearnTotal;
  }

  public void setAiNonVettedLearnTotal(Long aiNonVettedLearnTotal) {
    this.aiNonVettedLearnTotal = aiNonVettedLearnTotal;
  }

  public ClassifierMetricsOut metricTimeStamp(Long metricTimeStamp) {
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

  public ClassifierMetricsOut aiStartTime(Long aiStartTime) {
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

  public ClassifierMetricsOut aiVettedExpectedClassMetrics(List<ExpectedClassMetricsOut> aiVettedExpectedClassMetrics) {
    this.aiVettedExpectedClassMetrics = aiVettedExpectedClassMetrics;
    return this;
  }

  public ClassifierMetricsOut addAiVettedExpectedClassMetricsItem(ExpectedClassMetricsOut aiVettedExpectedClassMetricsItem) {
    if (this.aiVettedExpectedClassMetrics == null) {
      this.aiVettedExpectedClassMetrics = new ArrayList<ExpectedClassMetricsOut>();
    }
    this.aiVettedExpectedClassMetrics.add(aiVettedExpectedClassMetricsItem);
    return this;
  }

   /**
   * Get aiVettedExpectedClassMetrics
   * @return aiVettedExpectedClassMetrics
  **/
  @ApiModelProperty(value = "")
  public List<ExpectedClassMetricsOut> getAiVettedExpectedClassMetrics() {
    return aiVettedExpectedClassMetrics;
  }

  public void setAiVettedExpectedClassMetrics(List<ExpectedClassMetricsOut> aiVettedExpectedClassMetrics) {
    this.aiVettedExpectedClassMetrics = aiVettedExpectedClassMetrics;
  }

  public ClassifierMetricsOut aiNonVettedExpectedClassMetrics(List<ExpectedClassMetricsOut> aiNonVettedExpectedClassMetrics) {
    this.aiNonVettedExpectedClassMetrics = aiNonVettedExpectedClassMetrics;
    return this;
  }

  public ClassifierMetricsOut addAiNonVettedExpectedClassMetricsItem(ExpectedClassMetricsOut aiNonVettedExpectedClassMetricsItem) {
    if (this.aiNonVettedExpectedClassMetrics == null) {
      this.aiNonVettedExpectedClassMetrics = new ArrayList<ExpectedClassMetricsOut>();
    }
    this.aiNonVettedExpectedClassMetrics.add(aiNonVettedExpectedClassMetricsItem);
    return this;
  }

   /**
   * Get aiNonVettedExpectedClassMetrics
   * @return aiNonVettedExpectedClassMetrics
  **/
  @ApiModelProperty(value = "")
  public List<ExpectedClassMetricsOut> getAiNonVettedExpectedClassMetrics() {
    return aiNonVettedExpectedClassMetrics;
  }

  public void setAiNonVettedExpectedClassMetrics(List<ExpectedClassMetricsOut> aiNonVettedExpectedClassMetrics) {
    this.aiNonVettedExpectedClassMetrics = aiNonVettedExpectedClassMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassifierMetricsOut classifierMetricsOut = (ClassifierMetricsOut) o;
    return Objects.equals(this.learnQueueSize, classifierMetricsOut.learnQueueSize) &&
        Objects.equals(this.bufferSize, classifierMetricsOut.bufferSize) &&
        Objects.equals(this.preClassifyQueueSize, classifierMetricsOut.preClassifyQueueSize) &&
        Objects.equals(this.factKeysSize, classifierMetricsOut.factKeysSize) &&
        Objects.equals(this.factsLearned, classifierMetricsOut.factsLearned) &&
        Objects.equals(this.classifyDurationsCurrent, classifierMetricsOut.classifyDurationsCurrent) &&
        Objects.equals(this.classifyDurationsSummary, classifierMetricsOut.classifyDurationsSummary) &&
        Objects.equals(this.learnDurationsCurrent, classifierMetricsOut.learnDurationsCurrent) &&
        Objects.equals(this.learnDurationsSummary, classifierMetricsOut.learnDurationsSummary) &&
        Objects.equals(this.classifierName, classifierMetricsOut.classifierName) &&
        Objects.equals(this.featuresSize, classifierMetricsOut.featuresSize) &&
        Objects.equals(this.aiVettedEstimateTotal, classifierMetricsOut.aiVettedEstimateTotal) &&
        Objects.equals(this.aiVettedEstimatePrecision, classifierMetricsOut.aiVettedEstimatePrecision) &&
        Objects.equals(this.aiVettedEstimateRecall, classifierMetricsOut.aiVettedEstimateRecall) &&
        Objects.equals(this.aiVettedLearnTotal, classifierMetricsOut.aiVettedLearnTotal) &&
        Objects.equals(this.aiNonVettedEstimateTotal, classifierMetricsOut.aiNonVettedEstimateTotal) &&
        Objects.equals(this.aiNonVettedEstimatePrecision, classifierMetricsOut.aiNonVettedEstimatePrecision) &&
        Objects.equals(this.aiNonVettedEstimateRecall, classifierMetricsOut.aiNonVettedEstimateRecall) &&
        Objects.equals(this.aiNonVettedLearnTotal, classifierMetricsOut.aiNonVettedLearnTotal) &&
        Objects.equals(this.metricTimeStamp, classifierMetricsOut.metricTimeStamp) &&
        Objects.equals(this.aiStartTime, classifierMetricsOut.aiStartTime) &&
        Objects.equals(this.aiVettedExpectedClassMetrics, classifierMetricsOut.aiVettedExpectedClassMetrics) &&
        Objects.equals(this.aiNonVettedExpectedClassMetrics, classifierMetricsOut.aiNonVettedExpectedClassMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(learnQueueSize, bufferSize, preClassifyQueueSize, factKeysSize, factsLearned, classifyDurationsCurrent, classifyDurationsSummary, learnDurationsCurrent, learnDurationsSummary, classifierName, featuresSize, aiVettedEstimateTotal, aiVettedEstimatePrecision, aiVettedEstimateRecall, aiVettedLearnTotal, aiNonVettedEstimateTotal, aiNonVettedEstimatePrecision, aiNonVettedEstimateRecall, aiNonVettedLearnTotal, metricTimeStamp, aiStartTime, aiVettedExpectedClassMetrics, aiNonVettedExpectedClassMetrics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassifierMetricsOut {\n");
    sb.append("    learnQueueSize: ").append(toIndentedString(learnQueueSize)).append("\n");
    sb.append("    bufferSize: ").append(toIndentedString(bufferSize)).append("\n");
    sb.append("    preClassifyQueueSize: ").append(toIndentedString(preClassifyQueueSize)).append("\n");
    sb.append("    factKeysSize: ").append(toIndentedString(factKeysSize)).append("\n");
    sb.append("    factsLearned: ").append(toIndentedString(factsLearned)).append("\n");
    sb.append("    classifyDurationsCurrent: ").append(toIndentedString(classifyDurationsCurrent)).append("\n");
    sb.append("    classifyDurationsSummary: ").append(toIndentedString(classifyDurationsSummary)).append("\n");
    sb.append("    learnDurationsCurrent: ").append(toIndentedString(learnDurationsCurrent)).append("\n");
    sb.append("    learnDurationsSummary: ").append(toIndentedString(learnDurationsSummary)).append("\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    featuresSize: ").append(toIndentedString(featuresSize)).append("\n");
    sb.append("    aiVettedEstimateTotal: ").append(toIndentedString(aiVettedEstimateTotal)).append("\n");
    sb.append("    aiVettedEstimatePrecision: ").append(toIndentedString(aiVettedEstimatePrecision)).append("\n");
    sb.append("    aiVettedEstimateRecall: ").append(toIndentedString(aiVettedEstimateRecall)).append("\n");
    sb.append("    aiVettedLearnTotal: ").append(toIndentedString(aiVettedLearnTotal)).append("\n");
    sb.append("    aiNonVettedEstimateTotal: ").append(toIndentedString(aiNonVettedEstimateTotal)).append("\n");
    sb.append("    aiNonVettedEstimatePrecision: ").append(toIndentedString(aiNonVettedEstimatePrecision)).append("\n");
    sb.append("    aiNonVettedEstimateRecall: ").append(toIndentedString(aiNonVettedEstimateRecall)).append("\n");
    sb.append("    aiNonVettedLearnTotal: ").append(toIndentedString(aiNonVettedLearnTotal)).append("\n");
    sb.append("    metricTimeStamp: ").append(toIndentedString(metricTimeStamp)).append("\n");
    sb.append("    aiStartTime: ").append(toIndentedString(aiStartTime)).append("\n");
    sb.append("    aiVettedExpectedClassMetrics: ").append(toIndentedString(aiVettedExpectedClassMetrics)).append("\n");
    sb.append("    aiNonVettedExpectedClassMetrics: ").append(toIndentedString(aiNonVettedExpectedClassMetrics)).append("\n");
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

