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
import com.namsor.sdk2.model.NameMatchCandidateOut;
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
 * Classified matched names
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-28T10:15:07.323+01:00[Europe/Berlin]")
public class NameMatchCandidatesOut {
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

  public static final String SERIALIZED_NAME_ORDER_OPTION = "orderOption";
  @SerializedName(SERIALIZED_NAME_ORDER_OPTION)
  private String orderOption;

  public static final String SERIALIZED_NAME_MATCH_CANDIDATES = "matchCandidates";
  @SerializedName(SERIALIZED_NAME_MATCH_CANDIDATES)
  private List<NameMatchCandidateOut> matchCandidates;

  public NameMatchCandidatesOut() {
  }

  public NameMatchCandidatesOut script(String script) {
    
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


  public NameMatchCandidatesOut id(String id) {
    
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


  public NameMatchCandidatesOut explanation(String explanation) {
    
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


  public NameMatchCandidatesOut firstName(String firstName) {
    
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


  public NameMatchCandidatesOut lastName(String lastName) {
    
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


  public NameMatchCandidatesOut orderOption(String orderOption) {
    
    this.orderOption = orderOption;
    return this;
  }

   /**
   * The option for ordering
   * @return orderOption
  **/
  @javax.annotation.Nullable
  public String getOrderOption() {
    return orderOption;
  }


  public void setOrderOption(String orderOption) {
    this.orderOption = orderOption;
  }


  public NameMatchCandidatesOut matchCandidates(List<NameMatchCandidateOut> matchCandidates) {
    
    this.matchCandidates = matchCandidates;
    return this;
  }

  public NameMatchCandidatesOut addMatchCandidatesItem(NameMatchCandidateOut matchCandidatesItem) {
    if (this.matchCandidates == null) {
      this.matchCandidates = new ArrayList<>();
    }
    this.matchCandidates.add(matchCandidatesItem);
    return this;
  }

   /**
   * The ordered list of name matching candidates
   * @return matchCandidates
  **/
  @javax.annotation.Nullable
  public List<NameMatchCandidateOut> getMatchCandidates() {
    return matchCandidates;
  }


  public void setMatchCandidates(List<NameMatchCandidateOut> matchCandidates) {
    this.matchCandidates = matchCandidates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchCandidatesOut nameMatchCandidatesOut = (NameMatchCandidatesOut) o;
    return Objects.equals(this.script, nameMatchCandidatesOut.script) &&
        Objects.equals(this.id, nameMatchCandidatesOut.id) &&
        Objects.equals(this.explanation, nameMatchCandidatesOut.explanation) &&
        Objects.equals(this.firstName, nameMatchCandidatesOut.firstName) &&
        Objects.equals(this.lastName, nameMatchCandidatesOut.lastName) &&
        Objects.equals(this.orderOption, nameMatchCandidatesOut.orderOption) &&
        Objects.equals(this.matchCandidates, nameMatchCandidatesOut.matchCandidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, firstName, lastName, orderOption, matchCandidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchCandidatesOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    orderOption: ").append(toIndentedString(orderOption)).append("\n");
    sb.append("    matchCandidates: ").append(toIndentedString(matchCandidates)).append("\n");
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
    openapiFields.add("orderOption");
    openapiFields.add("matchCandidates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NameMatchCandidatesOut
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NameMatchCandidatesOut.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NameMatchCandidatesOut is not found in the empty JSON string", NameMatchCandidatesOut.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NameMatchCandidatesOut.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NameMatchCandidatesOut` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("orderOption") != null && !jsonObj.get("orderOption").isJsonNull()) && !jsonObj.get("orderOption").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderOption` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderOption").toString()));
      }
      if (jsonObj.get("matchCandidates") != null && !jsonObj.get("matchCandidates").isJsonNull()) {
        JsonArray jsonArraymatchCandidates = jsonObj.getAsJsonArray("matchCandidates");
        if (jsonArraymatchCandidates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matchCandidates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matchCandidates` to be an array in the JSON string but got `%s`", jsonObj.get("matchCandidates").toString()));
          }

          // validate the optional field `matchCandidates` (array)
          for (int i = 0; i < jsonArraymatchCandidates.size(); i++) {
            NameMatchCandidateOut.validateJsonObject(jsonArraymatchCandidates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameMatchCandidatesOut.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameMatchCandidatesOut' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameMatchCandidatesOut> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameMatchCandidatesOut.class));

       return (TypeAdapter<T>) new TypeAdapter<NameMatchCandidatesOut>() {
           @Override
           public void write(JsonWriter out, NameMatchCandidatesOut value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NameMatchCandidatesOut read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameMatchCandidatesOut given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameMatchCandidatesOut
  * @throws IOException if the JSON string is invalid with respect to NameMatchCandidatesOut
  */
  public static NameMatchCandidatesOut fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameMatchCandidatesOut.class);
  }

 /**
  * Convert an instance of NameMatchCandidatesOut to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

