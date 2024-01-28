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
 * APIClassifierTaxonomyOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class APIClassifierTaxonomyOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_TAXONOMY_CLASSES = "taxonomyClasses";
  @SerializedName(SERIALIZED_NAME_TAXONOMY_CLASSES)
  private List<String> taxonomyClasses;

  public static final String SERIALIZED_NAME_CLASSIFYING_SCRIPTS = "classifyingScripts";
  @SerializedName(SERIALIZED_NAME_CLASSIFYING_SCRIPTS)
  private List<String> classifyingScripts;

  public APIClassifierTaxonomyOut() {
  }

  public APIClassifierTaxonomyOut classifierName(String classifierName) {
    
    this.classifierName = classifierName;
    return this;
  }

   /**
   * Name of the classifier as per apiStatus (corresponds also to the name of the service in apiServices)
   * @return classifierName
  **/
  @javax.annotation.Nullable
  public String getClassifierName() {
    return classifierName;
  }


  public void setClassifierName(String classifierName) {
    this.classifierName = classifierName;
  }


  public APIClassifierTaxonomyOut taxonomyClasses(List<String> taxonomyClasses) {
    
    this.taxonomyClasses = taxonomyClasses;
    return this;
  }

  public APIClassifierTaxonomyOut addTaxonomyClassesItem(String taxonomyClassesItem) {
    if (this.taxonomyClasses == null) {
      this.taxonomyClasses = new ArrayList<>();
    }
    this.taxonomyClasses.add(taxonomyClassesItem);
    return this;
  }

   /**
   * The taxonomy classes this classifier classifies to
   * @return taxonomyClasses
  **/
  @javax.annotation.Nullable
  public List<String> getTaxonomyClasses() {
    return taxonomyClasses;
  }


  public void setTaxonomyClasses(List<String> taxonomyClasses) {
    this.taxonomyClasses = taxonomyClasses;
  }


  public APIClassifierTaxonomyOut classifyingScripts(List<String> classifyingScripts) {
    
    this.classifyingScripts = classifyingScripts;
    return this;
  }

  public APIClassifierTaxonomyOut addClassifyingScriptsItem(String classifyingScriptsItem) {
    if (this.classifyingScripts == null) {
      this.classifyingScripts = new ArrayList<>();
    }
    this.classifyingScripts.add(classifyingScriptsItem);
    return this;
  }

   /**
   * The scripts / alphabets this classifiers classifies to
   * @return classifyingScripts
  **/
  @javax.annotation.Nullable
  public List<String> getClassifyingScripts() {
    return classifyingScripts;
  }


  public void setClassifyingScripts(List<String> classifyingScripts) {
    this.classifyingScripts = classifyingScripts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIClassifierTaxonomyOut apIClassifierTaxonomyOut = (APIClassifierTaxonomyOut) o;
    return Objects.equals(this.classifierName, apIClassifierTaxonomyOut.classifierName) &&
        Objects.equals(this.taxonomyClasses, apIClassifierTaxonomyOut.taxonomyClasses) &&
        Objects.equals(this.classifyingScripts, apIClassifierTaxonomyOut.classifyingScripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierName, taxonomyClasses, classifyingScripts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIClassifierTaxonomyOut {\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    taxonomyClasses: ").append(toIndentedString(taxonomyClasses)).append("\n");
    sb.append("    classifyingScripts: ").append(toIndentedString(classifyingScripts)).append("\n");
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
    openapiFields.add("classifierName");
    openapiFields.add("taxonomyClasses");
    openapiFields.add("classifyingScripts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIClassifierTaxonomyOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIClassifierTaxonomyOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIClassifierTaxonomyOut is not found in the empty JSON string", APIClassifierTaxonomyOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIClassifierTaxonomyOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIClassifierTaxonomyOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("classifierName") != null && !jsonObj.get("classifierName").isJsonNull()) && !jsonObj.get("classifierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classifierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classifierName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("taxonomyClasses") != null && !jsonObj.get("taxonomyClasses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxonomyClasses` to be an array in the JSON string but got `%s`", jsonObj.get("taxonomyClasses").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("classifyingScripts") != null && !jsonObj.get("classifyingScripts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classifyingScripts` to be an array in the JSON string but got `%s`", jsonObj.get("classifyingScripts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIClassifierTaxonomyOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIClassifierTaxonomyOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIClassifierTaxonomyOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIClassifierTaxonomyOut.class));

       return (TypeAdapter<T>) new TypeAdapter<APIClassifierTaxonomyOut>() {
           @Override
           public void write(JsonWriter out, APIClassifierTaxonomyOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIClassifierTaxonomyOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIClassifierTaxonomyOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIClassifierTaxonomyOut
  * @throws IOException if the JSON string is invalid with respect to APIClassifierTaxonomyOut
  */
  public static APIClassifierTaxonomyOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIClassifierTaxonomyOut.class);
  }

 /**
  * Convert an instance of APIClassifierTaxonomyOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

