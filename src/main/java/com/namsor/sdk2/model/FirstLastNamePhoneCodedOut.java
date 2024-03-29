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
 * Represents the output of inferring the LIKELY country and phone code from a personal name and phone number.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class FirstLastNamePhoneCodedOut {
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

  public static final String SERIALIZED_NAME_INTERNATIONAL_PHONE_NUMBER_VERIFIED = "internationalPhoneNumberVerified";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_PHONE_NUMBER_VERIFIED)
  private String internationalPhoneNumberVerified;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2_VERIFIED = "phoneCountryIso2Verified";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2_VERIFIED)
  private String phoneCountryIso2Verified;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_CODE = "phoneCountryCode";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_CODE)
  private Integer phoneCountryCode;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_CODE_ALT = "phoneCountryCodeAlt";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_CODE_ALT)
  private Integer phoneCountryCodeAlt;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2 = "phoneCountryIso2";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2)
  private String phoneCountryIso2;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2_ALT = "phoneCountryIso2Alt";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2_ALT)
  private String phoneCountryIso2Alt;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2 = "originCountryIso2";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2)
  private String originCountryIso2;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2_ALT = "originCountryIso2Alt";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2_ALT)
  private String originCountryIso2Alt;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public FirstLastNamePhoneCodedOut() {
  }

  public FirstLastNamePhoneCodedOut script(String script) {
    
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


  public FirstLastNamePhoneCodedOut id(String id) {
    
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


  public FirstLastNamePhoneCodedOut explanation(String explanation) {
    
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


  public FirstLastNamePhoneCodedOut firstName(String firstName) {
    
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


  public FirstLastNamePhoneCodedOut lastName(String lastName) {
    
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


  public FirstLastNamePhoneCodedOut internationalPhoneNumberVerified(String internationalPhoneNumberVerified) {
    
    this.internationalPhoneNumberVerified = internationalPhoneNumberVerified;
    return this;
  }

   /**
   * The normalized phone number, verified using libphonenumber.
   * @return internationalPhoneNumberVerified
  **/
  @javax.annotation.Nullable
  public String getInternationalPhoneNumberVerified() {
    return internationalPhoneNumberVerified;
  }


  public void setInternationalPhoneNumberVerified(String internationalPhoneNumberVerified) {
    this.internationalPhoneNumberVerified = internationalPhoneNumberVerified;
  }


  public FirstLastNamePhoneCodedOut phoneCountryIso2Verified(String phoneCountryIso2Verified) {
    
    this.phoneCountryIso2Verified = phoneCountryIso2Verified;
    return this;
  }

   /**
   * The phone ISO2 country code, verified using libphonenumber.
   * @return phoneCountryIso2Verified
  **/
  @javax.annotation.Nullable
  public String getPhoneCountryIso2Verified() {
    return phoneCountryIso2Verified;
  }


  public void setPhoneCountryIso2Verified(String phoneCountryIso2Verified) {
    this.phoneCountryIso2Verified = phoneCountryIso2Verified;
  }


  public FirstLastNamePhoneCodedOut phoneCountryCode(Integer phoneCountryCode) {
    
    this.phoneCountryCode = phoneCountryCode;
    return this;
  }

   /**
   * The phone country code of the phone number, verified using libphonenumber.
   * @return phoneCountryCode
  **/
  @javax.annotation.Nullable
  public Integer getPhoneCountryCode() {
    return phoneCountryCode;
  }


  public void setPhoneCountryCode(Integer phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }


  public FirstLastNamePhoneCodedOut phoneCountryCodeAlt(Integer phoneCountryCodeAlt) {
    
    this.phoneCountryCodeAlt = phoneCountryCodeAlt;
    return this;
  }

   /**
   * The best alternative phone country code of the phone number.
   * @return phoneCountryCodeAlt
  **/
  @javax.annotation.Nullable
  public Integer getPhoneCountryCodeAlt() {
    return phoneCountryCodeAlt;
  }


  public void setPhoneCountryCodeAlt(Integer phoneCountryCodeAlt) {
    this.phoneCountryCodeAlt = phoneCountryCodeAlt;
  }


  public FirstLastNamePhoneCodedOut phoneCountryIso2(String phoneCountryIso2) {
    
    this.phoneCountryIso2 = phoneCountryIso2;
    return this;
  }

   /**
   * The likely country of the phone number.
   * @return phoneCountryIso2
  **/
  @javax.annotation.Nullable
  public String getPhoneCountryIso2() {
    return phoneCountryIso2;
  }


  public void setPhoneCountryIso2(String phoneCountryIso2) {
    this.phoneCountryIso2 = phoneCountryIso2;
  }


  public FirstLastNamePhoneCodedOut phoneCountryIso2Alt(String phoneCountryIso2Alt) {
    
    this.phoneCountryIso2Alt = phoneCountryIso2Alt;
    return this;
  }

   /**
   * The best alternative country of the phone number.
   * @return phoneCountryIso2Alt
  **/
  @javax.annotation.Nullable
  public String getPhoneCountryIso2Alt() {
    return phoneCountryIso2Alt;
  }


  public void setPhoneCountryIso2Alt(String phoneCountryIso2Alt) {
    this.phoneCountryIso2Alt = phoneCountryIso2Alt;
  }


  public FirstLastNamePhoneCodedOut originCountryIso2(String originCountryIso2) {
    
    this.originCountryIso2 = originCountryIso2;
    return this;
  }

   /**
   * The likely country of origin of the name.
   * @return originCountryIso2
  **/
  @javax.annotation.Nullable
  public String getOriginCountryIso2() {
    return originCountryIso2;
  }


  public void setOriginCountryIso2(String originCountryIso2) {
    this.originCountryIso2 = originCountryIso2;
  }


  public FirstLastNamePhoneCodedOut originCountryIso2Alt(String originCountryIso2Alt) {
    
    this.originCountryIso2Alt = originCountryIso2Alt;
    return this;
  }

   /**
   * The best alternative country of origin of the name.
   * @return originCountryIso2Alt
  **/
  @javax.annotation.Nullable
  public String getOriginCountryIso2Alt() {
    return originCountryIso2Alt;
  }


  public void setOriginCountryIso2Alt(String originCountryIso2Alt) {
    this.originCountryIso2Alt = originCountryIso2Alt;
  }


  public FirstLastNamePhoneCodedOut phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The input phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public FirstLastNamePhoneCodedOut verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Indicates if the phone number could be positively verified using libphonenumber.
   * @return verified
  **/
  @javax.annotation.Nullable
  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public FirstLastNamePhoneCodedOut score(Double score) {
    
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


  public FirstLastNamePhoneCodedOut countryIso2(String countryIso2) {
    
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * Get countryIso2
   * @return countryIso2
  **/
  @javax.annotation.Nullable
  public String getCountryIso2() {
    return countryIso2;
  }


  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNamePhoneCodedOut firstLastNamePhoneCodedOut = (FirstLastNamePhoneCodedOut) o;
    return Objects.equals(this.script, firstLastNamePhoneCodedOut.script) &&
        Objects.equals(this.id, firstLastNamePhoneCodedOut.id) &&
        Objects.equals(this.explanation, firstLastNamePhoneCodedOut.explanation) &&
        Objects.equals(this.firstName, firstLastNamePhoneCodedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNamePhoneCodedOut.lastName) &&
        Objects.equals(this.internationalPhoneNumberVerified, firstLastNamePhoneCodedOut.internationalPhoneNumberVerified) &&
        Objects.equals(this.phoneCountryIso2Verified, firstLastNamePhoneCodedOut.phoneCountryIso2Verified) &&
        Objects.equals(this.phoneCountryCode, firstLastNamePhoneCodedOut.phoneCountryCode) &&
        Objects.equals(this.phoneCountryCodeAlt, firstLastNamePhoneCodedOut.phoneCountryCodeAlt) &&
        Objects.equals(this.phoneCountryIso2, firstLastNamePhoneCodedOut.phoneCountryIso2) &&
        Objects.equals(this.phoneCountryIso2Alt, firstLastNamePhoneCodedOut.phoneCountryIso2Alt) &&
        Objects.equals(this.originCountryIso2, firstLastNamePhoneCodedOut.originCountryIso2) &&
        Objects.equals(this.originCountryIso2Alt, firstLastNamePhoneCodedOut.originCountryIso2Alt) &&
        Objects.equals(this.phoneNumber, firstLastNamePhoneCodedOut.phoneNumber) &&
        Objects.equals(this.verified, firstLastNamePhoneCodedOut.verified) &&
        Objects.equals(this.score, firstLastNamePhoneCodedOut.score) &&
        Objects.equals(this.countryIso2, firstLastNamePhoneCodedOut.countryIso2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, firstName, lastName, internationalPhoneNumberVerified, phoneCountryIso2Verified, phoneCountryCode, phoneCountryCodeAlt, phoneCountryIso2, phoneCountryIso2Alt, originCountryIso2, originCountryIso2Alt, phoneNumber, verified, score, countryIso2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNamePhoneCodedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    internationalPhoneNumberVerified: ").append(toIndentedString(internationalPhoneNumberVerified)).append("\n");
    sb.append("    phoneCountryIso2Verified: ").append(toIndentedString(phoneCountryIso2Verified)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    phoneCountryCodeAlt: ").append(toIndentedString(phoneCountryCodeAlt)).append("\n");
    sb.append("    phoneCountryIso2: ").append(toIndentedString(phoneCountryIso2)).append("\n");
    sb.append("    phoneCountryIso2Alt: ").append(toIndentedString(phoneCountryIso2Alt)).append("\n");
    sb.append("    originCountryIso2: ").append(toIndentedString(originCountryIso2)).append("\n");
    sb.append("    originCountryIso2Alt: ").append(toIndentedString(originCountryIso2Alt)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
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
    openapiFields.add("internationalPhoneNumberVerified");
    openapiFields.add("phoneCountryIso2Verified");
    openapiFields.add("phoneCountryCode");
    openapiFields.add("phoneCountryCodeAlt");
    openapiFields.add("phoneCountryIso2");
    openapiFields.add("phoneCountryIso2Alt");
    openapiFields.add("originCountryIso2");
    openapiFields.add("originCountryIso2Alt");
    openapiFields.add("phoneNumber");
    openapiFields.add("verified");
    openapiFields.add("score");
    openapiFields.add("countryIso2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FirstLastNamePhoneCodedOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FirstLastNamePhoneCodedOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirstLastNamePhoneCodedOut is not found in the empty JSON string", FirstLastNamePhoneCodedOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FirstLastNamePhoneCodedOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirstLastNamePhoneCodedOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("internationalPhoneNumberVerified") != null && !jsonObj.get("internationalPhoneNumberVerified").isJsonNull()) && !jsonObj.get("internationalPhoneNumberVerified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internationalPhoneNumberVerified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internationalPhoneNumberVerified").toString()));
      }
      if ((jsonObj.get("phoneCountryIso2Verified") != null && !jsonObj.get("phoneCountryIso2Verified").isJsonNull()) && !jsonObj.get("phoneCountryIso2Verified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneCountryIso2Verified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneCountryIso2Verified").toString()));
      }
      if ((jsonObj.get("phoneCountryIso2") != null && !jsonObj.get("phoneCountryIso2").isJsonNull()) && !jsonObj.get("phoneCountryIso2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneCountryIso2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneCountryIso2").toString()));
      }
      if ((jsonObj.get("phoneCountryIso2Alt") != null && !jsonObj.get("phoneCountryIso2Alt").isJsonNull()) && !jsonObj.get("phoneCountryIso2Alt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneCountryIso2Alt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneCountryIso2Alt").toString()));
      }
      if ((jsonObj.get("originCountryIso2") != null && !jsonObj.get("originCountryIso2").isJsonNull()) && !jsonObj.get("originCountryIso2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originCountryIso2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originCountryIso2").toString()));
      }
      if ((jsonObj.get("originCountryIso2Alt") != null && !jsonObj.get("originCountryIso2Alt").isJsonNull()) && !jsonObj.get("originCountryIso2Alt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originCountryIso2Alt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originCountryIso2Alt").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("countryIso2") != null && !jsonObj.get("countryIso2").isJsonNull()) && !jsonObj.get("countryIso2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryIso2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryIso2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirstLastNamePhoneCodedOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirstLastNamePhoneCodedOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirstLastNamePhoneCodedOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirstLastNamePhoneCodedOut.class));

       return (TypeAdapter<T>) new TypeAdapter<FirstLastNamePhoneCodedOut>() {
           @Override
           public void write(JsonWriter out, FirstLastNamePhoneCodedOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirstLastNamePhoneCodedOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirstLastNamePhoneCodedOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirstLastNamePhoneCodedOut
  * @throws IOException if the JSON string is invalid with respect to FirstLastNamePhoneCodedOut
  */
  public static FirstLastNamePhoneCodedOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirstLastNamePhoneCodedOut.class);
  }

 /**
  * Convert an instance of FirstLastNamePhoneCodedOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

