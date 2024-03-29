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
import com.namsor.sdk2.model.CorridorOut;
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
 * BatchCorridorOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class BatchCorridorOut {
  public static final String SERIALIZED_NAME_CORRIDOR_FROM_TO = "corridorFromTo";
  @SerializedName(SERIALIZED_NAME_CORRIDOR_FROM_TO)
  private List<CorridorOut> corridorFromTo;

  public BatchCorridorOut() {
  }

  public BatchCorridorOut corridorFromTo(List<CorridorOut> corridorFromTo) {
    
    this.corridorFromTo = corridorFromTo;
    return this;
  }

  public BatchCorridorOut addCorridorFromToItem(CorridorOut corridorFromToItem) {
    if (this.corridorFromTo == null) {
      this.corridorFromTo = new ArrayList<>();
    }
    this.corridorFromTo.add(corridorFromToItem);
    return this;
  }

   /**
   * Classified corridors
   * @return corridorFromTo
  **/
  @javax.annotation.Nullable
  public List<CorridorOut> getCorridorFromTo() {
    return corridorFromTo;
  }


  public void setCorridorFromTo(List<CorridorOut> corridorFromTo) {
    this.corridorFromTo = corridorFromTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchCorridorOut batchCorridorOut = (BatchCorridorOut) o;
    return Objects.equals(this.corridorFromTo, batchCorridorOut.corridorFromTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corridorFromTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchCorridorOut {\n");
    sb.append("    corridorFromTo: ").append(toIndentedString(corridorFromTo)).append("\n");
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
    openapiFields.add("corridorFromTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BatchCorridorOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BatchCorridorOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchCorridorOut is not found in the empty JSON string", BatchCorridorOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BatchCorridorOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchCorridorOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("corridorFromTo") != null && !jsonObj.get("corridorFromTo").isJsonNull()) {
        JsonArray jsonArraycorridorFromTo = jsonObj.getAsJsonArray("corridorFromTo");
        if (jsonArraycorridorFromTo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("corridorFromTo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `corridorFromTo` to be an array in the JSON string but got `%s`", jsonObj.get("corridorFromTo").toString()));
          }

          // validate the optional field `corridorFromTo` (array)
          for (int i = 0; i < jsonArraycorridorFromTo.size(); i++) {
            CorridorOut.validateJsonObject(jsonArraycorridorFromTo.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchCorridorOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchCorridorOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchCorridorOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchCorridorOut.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchCorridorOut>() {
           @Override
           public void write(JsonWriter out, BatchCorridorOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchCorridorOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BatchCorridorOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BatchCorridorOut
  * @throws IOException if the JSON string is invalid with respect to BatchCorridorOut
  */
  public static BatchCorridorOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchCorridorOut.class);
  }

 /**
  * Convert an instance of BatchCorridorOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

