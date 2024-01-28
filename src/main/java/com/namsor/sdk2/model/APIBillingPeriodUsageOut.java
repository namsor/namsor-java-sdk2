/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * The version of the OpenAPI document: 2.0.29
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
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.namsor.sdk2.invoke.JSON;

/**
 * The current billing period.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
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

  public APIBillingPeriodUsageOut() {
  }

  public APIBillingPeriodUsageOut apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * User API Key.
   * @return apiKey
  **/
  @javax.annotation.Nullable
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
   * Datetime when the user subscribed to the plan.
   * @return subscriptionStarted
  **/
  @javax.annotation.Nullable
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
   * Datetime when the the plan&#39;s current period started.
   * @return periodStarted
  **/
  @javax.annotation.Nullable
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
   * Datetime when the the plan&#39;s current period endend.
   * @return periodEnded
  **/
  @javax.annotation.Nullable
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
   * Datetime when the the plan&#39;s current period endend (in Stripe). Internal and Stripe periodicity should ~coincide.
   * @return stripeCurrentPeriodEnd
  **/
  @javax.annotation.Nullable
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
   * Datetime when the the plan&#39;s current period started (in Stripe). Internal and Stripe periodicity should ~coincide.
   * @return stripeCurrentPeriodStart
  **/
  @javax.annotation.Nullable
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
   * Current period billing status ex OPEN.
   * @return billingStatus
  **/
  @javax.annotation.Nullable
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
   * Current period usage in units (NB some API endpoints use more than one unit).
   * @return usage
  **/
  @javax.annotation.Nullable
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
   * Current period soft limit (reaching the limit sends an email notification).
   * @return softLimit
  **/
  @javax.annotation.Nullable
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
   * Current period hard limit (reaching the limit sends an email notification and blocks the API Key).
   * @return hardLimit
  **/
  @javax.annotation.Nullable
  public Long getHardLimit() {
    return hardLimit;
  }


  public void setHardLimit(Long hardLimit) {
    this.hardLimit = hardLimit;
  }



  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("apiKey");
    openapiFields.add("subscriptionStarted");
    openapiFields.add("periodStarted");
    openapiFields.add("periodEnded");
    openapiFields.add("stripeCurrentPeriodEnd");
    openapiFields.add("stripeCurrentPeriodStart");
    openapiFields.add("billingStatus");
    openapiFields.add("usage");
    openapiFields.add("softLimit");
    openapiFields.add("hardLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIBillingPeriodUsageOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIBillingPeriodUsageOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIBillingPeriodUsageOut is not found in the empty JSON string", APIBillingPeriodUsageOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIBillingPeriodUsageOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIBillingPeriodUsageOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiKey") != null && !jsonObj.get("apiKey").isJsonNull()) && !jsonObj.get("apiKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiKey").toString()));
      }
      if ((jsonObj.get("billingStatus") != null && !jsonObj.get("billingStatus").isJsonNull()) && !jsonObj.get("billingStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIBillingPeriodUsageOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIBillingPeriodUsageOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIBillingPeriodUsageOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIBillingPeriodUsageOut.class));

       return (TypeAdapter<T>) new TypeAdapter<APIBillingPeriodUsageOut>() {
           @Override
           public void write(JsonWriter out, APIBillingPeriodUsageOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIBillingPeriodUsageOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIBillingPeriodUsageOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIBillingPeriodUsageOut
  * @throws IOException if the JSON string is invalid with respect to APIBillingPeriodUsageOut
  */
  public static APIBillingPeriodUsageOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIBillingPeriodUsageOut.class);
  }

 /**
  * Convert an instance of APIBillingPeriodUsageOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

