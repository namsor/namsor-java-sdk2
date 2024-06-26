/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.30
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class PersonalNameUSRaceEthnicityOut {
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

  public PersonalNameUSRaceEthnicityOut script(String script) {
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

  public PersonalNameUSRaceEthnicityOut id(String id) {
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

  public PersonalNameUSRaceEthnicityOut explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @ApiModelProperty(value = "")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public PersonalNameUSRaceEthnicityOut name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The input name.
   * @return name
  **/
  @ApiModelProperty(value = "The input name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalNameUSRaceEthnicityOut raceEthnicityAlt(RaceEthnicityAltEnum raceEthnicityAlt) {
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

  public PersonalNameUSRaceEthnicityOut raceEthnicity(RaceEthnicityEnum raceEthnicity) {
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

  public PersonalNameUSRaceEthnicityOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Higher score is better, but score is not normalized. Use calibratedProbability if available. 
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @ApiModelProperty(value = "Higher score is better, but score is not normalized. Use calibratedProbability if available. ")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public PersonalNameUSRaceEthnicityOut raceEthnicitiesTop(List<String> raceEthnicitiesTop) {
    this.raceEthnicitiesTop = raceEthnicitiesTop;
    return this;
  }

  public PersonalNameUSRaceEthnicityOut addRaceEthnicitiesTopItem(String raceEthnicitiesTopItem) {
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

  public PersonalNameUSRaceEthnicityOut probabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
    return this;
  }

   /**
   * The calibrated probability for raceEthnicity to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for raceEthnicity to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityCalibrated() {
    return probabilityCalibrated;
  }

  public void setProbabilityCalibrated(Double probabilityCalibrated) {
    this.probabilityCalibrated = probabilityCalibrated;
  }

  public PersonalNameUSRaceEthnicityOut probabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
    return this;
  }

   /**
   * The calibrated probability for raceEthnicity OR raceEthnicityAlt to have been guessed correctly. -1 &#x3D; still calibrating. 
   * minimum: -1
   * maximum: 1
   * @return probabilityAltCalibrated
  **/
  @ApiModelProperty(value = "The calibrated probability for raceEthnicity OR raceEthnicityAlt to have been guessed correctly. -1 = still calibrating. ")
  public Double getProbabilityAltCalibrated() {
    return probabilityAltCalibrated;
  }

  public void setProbabilityAltCalibrated(Double probabilityAltCalibrated) {
    this.probabilityAltCalibrated = probabilityAltCalibrated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameUSRaceEthnicityOut personalNameUSRaceEthnicityOut = (PersonalNameUSRaceEthnicityOut) o;
    return Objects.equals(this.script, personalNameUSRaceEthnicityOut.script) &&
        Objects.equals(this.id, personalNameUSRaceEthnicityOut.id) &&
        Objects.equals(this.explanation, personalNameUSRaceEthnicityOut.explanation) &&
        Objects.equals(this.name, personalNameUSRaceEthnicityOut.name) &&
        Objects.equals(this.raceEthnicityAlt, personalNameUSRaceEthnicityOut.raceEthnicityAlt) &&
        Objects.equals(this.raceEthnicity, personalNameUSRaceEthnicityOut.raceEthnicity) &&
        Objects.equals(this.score, personalNameUSRaceEthnicityOut.score) &&
        Objects.equals(this.raceEthnicitiesTop, personalNameUSRaceEthnicityOut.raceEthnicitiesTop) &&
        Objects.equals(this.probabilityCalibrated, personalNameUSRaceEthnicityOut.probabilityCalibrated) &&
        Objects.equals(this.probabilityAltCalibrated, personalNameUSRaceEthnicityOut.probabilityAltCalibrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, raceEthnicityAlt, raceEthnicity, score, raceEthnicitiesTop, probabilityCalibrated, probabilityAltCalibrated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameUSRaceEthnicityOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    raceEthnicityAlt: ").append(toIndentedString(raceEthnicityAlt)).append("\n");
    sb.append("    raceEthnicity: ").append(toIndentedString(raceEthnicity)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    raceEthnicitiesTop: ").append(toIndentedString(raceEthnicitiesTop)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
    sb.append("    probabilityAltCalibrated: ").append(toIndentedString(probabilityAltCalibrated)).append("\n");
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

