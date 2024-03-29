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
import com.namsor.sdk2.model.FirstLastNamePhoneNumberGeoIn;
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
 * BatchFirstLastNamePhoneNumberGeoIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class BatchFirstLastNamePhoneNumberGeoIn {
  public static final String SERIALIZED_NAME_PERSONAL_NAMES_WITH_PHONE_NUMBERS = "personalNamesWithPhoneNumbers";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAMES_WITH_PHONE_NUMBERS)
  private List<FirstLastNamePhoneNumberGeoIn> personalNamesWithPhoneNumbers;

  public BatchFirstLastNamePhoneNumberGeoIn() {
  }

  public BatchFirstLastNamePhoneNumberGeoIn personalNamesWithPhoneNumbers(List<FirstLastNamePhoneNumberGeoIn> personalNamesWithPhoneNumbers) {
    
    this.personalNamesWithPhoneNumbers = personalNamesWithPhoneNumbers;
    return this;
  }

  public BatchFirstLastNamePhoneNumberGeoIn addPersonalNamesWithPhoneNumbersItem(FirstLastNamePhoneNumberGeoIn personalNamesWithPhoneNumbersItem) {
    if (this.personalNamesWithPhoneNumbers == null) {
      this.personalNamesWithPhoneNumbers = new ArrayList<>();
    }
    this.personalNamesWithPhoneNumbers.add(personalNamesWithPhoneNumbersItem);
    return this;
  }

   /**
   * Get personalNamesWithPhoneNumbers
   * @return personalNamesWithPhoneNumbers
  **/
  @javax.annotation.Nullable
  public List<FirstLastNamePhoneNumberGeoIn> getPersonalNamesWithPhoneNumbers() {
    return personalNamesWithPhoneNumbers;
  }


  public void setPersonalNamesWithPhoneNumbers(List<FirstLastNamePhoneNumberGeoIn> personalNamesWithPhoneNumbers) {
    this.personalNamesWithPhoneNumbers = personalNamesWithPhoneNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchFirstLastNamePhoneNumberGeoIn batchFirstLastNamePhoneNumberGeoIn = (BatchFirstLastNamePhoneNumberGeoIn) o;
    return Objects.equals(this.personalNamesWithPhoneNumbers, batchFirstLastNamePhoneNumberGeoIn.personalNamesWithPhoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNamesWithPhoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchFirstLastNamePhoneNumberGeoIn {\n");
    sb.append("    personalNamesWithPhoneNumbers: ").append(toIndentedString(personalNamesWithPhoneNumbers)).append("\n");
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
    openapiFields.add("personalNamesWithPhoneNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchFirstLastNamePhoneNumberGeoIn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BatchFirstLastNamePhoneNumberGeoIn.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchFirstLastNamePhoneNumberGeoIn is not found in the empty JSON string", BatchFirstLastNamePhoneNumberGeoIn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchFirstLastNamePhoneNumberGeoIn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchFirstLastNamePhoneNumberGeoIn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("personalNamesWithPhoneNumbers") != null && !jsonObj.get("personalNamesWithPhoneNumbers").isJsonNull()) {
        JsonArray jsonArraypersonalNamesWithPhoneNumbers = jsonObj.getAsJsonArray("personalNamesWithPhoneNumbers");
        if (jsonArraypersonalNamesWithPhoneNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("personalNamesWithPhoneNumbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `personalNamesWithPhoneNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("personalNamesWithPhoneNumbers").toString()));
          }

          // validate the optional field `personalNamesWithPhoneNumbers` (array)
          for (int i = 0; i < jsonArraypersonalNamesWithPhoneNumbers.size(); i++) {
            FirstLastNamePhoneNumberGeoIn.validateJsonObject(jsonArraypersonalNamesWithPhoneNumbers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchFirstLastNamePhoneNumberGeoIn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchFirstLastNamePhoneNumberGeoIn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchFirstLastNamePhoneNumberGeoIn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchFirstLastNamePhoneNumberGeoIn.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchFirstLastNamePhoneNumberGeoIn>() {
           @Override
           public void write(JsonWriter out, BatchFirstLastNamePhoneNumberGeoIn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchFirstLastNamePhoneNumberGeoIn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchFirstLastNamePhoneNumberGeoIn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchFirstLastNamePhoneNumberGeoIn
  * @throws IOException if the JSON string is invalid with respect to BatchFirstLastNamePhoneNumberGeoIn
  */
  public static BatchFirstLastNamePhoneNumberGeoIn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchFirstLastNamePhoneNumberGeoIn.class);
  }

 /**
  * Convert an instance of BatchFirstLastNamePhoneNumberGeoIn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

