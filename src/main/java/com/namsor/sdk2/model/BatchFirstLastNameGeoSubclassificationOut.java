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
import com.namsor.sdk2.model.FirstLastNameGeoSubclassificationOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the output of inferring the LIKELY country subclassification (regional names).
 */
@ApiModel(description = "Represents the output of inferring the LIKELY country subclassification (regional names).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-19T10:09:03.048+02:00[Europe/Berlin]")
public class BatchFirstLastNameGeoSubclassificationOut {
  public static final String SERIALIZED_NAME_PERSONAL_NAMES = "personalNames";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAMES)
  private List<FirstLastNameGeoSubclassificationOut> personalNames = new ArrayList<FirstLastNameGeoSubclassificationOut>();

  public BatchFirstLastNameGeoSubclassificationOut personalNames(List<FirstLastNameGeoSubclassificationOut> personalNames) {
    this.personalNames = personalNames;
    return this;
  }

  public BatchFirstLastNameGeoSubclassificationOut addPersonalNamesItem(FirstLastNameGeoSubclassificationOut personalNamesItem) {
    if (this.personalNames == null) {
      this.personalNames = new ArrayList<FirstLastNameGeoSubclassificationOut>();
    }
    this.personalNames.add(personalNamesItem);
    return this;
  }

   /**
   * Classified names at sub country level (region or state)
   * @return personalNames
  **/
  @ApiModelProperty(value = "Classified names at sub country level (region or state)")
  public List<FirstLastNameGeoSubclassificationOut> getPersonalNames() {
    return personalNames;
  }

  public void setPersonalNames(List<FirstLastNameGeoSubclassificationOut> personalNames) {
    this.personalNames = personalNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchFirstLastNameGeoSubclassificationOut batchFirstLastNameGeoSubclassificationOut = (BatchFirstLastNameGeoSubclassificationOut) o;
    return Objects.equals(this.personalNames, batchFirstLastNameGeoSubclassificationOut.personalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchFirstLastNameGeoSubclassificationOut {\n");
    sb.append("    personalNames: ").append(toIndentedString(personalNames)).append("\n");
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

