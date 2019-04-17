/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 1000 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.2-beta
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
import com.namsor.sdk2.model.FirstLastNamePhoneNumberIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchFirstLastNamePhoneNumberIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-18T01:11:00.312+02:00[Europe/Berlin]")
public class BatchFirstLastNamePhoneNumberIn {
  public static final String SERIALIZED_NAME_PERSONAL_NAMES_WITH_PHONE_NUMBERS = "personalNamesWithPhoneNumbers";
  @SerializedName(SERIALIZED_NAME_PERSONAL_NAMES_WITH_PHONE_NUMBERS)
  private List<FirstLastNamePhoneNumberIn> personalNamesWithPhoneNumbers = new ArrayList<FirstLastNamePhoneNumberIn>();

  public BatchFirstLastNamePhoneNumberIn personalNamesWithPhoneNumbers(List<FirstLastNamePhoneNumberIn> personalNamesWithPhoneNumbers) {
    this.personalNamesWithPhoneNumbers = personalNamesWithPhoneNumbers;
    return this;
  }

  public BatchFirstLastNamePhoneNumberIn addPersonalNamesWithPhoneNumbersItem(FirstLastNamePhoneNumberIn personalNamesWithPhoneNumbersItem) {
    if (this.personalNamesWithPhoneNumbers == null) {
      this.personalNamesWithPhoneNumbers = new ArrayList<FirstLastNamePhoneNumberIn>();
    }
    this.personalNamesWithPhoneNumbers.add(personalNamesWithPhoneNumbersItem);
    return this;
  }

   /**
   * Get personalNamesWithPhoneNumbers
   * @return personalNamesWithPhoneNumbers
  **/
  @ApiModelProperty(value = "")
  public List<FirstLastNamePhoneNumberIn> getPersonalNamesWithPhoneNumbers() {
    return personalNamesWithPhoneNumbers;
  }

  public void setPersonalNamesWithPhoneNumbers(List<FirstLastNamePhoneNumberIn> personalNamesWithPhoneNumbers) {
    this.personalNamesWithPhoneNumbers = personalNamesWithPhoneNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchFirstLastNamePhoneNumberIn batchFirstLastNamePhoneNumberIn = (BatchFirstLastNamePhoneNumberIn) o;
    return Objects.equals(this.personalNamesWithPhoneNumbers, batchFirstLastNamePhoneNumberIn.personalNamesWithPhoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalNamesWithPhoneNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchFirstLastNamePhoneNumberIn {\n");
    sb.append("    personalNamesWithPhoneNumbers: ").append(toIndentedString(personalNamesWithPhoneNumbers)).append("\n");
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

