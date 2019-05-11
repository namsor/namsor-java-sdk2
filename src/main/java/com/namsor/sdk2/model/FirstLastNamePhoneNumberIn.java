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
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FirstLastNamePhoneNumberIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-11T10:42:18.784+02:00[Europe/Berlin]")
public class FirstLastNamePhoneNumberIn {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT = "FirstLastNameOriginedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT)
  private FirstLastNameOriginedOut firstLastNameOriginedOut = null;

  public FirstLastNamePhoneNumberIn id(String id) {
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

  public FirstLastNamePhoneNumberIn firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FirstLastNamePhoneNumberIn lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public FirstLastNamePhoneNumberIn phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public FirstLastNamePhoneNumberIn firstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
    return this;
  }

   /**
   * Get firstLastNameOriginedOut
   * @return firstLastNameOriginedOut
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameOriginedOut getFirstLastNameOriginedOut() {
    return firstLastNameOriginedOut;
  }

  public void setFirstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNamePhoneNumberIn firstLastNamePhoneNumberIn = (FirstLastNamePhoneNumberIn) o;
    return Objects.equals(this.id, firstLastNamePhoneNumberIn.id) &&
        Objects.equals(this.firstName, firstLastNamePhoneNumberIn.firstName) &&
        Objects.equals(this.lastName, firstLastNamePhoneNumberIn.lastName) &&
        Objects.equals(this.phoneNumber, firstLastNamePhoneNumberIn.phoneNumber) &&
        Objects.equals(this.firstLastNameOriginedOut, firstLastNamePhoneNumberIn.firstLastNameOriginedOut);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, phoneNumber, firstLastNameOriginedOut);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNamePhoneNumberIn {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    firstLastNameOriginedOut: ").append(toIndentedString(firstLastNameOriginedOut)).append("\n");
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

