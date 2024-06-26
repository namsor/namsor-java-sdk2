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

/**
 * Classified matched names
 */
@ApiModel(description = "Classified matched names")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-11T10:56:47.519625+02:00[Europe/Berlin]")
public class NameMatchedOut {
  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXPLANATION = "explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  /**
   * The name matching status.
   */
  @JsonAdapter(MatchStatusEnum.Adapter.class)
  public enum MatchStatusEnum {
    MATCH("Match"),
    
    MISMATCH("Mismatch");

    private String value;

    MatchStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchStatusEnum fromValue(String text) {
      for (MatchStatusEnum b : MatchStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<MatchStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH_STATUS = "matchStatus";
  @SerializedName(SERIALIZED_NAME_MATCH_STATUS)
  private MatchStatusEnum matchStatus;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public NameMatchedOut script(String script) {
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

  public NameMatchedOut id(String id) {
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

  public NameMatchedOut explanation(String explanation) {
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

  public NameMatchedOut matchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
    return this;
  }

   /**
   * The name matching status.
   * @return matchStatus
  **/
  @ApiModelProperty(value = "The name matching status.")
  public MatchStatusEnum getMatchStatus() {
    return matchStatus;
  }

  public void setMatchStatus(MatchStatusEnum matchStatus) {
    this.matchStatus = matchStatus;
  }

  public NameMatchedOut score(Double score) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameMatchedOut nameMatchedOut = (NameMatchedOut) o;
    return Objects.equals(this.script, nameMatchedOut.script) &&
        Objects.equals(this.id, nameMatchedOut.id) &&
        Objects.equals(this.explanation, nameMatchedOut.explanation) &&
        Objects.equals(this.matchStatus, nameMatchedOut.matchStatus) &&
        Objects.equals(this.score, nameMatchedOut.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script, id, explanation, matchStatus, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameMatchedOut {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    matchStatus: ").append(toIndentedString(matchStatus)).append("\n");
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

