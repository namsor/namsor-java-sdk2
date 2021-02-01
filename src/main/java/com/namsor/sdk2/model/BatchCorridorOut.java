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
import com.namsor.sdk2.model.CorridorOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchCorridorOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class BatchCorridorOut {
  public static final String SERIALIZED_NAME_CORRIDOR_FROM_TO = "corridorFromTo";
  @SerializedName(SERIALIZED_NAME_CORRIDOR_FROM_TO)
  private List<CorridorOut> corridorFromTo = new ArrayList<CorridorOut>();

  public BatchCorridorOut corridorFromTo(List<CorridorOut> corridorFromTo) {
    this.corridorFromTo = corridorFromTo;
    return this;
  }

  public BatchCorridorOut addCorridorFromToItem(CorridorOut corridorFromToItem) {
    if (this.corridorFromTo == null) {
      this.corridorFromTo = new ArrayList<CorridorOut>();
    }
    this.corridorFromTo.add(corridorFromToItem);
    return this;
  }

   /**
   * Get corridorFromTo
   * @return corridorFromTo
  **/
  @ApiModelProperty(value = "")
  public List<CorridorOut> getCorridorFromTo() {
    return corridorFromTo;
  }

  public void setCorridorFromTo(List<CorridorOut> corridorFromTo) {
    this.corridorFromTo = corridorFromTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchCorridorOut batchCorridorOut = (BatchCorridorOut) o;
    return Objects.equals(this.corridorFromTo, batchCorridorOut.corridorFromTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corridorFromTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchCorridorOut {\n");
    sb.append("    corridorFromTo: ").append(toIndentedString(corridorFromTo)).append("\n");
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

