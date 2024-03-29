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
 * PersonalNameGeoOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class PersonalNameGeoOut {
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

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_ALT = "countryAlt";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ALT)
  private String countryAlt;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_TOP_REGION = "topRegion";
  @SerializedName(SERIALIZED_NAME_TOP_REGION)
  private String topRegion;

  public static final String SERIALIZED_NAME_SUB_REGION = "subRegion";
  @SerializedName(SERIALIZED_NAME_SUB_REGION)
  private String subRegion;

  public static final String SERIALIZED_NAME_COUNTRIES_TOP = "countriesTop";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_TOP)
  private List<String> countriesTop;

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

  public PersonalNameGeoOut() {
  }

  public PersonalNameGeoOut script(String script) {
    
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


  public PersonalNameGeoOut id(String id) {
    
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


  public PersonalNameGeoOut explanation(String explanation) {
    
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


  public PersonalNameGeoOut name(String name) {
    
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


  public PersonalNameGeoOut score(Double score) {
    
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


  public PersonalNameGeoOut country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Most likely country 
   * @return country
  **/
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PersonalNameGeoOut countryAlt(String countryAlt) {
    
    this.countryAlt = countryAlt;
    return this;
  }

   /**
   * Second best alternative : country 
   * @return countryAlt
  **/
  @javax.annotation.Nullable
  public String getCountryAlt() {
    return countryAlt;
  }


  public void setCountryAlt(String countryAlt) {
    this.countryAlt = countryAlt;
  }


  public PersonalNameGeoOut region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Most likely region (based on country ISO2 code)
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public PersonalNameGeoOut topRegion(String topRegion) {
    
    this.topRegion = topRegion;
    return this;
  }

   /**
   * Most likely top region (based on country ISO2 code)
   * @return topRegion
  **/
  @javax.annotation.Nullable
  public String getTopRegion() {
    return topRegion;
  }


  public void setTopRegion(String topRegion) {
    this.topRegion = topRegion;
  }


  public PersonalNameGeoOut subRegion(String subRegion) {
    
    this.subRegion = subRegion;
    return this;
  }

   /**
   * Most likely sub region (based on country ISO2 code)
   * @return subRegion
  **/
  @javax.annotation.Nullable
  public String getSubRegion() {
    return subRegion;
  }


  public void setSubRegion(String subRegion) {
    this.subRegion = subRegion;
  }


  public PersonalNameGeoOut countriesTop(List<String> countriesTop) {
    
    this.countriesTop = countriesTop;
    return this;
  }

  public PersonalNameGeoOut addCountriesTopItem(String countriesTopItem) {
    if (this.countriesTop == null) {
      this.countriesTop = new ArrayList<>();
    }
    this.countriesTop.add(countriesTopItem);
    return this;
  }

   /**
   * List countries (top 10)
   * @return countriesTop
  **/
  @javax.annotation.Nullable
  public List<String> getCountriesTop() {
    return countriesTop;
  }


  public void setCountriesTop(List<String> countriesTop) {
    this.countriesTop = countriesTop;
  }


  public PersonalNameGeoOut probabilityCalibrated(Double probabilityCalibrated) {
    
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


  public PersonalNameGeoOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    
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


  public PersonalNameGeoOut religionStats(List<ReligionStatOut> religionStats) {
    
    this.religionStats = religionStats;
    return this;
  }

  public PersonalNameGeoOut addReligionStatsItem(ReligionStatOut religionStatsItem) {
    if (this.religionStats == null) {
      this.religionStats = new ArrayList<>();
    }
    this.religionStats.add(religionStatsItem);
    return this;
  }

   /**
   * Geographic religious statistics, assuming country is correctly predicted.
   * @return religionStats
  **/
  @javax.annotation.Nullable
  public List<ReligionStatOut> getReligionStats() {
    return religionStats;
  }


  public void setReligionStats(List<ReligionStatOut> religionStats) {
    this.religionStats = religionStats;
  }


  public PersonalNameGeoOut religionStatsAlt(List<ReligionStatOut> religionStatsAlt) {
    
    this.religionStatsAlt = religionStatsAlt;
    return this;
  }

  public PersonalNameGeoOut addReligionStatsAltItem(ReligionStatOut religionStatsAltItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameGeoOut personalNameGeoOut = (PersonalNameGeoOut) o;
    return Objects.equals(this.script, personalNameGeoOut.script) &&
        Objects.equals(this.id, personalNameGeoOut.id) &&
        Objects.equals(this.explanation, personalNameGeoOut.explanation) &&
        Objects.equals(this.name, personalNameGeoOut.name) &&
        Objects.equals(this.score, personalNameGeoOut.score) &&
        Objects.equals(this.country, personalNameGeoOut.country) &&
        Objects.equals(this.countryAlt, personalNameGeoOut.countryAlt) &&
        Objects.equals(this.region, personalNameGeoOut.region) &&
        Objects.equals(this.topRegion, personalNameGeoOut.topRegion) &&
        Objects.equals(this.subRegion, personalNameGeoOut.subRegion) &&
        Objects.equals(this.countriesTop, personalNameGeoOut.countriesTop) &&
        Objects.equals(this.probabilityCalibrated, personalNameGeoOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameGeoOut.probabilityAltCalibrated) &&
        Objects.equals(this.religionStats, personalNameGeoOut.religionStats) &&
        Objects.equals(this.religionStatsAlt, personalNameGeoOut.religionStatsAlt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, score, country, countryAlt, region, topRegion, subRegion, countriesTop, probabilityCalibrated, probabilityAltCalibrated, religionStats, religionStatsAlt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameGeoOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryAlt: ").append(toIndentedString(countryAlt)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    topRegion: ").append(toIndentedString(topRegion)).append("\n");
    sb.append("    subRegion: ").append(toIndentedString(subRegion)).append("\n");
    sb.append("    countriesTop: ").append(toIndentedString(countriesTop)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
    sb.append("    religionStats: ").append(toIndentedString(religionStats)).append("\n");
    sb.append("    religionStatsAlt: ").append(toIndentedString(religionStatsAlt)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("countryAlt");
    openapiFields.add("region");
    openapiFields.add("topRegion");
    openapiFields.add("subRegion");
    openapiFields.add("countriesTop");
    openapiFields.add("probabilityCalibrated");
    openapiFields.add("probabilityAltCalibrated");
    openapiFields.add("religionStats");
    openapiFields.add("religionStatsAlt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PersonalNameGeoOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PersonalNameGeoOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PersonalNameGeoOut is not found in the empty JSON string", PersonalNameGeoOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PersonalNameGeoOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PersonalNameGeoOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("countryAlt") != null && !jsonObj.get("countryAlt").isJsonNull()) && !jsonObj.get("countryAlt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryAlt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryAlt").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("topRegion") != null && !jsonObj.get("topRegion").isJsonNull()) && !jsonObj.get("topRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topRegion").toString()));
      }
      if ((jsonObj.get("subRegion") != null && !jsonObj.get("subRegion").isJsonNull()) && !jsonObj.get("subRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subRegion").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("countriesTop") != null && !jsonObj.get("countriesTop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countriesTop` to be an array in the JSON string but got `%s`", jsonObj.get("countriesTop").toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PersonalNameGeoOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PersonalNameGeoOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PersonalNameGeoOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PersonalNameGeoOut.class));

       return (TypeAdapter<T>) new TypeAdapter<PersonalNameGeoOut>() {
           @Override
           public void write(JsonWriter out, PersonalNameGeoOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PersonalNameGeoOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PersonalNameGeoOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PersonalNameGeoOut
  * @throws IOException if the JSON string is invalid with respect to PersonalNameGeoOut
  */
  public static PersonalNameGeoOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PersonalNameGeoOut.class);
  }

 /**
  * Convert an instance of PersonalNameGeoOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

