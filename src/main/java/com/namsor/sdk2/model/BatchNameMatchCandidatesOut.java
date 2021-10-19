/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.16
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
import com.namsor.sdk2.model.NameMatchCandidatesOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchNameMatchCandidatesOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-19T10:09:03.048+02:00[Europe/Berlin]")
public class BatchNameMatchCandidatesOut {
  public static final String SERIALIZED_NAME_NAMES_AND_MATCH_CANDIDATES = "namesAndMatchCandidates";
  @SerializedName(SERIALIZED_NAME_NAMES_AND_MATCH_CANDIDATES)
  private List<NameMatchCandidatesOut> namesAndMatchCandidates = new ArrayList<NameMatchCandidatesOut>();

  public BatchNameMatchCandidatesOut namesAndMatchCandidates(List<NameMatchCandidatesOut> namesAndMatchCandidates) {
    this.namesAndMatchCandidates = namesAndMatchCandidates;
    return this;
  }

  public BatchNameMatchCandidatesOut addNamesAndMatchCandidatesItem(NameMatchCandidatesOut namesAndMatchCandidatesItem) {
    if (this.namesAndMatchCandidates == null) {
      this.namesAndMatchCandidates = new ArrayList<NameMatchCandidatesOut>();
    }
    this.namesAndMatchCandidates.add(namesAndMatchCandidatesItem);
    return this;
  }

   /**
   * Classified matched names
   * @return namesAndMatchCandidates
  **/
  @ApiModelProperty(value = "Classified matched names")
  public List<NameMatchCandidatesOut> getNamesAndMatchCandidates() {
    return namesAndMatchCandidates;
  }

  public void setNamesAndMatchCandidates(List<NameMatchCandidatesOut> namesAndMatchCandidates) {
    this.namesAndMatchCandidates = namesAndMatchCandidates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchNameMatchCandidatesOut batchNameMatchCandidatesOut = (BatchNameMatchCandidatesOut) o;
    return Objects.equals(this.namesAndMatchCandidates, batchNameMatchCandidatesOut.namesAndMatchCandidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namesAndMatchCandidates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchNameMatchCandidatesOut {\n");
    sb.append("    namesAndMatchCandidates: ").append(toIndentedString(namesAndMatchCandidates)).append("\n");
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

