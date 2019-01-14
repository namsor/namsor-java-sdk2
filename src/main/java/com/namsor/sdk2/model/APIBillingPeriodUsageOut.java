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
 * APIBillingPeriodUsageOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T09:54:19.925+01:00[Europe/Berlin]")
public class APIBillingPeriodUsageOut {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_STARTED = "subscriptionStarted";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_STARTED)
  private Long subscriptionStarted;

  public static final String SERIALIZED_NAME_PERIOD_STARTED = "periodStarted";
  @SerializedName(SERIALIZED_NAME_PERIOD_STARTED)
  private Long periodStarted;

  public static final String SERIALIZED_NAME_PERIOD_ENDED = "periodEnded";
  @SerializedName(SERIALIZED_NAME_PERIOD_ENDED)
  private Long periodEnded;

  public static final String SERIALIZED_NAME_STRIPE_CURRENT_PERIOD_END = "stripeCurrentPeriodEnd";
  @SerializedName(SERIALIZED_NAME_STRIPE_CURRENT_PERIOD_END)
  private Long stripeCurrentPeriodEnd;

  public static final String SERIALIZED_NAME_STRIPE_CURRENT_PERIOD_START = "stripeCurrentPeriodStart";
  @SerializedName(SERIALIZED_NAME_STRIPE_CURRENT_PERIOD_START)
  private Long stripeCurrentPeriodStart;

  public static final String SERIALIZED_NAME_BILLING_STATUS = "billingStatus";
  @SerializedName(SERIALIZED_NAME_BILLING_STATUS)
  private String billingStatus;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Long usage;

  public static final String SERIALIZED_NAME_SOFT_LIMIT = "softLimit";
  @SerializedName(SERIALIZED_NAME_SOFT_LIMIT)
  private Long softLimit;

  public static final String SERIALIZED_NAME_HARD_LIMIT = "hardLimit";
  @SerializedName(SERIALIZED_NAME_HARD_LIMIT)
  private Long hardLimit;

  public APIBillingPeriodUsageOut apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public APIBillingPeriodUsageOut subscriptionStarted(Long subscriptionStarted) {
    this.subscriptionStarted = subscriptionStarted;
    return this;
  }

   /**
   * Get subscriptionStarted
   * @return subscriptionStarted
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionStarted() {
    return subscriptionStarted;
  }

  public void setSubscriptionStarted(Long subscriptionStarted) {
    this.subscriptionStarted = subscriptionStarted;
  }

  public APIBillingPeriodUsageOut periodStarted(Long periodStarted) {
    this.periodStarted = periodStarted;
    return this;
  }

   /**
   * Get periodStarted
   * @return periodStarted
  **/
  @ApiModelProperty(value = "")
  public Long getPeriodStarted() {
    return periodStarted;
  }

  public void setPeriodStarted(Long periodStarted) {
    this.periodStarted = periodStarted;
  }

  public APIBillingPeriodUsageOut periodEnded(Long periodEnded) {
    this.periodEnded = periodEnded;
    return this;
  }

   /**
   * Get periodEnded
   * @return periodEnded
  **/
  @ApiModelProperty(value = "")
  public Long getPeriodEnded() {
    return periodEnded;
  }

  public void setPeriodEnded(Long periodEnded) {
    this.periodEnded = periodEnded;
  }

  public APIBillingPeriodUsageOut stripeCurrentPeriodEnd(Long stripeCurrentPeriodEnd) {
    this.stripeCurrentPeriodEnd = stripeCurrentPeriodEnd;
    return this;
  }

   /**
   * Get stripeCurrentPeriodEnd
   * @return stripeCurrentPeriodEnd
  **/
  @ApiModelProperty(value = "")
  public Long getStripeCurrentPeriodEnd() {
    return stripeCurrentPeriodEnd;
  }

  public void setStripeCurrentPeriodEnd(Long stripeCurrentPeriodEnd) {
    this.stripeCurrentPeriodEnd = stripeCurrentPeriodEnd;
  }

  public APIBillingPeriodUsageOut stripeCurrentPeriodStart(Long stripeCurrentPeriodStart) {
    this.stripeCurrentPeriodStart = stripeCurrentPeriodStart;
    return this;
  }

   /**
   * Get stripeCurrentPeriodStart
   * @return stripeCurrentPeriodStart
  **/
  @ApiModelProperty(value = "")
  public Long getStripeCurrentPeriodStart() {
    return stripeCurrentPeriodStart;
  }

  public void setStripeCurrentPeriodStart(Long stripeCurrentPeriodStart) {
    this.stripeCurrentPeriodStart = stripeCurrentPeriodStart;
  }

  public APIBillingPeriodUsageOut billingStatus(String billingStatus) {
    this.billingStatus = billingStatus;
    return this;
  }

   /**
   * Get billingStatus
   * @return billingStatus
  **/
  @ApiModelProperty(value = "")
  public String getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(String billingStatus) {
    this.billingStatus = billingStatus;
  }

  public APIBillingPeriodUsageOut usage(Long usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @ApiModelProperty(value = "")
  public Long getUsage() {
    return usage;
  }

  public void setUsage(Long usage) {
    this.usage = usage;
  }

  public APIBillingPeriodUsageOut softLimit(Long softLimit) {
    this.softLimit = softLimit;
    return this;
  }

   /**
   * Get softLimit
   * @return softLimit
  **/
  @ApiModelProperty(value = "")
  public Long getSoftLimit() {
    return softLimit;
  }

  public void setSoftLimit(Long softLimit) {
    this.softLimit = softLimit;
  }

  public APIBillingPeriodUsageOut hardLimit(Long hardLimit) {
    this.hardLimit = hardLimit;
    return this;
  }

   /**
   * Get hardLimit
   * @return hardLimit
  **/
  @ApiModelProperty(value = "")
  public Long getHardLimit() {
    return hardLimit;
  }

  public void setHardLimit(Long hardLimit) {
    this.hardLimit = hardLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBillingPeriodUsageOut apIBillingPeriodUsageOut = (APIBillingPeriodUsageOut) o;
    return Objects.equals(this.apiKey, apIBillingPeriodUsageOut.apiKey) &&
        Objects.equals(this.subscriptionStarted, apIBillingPeriodUsageOut.subscriptionStarted) &&
        Objects.equals(this.periodStarted, apIBillingPeriodUsageOut.periodStarted) &&
        Objects.equals(this.periodEnded, apIBillingPeriodUsageOut.periodEnded) &&
        Objects.equals(this.stripeCurrentPeriodEnd, apIBillingPeriodUsageOut.stripeCurrentPeriodEnd) &&
        Objects.equals(this.stripeCurrentPeriodStart, apIBillingPeriodUsageOut.stripeCurrentPeriodStart) &&
        Objects.equals(this.billingStatus, apIBillingPeriodUsageOut.billingStatus) &&
        Objects.equals(this.usage, apIBillingPeriodUsageOut.usage) &&
        Objects.equals(this.softLimit, apIBillingPeriodUsageOut.softLimit) &&
        Objects.equals(this.hardLimit, apIBillingPeriodUsageOut.hardLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, subscriptionStarted, periodStarted, periodEnded, stripeCurrentPeriodEnd, stripeCurrentPeriodStart, billingStatus, usage, softLimit, hardLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBillingPeriodUsageOut {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    subscriptionStarted: ").append(toIndentedString(subscriptionStarted)).append("\n");
    sb.append("    periodStarted: ").append(toIndentedString(periodStarted)).append("\n");
    sb.append("    periodEnded: ").append(toIndentedString(periodEnded)).append("\n");
    sb.append("    stripeCurrentPeriodEnd: ").append(toIndentedString(stripeCurrentPeriodEnd)).append("\n");
    sb.append("    stripeCurrentPeriodStart: ").append(toIndentedString(stripeCurrentPeriodStart)).append("\n");
    sb.append("    billingStatus: ").append(toIndentedString(billingStatus)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    softLimit: ").append(toIndentedString(softLimit)).append("\n");
    sb.append("    hardLimit: ").append(toIndentedString(hardLimit)).append("\n");
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
