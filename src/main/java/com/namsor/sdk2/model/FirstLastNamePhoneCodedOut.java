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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the output of inferring the LIKELY country and phone code from a personal name and phone number.
 */
@ApiModel(description = "Represents the output of inferring the LIKELY country and phone code from a personal name and phone number.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-17T18:30:50.594+01:00[Europe/Berlin]")
public class FirstLastNamePhoneCodedOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_INTERNATIONAL_PHONE_NUMBER_VERIFIED = "internationalPhoneNumberVerified";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL_PHONE_NUMBER_VERIFIED)
  private String internationalPhoneNumberVerified;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2_VERIFIED = "phoneCountryIso2Verified";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2_VERIFIED)
  private String phoneCountryIso2Verified;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_CODE = "phoneCountryCode";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_CODE)
  private Integer phoneCountryCode;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_CODE_ALT = "phoneCountryCodeAlt";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_CODE_ALT)
  private Integer phoneCountryCodeAlt;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2 = "phoneCountryIso2";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2)
  private String phoneCountryIso2;

  public static final String SERIALIZED_NAME_PHONE_COUNTRY_ISO2_ALT = "phoneCountryIso2Alt";
  @SerializedName(SERIALIZED_NAME_PHONE_COUNTRY_ISO2_ALT)
  private String phoneCountryIso2Alt;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2 = "originCountryIso2";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2)
  private String originCountryIso2;

  public static final String SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2_ALT = "originCountryIso2Alt";
  @SerializedName(SERIALIZED_NAME_ORIGIN_COUNTRY_ISO2_ALT)
  private String originCountryIso2Alt;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Double score;

  public static final String SERIALIZED_NAME_COUNTRY_ISO2 = "countryIso2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ISO2)
  private String countryIso2;

  public FirstLastNamePhoneCodedOut id(String id) {
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

  public FirstLastNamePhoneCodedOut firstName(String firstName) {
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

  public FirstLastNamePhoneCodedOut lastName(String lastName) {
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

  public FirstLastNamePhoneCodedOut internationalPhoneNumberVerified(String internationalPhoneNumberVerified) {
    this.internationalPhoneNumberVerified = internationalPhoneNumberVerified;
    return this;
  }

   /**
   * Get internationalPhoneNumberVerified
   * @return internationalPhoneNumberVerified
  **/
  @ApiModelProperty(value = "")
  public String getInternationalPhoneNumberVerified() {
    return internationalPhoneNumberVerified;
  }

  public void setInternationalPhoneNumberVerified(String internationalPhoneNumberVerified) {
    this.internationalPhoneNumberVerified = internationalPhoneNumberVerified;
  }

  public FirstLastNamePhoneCodedOut phoneCountryIso2Verified(String phoneCountryIso2Verified) {
    this.phoneCountryIso2Verified = phoneCountryIso2Verified;
    return this;
  }

   /**
   * Get phoneCountryIso2Verified
   * @return phoneCountryIso2Verified
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCountryIso2Verified() {
    return phoneCountryIso2Verified;
  }

  public void setPhoneCountryIso2Verified(String phoneCountryIso2Verified) {
    this.phoneCountryIso2Verified = phoneCountryIso2Verified;
  }

  public FirstLastNamePhoneCodedOut phoneCountryCode(Integer phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
    return this;
  }

   /**
   * Get phoneCountryCode
   * @return phoneCountryCode
  **/
  @ApiModelProperty(value = "")
  public Integer getPhoneCountryCode() {
    return phoneCountryCode;
  }

  public void setPhoneCountryCode(Integer phoneCountryCode) {
    this.phoneCountryCode = phoneCountryCode;
  }

  public FirstLastNamePhoneCodedOut phoneCountryCodeAlt(Integer phoneCountryCodeAlt) {
    this.phoneCountryCodeAlt = phoneCountryCodeAlt;
    return this;
  }

   /**
   * Get phoneCountryCodeAlt
   * @return phoneCountryCodeAlt
  **/
  @ApiModelProperty(value = "")
  public Integer getPhoneCountryCodeAlt() {
    return phoneCountryCodeAlt;
  }

  public void setPhoneCountryCodeAlt(Integer phoneCountryCodeAlt) {
    this.phoneCountryCodeAlt = phoneCountryCodeAlt;
  }

  public FirstLastNamePhoneCodedOut phoneCountryIso2(String phoneCountryIso2) {
    this.phoneCountryIso2 = phoneCountryIso2;
    return this;
  }

   /**
   * Get phoneCountryIso2
   * @return phoneCountryIso2
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCountryIso2() {
    return phoneCountryIso2;
  }

  public void setPhoneCountryIso2(String phoneCountryIso2) {
    this.phoneCountryIso2 = phoneCountryIso2;
  }

  public FirstLastNamePhoneCodedOut phoneCountryIso2Alt(String phoneCountryIso2Alt) {
    this.phoneCountryIso2Alt = phoneCountryIso2Alt;
    return this;
  }

   /**
   * Get phoneCountryIso2Alt
   * @return phoneCountryIso2Alt
  **/
  @ApiModelProperty(value = "")
  public String getPhoneCountryIso2Alt() {
    return phoneCountryIso2Alt;
  }

  public void setPhoneCountryIso2Alt(String phoneCountryIso2Alt) {
    this.phoneCountryIso2Alt = phoneCountryIso2Alt;
  }

  public FirstLastNamePhoneCodedOut originCountryIso2(String originCountryIso2) {
    this.originCountryIso2 = originCountryIso2;
    return this;
  }

   /**
   * Get originCountryIso2
   * @return originCountryIso2
  **/
  @ApiModelProperty(value = "")
  public String getOriginCountryIso2() {
    return originCountryIso2;
  }

  public void setOriginCountryIso2(String originCountryIso2) {
    this.originCountryIso2 = originCountryIso2;
  }

  public FirstLastNamePhoneCodedOut originCountryIso2Alt(String originCountryIso2Alt) {
    this.originCountryIso2Alt = originCountryIso2Alt;
    return this;
  }

   /**
   * Get originCountryIso2Alt
   * @return originCountryIso2Alt
  **/
  @ApiModelProperty(value = "")
  public String getOriginCountryIso2Alt() {
    return originCountryIso2Alt;
  }

  public void setOriginCountryIso2Alt(String originCountryIso2Alt) {
    this.originCountryIso2Alt = originCountryIso2Alt;
  }

  public FirstLastNamePhoneCodedOut phoneNumber(String phoneNumber) {
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

  public FirstLastNamePhoneCodedOut verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Get verified
   * @return verified
  **/
  @ApiModelProperty(value = "")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public FirstLastNamePhoneCodedOut score(Double score) {
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

  public FirstLastNamePhoneCodedOut countryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
    return this;
  }

   /**
   * Get countryIso2
   * @return countryIso2
  **/
  @ApiModelProperty(value = "")
  public String getCountryIso2() {
    return countryIso2;
  }

  public void setCountryIso2(String countryIso2) {
    this.countryIso2 = countryIso2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirstLastNamePhoneCodedOut firstLastNamePhoneCodedOut = (FirstLastNamePhoneCodedOut) o;
    return Objects.equals(this.id, firstLastNamePhoneCodedOut.id) &&
        Objects.equals(this.firstName, firstLastNamePhoneCodedOut.firstName) &&
        Objects.equals(this.lastName, firstLastNamePhoneCodedOut.lastName) &&
        Objects.equals(this.internationalPhoneNumberVerified, firstLastNamePhoneCodedOut.internationalPhoneNumberVerified) &&
        Objects.equals(this.phoneCountryIso2Verified, firstLastNamePhoneCodedOut.phoneCountryIso2Verified) &&
        Objects.equals(this.phoneCountryCode, firstLastNamePhoneCodedOut.phoneCountryCode) &&
        Objects.equals(this.phoneCountryCodeAlt, firstLastNamePhoneCodedOut.phoneCountryCodeAlt) &&
        Objects.equals(this.phoneCountryIso2, firstLastNamePhoneCodedOut.phoneCountryIso2) &&
        Objects.equals(this.phoneCountryIso2Alt, firstLastNamePhoneCodedOut.phoneCountryIso2Alt) &&
        Objects.equals(this.originCountryIso2, firstLastNamePhoneCodedOut.originCountryIso2) &&
        Objects.equals(this.originCountryIso2Alt, firstLastNamePhoneCodedOut.originCountryIso2Alt) &&
        Objects.equals(this.phoneNumber, firstLastNamePhoneCodedOut.phoneNumber) &&
        Objects.equals(this.verified, firstLastNamePhoneCodedOut.verified) &&
        Objects.equals(this.score, firstLastNamePhoneCodedOut.score) &&
        Objects.equals(this.countryIso2, firstLastNamePhoneCodedOut.countryIso2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, internationalPhoneNumberVerified, phoneCountryIso2Verified, phoneCountryCode, phoneCountryCodeAlt, phoneCountryIso2, phoneCountryIso2Alt, originCountryIso2, originCountryIso2Alt, phoneNumber, verified, score, countryIso2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirstLastNamePhoneCodedOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    internationalPhoneNumberVerified: ").append(toIndentedString(internationalPhoneNumberVerified)).append("\n");
    sb.append("    phoneCountryIso2Verified: ").append(toIndentedString(phoneCountryIso2Verified)).append("\n");
    sb.append("    phoneCountryCode: ").append(toIndentedString(phoneCountryCode)).append("\n");
    sb.append("    phoneCountryCodeAlt: ").append(toIndentedString(phoneCountryCodeAlt)).append("\n");
    sb.append("    phoneCountryIso2: ").append(toIndentedString(phoneCountryIso2)).append("\n");
    sb.append("    phoneCountryIso2Alt: ").append(toIndentedString(phoneCountryIso2Alt)).append("\n");
    sb.append("    originCountryIso2: ").append(toIndentedString(originCountryIso2)).append("\n");
    sb.append("    originCountryIso2Alt: ").append(toIndentedString(originCountryIso2Alt)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    countryIso2: ").append(toIndentedString(countryIso2)).append("\n");
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

