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
import com.namsor.sdk2.model.FirstLastNameOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersonalNameParsedOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class PersonalNameParsedOut {
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
   * Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.
   */
  @JsonAdapter(NameParserTypeEnum.Adapter.class)
  public enum NameParserTypeEnum {
    FN1LN1("FN1LN1"),
    
    LN1FN1("LN1FN1"),
    
    FN1LN2("FN1LN2"),
    
    LN2FN1("LN2FN1"),
    
    FN1LNX("FN1LNx"),
    
    LNXFN1("LNxFN1"),
    
    FN2LN1("FN2LN1"),
    
    LN1FN2("LN1FN2"),
    
    FN2LN2("FN2LN2"),
    
    LN2FN2("LN2FN2"),
    
    FN2LNX("FN2LNx"),
    
    LNXFN2("LNxFN2"),
    
    FNXLN1("FNxLN1"),
    
    LN1FNX("LN1FNx"),
    
    FNXLN2("FNxLN2"),
    
    LN2FNX("LN2FNx"),
    
    FNXLNX("FNxLNx"),
    
    LNXFNX("LNxFNx");

    private String value;

    NameParserTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameParserTypeEnum fromValue(String text) {
      for (NameParserTypeEnum b : NameParserTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<NameParserTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameParserTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameParserTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameParserTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME_PARSER_TYPE = "nameParserType";
  @SerializedName(SERIALIZED_NAME_NAME_PARSER_TYPE)
  private NameParserTypeEnum nameParserType;

  /**
   * Second best alternative parsing. Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.
   */
  @JsonAdapter(NameParserTypeAltEnum.Adapter.class)
  public enum NameParserTypeAltEnum {
    FN1LN1("FN1LN1"),
    
    LN1FN1("LN1FN1"),
    
    FN1LN2("FN1LN2"),
    
    LN2FN1("LN2FN1"),
    
    FN1LNX("FN1LNx"),
    
    LNXFN1("LNxFN1"),
    
    FN2LN1("FN2LN1"),
    
    LN1FN2("LN1FN2"),
    
    FN2LN2("FN2LN2"),
    
    LN2FN2("LN2FN2"),
    
    FN2LNX("FN2LNx"),
    
    LNXFN2("LNxFN2"),
    
    FNXLN1("FNxLN1"),
    
    LN1FNX("LN1FNx"),
    
    FNXLN2("FNxLN2"),
    
    LN2FNX("LN2FNx"),
    
    FNXLNX("FNxLNx"),
    
    LNXFNX("LNxFNx");

    private String value;

    NameParserTypeAltEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameParserTypeAltEnum fromValue(String text) {
      for (NameParserTypeAltEnum b : NameParserTypeAltEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<NameParserTypeAltEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameParserTypeAltEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameParserTypeAltEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameParserTypeAltEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME_PARSER_TYPE_ALT = "nameParserTypeAlt";
  @SerializedName(SERIALIZED_NAME_NAME_PARSER_TYPE_ALT)
  private NameParserTypeAltEnum nameParserTypeAlt;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME = "firstLastName";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME)
  private FirstLastNameOut firstLastName = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public PersonalNameParsedOut script(String script) {
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

  public PersonalNameParsedOut id(String id) {
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

  public PersonalNameParsedOut explanation(String explanation) {
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

  public PersonalNameParsedOut name(String name) {
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

  public PersonalNameParsedOut nameParserType(NameParserTypeEnum nameParserType) {
    this.nameParserType = nameParserType;
    return this;
  }

   /**
   * Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.
   * @return nameParserType
  **/
  @ApiModelProperty(value = "Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.")
  public NameParserTypeEnum getNameParserType() {
    return nameParserType;
  }

  public void setNameParserType(NameParserTypeEnum nameParserType) {
    this.nameParserType = nameParserType;
  }

  public PersonalNameParsedOut nameParserTypeAlt(NameParserTypeAltEnum nameParserTypeAlt) {
    this.nameParserTypeAlt = nameParserTypeAlt;
    return this;
  }

   /**
   * Second best alternative parsing. Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.
   * @return nameParserTypeAlt
  **/
  @ApiModelProperty(value = "Second best alternative parsing. Name parsing is addressed as a classification problem, for example FN1LN1 means a first then last name order.")
  public NameParserTypeAltEnum getNameParserTypeAlt() {
    return nameParserTypeAlt;
  }

  public void setNameParserTypeAlt(NameParserTypeAltEnum nameParserTypeAlt) {
    this.nameParserTypeAlt = nameParserTypeAlt;
  }

  public PersonalNameParsedOut firstLastName(FirstLastNameOut firstLastName) {
    this.firstLastName = firstLastName;
    return this;
  }

   /**
   * Get firstLastName
   * @return firstLastName
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameOut getFirstLastName() {
    return firstLastName;
  }

  public void setFirstLastName(FirstLastNameOut firstLastName) {
    this.firstLastName = firstLastName;
  }

  public PersonalNameParsedOut score(Double score) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalNameParsedOut personalNameParsedOut = (PersonalNameParsedOut) o;
    return Objects.equals(this.script, personalNameParsedOut.script) &&
        Objects.equals(this.id, personalNameParsedOut.id) &&
        Objects.equals(this.explanation, personalNameParsedOut.explanation) &&
        Objects.equals(this.name, personalNameParsedOut.name) &&
        Objects.equals(this.nameParserType, personalNameParsedOut.nameParserType) &&
        Objects.equals(this.nameParserTypeAlt, personalNameParsedOut.nameParserTypeAlt) &&
        Objects.equals(this.firstLastName, personalNameParsedOut.firstLastName) &&
        Objects.equals(this.score, personalNameParsedOut.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, name, nameParserType, nameParserTypeAlt, firstLastName, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalNameParsedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameParserType: ").append(toIndentedString(nameParserType)).append("\n");
    sb.append("    nameParserTypeAlt: ").append(toIndentedString(nameParserTypeAlt)).append("\n");
    sb.append("    firstLastName: ").append(toIndentedString(firstLastName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

