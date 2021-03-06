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
import com.namsor.sdk2.model.FirstLastNameGeoIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represent any transnational interaction between names (ex. remittance, communication, cross-border investment, airline travel
 */
@ApiModel(description = "Represent any transnational interaction between names (ex. remittance, communication, cross-border investment, airline travel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class CorridorIn {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM = "firstLastNameGeoFrom";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_FROM)
  private FirstLastNameGeoIn firstLastNameGeoFrom = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO = "firstLastNameGeoTo";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GEO_TO)
  private FirstLastNameGeoIn firstLastNameGeoTo = null;

  public CorridorIn id(String id) {
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

  public CorridorIn firstLastNameGeoFrom(FirstLastNameGeoIn firstLastNameGeoFrom) {
    this.firstLastNameGeoFrom = firstLastNameGeoFrom;
    return this;
  }

   /**
   * Get firstLastNameGeoFrom
   * @return firstLastNameGeoFrom
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameGeoIn getFirstLastNameGeoFrom() {
    return firstLastNameGeoFrom;
  }

  public void setFirstLastNameGeoFrom(FirstLastNameGeoIn firstLastNameGeoFrom) {
    this.firstLastNameGeoFrom = firstLastNameGeoFrom;
  }

  public CorridorIn firstLastNameGeoTo(FirstLastNameGeoIn firstLastNameGeoTo) {
    this.firstLastNameGeoTo = firstLastNameGeoTo;
    return this;
  }

   /**
   * Get firstLastNameGeoTo
   * @return firstLastNameGeoTo
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameGeoIn getFirstLastNameGeoTo() {
    return firstLastNameGeoTo;
  }

  public void setFirstLastNameGeoTo(FirstLastNameGeoIn firstLastNameGeoTo) {
    this.firstLastNameGeoTo = firstLastNameGeoTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorridorIn corridorIn = (CorridorIn) o;
    return Objects.equals(this.id, corridorIn.id) &&
        Objects.equals(this.firstLastNameGeoFrom, corridorIn.firstLastNameGeoFrom) &&
        Objects.equals(this.firstLastNameGeoTo, corridorIn.firstLastNameGeoTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstLastNameGeoFrom, firstLastNameGeoTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorridorIn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstLastNameGeoFrom: ").append(toIndentedString(firstLastNameGeoFrom)).append("\n");
    sb.append("    firstLastNameGeoTo: ").append(toIndentedString(firstLastNameGeoTo)).append("\n");
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

