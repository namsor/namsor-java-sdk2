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
import com.namsor.sdk2.model.FirstLastNameDiasporaedOut;
import com.namsor.sdk2.model.FirstLastNameGenderedOut;
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
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
 * Represent multiple classifications for corridor sender and receiver (gender, country, origin, diaspora)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class CorridorOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GENDERED_OUT = "FirstLastNameGenderedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GENDERED_OUT)
  private FirstLastNameGenderedOut firstLastNameGenderedOut;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT = "FirstLastNameOriginedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT)
  private FirstLastNameOriginedOut firstLastNameOriginedOut;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_DIASPORAED_OUT = "FirstLastNameDiasporaedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_DIASPORAED_OUT)
  private FirstLastNameDiasporaedOut firstLastNameDiasporaedOut;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public CorridorOut() {
  }

  public CorridorOut id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CorridorOut firstLastNameGenderedOut(FirstLastNameGenderedOut firstLastNameGenderedOut) {
    
    this.firstLastNameGenderedOut = firstLastNameGenderedOut;
    return this;
  }

   /**
   * Get firstLastNameGenderedOut
   * @return firstLastNameGenderedOut
  **/
  @javax.annotation.Nullable
  public FirstLastNameGenderedOut getFirstLastNameGenderedOut() {
    return firstLastNameGenderedOut;
  }


  public void setFirstLastNameGenderedOut(FirstLastNameGenderedOut firstLastNameGenderedOut) {
    this.firstLastNameGenderedOut = firstLastNameGenderedOut;
  }


  public CorridorOut firstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
    return this;
  }

   /**
   * Get firstLastNameOriginedOut
   * @return firstLastNameOriginedOut
  **/
  @javax.annotation.Nullable
  public FirstLastNameOriginedOut getFirstLastNameOriginedOut() {
    return firstLastNameOriginedOut;
  }


  public void setFirstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
  }


  public CorridorOut firstLastNameDiasporaedOut(FirstLastNameDiasporaedOut firstLastNameDiasporaedOut) {
    
    this.firstLastNameDiasporaedOut = firstLastNameDiasporaedOut;
    return this;
  }

   /**
   * Get firstLastNameDiasporaedOut
   * @return firstLastNameDiasporaedOut
  **/
  @javax.annotation.Nullable
  public FirstLastNameDiasporaedOut getFirstLastNameDiasporaedOut() {
    return firstLastNameDiasporaedOut;
  }


  public void setFirstLastNameDiasporaedOut(FirstLastNameDiasporaedOut firstLastNameDiasporaedOut) {
    this.firstLastNameDiasporaedOut = firstLastNameDiasporaedOut;
  }


  public CorridorOut script(String script) {
    
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @javax.annotation.Nullable
  public String getScript() {
    return script;
  }


  public void setScript(String script) {
    this.script = script;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorridorOut corridorOut = (CorridorOut) o;
    return Objects.equals(this.id, corridorOut.id) &&
        Objects.equals(this.firstLastNameGenderedOut, corridorOut.firstLastNameGenderedOut) &&
        Objects.equals(this.firstLastNameOriginedOut, corridorOut.firstLastNameOriginedOut) &&
        Objects.equals(this.firstLastNameDiasporaedOut, corridorOut.firstLastNameDiasporaedOut) &&
        Objects.equals(this.script, corridorOut.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstLastNameGenderedOut, firstLastNameOriginedOut, firstLastNameDiasporaedOut, script);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorridorOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstLastNameGenderedOut: ").append(toIndentedString(firstLastNameGenderedOut)).append("\n");
    sb.append("    firstLastNameOriginedOut: ").append(toIndentedString(firstLastNameOriginedOut)).append("\n");
    sb.append("    firstLastNameDiasporaedOut: ").append(toIndentedString(firstLastNameDiasporaedOut)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("FirstLastNameGenderedOut");
    openapiFields.add("FirstLastNameOriginedOut");
    openapiFields.add("FirstLastNameDiasporaedOut");
    openapiFields.add("script");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CorridorOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CorridorOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CorridorOut is not found in the empty JSON string", CorridorOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CorridorOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CorridorOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `FirstLastNameGenderedOut`
      if (jsonObj.get("FirstLastNameGenderedOut") != null && !jsonObj.get("FirstLastNameGenderedOut").isJsonNull()) {
        FirstLastNameGenderedOut.validateJsonObject(jsonObj.getAsJsonObject("FirstLastNameGenderedOut"));
      }
      // validate the optional field `FirstLastNameOriginedOut`
      if (jsonObj.get("FirstLastNameOriginedOut") != null && !jsonObj.get("FirstLastNameOriginedOut").isJsonNull()) {
        FirstLastNameOriginedOut.validateJsonObject(jsonObj.getAsJsonObject("FirstLastNameOriginedOut"));
      }
      // validate the optional field `FirstLastNameDiasporaedOut`
      if (jsonObj.get("FirstLastNameDiasporaedOut") != null && !jsonObj.get("FirstLastNameDiasporaedOut").isJsonNull()) {
        FirstLastNameDiasporaedOut.validateJsonObject(jsonObj.getAsJsonObject("FirstLastNameDiasporaedOut"));
      }
      if ((jsonObj.get("script") != null && !jsonObj.get("script").isJsonNull()) && !jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CorridorOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CorridorOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CorridorOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CorridorOut.class));

       return (TypeAdapter<T>) new TypeAdapter<CorridorOut>() {
           @Override
           public void write(JsonWriter out, CorridorOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CorridorOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CorridorOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CorridorOut
  * @throws IOException if the JSON string is invalid with respect to CorridorOut
  */
  public static CorridorOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CorridorOut.class);
  }

 /**
  * Convert an instance of CorridorOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

