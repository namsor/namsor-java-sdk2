/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.12
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
 * APIPlanOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class APIPlanOut {
  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_QUOTA = "planQuota";
  @SerializedName(SERIALIZED_NAME_PLAN_QUOTA)
  private Long planQuota;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PRICE_OVERAGE = "priceOverage";
  @SerializedName(SERIALIZED_NAME_PRICE_OVERAGE)
  private Double priceOverage;

  public APIPlanOut planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * Get planName
   * @return planName
  **/
  @ApiModelProperty(value = "")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public APIPlanOut planQuota(Long planQuota) {
    this.planQuota = planQuota;
    return this;
  }

   /**
   * Get planQuota
   * @return planQuota
  **/
  @ApiModelProperty(value = "")
  public Long getPlanQuota() {
    return planQuota;
  }

  public void setPlanQuota(Long planQuota) {
    this.planQuota = planQuota;
  }

  public APIPlanOut price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public APIPlanOut priceOverage(Double priceOverage) {
    this.priceOverage = priceOverage;
    return this;
  }

   /**
   * Get priceOverage
   * @return priceOverage
  **/
  @ApiModelProperty(value = "")
  public Double getPriceOverage() {
    return priceOverage;
  }

  public void setPriceOverage(Double priceOverage) {
    this.priceOverage = priceOverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPlanOut apIPlanOut = (APIPlanOut) o;
    return Objects.equals(this.planName, apIPlanOut.planName) &&
        Objects.equals(this.planQuota, apIPlanOut.planQuota) &&
        Objects.equals(this.price, apIPlanOut.price) &&
        Objects.equals(this.priceOverage, apIPlanOut.priceOverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planName, planQuota, price, priceOverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPlanOut {\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planQuota: ").append(toIndentedString(planQuota)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceOverage: ").append(toIndentedString(priceOverage)).append("\n");
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

