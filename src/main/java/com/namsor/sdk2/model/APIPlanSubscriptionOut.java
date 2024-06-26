/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.30
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
 * The API Plan governing the subscription.
 */
@ApiModel(description = "The API Plan governing the subscription.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class APIPlanSubscriptionOut {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_PLAN_STARTED = "planStarted";
  @SerializedName(SERIALIZED_NAME_PLAN_STARTED)
  private Long planStarted;

  public static final String SERIALIZED_NAME_PRIOR_PLAN_STARTED = "priorPlanStarted";
  @SerializedName(SERIALIZED_NAME_PRIOR_PLAN_STARTED)
  private Long priorPlanStarted;

  public static final String SERIALIZED_NAME_PLAN_ENDED = "planEnded";
  @SerializedName(SERIALIZED_NAME_PLAN_ENDED)
  private Long planEnded;

  public static final String SERIALIZED_NAME_TAX_RATE = "taxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Double taxRate;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_BASE_FEES_KEY = "planBaseFeesKey";
  @SerializedName(SERIALIZED_NAME_PLAN_BASE_FEES_KEY)
  private String planBaseFeesKey;

  public static final String SERIALIZED_NAME_PLAN_STATUS = "planStatus";
  @SerializedName(SERIALIZED_NAME_PLAN_STATUS)
  private String planStatus;

  public static final String SERIALIZED_NAME_PLAN_QUOTA = "planQuota";
  @SerializedName(SERIALIZED_NAME_PLAN_QUOTA)
  private Long planQuota;

  public static final String SERIALIZED_NAME_PRICE_U_S_D = "priceUSD";
  @SerializedName(SERIALIZED_NAME_PRICE_U_S_D)
  private Double priceUSD;

  public static final String SERIALIZED_NAME_PRICE_OVERAGE_U_S_D = "priceOverageUSD";
  @SerializedName(SERIALIZED_NAME_PRICE_OVERAGE_U_S_D)
  private Double priceOverageUSD;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_PRICE_OVERAGE = "priceOverage";
  @SerializedName(SERIALIZED_NAME_PRICE_OVERAGE)
  private Double priceOverage;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CURRENCY_FACTOR = "currencyFactor";
  @SerializedName(SERIALIZED_NAME_CURRENCY_FACTOR)
  private Double currencyFactor;

  public static final String SERIALIZED_NAME_STRIPE_CUSTOMER_ID = "stripeCustomerId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUSTOMER_ID)
  private String stripeCustomerId;

  public static final String SERIALIZED_NAME_STRIPE_STATUS = "stripeStatus";
  @SerializedName(SERIALIZED_NAME_STRIPE_STATUS)
  private String stripeStatus;

  public static final String SERIALIZED_NAME_STRIPE_SUBSCRIPTION = "stripeSubscription";
  @SerializedName(SERIALIZED_NAME_STRIPE_SUBSCRIPTION)
  private String stripeSubscription;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public APIPlanSubscriptionOut apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * User API Key.
   * @return apiKey
  **/
  @ApiModelProperty(value = "User API Key.")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public APIPlanSubscriptionOut planStarted(Long planStarted) {
    this.planStarted = planStarted;
    return this;
  }

   /**
   * Datetime when the user subscribed to the current plan.
   * @return planStarted
  **/
  @ApiModelProperty(value = "Datetime when the user subscribed to the current plan.")
  public Long getPlanStarted() {
    return planStarted;
  }

  public void setPlanStarted(Long planStarted) {
    this.planStarted = planStarted;
  }

  public APIPlanSubscriptionOut priorPlanStarted(Long priorPlanStarted) {
    this.priorPlanStarted = priorPlanStarted;
    return this;
  }

   /**
   * Datetime when the user subscribed to the prior plan.
   * @return priorPlanStarted
  **/
  @ApiModelProperty(value = "Datetime when the user subscribed to the prior plan.")
  public Long getPriorPlanStarted() {
    return priorPlanStarted;
  }

  public void setPriorPlanStarted(Long priorPlanStarted) {
    this.priorPlanStarted = priorPlanStarted;
  }

  public APIPlanSubscriptionOut planEnded(Long planEnded) {
    this.planEnded = planEnded;
    return this;
  }

   /**
   * Datetime when the user ended the plan.
   * @return planEnded
  **/
  @ApiModelProperty(value = "Datetime when the user ended the plan.")
  public Long getPlanEnded() {
    return planEnded;
  }

  public void setPlanEnded(Long planEnded) {
    this.planEnded = planEnded;
  }

  public APIPlanSubscriptionOut taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Applicable tax rate for the plan.
   * @return taxRate
  **/
  @ApiModelProperty(value = "Applicable tax rate for the plan.")
  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  public APIPlanSubscriptionOut planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * Current plan name.
   * @return planName
  **/
  @ApiModelProperty(value = "Current plan name.")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public APIPlanSubscriptionOut planBaseFeesKey(String planBaseFeesKey) {
    this.planBaseFeesKey = planBaseFeesKey;
    return this;
  }

   /**
   * Current plan key (as in Stripe product).
   * @return planBaseFeesKey
  **/
  @ApiModelProperty(value = "Current plan key (as in Stripe product).")
  public String getPlanBaseFeesKey() {
    return planBaseFeesKey;
  }

  public void setPlanBaseFeesKey(String planBaseFeesKey) {
    this.planBaseFeesKey = planBaseFeesKey;
  }

  public APIPlanSubscriptionOut planStatus(String planStatus) {
    this.planStatus = planStatus;
    return this;
  }

   /**
   * Plan status.
   * @return planStatus
  **/
  @ApiModelProperty(value = "Plan status.")
  public String getPlanStatus() {
    return planStatus;
  }

  public void setPlanStatus(String planStatus) {
    this.planStatus = planStatus;
  }

  public APIPlanSubscriptionOut planQuota(Long planQuota) {
    this.planQuota = planQuota;
    return this;
  }

   /**
   * Current plan quota in quantity of units (NB: some API use several units per name).
   * @return planQuota
  **/
  @ApiModelProperty(value = "Current plan quota in quantity of units (NB: some API use several units per name).")
  public Long getPlanQuota() {
    return planQuota;
  }

  public void setPlanQuota(Long planQuota) {
    this.planQuota = planQuota;
  }

  public APIPlanSubscriptionOut priceUSD(Double priceUSD) {
    this.priceUSD = priceUSD;
    return this;
  }

   /**
   * Current plan monthly price expressed in USD (includes a free quota).
   * @return priceUSD
  **/
  @ApiModelProperty(value = "Current plan monthly price expressed in USD (includes a free quota).")
  public Double getPriceUSD() {
    return priceUSD;
  }

  public void setPriceUSD(Double priceUSD) {
    this.priceUSD = priceUSD;
  }

  public APIPlanSubscriptionOut priceOverageUSD(Double priceOverageUSD) {
    this.priceOverageUSD = priceOverageUSD;
    return this;
  }

   /**
   * Current plan price for overages expressed in USD (extra price per unit above the free quota).
   * @return priceOverageUSD
  **/
  @ApiModelProperty(value = "Current plan price for overages expressed in USD (extra price per unit above the free quota).")
  public Double getPriceOverageUSD() {
    return priceOverageUSD;
  }

  public void setPriceOverageUSD(Double priceOverageUSD) {
    this.priceOverageUSD = priceOverageUSD;
  }

  public APIPlanSubscriptionOut price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Current plan price for overages expressed in Currency (extra price per unit above the free quota).
   * @return price
  **/
  @ApiModelProperty(value = "Current plan price for overages expressed in Currency (extra price per unit above the free quota).")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public APIPlanSubscriptionOut priceOverage(Double priceOverage) {
    this.priceOverage = priceOverage;
    return this;
  }

   /**
   * Current plan price for overages expressed in Currency (extra price per unit above the free quota).
   * @return priceOverage
  **/
  @ApiModelProperty(value = "Current plan price for overages expressed in Currency (extra price per unit above the free quota).")
  public Double getPriceOverage() {
    return priceOverage;
  }

  public void setPriceOverage(Double priceOverage) {
    this.priceOverage = priceOverage;
  }

  public APIPlanSubscriptionOut currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Current plan Currency for prices.
   * @return currency
  **/
  @ApiModelProperty(value = "Current plan Currency for prices.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public APIPlanSubscriptionOut currencyFactor(Double currencyFactor) {
    this.currencyFactor = currencyFactor;
    return this;
  }

   /**
   * For USD, GBP, EUR - the factor is 1.
   * @return currencyFactor
  **/
  @ApiModelProperty(value = "For USD, GBP, EUR - the factor is 1.")
  public Double getCurrencyFactor() {
    return currencyFactor;
  }

  public void setCurrencyFactor(Double currencyFactor) {
    this.currencyFactor = currencyFactor;
  }

  public APIPlanSubscriptionOut stripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
    return this;
  }

   /**
   * Stripe customer identifier.
   * @return stripeCustomerId
  **/
  @ApiModelProperty(value = "Stripe customer identifier.")
  public String getStripeCustomerId() {
    return stripeCustomerId;
  }

  public void setStripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
  }

  public APIPlanSubscriptionOut stripeStatus(String stripeStatus) {
    this.stripeStatus = stripeStatus;
    return this;
  }

   /**
   * Stripe status ex active.
   * @return stripeStatus
  **/
  @ApiModelProperty(value = "Stripe status ex active.")
  public String getStripeStatus() {
    return stripeStatus;
  }

  public void setStripeStatus(String stripeStatus) {
    this.stripeStatus = stripeStatus;
  }

  public APIPlanSubscriptionOut stripeSubscription(String stripeSubscription) {
    this.stripeSubscription = stripeSubscription;
    return this;
  }

   /**
   * Stripe subscription identifier.
   * @return stripeSubscription
  **/
  @ApiModelProperty(value = "Stripe subscription identifier.")
  public String getStripeSubscription() {
    return stripeSubscription;
  }

  public void setStripeSubscription(String stripeSubscription) {
    this.stripeSubscription = stripeSubscription;
  }

  public APIPlanSubscriptionOut userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Internal user identifier.
   * @return userId
  **/
  @ApiModelProperty(value = "Internal user identifier.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPlanSubscriptionOut apIPlanSubscriptionOut = (APIPlanSubscriptionOut) o;
    return Objects.equals(this.apiKey, apIPlanSubscriptionOut.apiKey) &&
        Objects.equals(this.planStarted, apIPlanSubscriptionOut.planStarted) &&
        Objects.equals(this.priorPlanStarted, apIPlanSubscriptionOut.priorPlanStarted) &&
        Objects.equals(this.planEnded, apIPlanSubscriptionOut.planEnded) &&
        Objects.equals(this.taxRate, apIPlanSubscriptionOut.taxRate) &&
        Objects.equals(this.planName, apIPlanSubscriptionOut.planName) &&
        Objects.equals(this.planBaseFeesKey, apIPlanSubscriptionOut.planBaseFeesKey) &&
        Objects.equals(this.planStatus, apIPlanSubscriptionOut.planStatus) &&
        Objects.equals(this.planQuota, apIPlanSubscriptionOut.planQuota) &&
        Objects.equals(this.priceUSD, apIPlanSubscriptionOut.priceUSD) &&
        Objects.equals(this.priceOverageUSD, apIPlanSubscriptionOut.priceOverageUSD) &&
        Objects.equals(this.price, apIPlanSubscriptionOut.price) &&
        Objects.equals(this.priceOverage, apIPlanSubscriptionOut.priceOverage) &&
        Objects.equals(this.currency, apIPlanSubscriptionOut.currency) &&
        Objects.equals(this.currencyFactor, apIPlanSubscriptionOut.currencyFactor) &&
        Objects.equals(this.stripeCustomerId, apIPlanSubscriptionOut.stripeCustomerId) &&
        Objects.equals(this.stripeStatus, apIPlanSubscriptionOut.stripeStatus) &&
        Objects.equals(this.stripeSubscription, apIPlanSubscriptionOut.stripeSubscription) &&
        Objects.equals(this.userId, apIPlanSubscriptionOut.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, planStarted, priorPlanStarted, planEnded, taxRate, planName, planBaseFeesKey, planStatus, planQuota, priceUSD, priceOverageUSD, price, priceOverage, currency, currencyFactor, stripeCustomerId, stripeStatus, stripeSubscription, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPlanSubscriptionOut {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    planStarted: ").append(toIndentedString(planStarted)).append("\n");
    sb.append("    priorPlanStarted: ").append(toIndentedString(priorPlanStarted)).append("\n");
    sb.append("    planEnded: ").append(toIndentedString(planEnded)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planBaseFeesKey: ").append(toIndentedString(planBaseFeesKey)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    planQuota: ").append(toIndentedString(planQuota)).append("\n");
    sb.append("    priceUSD: ").append(toIndentedString(priceUSD)).append("\n");
    sb.append("    priceOverageUSD: ").append(toIndentedString(priceOverageUSD)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceOverage: ").append(toIndentedString(priceOverage)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencyFactor: ").append(toIndentedString(currencyFactor)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    stripeStatus: ").append(toIndentedString(stripeStatus)).append("\n");
    sb.append("    stripeSubscription: ").append(toIndentedString(stripeSubscription)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

