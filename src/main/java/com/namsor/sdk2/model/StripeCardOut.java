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
 * StripeCardOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T10:34:07.082+01:00[Europe/Berlin]")
public class StripeCardOut {
  public static final String SERIALIZED_NAME_DEFAULT_CARD = "defaultCard";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CARD)
  private Boolean defaultCard;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_EXP_MONTH = "expMonth";
  @SerializedName(SERIALIZED_NAME_EXP_MONTH)
  private Integer expMonth;

  public static final String SERIALIZED_NAME_EXP_YEAR = "expYear";
  @SerializedName(SERIALIZED_NAME_EXP_YEAR)
  private Integer expYear;

  public static final String SERIALIZED_NAME_LAST4 = "last4";
  @SerializedName(SERIALIZED_NAME_LAST4)
  private String last4;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public StripeCardOut defaultCard(Boolean defaultCard) {
    this.defaultCard = defaultCard;
    return this;
  }

   /**
   * Get defaultCard
   * @return defaultCard
  **/
  @ApiModelProperty(value = "")
  public Boolean getDefaultCard() {
    return defaultCard;
  }

  public void setDefaultCard(Boolean defaultCard) {
    this.defaultCard = defaultCard;
  }

  public StripeCardOut sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public StripeCardOut expMonth(Integer expMonth) {
    this.expMonth = expMonth;
    return this;
  }

   /**
   * Get expMonth
   * @return expMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getExpMonth() {
    return expMonth;
  }

  public void setExpMonth(Integer expMonth) {
    this.expMonth = expMonth;
  }

  public StripeCardOut expYear(Integer expYear) {
    this.expYear = expYear;
    return this;
  }

   /**
   * Get expYear
   * @return expYear
  **/
  @ApiModelProperty(value = "")
  public Integer getExpYear() {
    return expYear;
  }

  public void setExpYear(Integer expYear) {
    this.expYear = expYear;
  }

  public StripeCardOut last4(String last4) {
    this.last4 = last4;
    return this;
  }

   /**
   * Get last4
   * @return last4
  **/
  @ApiModelProperty(value = "")
  public String getLast4() {
    return last4;
  }

  public void setLast4(String last4) {
    this.last4 = last4;
  }

  public StripeCardOut brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Get brand
   * @return brand
  **/
  @ApiModelProperty(value = "")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeCardOut stripeCardOut = (StripeCardOut) o;
    return Objects.equals(this.defaultCard, stripeCardOut.defaultCard) &&
        Objects.equals(this.sourceId, stripeCardOut.sourceId) &&
        Objects.equals(this.expMonth, stripeCardOut.expMonth) &&
        Objects.equals(this.expYear, stripeCardOut.expYear) &&
        Objects.equals(this.last4, stripeCardOut.last4) &&
        Objects.equals(this.brand, stripeCardOut.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCard, sourceId, expMonth, expYear, last4, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeCardOut {\n");
    sb.append("    defaultCard: ").append(toIndentedString(defaultCard)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    expMonth: ").append(toIndentedString(expMonth)).append("\n");
    sb.append("    expYear: ").append(toIndentedString(expYear)).append("\n");
    sb.append("    last4: ").append(toIndentedString(last4)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

