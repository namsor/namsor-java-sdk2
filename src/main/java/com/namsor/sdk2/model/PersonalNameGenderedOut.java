/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.12
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

/**
 * PersonalNameGenderedOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class PersonalNameGenderedOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

    public static LikelyGenderEnum fromValue(String text) {
      for (LikelyGenderEnum b : LikelyGenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<LikelyGenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LikelyGenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LikelyGenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LikelyGenderEnum.fromValue(String.valueOf(value));
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

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public PersonalNameGenderedOut script(String script) {
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

  public PersonalNameGenderedOut id(String id) {
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

  public PersonalNameGenderedOut name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonalNameGenderedOut likelyGender(LikelyGenderEnum likelyGender) {
    this.likelyGender = likelyGender;
    return this;
  }

   /**
   * Most likely gender
   * @return likelyGender
  **/
  @ApiModelProperty(value = "Most likely gender")
  public LikelyGenderEnum getLikelyGender() {
    return likelyGender;
  }

  public void setLikelyGender(LikelyGenderEnum likelyGender) {
    this.likelyGender = likelyGender;
  }

  public PersonalNameGenderedOut genderScale(Double genderScale) {
    this.genderScale = genderScale;
    return this;
  }

   /**
   * Compatibility to NamSor_v1 Gender Scale M[-1..U..+1]F value
   * @return genderScale
  **/
  @ApiModelProperty(value = "Compatibility to NamSor_v1 Gender Scale M[-1..U..+1]F value")
  public Double getGenderScale() {
    return genderScale;
  }

  public void setGenderScale(Double genderScale) {
    this.genderScale = genderScale;
  }

  public PersonalNameGenderedOut score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public PersonalNameGenderedOut probabilityCalibrated(Double probabilityCalibrated) {
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

  public PersonalNameGenderedOut category(String category) {
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
    PersonalNameGenderedOut personalNameGenderedOut = (PersonalNameGenderedOut) o;
    return Objects.equals(this.script, personalNameGenderedOut.script) &&
        Objects.equals(this.id, personalNameGenderedOut.id) &&
        Objects.equals(this.name, personalNameGenderedOut.name) &&
        Objects.equals(this.likelyGender, personalNameGenderedOut.likelyGender) &&
        Objects.equals(this.genderScale, personalNameGenderedOut.genderScale) &&
        Objects.equals(this.score, personalNameGenderedOut.score) &&
        Objects.equals(this.probabilityCalibrated, personalNameGenderedOut.probabilityCalibrated) &&
        Objects.equals(this.category, personalNameGenderedOut.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, name, likelyGender, genderScale, score, probabilityCalibrated, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameGenderedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    likelyGender: ").append(toIndentedString(likelyGender)).append("\n");
    sb.append("    genderScale: ").append(toIndentedString(genderScale)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    probabilityCalibrated: ").append(toIndentedString(probabilityCalibrated)).append("\n");
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

