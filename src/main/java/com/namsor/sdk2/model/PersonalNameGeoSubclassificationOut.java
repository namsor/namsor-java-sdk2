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
 * Classified names at sub country level (region or state)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class PersonalNameGeoSubclassificationOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public static final String SERIALIZED_NAME_SUB_CLASSIFICATION = "subClassification";
  @SerializedName(SERIALIZED_NAME_SUB_CLASSIFICATION)
  private String subClassification;

  public static final String SERIALIZED_NAME_SUB_CLASSIFICATION_ALT = "subClassificationAlt";
  @SerializedName(SERIALIZED_NAME_SUB_CLASSIFICATION_ALT)
  private String subClassificationAlt;

  public static final String SERIALIZED_NAME_SUBCLASSIFICATION_TOP = "subclassificationTop";
  @SerializedName(SERIALIZED_NAME_SUBCLASSIFICATION_TOP)
  private List<String> subclassificationTop;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public PersonalNameGeoSubclassificationOut() {
  }

  public PersonalNameGeoSubclassificationOut script(String script) {
    
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


  public PersonalNameGeoSubclassificationOut id(String id) {
    
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


  public PersonalNameGeoSubclassificationOut explanation(String explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @javax.annotation.Nullable
  public String getExplanation() {
    return explanation;
  }


  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }


  public PersonalNameGeoSubclassificationOut name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The input name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PersonalNameGeoSubclassificationOut countryIso2(String countryIso2) {
    
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * The input country ISO2 code
   * @return countryIso2
  **/
  @javax.annotation.Nullable
  public String getCountryIso2() {
    return countryIso2;
  }


  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }


  public PersonalNameGeoSubclassificationOut subClassification(String subClassification) {
    
    this.subClassification = subClassification;
    return this;
  }

   /**
   * Most likely subclassification ISO_3166-2 code
   * @return subClassification
  **/
  @javax.annotation.Nullable
  public String getSubClassification() {
    return subClassification;
  }


  public void setSubClassification(String subClassification) {
    this.subClassification = subClassification;
  }


  public PersonalNameGeoSubclassificationOut subClassificationAlt(String subClassificationAlt) {
    
    this.subClassificationAlt = subClassificationAlt;
    return this;
  }

   /**
   * Second best alternative : subclassification ISO_3166-2 code
   * @return subClassificationAlt
  **/
  @javax.annotation.Nullable
  public String getSubClassificationAlt() {
    return subClassificationAlt;
  }


  public void setSubClassificationAlt(String subClassificationAlt) {
    this.subClassificationAlt = subClassificationAlt;
  }


  public PersonalNameGeoSubclassificationOut subclassificationTop(List<String> subclassificationTop) {
    
    this.subclassificationTop = subclassificationTop;
    return this;
  }

  public PersonalNameGeoSubclassificationOut addSubclassificationTopItem(String subclassificationTopItem) {
    if (this.subclassificationTop == null) {
      this.subclassificationTop = new ArrayList<>();
    }
    this.subclassificationTop.add(subclassificationTopItem);
    return this;
  }

   /**
   * List subclassification ISO_3166-2 codes (top 10)
   * @return subclassificationTop
  **/
  @javax.annotation.Nullable
  public List<String> getSubclassificationTop() {
    return subclassificationTop;
  }


  public void setSubclassificationTop(List<String> subclassificationTop) {
    this.subclassificationTop = subclassificationTop;
  }


  public PersonalNameGeoSubclassificationOut score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Origin score value. Higher score is better, but score is not normalized. Use calibratedProbability if available. 
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @javax.annotation.Nullable
  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }


  public PersonalNameGeoSubclassificationOut probabilityCalibrated(Double probabilityCalibrated) {
    
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for subclassification to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityCalibrated
  **/
  @javax.annotation.Nullable
  public Double getProbabilityCalibrated() {
    return probabilityCalibrated;
  }


  public void setProbabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
  }


  public PersonalNameGeoSubclassificationOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for subclassification OR subclassificationAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityAltCalibrated
  **/
  @javax.annotation.Nullable
  public Double getProbabilityAltCalibrated() {
    return probabilityAltCalibrated;
  }


  public void setProbabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameGeoSubclassificationOut personalNameGeoSubclassificationOut = (PersonalNameGeoSubclassificationOut) o;
    return Objects.equals(this.script, personalNameGeoSubclassificationOut.script) &&
        Objects.equals(this.id, personalNameGeoSubclassificationOut.id) &&
        Objects.equals(this.explanation, personalNameGeoSubclassificationOut.explanation) &&
        Objects.equals(this.name, personalNameGeoSubclassificationOut.name) &&
        Objects.equals(this.countryIso2, personalNameGeoSubclassificationOut.countryIso2) &&
        Objects.equals(this.subClassification, personalNameGeoSubclassificationOut.subClassification) &&
        Objects.equals(this.subClassificationAlt, personalNameGeoSubclassificationOut.subClassificationAlt) &&
        Objects.equals(this.subclassificationTop, personalNameGeoSubclassificationOut.subclassificationTop) &&
        Objects.equals(this.score, personalNameGeoSubclassificationOut.score) &&
        Objects.equals(this.probabilityCalibrated, personalNameGeoSubclassificationOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameGeoSubclassificationOut.probabilityAltCalibrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, countryIso2, subClassification, subClassificationAlt, subclassificationTop, score, probabilityCalibrated, probabilityAltCalibrated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameGeoSubclassificationOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
    sb.append("    subClassification: ").append(toIndentedString(subClassification)).append("\n");
    sb.append("    subClassificationAlt: ").append(toIndentedString(subClassificationAlt)).append("\n");
    sb.append("    subclassificationTop: ").append(toIndentedString(subclassificationTop)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
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
    openapiFields.add("script");
    openapiFields.add("id");
    openapiFields.add("explanation");
    openapiFields.add("name");
    openapiFields.add("countryIso2");
    openapiFields.add("subClassification");
    openapiFields.add("subClassificationAlt");
    openapiFields.add("subclassificationTop");
    openapiFields.add("score");
    openapiFields.add("probabilityCalibrated");
    openapiFields.add("probabilityAltCalibrated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonalNameGeoSubclassificationOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalNameGeoSubclassificationOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalNameGeoSubclassificationOut is not found in the empty JSON string", PersonalNameGeoSubclassificationOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalNameGeoSubclassificationOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalNameGeoSubclassificationOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("script") != null && !jsonObj.get("script").isJsonNull()) && !jsonObj.get("script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("script").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("explanation") != null && !jsonObj.get("explanation").isJsonNull()) && !jsonObj.get("explanation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `explanation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("explanation").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("countryIso2") != null && !jsonObj.get("countryIso2").isJsonNull()) && !jsonObj.get("countryIso2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryIso2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryIso2").toString()));
      }
      if ((jsonObj.get("subClassification") != null && !jsonObj.get("subClassification").isJsonNull()) && !jsonObj.get("subClassification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subClassification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subClassification").toString()));
      }
      if ((jsonObj.get("subClassificationAlt") != null && !jsonObj.get("subClassificationAlt").isJsonNull()) && !jsonObj.get("subClassificationAlt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subClassificationAlt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subClassificationAlt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("subclassificationTop") != null && !jsonObj.get("subclassificationTop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subclassificationTop` to be an array in the JSON string but got `%s`", jsonObj.get("subclassificationTop").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalNameGeoSubclassificationOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalNameGeoSubclassificationOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalNameGeoSubclassificationOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalNameGeoSubclassificationOut.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalNameGeoSubclassificationOut>() {
           @Override
           public void write(JsonWriter out, PersonalNameGeoSubclassificationOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalNameGeoSubclassificationOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalNameGeoSubclassificationOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalNameGeoSubclassificationOut
  * @throws IOException if the JSON string is invalid with respect to PersonalNameGeoSubclassificationOut
  */
  public static PersonalNameGeoSubclassificationOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalNameGeoSubclassificationOut.class);
  }

 /**
  * Convert an instance of PersonalNameGeoSubclassificationOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

