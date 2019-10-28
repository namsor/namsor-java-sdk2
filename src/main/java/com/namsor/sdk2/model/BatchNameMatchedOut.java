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
import com.namsor.sdk2.model.NameMatchedOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchNameMatchedOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-28T19:07:05.363+01:00[Europe/Berlin]")
public class BatchNameMatchedOut {
  public static final String SERIALIZED_NAME_MATCHED_NAMES = "matchedNames";
  @SerializedName(SERIALIZED_NAME_MATCHED_NAMES)
  private List<NameMatchedOut> matchedNames = new ArrayList<NameMatchedOut>();

  public BatchNameMatchedOut matchedNames(List<NameMatchedOut> matchedNames) {
    this.matchedNames = matchedNames;
    return this;
  }

  public BatchNameMatchedOut addMatchedNamesItem(NameMatchedOut matchedNamesItem) {
    if (this.matchedNames == null) {
      this.matchedNames = new ArrayList<NameMatchedOut>();
    }
    this.matchedNames.add(matchedNamesItem);
    return this;
  }

   /**
   * Get matchedNames
   * @return matchedNames
  **/
  @ApiModelProperty(value = "")
  public List<NameMatchedOut> getMatchedNames() {
    return matchedNames;
  }

  public void setMatchedNames(List<NameMatchedOut> matchedNames) {
    this.matchedNames = matchedNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchNameMatchedOut batchNameMatchedOut = (BatchNameMatchedOut) o;
    return Objects.equals(this.matchedNames, batchNameMatchedOut.matchedNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchNameMatchedOut {\n");
    sb.append("    matchedNames: ").append(toIndentedString(matchedNames)).append("\n");
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

