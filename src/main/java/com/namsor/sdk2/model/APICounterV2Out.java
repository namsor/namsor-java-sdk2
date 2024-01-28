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
import com.namsor.sdk2.model.APIKeyOut;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * Detailed usage as reported by the deduplicating API counter.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class APICounterV2Out {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private APIKeyOut apiKey;

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
  private Map<String, Long> serviceFeaturesUsage = new HashMap<>();

  public APICounterV2Out() {
  }

  public APICounterV2Out apiKey(APIKeyOut apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
      this.serviceFeaturesUsage = new HashMap<>();
    }
    this.serviceFeaturesUsage.put(key, serviceFeaturesUsageItem);
    return this;
  }

   /**
   * Usage of special features, such as Chinese, Japanese.
   * @return serviceFeaturesUsage
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getServiceFeaturesUsage() {
    return serviceFeaturesUsage;
  }


  public void setServiceFeaturesUsage(Map<String, Long> serviceFeaturesUsage) {
    this.serviceFeaturesUsage = serviceFeaturesUsage;
  }



  @Override
  public boolean equals(Object o) {
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
    openapiFields.add("apiService");
    openapiFields.add("hostAddress");
    openapiFields.add("createdDateTime");
    openapiFields.add("totalUsage");
    openapiFields.add("lastFlushedDateTime");
    openapiFields.add("lastUsedDateTime");
    openapiFields.add("serviceFeaturesUsage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APICounterV2Out
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APICounterV2Out.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APICounterV2Out is not found in the empty JSON string", APICounterV2Out.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APICounterV2Out.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APICounterV2Out` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `apiKey`
      if (jsonObj.get("apiKey") != null && !jsonObj.get("apiKey").isJsonNull()) {
        APIKeyOut.validateJsonObject(jsonObj.getAsJsonObject("apiKey"));
      }
      if ((jsonObj.get("apiService") != null && !jsonObj.get("apiService").isJsonNull()) && !jsonObj.get("apiService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiService").toString()));
      }
      if ((jsonObj.get("hostAddress") != null && !jsonObj.get("hostAddress").isJsonNull()) && !jsonObj.get("hostAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APICounterV2Out.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APICounterV2Out' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APICounterV2Out> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APICounterV2Out.class));

       return (TypeAdapter<T>) new TypeAdapter<APICounterV2Out>() {
           @Override
           public void write(JsonWriter out, APICounterV2Out value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APICounterV2Out read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APICounterV2Out given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APICounterV2Out
  * @throws IOException if the JSON string is invalid with respect to APICounterV2Out
  */
  public static APICounterV2Out fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APICounterV2Out.class);
  }

 /**
  * Convert an instance of APICounterV2Out to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

