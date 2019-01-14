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
import com.namsor.sdk2.model.ClassifierMetricsOut;
import com.namsor.sdk2.model.SourceMetricsOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SystemMetricsOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T09:54:19.925+01:00[Europe/Berlin]")
public class SystemMetricsOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_METRICS = "classifierMetrics";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_METRICS)
  private List<ClassifierMetricsOut> classifierMetrics = new ArrayList<ClassifierMetricsOut>();

  public static final String SERIALIZED_NAME_SOURCE_METRICS = "sourceMetrics";
  @SerializedName(SERIALIZED_NAME_SOURCE_METRICS)
  private List<SourceMetricsOut> sourceMetrics = new ArrayList<SourceMetricsOut>();

  public static final String SERIALIZED_NAME_TOTAL_MEM = "totalMem";
  @SerializedName(SERIALIZED_NAME_TOTAL_MEM)
  private Long totalMem;

  public static final String SERIALIZED_NAME_FREE_MEM = "freeMem";
  @SerializedName(SERIALIZED_NAME_FREE_MEM)
  private Long freeMem;

  public static final String SERIALIZED_NAME_MAX_MEM = "maxMem";
  @SerializedName(SERIALIZED_NAME_MAX_MEM)
  private Long maxMem;

  public SystemMetricsOut classifierMetrics(List<ClassifierMetricsOut> classifierMetrics) {
    this.classifierMetrics = classifierMetrics;
    return this;
  }

  public SystemMetricsOut addClassifierMetricsItem(ClassifierMetricsOut classifierMetricsItem) {
    if (this.classifierMetrics == null) {
      this.classifierMetrics = new ArrayList<ClassifierMetricsOut>();
    }
    this.classifierMetrics.add(classifierMetricsItem);
    return this;
  }

   /**
   * Get classifierMetrics
   * @return classifierMetrics
  **/
  @ApiModelProperty(value = "")
  public List<ClassifierMetricsOut> getClassifierMetrics() {
    return classifierMetrics;
  }

  public void setClassifierMetrics(List<ClassifierMetricsOut> classifierMetrics) {
    this.classifierMetrics = classifierMetrics;
  }

  public SystemMetricsOut sourceMetrics(List<SourceMetricsOut> sourceMetrics) {
    this.sourceMetrics = sourceMetrics;
    return this;
  }

  public SystemMetricsOut addSourceMetricsItem(SourceMetricsOut sourceMetricsItem) {
    if (this.sourceMetrics == null) {
      this.sourceMetrics = new ArrayList<SourceMetricsOut>();
    }
    this.sourceMetrics.add(sourceMetricsItem);
    return this;
  }

   /**
   * Get sourceMetrics
   * @return sourceMetrics
  **/
  @ApiModelProperty(value = "")
  public List<SourceMetricsOut> getSourceMetrics() {
    return sourceMetrics;
  }

  public void setSourceMetrics(List<SourceMetricsOut> sourceMetrics) {
    this.sourceMetrics = sourceMetrics;
  }

  public SystemMetricsOut totalMem(Long totalMem) {
    this.totalMem = totalMem;
    return this;
  }

   /**
   * Get totalMem
   * @return totalMem
  **/
  @ApiModelProperty(value = "")
  public Long getTotalMem() {
    return totalMem;
  }

  public void setTotalMem(Long totalMem) {
    this.totalMem = totalMem;
  }

  public SystemMetricsOut freeMem(Long freeMem) {
    this.freeMem = freeMem;
    return this;
  }

   /**
   * Get freeMem
   * @return freeMem
  **/
  @ApiModelProperty(value = "")
  public Long getFreeMem() {
    return freeMem;
  }

  public void setFreeMem(Long freeMem) {
    this.freeMem = freeMem;
  }

  public SystemMetricsOut maxMem(Long maxMem) {
    this.maxMem = maxMem;
    return this;
  }

   /**
   * Get maxMem
   * @return maxMem
  **/
  @ApiModelProperty(value = "")
  public Long getMaxMem() {
    return maxMem;
  }

  public void setMaxMem(Long maxMem) {
    this.maxMem = maxMem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMetricsOut systemMetricsOut = (SystemMetricsOut) o;
    return Objects.equals(this.classifierMetrics, systemMetricsOut.classifierMetrics) &&
        Objects.equals(this.sourceMetrics, systemMetricsOut.sourceMetrics) &&
        Objects.equals(this.totalMem, systemMetricsOut.totalMem) &&
        Objects.equals(this.freeMem, systemMetricsOut.freeMem) &&
        Objects.equals(this.maxMem, systemMetricsOut.maxMem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierMetrics, sourceMetrics, totalMem, freeMem, maxMem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMetricsOut {\n");
    sb.append("    classifierMetrics: ").append(toIndentedString(classifierMetrics)).append("\n");
    sb.append("    sourceMetrics: ").append(toIndentedString(sourceMetrics)).append("\n");
    sb.append("    totalMem: ").append(toIndentedString(totalMem)).append("\n");
    sb.append("    freeMem: ").append(toIndentedString(freeMem)).append("\n");
    sb.append("    maxMem: ").append(toIndentedString(maxMem)).append("\n");
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

