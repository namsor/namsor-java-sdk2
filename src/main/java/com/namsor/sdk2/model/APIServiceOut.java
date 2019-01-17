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
 * APIServiceOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-17T18:30:50.594+01:00[Europe/Berlin]")
public class APIServiceOut {
  public static final String SERIALIZED_NAME_SERVICE_NAME = "serviceName";
  @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
  private String serviceName;

  public static final String SERIALIZED_NAME_SERVICE_GROUP = "serviceGroup";
  @SerializedName(SERIALIZED_NAME_SERVICE_GROUP)
  private String serviceGroup;

  public static final String SERIALIZED_NAME_COST_IN_UNITS = "costInUnits";
  @SerializedName(SERIALIZED_NAME_COST_IN_UNITS)
  private Integer costInUnits;

  public APIServiceOut serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public APIServiceOut serviceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
    return this;
  }

   /**
   * Get serviceGroup
   * @return serviceGroup
  **/
  @ApiModelProperty(value = "")
  public String getServiceGroup() {
    return serviceGroup;
  }

  public void setServiceGroup(String serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  public APIServiceOut costInUnits(Integer costInUnits) {
    this.costInUnits = costInUnits;
    return this;
  }

   /**
   * Get costInUnits
   * @return costInUnits
  **/
  @ApiModelProperty(value = "")
  public Integer getCostInUnits() {
    return costInUnits;
  }

  public void setCostInUnits(Integer costInUnits) {
    this.costInUnits = costInUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIServiceOut apIServiceOut = (APIServiceOut) o;
    return Objects.equals(this.serviceName, apIServiceOut.serviceName) &&
        Objects.equals(this.serviceGroup, apIServiceOut.serviceGroup) &&
        Objects.equals(this.costInUnits, apIServiceOut.costInUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, serviceGroup, costInUnits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIServiceOut {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    costInUnits: ").append(toIndentedString(costInUnits)).append("\n");
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

