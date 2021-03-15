/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.13
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
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the output of inferring the LIKELY origin from a list of personal names.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY origin from a list of personal names.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T09:38:22.982+01:00[Europe/Berlin]")
public class BatchFirstLastNameOriginedOut {
  public static final String SERIALIZED_NAME_PERSONAL_NAMES = "personalNames";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAMES)
  private List<FirstLastNameOriginedOut> personalNames = new ArrayList<FirstLastNameOriginedOut>();

  public BatchFirstLastNameOriginedOut personalNames(List<FirstLastNameOriginedOut> personalNames) {
    this.personalNames = personalNames;
    return this;
  }

  public BatchFirstLastNameOriginedOut addPersonalNamesItem(FirstLastNameOriginedOut personalNamesItem) {
    if (this.personalNames == null) {
      this.personalNames = new ArrayList<FirstLastNameOriginedOut>();
    }
    this.personalNames.add(personalNamesItem);
    return this;
  }

   /**
   * Get personalNames
   * @return personalNames
  **/
  @ApiModelProperty(value = "")
  public List<FirstLastNameOriginedOut> getPersonalNames() {
    return personalNames;
  }

  public void setPersonalNames(List<FirstLastNameOriginedOut> personalNames) {
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
    BatchFirstLastNameOriginedOut batchFirstLastNameOriginedOut = (BatchFirstLastNameOriginedOut) o;
    return Objects.equals(this.personalNames, batchFirstLastNameOriginedOut.personalNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchFirstLastNameOriginedOut {\n");
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

