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
 * Caste group-coded names
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-16T08:45:49.006+02:00[Europe/Berlin]")
public class PersonalNameCastegroupOut {
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

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_CASTEGROUP = "castegroup";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP)
  private String castegroup;

  public static final String SERIALIZED_NAME_CASTEGROUP_ALT = "castegroupAlt";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP_ALT)
  private String castegroupAlt;

  public static final String SERIALIZED_NAME_CASTEGROUP_TOP = "castegroupTop";
  @SerializedName(SERIALIZED_NAME_CASTEGROUP_TOP)
  private List<String> castegroupTop;

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public PersonalNameCastegroupOut() {
  }

  public PersonalNameCastegroupOut script(String script) {
    
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


  public PersonalNameCastegroupOut id(String id) {
    
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


  public PersonalNameCastegroupOut explanation(String explanation) {
    
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


  public PersonalNameCastegroupOut name(String name) {
    
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


  public PersonalNameCastegroupOut score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Higher score is better, but score is not normalized. Use calibratedProbability if available. 
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


  public PersonalNameCastegroupOut castegroup(String castegroup) {
    
    this.castegroup = castegroup;
    return this;
  }

   /**
   * Most likely caste group
   * @return castegroup
  **/
  @javax.annotation.Nullable
  public String getCastegroup() {
    return castegroup;
  }


  public void setCastegroup(String castegroup) {
    this.castegroup = castegroup;
  }


  public PersonalNameCastegroupOut castegroupAlt(String castegroupAlt) {
    
    this.castegroupAlt = castegroupAlt;
    return this;
  }

   /**
   * Second best alternative : caste group 
   * @return castegroupAlt
  **/
  @javax.annotation.Nullable
  public String getCastegroupAlt() {
    return castegroupAlt;
  }


  public void setCastegroupAlt(String castegroupAlt) {
    this.castegroupAlt = castegroupAlt;
  }


  public PersonalNameCastegroupOut castegroupTop(List<String> castegroupTop) {
    
    this.castegroupTop = castegroupTop;
    return this;
  }

  public PersonalNameCastegroupOut addCastegroupTopItem(String castegroupTopItem) {
    if (this.castegroupTop == null) {
      this.castegroupTop = new ArrayList<>();
    }
    this.castegroupTop.add(castegroupTopItem);
    return this;
  }

   /**
   * List caste group (top 10)
   * @return castegroupTop
  **/
  @javax.annotation.Nullable
  public List<String> getCastegroupTop() {
    return castegroupTop;
  }


  public void setCastegroupTop(List<String> castegroupTop) {
    this.castegroupTop = castegroupTop;
  }


  public PersonalNameCastegroupOut probabilityCalibrated(Double probabilityCalibrated) {
    
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating. 
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


  public PersonalNameCastegroupOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
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
    PersonalNameCastegroupOut personalNameCastegroupOut = (PersonalNameCastegroupOut) o;
    return Objects.equals(this.script, personalNameCastegroupOut.script) &&
        Objects.equals(this.id, personalNameCastegroupOut.id) &&
        Objects.equals(this.explanation, personalNameCastegroupOut.explanation) &&
        Objects.equals(this.name, personalNameCastegroupOut.name) &&
        Objects.equals(this.score, personalNameCastegroupOut.score) &&
        Objects.equals(this.castegroup, personalNameCastegroupOut.castegroup) &&
        Objects.equals(this.castegroupAlt, personalNameCastegroupOut.castegroupAlt) &&
        Objects.equals(this.castegroupTop, personalNameCastegroupOut.castegroupTop) &&
        Objects.equals(this.probabilityCalibrated, personalNameCastegroupOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameCastegroupOut.probabilityAltCalibrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, score, castegroup, castegroupAlt, castegroupTop, probabilityCalibrated, probabilityAltCalibrated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameCastegroupOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    castegroup: ").append(toIndentedString(castegroup)).append("\n");
    sb.append("    castegroupAlt: ").append(toIndentedString(castegroupAlt)).append("\n");
    sb.append("    castegroupTop: ").append(toIndentedString(castegroupTop)).append("\n");
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
    openapiFields.add("score");
    openapiFields.add("castegroup");
    openapiFields.add("castegroupAlt");
    openapiFields.add("castegroupTop");
    openapiFields.add("probabilityCalibrated");
    openapiFields.add("probabilityAltCalibrated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonalNameCastegroupOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalNameCastegroupOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalNameCastegroupOut is not found in the empty JSON string", PersonalNameCastegroupOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalNameCastegroupOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalNameCastegroupOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("castegroup") != null && !jsonObj.get("castegroup").isJsonNull()) && !jsonObj.get("castegroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `castegroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("castegroup").toString()));
      }
      if ((jsonObj.get("castegroupAlt") != null && !jsonObj.get("castegroupAlt").isJsonNull()) && !jsonObj.get("castegroupAlt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `castegroupAlt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("castegroupAlt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("castegroupTop") != null && !jsonObj.get("castegroupTop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `castegroupTop` to be an array in the JSON string but got `%s`", jsonObj.get("castegroupTop").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalNameCastegroupOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalNameCastegroupOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalNameCastegroupOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalNameCastegroupOut.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalNameCastegroupOut>() {
           @Override
           public void write(JsonWriter out, PersonalNameCastegroupOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalNameCastegroupOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalNameCastegroupOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalNameCastegroupOut
  * @throws IOException if the JSON string is invalid with respect to PersonalNameCastegroupOut
  */
  public static PersonalNameCastegroupOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalNameCastegroupOut.class);
  }

 /**
  * Convert an instance of PersonalNameCastegroupOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

