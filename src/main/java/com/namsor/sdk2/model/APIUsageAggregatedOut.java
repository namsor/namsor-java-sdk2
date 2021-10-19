/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.16
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
 * APIUsageAggregatedOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-19T10:09:03.048+02:00[Europe/Berlin]")
public class APIUsageAggregatedOut {
  public static final String SERIALIZED_NAME_TIME_UNIT = "timeUnit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private String timeUnit;

  public static final String SERIALIZED_NAME_PERIOD_START = "periodStart";
  @SerializedName(SERIALIZED_NAME_PERIOD_START)
  private Long periodStart;

  public static final String SERIALIZED_NAME_PERIOD_END = "periodEnd";
  @SerializedName(SERIALIZED_NAME_PERIOD_END)
  private Long periodEnd;

  public static final String SERIALIZED_NAME_TOTAL_USAGE = "totalUsage";
  @SerializedName(SERIALIZED_NAME_TOTAL_USAGE)
  private Long totalUsage;

  public static final String SERIALIZED_NAME_HISTORY_TRUNCATED = "historyTruncated";
  @SerializedName(SERIALIZED_NAME_HISTORY_TRUNCATED)
  private Boolean historyTruncated;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<List<Integer>> data = new ArrayList<List<Integer>>();

  public static final String SERIALIZED_NAME_COL_HEADERS = "colHeaders";
  @SerializedName(SERIALIZED_NAME_COL_HEADERS)
  private List<String> colHeaders = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ROW_HEADERS = "rowHeaders";
  @SerializedName(SERIALIZED_NAME_ROW_HEADERS)
  private List<String> rowHeaders = new ArrayList<String>();

  public APIUsageAggregatedOut timeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Time unit is DAY, WEEK or MONTH depending on prior usage
   * @return timeUnit
  **/
  @ApiModelProperty(value = "Time unit is DAY, WEEK or MONTH depending on prior usage")
  public String getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }

  public APIUsageAggregatedOut periodStart(Long periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Start datetime of the reporting period
   * @return periodStart
  **/
  @ApiModelProperty(value = "Start datetime of the reporting period")
  public Long getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(Long periodStart) {
    this.periodStart = periodStart;
  }

  public APIUsageAggregatedOut periodEnd(Long periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * End datetime of the reporting period
   * @return periodEnd
  **/
  @ApiModelProperty(value = "End datetime of the reporting period")
  public Long getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(Long periodEnd) {
    this.periodEnd = periodEnd;
  }

  public APIUsageAggregatedOut totalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
    return this;
  }

   /**
   * Total usage in the current period
   * @return totalUsage
  **/
  @ApiModelProperty(value = "Total usage in the current period")
  public Long getTotalUsage() {
    return totalUsage;
  }

  public void setTotalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
  }

  public APIUsageAggregatedOut historyTruncated(Boolean historyTruncated) {
    this.historyTruncated = historyTruncated;
    return this;
  }

   /**
   * If the history was truncaded due to data limit
   * @return historyTruncated
  **/
  @ApiModelProperty(value = "If the history was truncaded due to data limit")
  public Boolean getHistoryTruncated() {
    return historyTruncated;
  }

  public void setHistoryTruncated(Boolean historyTruncated) {
    this.historyTruncated = historyTruncated;
  }

  public APIUsageAggregatedOut data(List<List<Integer>> data) {
    this.data = data;
    return this;
  }

  public APIUsageAggregatedOut addDataItem(List<Integer> dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<List<Integer>>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Data points : usage per DAY, WEEK or MONTH and per apiService
   * @return data
  **/
  @ApiModelProperty(value = "Data points : usage per DAY, WEEK or MONTH and per apiService")
  public List<List<Integer>> getData() {
    return data;
  }

  public void setData(List<List<Integer>> data) {
    this.data = data;
  }

  public APIUsageAggregatedOut colHeaders(List<String> colHeaders) {
    this.colHeaders = colHeaders;
    return this;
  }

  public APIUsageAggregatedOut addColHeadersItem(String colHeadersItem) {
    if (this.colHeaders == null) {
      this.colHeaders = new ArrayList<String>();
    }
    this.colHeaders.add(colHeadersItem);
    return this;
  }

   /**
   * apiServices as column headers 
   * @return colHeaders
  **/
  @ApiModelProperty(value = "apiServices as column headers ")
  public List<String> getColHeaders() {
    return colHeaders;
  }

  public void setColHeaders(List<String> colHeaders) {
    this.colHeaders = colHeaders;
  }

  public APIUsageAggregatedOut rowHeaders(List<String> rowHeaders) {
    this.rowHeaders = rowHeaders;
    return this;
  }

  public APIUsageAggregatedOut addRowHeadersItem(String rowHeadersItem) {
    if (this.rowHeaders == null) {
      this.rowHeaders = new ArrayList<String>();
    }
    this.rowHeaders.add(rowHeadersItem);
    return this;
  }

   /**
   * dates as row headers 
   * @return rowHeaders
  **/
  @ApiModelProperty(value = "dates as row headers ")
  public List<String> getRowHeaders() {
    return rowHeaders;
  }

  public void setRowHeaders(List<String> rowHeaders) {
    this.rowHeaders = rowHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIUsageAggregatedOut apIUsageAggregatedOut = (APIUsageAggregatedOut) o;
    return Objects.equals(this.timeUnit, apIUsageAggregatedOut.timeUnit) &&
        Objects.equals(this.periodStart, apIUsageAggregatedOut.periodStart) &&
        Objects.equals(this.periodEnd, apIUsageAggregatedOut.periodEnd) &&
        Objects.equals(this.totalUsage, apIUsageAggregatedOut.totalUsage) &&
        Objects.equals(this.historyTruncated, apIUsageAggregatedOut.historyTruncated) &&
        Objects.equals(this.data, apIUsageAggregatedOut.data) &&
        Objects.equals(this.colHeaders, apIUsageAggregatedOut.colHeaders) &&
        Objects.equals(this.rowHeaders, apIUsageAggregatedOut.rowHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, periodStart, periodEnd, totalUsage, historyTruncated, data, colHeaders, rowHeaders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIUsageAggregatedOut {\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
    sb.append("    historyTruncated: ").append(toIndentedString(historyTruncated)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    colHeaders: ").append(toIndentedString(colHeaders)).append("\n");
    sb.append("    rowHeaders: ").append(toIndentedString(rowHeaders)).append("\n");
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

