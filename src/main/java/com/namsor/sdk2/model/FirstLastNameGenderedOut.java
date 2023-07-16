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
 * Represents the output of inferring the LIKELY gender from a personal name.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-16T08:45:49.006+02:00[Europe/Berlin]")
public class FirstLastNameGenderedOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  /**
   * Most likely gender
   */
  @JsonAdapter(LikelyGenderEnum.Adapter.class)
  public enum LikelyGenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    UNKNOWN("unknown");

    private String value;

    LikelyGenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LikelyGenderEnum fromValue(String value) {
      for (LikelyGenderEnum b : LikelyGenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LikelyGenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LikelyGenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LikelyGenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LikelyGenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LIKELY_GENDER = "likelyGender";
  @SerializedName(SERIALIZED_NAME_LIKELY_GENDER)
  private LikelyGenderEnum likelyGender;

  public static final String SERIALIZED_NAME_GENDER_SCALE = "genderScale";
  @SerializedName(SERIALIZED_NAME_GENDER_SCALE)
  private Double genderScale;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public FirstLastNameGenderedOut() {
  }

  public FirstLastNameGenderedOut script(String script) {
    
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


  public FirstLastNameGenderedOut id(String id) {
    
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


  public FirstLastNameGenderedOut explanation(String explanation) {
    
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


  public FirstLastNameGenderedOut firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name (also known as given name)
   * @return firstName
  **/
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public FirstLastNameGenderedOut lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name (also known as family name, or surname)
   * @return lastName
  **/
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public FirstLastNameGenderedOut likelyGender(LikelyGenderEnum likelyGender) {
    
    this.likelyGender = likelyGender;
    return this;
  }

   /**
   * Most likely gender
   * @return likelyGender
  **/
  @javax.annotation.Nullable
  public LikelyGenderEnum getLikelyGender() {
    return likelyGender;
  }


  public void setLikelyGender(LikelyGenderEnum likelyGender) {
    this.likelyGender = likelyGender;
  }


  public FirstLastNameGenderedOut genderScale(Double genderScale) {
    
    this.genderScale = genderScale;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Gender Scale M[-1..U..+1]F value.
   * minimum: -1
   * maximum: 1
   * @return genderScale
  **/
  @javax.annotation.Nullable
  public Double getGenderScale() {
    return genderScale;
  }


  public void setGenderScale(Double genderScale) {
    this.genderScale = genderScale;
  }


  public FirstLastNameGenderedOut score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Gender score value. Higher score is better, but score is not normalized. Use calibratedProbability if available. 
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


  public FirstLastNameGenderedOut probabilityCalibrated(Double probabilityCalibrated) {
    
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for inferred gender to have been guessed correctly. -1 &#x3D; still calibrating. 
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNameGenderedOut firstLastNameGenderedOut = (FirstLastNameGenderedOut) o;
    return Objects.equals(this.script, firstLastNameGenderedOut.script) &&
        Objects.equals(this.id, firstLastNameGenderedOut.id) &&
        Objects.equals(this.explanation, firstLastNameGenderedOut.explanation) &&
        Objects.equals(this.firstName, firstLastNameGenderedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameGenderedOut.lastName) &&
        Objects.equals(this.likelyGender, firstLastNameGenderedOut.likelyGender) &&
        Objects.equals(this.genderScale, firstLastNameGenderedOut.genderScale) &&
        Objects.equals(this.score, firstLastNameGenderedOut.score) &&
        Objects.equals(this.probabilityCalibrated, firstLastNameGenderedOut.probabilityCalibrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, firstName, lastName, likelyGender, genderScale, score, probabilityCalibrated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameGenderedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    likelyGender: ").append(toIndentedString(likelyGender)).append("\n");
    sb.append("    genderScale: ").append(toIndentedString(genderScale)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
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
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("likelyGender");
    openapiFields.add("genderScale");
    openapiFields.add("score");
    openapiFields.add("probabilityCalibrated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FirstLastNameGenderedOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FirstLastNameGenderedOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirstLastNameGenderedOut is not found in the empty JSON string", FirstLastNameGenderedOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FirstLastNameGenderedOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirstLastNameGenderedOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("likelyGender") != null && !jsonObj.get("likelyGender").isJsonNull()) && !jsonObj.get("likelyGender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `likelyGender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("likelyGender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirstLastNameGenderedOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirstLastNameGenderedOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirstLastNameGenderedOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirstLastNameGenderedOut.class));

       return (TypeAdapter<T>) new TypeAdapter<FirstLastNameGenderedOut>() {
           @Override
           public void write(JsonWriter out, FirstLastNameGenderedOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirstLastNameGenderedOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirstLastNameGenderedOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirstLastNameGenderedOut
  * @throws IOException if the JSON string is invalid with respect to FirstLastNameGenderedOut
  */
  public static FirstLastNameGenderedOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirstLastNameGenderedOut.class);
  }

 /**
  * Convert an instance of FirstLastNameGenderedOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

