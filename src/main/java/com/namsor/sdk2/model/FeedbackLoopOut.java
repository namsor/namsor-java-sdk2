/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.6
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
 * FeedbackLoopOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-28T19:07:05.363+01:00[Europe/Berlin]")
public class FeedbackLoopOut {
  public static final String SERIALIZED_NAME_FEEDBACK_CREDITS = "feedbackCredits";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_CREDITS)
  private Long feedbackCredits;

  public FeedbackLoopOut feedbackCredits(Long feedbackCredits) {
    this.feedbackCredits = feedbackCredits;
    return this;
  }

   /**
   * Get feedbackCredits
   * @return feedbackCredits
  **/
  @ApiModelProperty(value = "")
  public Long getFeedbackCredits() {
    return feedbackCredits;
  }

  public void setFeedbackCredits(Long feedbackCredits) {
    this.feedbackCredits = feedbackCredits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackLoopOut feedbackLoopOut = (FeedbackLoopOut) o;
    return Objects.equals(this.feedbackCredits, feedbackLoopOut.feedbackCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackCredits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackLoopOut {\n");
    sb.append("    feedbackCredits: ").append(toIndentedString(feedbackCredits)).append("\n");
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

