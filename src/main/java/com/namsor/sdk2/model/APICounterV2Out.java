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
import com.namsor.sdk2.model.APIKeyOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Detailed usage as reported by the deduplicating API counter.
 */
@ApiModel(description = "Detailed usage as reported by the deduplicating API counter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:33:14.621+02:00[Europe/Berlin]")
public class APICounterV2Out {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private APIKeyOut apiKey = null;

  public static final String SERIALIZED_NAME_API_SERVICE = "apiService";
  @SerializedName(SERIALIZED_NAME_API_SERVICE)
  private String apiService;

  public static final String SERIALIZED_NAME_HOST_ADDRESS = "hostAddress";
  @SerializedName(SERIALIZED_NAME_HOST_ADDRESS)
  private String hostAddress;

  public static final String SERIALIZED_NAME_CREATED_DATE_TIME = "createdDateTime";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE_TIME)
  private Long createdDateTime;

  public static final String SERIALIZED_NAME_TOTAL_USAGE = "totalUsage";
  @SerializedName(SERIALIZED_NAME_TOTAL_USAGE)
  private Long totalUsage;

  public static final String SERIALIZED_NAME_LAST_FLUSHED_DATE_TIME = "lastFlushedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_FLUSHED_DATE_TIME)
  private Long lastFlushedDateTime;

  public static final String SERIALIZED_NAME_LAST_USED_DATE_TIME = "lastUsedDateTime";
  @SerializedName(SERIALIZED_NAME_LAST_USED_DATE_TIME)
  private Long lastUsedDateTime;

  public static final String SERIALIZED_NAME_SERVICE_FEATURES_USAGE = "serviceFeaturesUsage";
  @SerializedName(SERIALIZED_NAME_SERVICE_FEATURES_USAGE)
  private Map<String, Long> serviceFeaturesUsage = new HashMap<String, Long>();

  public APICounterV2Out apiKey(APIKeyOut apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public APIKeyOut getApiKey() {
    return apiKey;
  }

  public void setApiKey(APIKeyOut apiKey) {
    this.apiKey = apiKey;
  }

  public APICounterV2Out apiService(String apiService) {
    this.apiService = apiService;
    return this;
  }

   /**
   * The apiService corresponds to the classifier name.
   * @return apiService
  **/
  @ApiModelProperty(value = "The apiService corresponds to the classifier name.")
  public String getApiService() {
    return apiService;
  }

  public void setApiService(String apiService) {
    this.apiService = apiService;
  }

  public APICounterV2Out hostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * The processing hostAddress.
   * @return hostAddress
  **/
  @ApiModelProperty(value = "The processing hostAddress.")
  public String getHostAddress() {
    return hostAddress;
  }

  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }

  public APICounterV2Out createdDateTime(Long createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * The create datetime of the counter.
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "The create datetime of the counter.")
  public Long getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(Long createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public APICounterV2Out totalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
    return this;
  }

   /**
   * The usage of the counter.
   * @return totalUsage
  **/
  @ApiModelProperty(value = "The usage of the counter.")
  public Long getTotalUsage() {
    return totalUsage;
  }

  public void setTotalUsage(Long totalUsage) {
    this.totalUsage = totalUsage;
  }

  public APICounterV2Out lastFlushedDateTime(Long lastFlushedDateTime) {
    this.lastFlushedDateTime = lastFlushedDateTime;
    return this;
  }

   /**
   * The flush datetime of the counter.
   * @return lastFlushedDateTime
  **/
  @ApiModelProperty(value = "The flush datetime of the counter.")
  public Long getLastFlushedDateTime() {
    return lastFlushedDateTime;
  }

  public void setLastFlushedDateTime(Long lastFlushedDateTime) {
    this.lastFlushedDateTime = lastFlushedDateTime;
  }

  public APICounterV2Out lastUsedDateTime(Long lastUsedDateTime) {
    this.lastUsedDateTime = lastUsedDateTime;
    return this;
  }

   /**
   * The last usage datetime of the counter.
   * @return lastUsedDateTime
  **/
  @ApiModelProperty(value = "The last usage datetime of the counter.")
  public Long getLastUsedDateTime() {
    return lastUsedDateTime;
  }

  public void setLastUsedDateTime(Long lastUsedDateTime) {
    this.lastUsedDateTime = lastUsedDateTime;
  }

  public APICounterV2Out serviceFeaturesUsage(Map<String, Long> serviceFeaturesUsage) {
    this.serviceFeaturesUsage = serviceFeaturesUsage;
    return this;
  }

  public APICounterV2Out putServiceFeaturesUsageItem(String key, Long serviceFeaturesUsageItem) {
    if (this.serviceFeaturesUsage == null) {
      this.serviceFeaturesUsage = new HashMap<String, Long>();
    }
    this.serviceFeaturesUsage.put(key, serviceFeaturesUsageItem);
    return this;
  }

   /**
   * Usage of special features, such as Chinese, Japanese.
   * @return serviceFeaturesUsage
  **/
  @ApiModelProperty(value = "Usage of special features, such as Chinese, Japanese.")
  public Map<String, Long> getServiceFeaturesUsage() {
    return serviceFeaturesUsage;
  }

  public void setServiceFeaturesUsage(Map<String, Long> serviceFeaturesUsage) {
    this.serviceFeaturesUsage = serviceFeaturesUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APICounterV2Out apICounterV2Out = (APICounterV2Out) o;
    return Objects.equals(this.apiKey, apICounterV2Out.apiKey) &&
        Objects.equals(this.apiService, apICounterV2Out.apiService) &&
        Objects.equals(this.hostAddress, apICounterV2Out.hostAddress) &&
        Objects.equals(this.createdDateTime, apICounterV2Out.createdDateTime) &&
        Objects.equals(this.totalUsage, apICounterV2Out.totalUsage) &&
        Objects.equals(this.lastFlushedDateTime, apICounterV2Out.lastFlushedDateTime) &&
        Objects.equals(this.lastUsedDateTime, apICounterV2Out.lastUsedDateTime) &&
        Objects.equals(this.serviceFeaturesUsage, apICounterV2Out.serviceFeaturesUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, apiService, hostAddress, createdDateTime, totalUsage, lastFlushedDateTime, lastUsedDateTime, serviceFeaturesUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APICounterV2Out {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiService: ").append(toIndentedString(apiService)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    totalUsage: ").append(toIndentedString(totalUsage)).append("\n");
    sb.append("    lastFlushedDateTime: ").append(toIndentedString(lastFlushedDateTime)).append("\n");
    sb.append("    lastUsedDateTime: ").append(toIndentedString(lastUsedDateTime)).append("\n");
    sb.append("    serviceFeaturesUsage: ").append(toIndentedString(serviceFeaturesUsage)).append("\n");
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

