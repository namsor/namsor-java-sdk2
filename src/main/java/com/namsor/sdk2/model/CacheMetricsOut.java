/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.10
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
 * Simple metrics system caches
 */
@ApiModel(description = "Simple metrics system caches")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-07T20:31:24.687+02:00[Europe/Berlin]")
public class CacheMetricsOut {
  public static final String SERIALIZED_NAME_CACHE_NAME = "cacheName";
  @SerializedName(SERIALIZED_NAME_CACHE_NAME)
  private String cacheName;

  public static final String SERIALIZED_NAME_CACHE_STATS = "cacheStats";
  @SerializedName(SERIALIZED_NAME_CACHE_STATS)
  private String cacheStats;

  public CacheMetricsOut cacheName(String cacheName) {
    this.cacheName = cacheName;
    return this;
  }

   /**
   * Get cacheName
   * @return cacheName
  **/
  @ApiModelProperty(value = "")
  public String getCacheName() {
    return cacheName;
  }

  public void setCacheName(String cacheName) {
    this.cacheName = cacheName;
  }

  public CacheMetricsOut cacheStats(String cacheStats) {
    this.cacheStats = cacheStats;
    return this;
  }

   /**
   * Get cacheStats
   * @return cacheStats
  **/
  @ApiModelProperty(value = "")
  public String getCacheStats() {
    return cacheStats;
  }

  public void setCacheStats(String cacheStats) {
    this.cacheStats = cacheStats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheMetricsOut cacheMetricsOut = (CacheMetricsOut) o;
    return Objects.equals(this.cacheName, cacheMetricsOut.cacheName) &&
        Objects.equals(this.cacheStats, cacheMetricsOut.cacheStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheName, cacheStats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheMetricsOut {\n");
    sb.append("    cacheName: ").append(toIndentedString(cacheName)).append("\n");
    sb.append("    cacheStats: ").append(toIndentedString(cacheStats)).append("\n");
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
