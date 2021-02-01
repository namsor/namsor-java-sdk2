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
import com.namsor.sdk2.model.APIBillingPeriodUsageOut;
import com.namsor.sdk2.model.APIPlanSubscriptionOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * APIPeriodUsageOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class APIPeriodUsageOut {
  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private APIPlanSubscriptionOut subscription = null;

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private APIBillingPeriodUsageOut billingPeriod = null;

  public static final String SERIALIZED_NAME_OVERAGE_EXCL_TAX = "overageExclTax";
  @SerializedName(SERIALIZED_NAME_OVERAGE_EXCL_TAX)
  private Double overageExclTax;

  public static final String SERIALIZED_NAME_OVERAGE_INCL_TAX = "overageInclTax";
  @SerializedName(SERIALIZED_NAME_OVERAGE_INCL_TAX)
  private Double overageInclTax;

  public static final String SERIALIZED_NAME_OVERAGE_CURRENCY = "overageCurrency";
  @SerializedName(SERIALIZED_NAME_OVERAGE_CURRENCY)
  private String overageCurrency;

  public static final String SERIALIZED_NAME_OVERAGE_QUANTITY = "overageQuantity";
  @SerializedName(SERIALIZED_NAME_OVERAGE_QUANTITY)
  private Long overageQuantity;

  public APIPeriodUsageOut subscription(APIPlanSubscriptionOut subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public APIPlanSubscriptionOut getSubscription() {
    return subscription;
  }

  public void setSubscription(APIPlanSubscriptionOut subscription) {
    this.subscription = subscription;
  }

  public APIPeriodUsageOut billingPeriod(APIBillingPeriodUsageOut billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

   /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @ApiModelProperty(value = "")
  public APIBillingPeriodUsageOut getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(APIBillingPeriodUsageOut billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public APIPeriodUsageOut overageExclTax(Double overageExclTax) {
    this.overageExclTax = overageExclTax;
    return this;
  }

   /**
   * Get overageExclTax
   * @return overageExclTax
  **/
  @ApiModelProperty(value = "")
  public Double getOverageExclTax() {
    return overageExclTax;
  }

  public void setOverageExclTax(Double overageExclTax) {
    this.overageExclTax = overageExclTax;
  }

  public APIPeriodUsageOut overageInclTax(Double overageInclTax) {
    this.overageInclTax = overageInclTax;
    return this;
  }

   /**
   * Get overageInclTax
   * @return overageInclTax
  **/
  @ApiModelProperty(value = "")
  public Double getOverageInclTax() {
    return overageInclTax;
  }

  public void setOverageInclTax(Double overageInclTax) {
    this.overageInclTax = overageInclTax;
  }

  public APIPeriodUsageOut overageCurrency(String overageCurrency) {
    this.overageCurrency = overageCurrency;
    return this;
  }

   /**
   * Get overageCurrency
   * @return overageCurrency
  **/
  @ApiModelProperty(value = "")
  public String getOverageCurrency() {
    return overageCurrency;
  }

  public void setOverageCurrency(String overageCurrency) {
    this.overageCurrency = overageCurrency;
  }

  public APIPeriodUsageOut overageQuantity(Long overageQuantity) {
    this.overageQuantity = overageQuantity;
    return this;
  }

   /**
   * Get overageQuantity
   * @return overageQuantity
  **/
  @ApiModelProperty(value = "")
  public Long getOverageQuantity() {
    return overageQuantity;
  }

  public void setOverageQuantity(Long overageQuantity) {
    this.overageQuantity = overageQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPeriodUsageOut apIPeriodUsageOut = (APIPeriodUsageOut) o;
    return Objects.equals(this.subscription, apIPeriodUsageOut.subscription) &&
        Objects.equals(this.billingPeriod, apIPeriodUsageOut.billingPeriod) &&
        Objects.equals(this.overageExclTax, apIPeriodUsageOut.overageExclTax) &&
        Objects.equals(this.overageInclTax, apIPeriodUsageOut.overageInclTax) &&
        Objects.equals(this.overageCurrency, apIPeriodUsageOut.overageCurrency) &&
        Objects.equals(this.overageQuantity, apIPeriodUsageOut.overageQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, billingPeriod, overageExclTax, overageInclTax, overageCurrency, overageQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPeriodUsageOut {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    overageExclTax: ").append(toIndentedString(overageExclTax)).append("\n");
    sb.append("    overageInclTax: ").append(toIndentedString(overageInclTax)).append("\n");
    sb.append("    overageCurrency: ").append(toIndentedString(overageCurrency)).append("\n");
    sb.append("    overageQuantity: ").append(toIndentedString(overageQuantity)).append("\n");
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

