/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.14
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the output of inferring the LIKELY US &#39;race/ethnicity&#39; from a personal name, given US country of residence and (optionally) a ZIP5 code.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY US 'race/ethnicity' from a personal name, given US country of residence and (optionally) a ZIP5 code.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T18:00:09.597+02:00[Europe/Berlin]")
public class FirstLastNameUSRaceEthnicityOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  /**
   * Second most likely US &#39;race&#39;/ethnicity
   */
  @JsonAdapter(RaceEthnicityAltEnum.Adapter.class)
  public enum RaceEthnicityAltEnum {
    W_NL("W_NL"),
    
    HL("HL"),
    
    A("A"),
    
    B_NL("B_NL"),
    
    AI_AN("AI_AN"),
    
    PI("PI");

    private String value;

    RaceEthnicityAltEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RaceEthnicityAltEnum fromValue(String text) {
      for (RaceEthnicityAltEnum b : RaceEthnicityAltEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<RaceEthnicityAltEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RaceEthnicityAltEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RaceEthnicityAltEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RaceEthnicityAltEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_RACE_ETHNICITY_ALT = "raceEthnicityAlt";
  @SerializedName(SERIALIZED_NAME_RACE_ETHNICITY_ALT)
  private RaceEthnicityAltEnum raceEthnicityAlt;

  /**
   * Most likely US &#39;race&#39;/ethnicity
   */
  @JsonAdapter(RaceEthnicityEnum.Adapter.class)
  public enum RaceEthnicityEnum {
    W_NL("W_NL"),
    
    HL("HL"),
    
    A("A"),
    
    B_NL("B_NL"),
    
    AI_AN("AI_AN"),
    
    PI("PI");

    private String value;

    RaceEthnicityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RaceEthnicityEnum fromValue(String text) {
      for (RaceEthnicityEnum b : RaceEthnicityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<RaceEthnicityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RaceEthnicityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RaceEthnicityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RaceEthnicityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_RACE_ETHNICITY = "raceEthnicity";
  @SerializedName(SERIALIZED_NAME_RACE_ETHNICITY)
  private RaceEthnicityEnum raceEthnicity;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_RACE_ETHNICITIES_TOP = "raceEthnicitiesTop";
  @SerializedName(SERIALIZED_NAME_RACE_ETHNICITIES_TOP)
  private List<String> raceEthnicitiesTop = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PROBABILITY_CALIBRATED = "probabilityCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_CALIBRATED)
  private Double probabilityCalibrated;

  public static final String SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED = "probabilityAltCalibrated";
  @SerializedName(SERIALIZED_NAME_PROBABILITY_ALT_CALIBRATED)
  private Double probabilityAltCalibrated;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public FirstLastNameUSRaceEthnicityOut script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(value = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }

  public FirstLastNameUSRaceEthnicityOut id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FirstLastNameUSRaceEthnicityOut firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FirstLastNameUSRaceEthnicityOut lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public FirstLastNameUSRaceEthnicityOut raceEthnicityAlt(RaceEthnicityAltEnum raceEthnicityAlt) {
    this.raceEthnicityAlt = raceEthnicityAlt;
    return this;
  }

   /**
   * Second most likely US &#39;race&#39;/ethnicity
   * @return raceEthnicityAlt
  **/
  @ApiModelProperty(value = "Second most likely US 'race'/ethnicity")
  public RaceEthnicityAltEnum getRaceEthnicityAlt() {
    return raceEthnicityAlt;
  }

  public void setRaceEthnicityAlt(RaceEthnicityAltEnum raceEthnicityAlt) {
    this.raceEthnicityAlt = raceEthnicityAlt;
  }

  public FirstLastNameUSRaceEthnicityOut raceEthnicity(RaceEthnicityEnum raceEthnicity) {
    this.raceEthnicity = raceEthnicity;
    return this;
  }

   /**
   * Most likely US &#39;race&#39;/ethnicity
   * @return raceEthnicity
  **/
  @ApiModelProperty(value = "Most likely US 'race'/ethnicity")
  public RaceEthnicityEnum getRaceEthnicity() {
    return raceEthnicity;
  }

  public void setRaceEthnicity(RaceEthnicityEnum raceEthnicity) {
    this.raceEthnicity = raceEthnicity;
  }

  public FirstLastNameUSRaceEthnicityOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Origin score value
   * @return score
  **/
  @ApiModelProperty(value = "Compatibility to NamSor_v1 Origin score value")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public FirstLastNameUSRaceEthnicityOut raceEthnicitiesTop(List<String> raceEthnicitiesTop) {
    this.raceEthnicitiesTop = raceEthnicitiesTop;
    return this;
  }

  public FirstLastNameUSRaceEthnicityOut addRaceEthnicitiesTopItem(String raceEthnicitiesTopItem) {
    if (this.raceEthnicitiesTop == null) {
      this.raceEthnicitiesTop = new ArrayList<String>();
    }
    this.raceEthnicitiesTop.add(raceEthnicitiesTopItem);
    return this;
  }

   /**
   * List &#39;race&#39;/ethnicities
   * @return raceEthnicitiesTop
  **/
  @ApiModelProperty(value = "List 'race'/ethnicities")
  public List<String> getRaceEthnicitiesTop() {
    return raceEthnicitiesTop;
  }

  public void setRaceEthnicitiesTop(List<String> raceEthnicitiesTop) {
    this.raceEthnicitiesTop = raceEthnicitiesTop;
  }

  public FirstLastNameUSRaceEthnicityOut probabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * Get probabilityCalibrated
   * @return probabilityCalibrated
  **/
  @ApiModelProperty(value = "")
  public Double getProbabilityCalibrated() {
    return probabilityCalibrated;
  }

  public void setProbabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
  }

  public FirstLastNameUSRaceEthnicityOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * Get probabilityAltCalibrated
   * @return probabilityAltCalibrated
  **/
  @ApiModelProperty(value = "")
  public Double getProbabilityAltCalibrated() {
    return probabilityAltCalibrated;
  }

  public void setProbabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
  }

  public FirstLastNameUSRaceEthnicityOut category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNameUSRaceEthnicityOut firstLastNameUSRaceEthnicityOut = (FirstLastNameUSRaceEthnicityOut) o;
    return Objects.equals(this.script, firstLastNameUSRaceEthnicityOut.script) &&
        Objects.equals(this.id, firstLastNameUSRaceEthnicityOut.id) &&
        Objects.equals(this.firstName, firstLastNameUSRaceEthnicityOut.firstName) &&
        Objects.equals(this.lastName, firstLastNameUSRaceEthnicityOut.lastName) &&
        Objects.equals(this.raceEthnicityAlt, firstLastNameUSRaceEthnicityOut.raceEthnicityAlt) &&
        Objects.equals(this.raceEthnicity, firstLastNameUSRaceEthnicityOut.raceEthnicity) &&
        Objects.equals(this.score, firstLastNameUSRaceEthnicityOut.score) &&
        Objects.equals(this.raceEthnicitiesTop, firstLastNameUSRaceEthnicityOut.raceEthnicitiesTop) &&
        Objects.equals(this.probabilityCalibrated, firstLastNameUSRaceEthnicityOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, firstLastNameUSRaceEthnicityOut.probabilityAltCalibrated) &&
        Objects.equals(this.category, firstLastNameUSRaceEthnicityOut.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, firstName, lastName, raceEthnicityAlt, raceEthnicity, score, raceEthnicitiesTop, probabilityCalibrated, probabilityAltCalibrated, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNameUSRaceEthnicityOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    raceEthnicityAlt: ").append(toIndentedString(raceEthnicityAlt)).append("\n");
    sb.append("    raceEthnicity: ").append(toIndentedString(raceEthnicity)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    raceEthnicitiesTop: ").append(toIndentedString(raceEthnicitiesTop)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

