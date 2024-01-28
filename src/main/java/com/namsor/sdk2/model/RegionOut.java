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
import com.namsor.sdk2.model.RegionISO;
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
 * RegionOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class RegionOut {
  public static final String SERIALIZED_NAME_COUNTRIES_AND_REGIONS = "countriesAndRegions";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_AND_REGIONS)
  private List<RegionISO> countriesAndRegions;

  public RegionOut() {
  }

  public RegionOut countriesAndRegions(List<RegionISO> countriesAndRegions) {
    
    this.countriesAndRegions = countriesAndRegions;
    return this;
  }

  public RegionOut addCountriesAndRegionsItem(RegionISO countriesAndRegionsItem) {
    if (this.countriesAndRegions == null) {
      this.countriesAndRegions = new ArrayList<>();
    }
    this.countriesAndRegions.add(countriesAndRegionsItem);
    return this;
  }

   /**
   * List of countries and regions
   * @return countriesAndRegions
  **/
  @javax.annotation.Nullable
  public List<RegionISO> getCountriesAndRegions() {
    return countriesAndRegions;
  }


  public void setCountriesAndRegions(List<RegionISO> countriesAndRegions) {
    this.countriesAndRegions = countriesAndRegions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionOut regionOut = (RegionOut) o;
    return Objects.equals(this.countriesAndRegions, regionOut.countriesAndRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countriesAndRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionOut {\n");
    sb.append("    countriesAndRegions: ").append(toIndentedString(countriesAndRegions)).append("\n");
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
    openapiFields.add("countriesAndRegions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RegionOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RegionOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegionOut is not found in the empty JSON string", RegionOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RegionOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegionOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("countriesAndRegions") != null && !jsonObj.get("countriesAndRegions").isJsonNull()) {
        JsonArray jsonArraycountriesAndRegions = jsonObj.getAsJsonArray("countriesAndRegions");
        if (jsonArraycountriesAndRegions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("countriesAndRegions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `countriesAndRegions` to be an array in the JSON string but got `%s`", jsonObj.get("countriesAndRegions").toString()));
          }

          // validate the optional field `countriesAndRegions` (array)
          for (int i = 0; i < jsonArraycountriesAndRegions.size(); i++) {
            RegionISO.validateJsonObject(jsonArraycountriesAndRegions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegionOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegionOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegionOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegionOut.class));

       return (TypeAdapter<T>) new TypeAdapter<RegionOut>() {
           @Override
           public void write(JsonWriter out, RegionOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegionOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RegionOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegionOut
  * @throws IOException if the JSON string is invalid with respect to RegionOut
  */
  public static RegionOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegionOut.class);
  }

 /**
  * Convert an instance of RegionOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

