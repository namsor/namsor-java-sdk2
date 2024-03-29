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
import com.namsor.sdk2.model.ReligionStatOut;
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
 * Represents the output of inferring the LIKELY country of Origin from a personal name.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class PersonalNameOriginedOut {
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

  public static final String SERIALIZED_NAME_COUNTRY_ORIGIN = "countryOrigin";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ORIGIN)
  private String countryOrigin;

  public static final String SERIALIZED_NAME_COUNTRY_ORIGIN_ALT = "countryOriginAlt";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ORIGIN_ALT)
  private String countryOriginAlt;

  public static final String SERIALIZED_NAME_COUNTRIES_ORIGIN_TOP = "countriesOriginTop";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_ORIGIN_TOP)
  private List<String> countriesOriginTop;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_REGION_ORIGIN = "regionOrigin";
  @SerializedName(SERIALIZED_NAME_REGION_ORIGIN)
  private String regionOrigin;

  public static final String SERIALIZED_NAME_TOP_REGION_ORIGIN = "topRegionOrigin";
  @SerializedName(SERIALIZED_NAME_TOP_REGION_ORIGIN)
  private String topRegionOrigin;

  public static final String SERIALIZED_NAME_SUB_REGION_ORIGIN = "subRegionOrigin";
  @SerializedName(SERIALIZED_NAME_SUB_REGION_ORIGIN)
  private String subRegionOrigin;

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public static final String SERIALIZED_NAME_RELIGION_STATS = "religionStats";
  @SerializedName(SERIALIZED_NAME_RELIGION_STATS)
  private List<ReligionStatOut> religionStats;

  public static final String SERIALIZED_NAME_RELIGION_STATS_ALT = "religionStatsAlt";
  @SerializedName(SERIALIZED_NAME_RELIGION_STATS_ALT)
  private List<ReligionStatOut> religionStatsAlt;

  public static final String SERIALIZED_NAME_RELIGION_STATS_SYNTHETIC = "religionStatsSynthetic";
  @SerializedName(SERIALIZED_NAME_RELIGION_STATS_SYNTHETIC)
  private List<ReligionStatOut> religionStatsSynthetic;

  public PersonalNameOriginedOut() {
  }

  public PersonalNameOriginedOut script(String script) {
    
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


  public PersonalNameOriginedOut id(String id) {
    
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


  public PersonalNameOriginedOut explanation(String explanation) {
    
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


  public PersonalNameOriginedOut name(String name) {
    
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


  public PersonalNameOriginedOut countryOrigin(String countryOrigin) {
    
    this.countryOrigin = countryOrigin;
    return this;
  }

   /**
   * Most likely country of Origin
   * @return countryOrigin
  **/
  @javax.annotation.Nullable
  public String getCountryOrigin() {
    return countryOrigin;
  }


  public void setCountryOrigin(String countryOrigin) {
    this.countryOrigin = countryOrigin;
  }


  public PersonalNameOriginedOut countryOriginAlt(String countryOriginAlt) {
    
    this.countryOriginAlt = countryOriginAlt;
    return this;
  }

   /**
   * Second best alternative : country of Origin
   * @return countryOriginAlt
  **/
  @javax.annotation.Nullable
  public String getCountryOriginAlt() {
    return countryOriginAlt;
  }


  public void setCountryOriginAlt(String countryOriginAlt) {
    this.countryOriginAlt = countryOriginAlt;
  }


  public PersonalNameOriginedOut countriesOriginTop(List<String> countriesOriginTop) {
    
    this.countriesOriginTop = countriesOriginTop;
    return this;
  }

  public PersonalNameOriginedOut addCountriesOriginTopItem(String countriesOriginTopItem) {
    if (this.countriesOriginTop == null) {
      this.countriesOriginTop = new ArrayList<>();
    }
    this.countriesOriginTop.add(countriesOriginTopItem);
    return this;
  }

   /**
   * List countries of Origin (top 10)
   * @return countriesOriginTop
  **/
  @javax.annotation.Nullable
  public List<String> getCountriesOriginTop() {
    return countriesOriginTop;
  }


  public void setCountriesOriginTop(List<String> countriesOriginTop) {
    this.countriesOriginTop = countriesOriginTop;
  }


  public PersonalNameOriginedOut score(Double score) {
    
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


  public PersonalNameOriginedOut regionOrigin(String regionOrigin) {
    
    this.regionOrigin = regionOrigin;
    return this;
  }

   /**
   * Most likely region of Origin (based on countryOrigin ISO2 code)
   * @return regionOrigin
  **/
  @javax.annotation.Nullable
  public String getRegionOrigin() {
    return regionOrigin;
  }


  public void setRegionOrigin(String regionOrigin) {
    this.regionOrigin = regionOrigin;
  }


  public PersonalNameOriginedOut topRegionOrigin(String topRegionOrigin) {
    
    this.topRegionOrigin = topRegionOrigin;
    return this;
  }

   /**
   * Most likely top region of Origin (based on countryOrigin ISO2 code)
   * @return topRegionOrigin
  **/
  @javax.annotation.Nullable
  public String getTopRegionOrigin() {
    return topRegionOrigin;
  }


  public void setTopRegionOrigin(String topRegionOrigin) {
    this.topRegionOrigin = topRegionOrigin;
  }


  public PersonalNameOriginedOut subRegionOrigin(String subRegionOrigin) {
    
    this.subRegionOrigin = subRegionOrigin;
    return this;
  }

   /**
   * Most likely sub region of Origin (based on countryOrigin ISO2 code)
   * @return subRegionOrigin
  **/
  @javax.annotation.Nullable
  public String getSubRegionOrigin() {
    return subRegionOrigin;
  }


  public void setSubRegionOrigin(String subRegionOrigin) {
    this.subRegionOrigin = subRegionOrigin;
  }


  public PersonalNameOriginedOut probabilityCalibrated(Double probabilityCalibrated) {
    
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for countryOrigin to have been guessed correctly. -1 &#x3D; still calibrating. 
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


  public PersonalNameOriginedOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for countryOrigin OR countryOriginAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
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


  public PersonalNameOriginedOut religionStats(List<ReligionStatOut> religionStats) {
    
    this.religionStats = religionStats;
    return this;
  }

  public PersonalNameOriginedOut addReligionStatsItem(ReligionStatOut religionStatsItem) {
    if (this.religionStats == null) {
      this.religionStats = new ArrayList<>();
    }
    this.religionStats.add(religionStatsItem);
    return this;
  }

   /**
   * Geographic religious statistics, assuming country of origin is correctly predicted.
   * @return religionStats
  **/
  @javax.annotation.Nullable
  public List<ReligionStatOut> getReligionStats() {
    return religionStats;
  }


  public void setReligionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
  }


  public PersonalNameOriginedOut religionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    
    this.religionStatsAlt = religionStatsAlt;
    return this;
  }

  public PersonalNameOriginedOut addReligionStatsAltItem(ReligionStatOut religionStatsAltItem) {
    if (this.religionStatsAlt == null) {
      this.religionStatsAlt = new ArrayList<>();
    }
    this.religionStatsAlt.add(religionStatsAltItem);
    return this;
  }

   /**
   * Geographic religious statistics, for country best alternative.
   * @return religionStatsAlt
  **/
  @javax.annotation.Nullable
  public List<ReligionStatOut> getReligionStatsAlt() {
    return religionStatsAlt;
  }


  public void setReligionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    this.religionStatsAlt = religionStatsAlt;
  }


  public PersonalNameOriginedOut religionStatsSynthetic(List<ReligionStatOut> religionStatsSynthetic) {
    
    this.religionStatsSynthetic = religionStatsSynthetic;
    return this;
  }

  public PersonalNameOriginedOut addReligionStatsSyntheticItem(ReligionStatOut religionStatsSyntheticItem) {
    if (this.religionStatsSynthetic == null) {
      this.religionStatsSynthetic = new ArrayList<>();
    }
    this.religionStatsSynthetic.add(religionStatsSyntheticItem);
    return this;
  }

   /**
   * Geographic religious statistics, assuming country of origin OR best alternative is correctly predicted.
   * @return religionStatsSynthetic
  **/
  @javax.annotation.Nullable
  public List<ReligionStatOut> getReligionStatsSynthetic() {
    return religionStatsSynthetic;
  }


  public void setReligionStatsSynthetic(List<ReligionStatOut> religionStatsSynthetic) {
    this.religionStatsSynthetic = religionStatsSynthetic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameOriginedOut personalNameOriginedOut = (PersonalNameOriginedOut) o;
    return Objects.equals(this.script, personalNameOriginedOut.script) &&
        Objects.equals(this.id, personalNameOriginedOut.id) &&
        Objects.equals(this.explanation, personalNameOriginedOut.explanation) &&
        Objects.equals(this.name, personalNameOriginedOut.name) &&
        Objects.equals(this.countryOrigin, personalNameOriginedOut.countryOrigin) &&
        Objects.equals(this.countryOriginAlt, personalNameOriginedOut.countryOriginAlt) &&
        Objects.equals(this.countriesOriginTop, personalNameOriginedOut.countriesOriginTop) &&
        Objects.equals(this.score, personalNameOriginedOut.score) &&
        Objects.equals(this.regionOrigin, personalNameOriginedOut.regionOrigin) &&
        Objects.equals(this.topRegionOrigin, personalNameOriginedOut.topRegionOrigin) &&
        Objects.equals(this.subRegionOrigin, personalNameOriginedOut.subRegionOrigin) &&
        Objects.equals(this.probabilityCalibrated, personalNameOriginedOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameOriginedOut.probabilityAltCalibrated) &&
        Objects.equals(this.religionStats, personalNameOriginedOut.religionStats) &&
        Objects.equals(this.religionStatsAlt, personalNameOriginedOut.religionStatsAlt) &&
        Objects.equals(this.religionStatsSynthetic, personalNameOriginedOut.religionStatsSynthetic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, countryOrigin, countryOriginAlt, countriesOriginTop, score, regionOrigin, topRegionOrigin, subRegionOrigin, probabilityCalibrated, probabilityAltCalibrated, religionStats, religionStatsAlt, religionStatsSynthetic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameOriginedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryOrigin: ").append(toIndentedString(countryOrigin)).append("\n");
    sb.append("    countryOriginAlt: ").append(toIndentedString(countryOriginAlt)).append("\n");
    sb.append("    countriesOriginTop: ").append(toIndentedString(countriesOriginTop)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    regionOrigin: ").append(toIndentedString(regionOrigin)).append("\n");
    sb.append("    topRegionOrigin: ").append(toIndentedString(topRegionOrigin)).append("\n");
    sb.append("    subRegionOrigin: ").append(toIndentedString(subRegionOrigin)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
    sb.append("    religionStats: ").append(toIndentedString(religionStats)).append("\n");
    sb.append("    religionStatsAlt: ").append(toIndentedString(religionStatsAlt)).append("\n");
    sb.append("    religionStatsSynthetic: ").append(toIndentedString(religionStatsSynthetic)).append("\n");
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
    openapiFields.add("countryOrigin");
    openapiFields.add("countryOriginAlt");
    openapiFields.add("countriesOriginTop");
    openapiFields.add("score");
    openapiFields.add("regionOrigin");
    openapiFields.add("topRegionOrigin");
    openapiFields.add("subRegionOrigin");
    openapiFields.add("probabilityCalibrated");
    openapiFields.add("probabilityAltCalibrated");
    openapiFields.add("religionStats");
    openapiFields.add("religionStatsAlt");
    openapiFields.add("religionStatsSynthetic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonalNameOriginedOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalNameOriginedOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalNameOriginedOut is not found in the empty JSON string", PersonalNameOriginedOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalNameOriginedOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalNameOriginedOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("countryOrigin") != null && !jsonObj.get("countryOrigin").isJsonNull()) && !jsonObj.get("countryOrigin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryOrigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryOrigin").toString()));
      }
      if ((jsonObj.get("countryOriginAlt") != null && !jsonObj.get("countryOriginAlt").isJsonNull()) && !jsonObj.get("countryOriginAlt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryOriginAlt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryOriginAlt").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countriesOriginTop") != null && !jsonObj.get("countriesOriginTop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countriesOriginTop` to be an array in the JSON string but got `%s`", jsonObj.get("countriesOriginTop").toString()));
      }
      if ((jsonObj.get("regionOrigin") != null && !jsonObj.get("regionOrigin").isJsonNull()) && !jsonObj.get("regionOrigin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `regionOrigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("regionOrigin").toString()));
      }
      if ((jsonObj.get("topRegionOrigin") != null && !jsonObj.get("topRegionOrigin").isJsonNull()) && !jsonObj.get("topRegionOrigin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topRegionOrigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topRegionOrigin").toString()));
      }
      if ((jsonObj.get("subRegionOrigin") != null && !jsonObj.get("subRegionOrigin").isJsonNull()) && !jsonObj.get("subRegionOrigin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subRegionOrigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subRegionOrigin").toString()));
      }
      if (jsonObj.get("religionStats") != null && !jsonObj.get("religionStats").isJsonNull()) {
        JsonArray jsonArrayreligionStats = jsonObj.getAsJsonArray("religionStats");
        if (jsonArrayreligionStats != null) {
          // ensure the json data is an array
          if (!jsonObj.get("religionStats").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `religionStats` to be an array in the JSON string but got `%s`", jsonObj.get("religionStats").toString()));
          }

          // validate the optional field `religionStats` (array)
          for (int i = 0; i < jsonArrayreligionStats.size(); i++) {
            ReligionStatOut.validateJsonObject(jsonArrayreligionStats.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("religionStatsAlt") != null && !jsonObj.get("religionStatsAlt").isJsonNull()) {
        JsonArray jsonArrayreligionStatsAlt = jsonObj.getAsJsonArray("religionStatsAlt");
        if (jsonArrayreligionStatsAlt != null) {
          // ensure the json data is an array
          if (!jsonObj.get("religionStatsAlt").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `religionStatsAlt` to be an array in the JSON string but got `%s`", jsonObj.get("religionStatsAlt").toString()));
          }

          // validate the optional field `religionStatsAlt` (array)
          for (int i = 0; i < jsonArrayreligionStatsAlt.size(); i++) {
            ReligionStatOut.validateJsonObject(jsonArrayreligionStatsAlt.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("religionStatsSynthetic") != null && !jsonObj.get("religionStatsSynthetic").isJsonNull()) {
        JsonArray jsonArrayreligionStatsSynthetic = jsonObj.getAsJsonArray("religionStatsSynthetic");
        if (jsonArrayreligionStatsSynthetic != null) {
          // ensure the json data is an array
          if (!jsonObj.get("religionStatsSynthetic").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `religionStatsSynthetic` to be an array in the JSON string but got `%s`", jsonObj.get("religionStatsSynthetic").toString()));
          }

          // validate the optional field `religionStatsSynthetic` (array)
          for (int i = 0; i < jsonArrayreligionStatsSynthetic.size(); i++) {
            ReligionStatOut.validateJsonObject(jsonArrayreligionStatsSynthetic.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalNameOriginedOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalNameOriginedOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalNameOriginedOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalNameOriginedOut.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalNameOriginedOut>() {
           @Override
           public void write(JsonWriter out, PersonalNameOriginedOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalNameOriginedOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalNameOriginedOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalNameOriginedOut
  * @throws IOException if the JSON string is invalid with respect to PersonalNameOriginedOut
  */
  public static PersonalNameOriginedOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalNameOriginedOut.class);
  }

 /**
  * Convert an instance of PersonalNameOriginedOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

