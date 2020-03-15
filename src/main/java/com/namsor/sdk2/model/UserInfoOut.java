/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.9
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
import java.util.ArrayList;
import java.util.List;

/**
 * UserInfoOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T12:23:01.598+01:00[Europe/Berlin]")
public class UserInfoOut {
  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL_VERIFIED = "emailVerified";
  @SerializedName(SERIALIZED_NAME_EMAIL_VERIFIED)
  private Boolean emailVerified;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_PHOTO_URL = "photoUrl";
  @SerializedName(SERIALIZED_NAME_PHOTO_URL)
  private String photoUrl;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_FIRST_KNOWN_IP_ADDRESS = "firstKnownIpAddress";
  @SerializedName(SERIALIZED_NAME_FIRST_KNOWN_IP_ADDRESS)
  private String firstKnownIpAddress;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private String providerId;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private Long timeStamp;

  public static final String SERIALIZED_NAME_VERIFY_TOKEN = "verifyToken";
  @SerializedName(SERIALIZED_NAME_VERIFY_TOKEN)
  private String verifyToken;

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_STRIPE_PERISHABLE_KEY = "stripePerishableKey";
  @SerializedName(SERIALIZED_NAME_STRIPE_PERISHABLE_KEY)
  private String stripePerishableKey;

  public static final String SERIALIZED_NAME_STRIPE_CUSTOMER_ID = "stripeCustomerId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUSTOMER_ID)
  private String stripeCustomerId;

  public static final String SERIALIZED_NAME_OTHER_INFOS = "otherInfos";
  @SerializedName(SERIALIZED_NAME_OTHER_INFOS)
  private List<UserInfoOut> otherInfos = new ArrayList<UserInfoOut>();

  public UserInfoOut uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @ApiModelProperty(value = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public UserInfoOut email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInfoOut phoneNumber(String phoneNumber) {
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

  public UserInfoOut emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @ApiModelProperty(value = "")
  public Boolean getEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public UserInfoOut displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserInfoOut photoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
    return this;
  }

   /**
   * Get photoUrl
   * @return photoUrl
  **/
  @ApiModelProperty(value = "")
  public String getPhotoUrl() {
    return photoUrl;
  }

  public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

  public UserInfoOut disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public UserInfoOut firstKnownIpAddress(String firstKnownIpAddress) {
    this.firstKnownIpAddress = firstKnownIpAddress;
    return this;
  }

   /**
   * Get firstKnownIpAddress
   * @return firstKnownIpAddress
  **/
  @ApiModelProperty(value = "")
  public String getFirstKnownIpAddress() {
    return firstKnownIpAddress;
  }

  public void setFirstKnownIpAddress(String firstKnownIpAddress) {
    this.firstKnownIpAddress = firstKnownIpAddress;
  }

  public UserInfoOut providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(value = "")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public UserInfoOut timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public UserInfoOut verifyToken(String verifyToken) {
    this.verifyToken = verifyToken;
    return this;
  }

   /**
   * Get verifyToken
   * @return verifyToken
  **/
  @ApiModelProperty(value = "")
  public String getVerifyToken() {
    return verifyToken;
  }

  public void setVerifyToken(String verifyToken) {
    this.verifyToken = verifyToken;
  }

  public UserInfoOut apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public UserInfoOut stripePerishableKey(String stripePerishableKey) {
    this.stripePerishableKey = stripePerishableKey;
    return this;
  }

   /**
   * Get stripePerishableKey
   * @return stripePerishableKey
  **/
  @ApiModelProperty(value = "")
  public String getStripePerishableKey() {
    return stripePerishableKey;
  }

  public void setStripePerishableKey(String stripePerishableKey) {
    this.stripePerishableKey = stripePerishableKey;
  }

  public UserInfoOut stripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
    return this;
  }

   /**
   * Get stripeCustomerId
   * @return stripeCustomerId
  **/
  @ApiModelProperty(value = "")
  public String getStripeCustomerId() {
    return stripeCustomerId;
  }

  public void setStripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
  }

  public UserInfoOut otherInfos(List<UserInfoOut> otherInfos) {
    this.otherInfos = otherInfos;
    return this;
  }

  public UserInfoOut addOtherInfosItem(UserInfoOut otherInfosItem) {
    if (this.otherInfos == null) {
      this.otherInfos = new ArrayList<UserInfoOut>();
    }
    this.otherInfos.add(otherInfosItem);
    return this;
  }

   /**
   * Get otherInfos
   * @return otherInfos
  **/
  @ApiModelProperty(value = "")
  public List<UserInfoOut> getOtherInfos() {
    return otherInfos;
  }

  public void setOtherInfos(List<UserInfoOut> otherInfos) {
    this.otherInfos = otherInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoOut userInfoOut = (UserInfoOut) o;
    return Objects.equals(this.uid, userInfoOut.uid) &&
        Objects.equals(this.email, userInfoOut.email) &&
        Objects.equals(this.phoneNumber, userInfoOut.phoneNumber) &&
        Objects.equals(this.emailVerified, userInfoOut.emailVerified) &&
        Objects.equals(this.displayName, userInfoOut.displayName) &&
        Objects.equals(this.photoUrl, userInfoOut.photoUrl) &&
        Objects.equals(this.disabled, userInfoOut.disabled) &&
        Objects.equals(this.firstKnownIpAddress, userInfoOut.firstKnownIpAddress) &&
        Objects.equals(this.providerId, userInfoOut.providerId) &&
        Objects.equals(this.timeStamp, userInfoOut.timeStamp) &&
        Objects.equals(this.verifyToken, userInfoOut.verifyToken) &&
        Objects.equals(this.apiKey, userInfoOut.apiKey) &&
        Objects.equals(this.stripePerishableKey, userInfoOut.stripePerishableKey) &&
        Objects.equals(this.stripeCustomerId, userInfoOut.stripeCustomerId) &&
        Objects.equals(this.otherInfos, userInfoOut.otherInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, email, phoneNumber, emailVerified, displayName, photoUrl, disabled, firstKnownIpAddress, providerId, timeStamp, verifyToken, apiKey, stripePerishableKey, stripeCustomerId, otherInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoOut {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    photoUrl: ").append(toIndentedString(photoUrl)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    firstKnownIpAddress: ").append(toIndentedString(firstKnownIpAddress)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    verifyToken: ").append(toIndentedString(verifyToken)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    stripePerishableKey: ").append(toIndentedString(stripePerishableKey)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    otherInfos: ").append(toIndentedString(otherInfos)).append("\n");
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

