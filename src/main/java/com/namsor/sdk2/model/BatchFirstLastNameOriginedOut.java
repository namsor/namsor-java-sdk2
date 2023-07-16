/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * The version of the OpenAPI document: 2.0.27
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
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Represents the output of inferring the LIKELY origin from a list of personal names.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-16T08:45:49.006+02:00[Europe/Berlin]")
public class BatchFirstLastNameOriginedOut {
  public static final String SERIALIZED_NAME_PERSONAL_NAMES = "personalNames";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAMES)
  private List<FirstLastNameOriginedOut> personalNames;

  public BatchFirstLastNameOriginedOut() {
  }

  public BatchFirstLastNameOriginedOut personalNames(List<FirstLastNameOriginedOut> personalNames) {
    
    this.personalNames = personalNames;
    return this;
  }

  public BatchFirstLastNameOriginedOut addPersonalNamesItem(FirstLastNameOriginedOut personalNamesItem) {
    if (this.personalNames == null) {
      this.personalNames = new ArrayList<>();
    }
    this.personalNames.add(personalNamesItem);
    return this;
  }

   /**
   * Classified origined names
   * @return personalNames
  **/
  @javax.annotation.Nullable
  public List<FirstLastNameOriginedOut> getPersonalNames() {
    return personalNames;
  }


  public void setPersonalNames(List<FirstLastNameOriginedOut> personalNames) {
    this.personalNames = personalNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchFirstLastNameOriginedOut batchFirstLastNameOriginedOut = (BatchFirstLastNameOriginedOut) o;
    return Objects.equals(this.personalNames, batchFirstLastNameOriginedOut.personalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchFirstLastNameOriginedOut {\n");
    sb.append("    personalNames: ").append(toIndentedString(personalNames)).append("\n");
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
    openapiFields.add("personalNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchFirstLastNameOriginedOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BatchFirstLastNameOriginedOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchFirstLastNameOriginedOut is not found in the empty JSON string", BatchFirstLastNameOriginedOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchFirstLastNameOriginedOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchFirstLastNameOriginedOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("personalNames") != null && !jsonObj.get("personalNames").isJsonNull()) {
        JsonArray jsonArraypersonalNames = jsonObj.getAsJsonArray("personalNames");
        if (jsonArraypersonalNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("personalNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `personalNames` to be an array in the JSON string but got `%s`", jsonObj.get("personalNames").toString()));
          }

          // validate the optional field `personalNames` (array)
          for (int i = 0; i < jsonArraypersonalNames.size(); i++) {
            FirstLastNameOriginedOut.validateJsonObject(jsonArraypersonalNames.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchFirstLastNameOriginedOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchFirstLastNameOriginedOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchFirstLastNameOriginedOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchFirstLastNameOriginedOut.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchFirstLastNameOriginedOut>() {
           @Override
           public void write(JsonWriter out, BatchFirstLastNameOriginedOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchFirstLastNameOriginedOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchFirstLastNameOriginedOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchFirstLastNameOriginedOut
  * @throws IOException if the JSON string is invalid with respect to BatchFirstLastNameOriginedOut
  */
  public static BatchFirstLastNameOriginedOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchFirstLastNameOriginedOut.class);
  }

 /**
  * Convert an instance of BatchFirstLastNameOriginedOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

