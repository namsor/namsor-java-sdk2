/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.15
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
 * The API Key.
 */
@ApiModel(description = "The API Key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-17T18:27:27.141+02:00[Europe/Berlin]")
public class APIKeyOut {
  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_VETTED = "vetted";
  @SerializedName(SERIALIZED_NAME_VETTED)
  private Boolean vetted;

  public static final String SERIALIZED_NAME_LEARNABLE = "learnable";
  @SerializedName(SERIALIZED_NAME_LEARNABLE)
  private Boolean learnable;

  public static final String SERIALIZED_NAME_ANONYMIZED = "anonymized";
  @SerializedName(SERIALIZED_NAME_ANONYMIZED)
  private Boolean anonymized;

  public static final String SERIALIZED_NAME_PARTNER = "partner";
  @SerializedName(SERIALIZED_NAME_PARTNER)
  private Boolean partner;

  public static final String SERIALIZED_NAME_STRIPED = "striped";
  @SerializedName(SERIALIZED_NAME_STRIPED)
  private Boolean striped;

  public static final String SERIALIZED_NAME_CORPORATE = "corporate";
  @SerializedName(SERIALIZED_NAME_CORPORATE)
  private Boolean corporate;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public APIKeyOut apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The user API Key.
   * @return apiKey
  **/
  @ApiModelProperty(value = "The user API Key.")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public APIKeyOut userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user identifier.
   * @return userId
  **/
  @ApiModelProperty(value = "The user identifier.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public APIKeyOut admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * The API Key has admin role.
   * @return admin
  **/
  @ApiModelProperty(value = "The API Key has admin role.")
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public APIKeyOut vetted(Boolean vetted) {
    this.vetted = vetted;
    return this;
  }

   /**
   * The API Key is vetted (assumed truthful) for machine learning.
   * @return vetted
  **/
  @ApiModelProperty(value = "The API Key is vetted (assumed truthful) for machine learning.")
  public Boolean getVetted() {
    return vetted;
  }

  public void setVetted(Boolean vetted) {
    this.vetted = vetted;
  }

  public APIKeyOut learnable(Boolean learnable) {
    this.learnable = learnable;
    return this;
  }

   /**
   * The API Key is learnable (without assuming truthfulness) for machine learning. Set learnable&#x3D;false and anonymized&#x3D;true for highest privacy (ie. to forget data as it&#39;s processed).
   * @return learnable
  **/
  @ApiModelProperty(value = "The API Key is learnable (without assuming truthfulness) for machine learning. Set learnable=false and anonymized=true for highest privacy (ie. to forget data as it's processed).")
  public Boolean getLearnable() {
    return learnable;
  }

  public void setLearnable(Boolean learnable) {
    this.learnable = learnable;
  }

  public APIKeyOut anonymized(Boolean anonymized) {
    this.anonymized = anonymized;
    return this;
  }

   /**
   * The API Key is anonymized (using SHA-252 digest for logging). Set learnable&#x3D;false and anonymized&#x3D;true for highest privacy (ie. to forget data as it&#39;s processed).
   * @return anonymized
  **/
  @ApiModelProperty(value = "The API Key is anonymized (using SHA-252 digest for logging). Set learnable=false and anonymized=true for highest privacy (ie. to forget data as it's processed).")
  public Boolean getAnonymized() {
    return anonymized;
  }

  public void setAnonymized(Boolean anonymized) {
    this.anonymized = anonymized;
  }

  public APIKeyOut partner(Boolean partner) {
    this.partner = partner;
    return this;
  }

   /**
   * The API Key has partner role.
   * @return partner
  **/
  @ApiModelProperty(value = "The API Key has partner role.")
  public Boolean getPartner() {
    return partner;
  }

  public void setPartner(Boolean partner) {
    this.partner = partner;
  }

  public APIKeyOut striped(Boolean striped) {
    this.striped = striped;
    return this;
  }

   /**
   * The API Key is associated to a valid Stripe account.
   * @return striped
  **/
  @ApiModelProperty(value = "The API Key is associated to a valid Stripe account.")
  public Boolean getStriped() {
    return striped;
  }

  public void setStriped(Boolean striped) {
    this.striped = striped;
  }

  public APIKeyOut corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

   /**
   * The API Key has role corporate (ex SWIFT payments instead of Stripe payments).
   * @return corporate
  **/
  @ApiModelProperty(value = "The API Key has role corporate (ex SWIFT payments instead of Stripe payments).")
  public Boolean getCorporate() {
    return corporate;
  }

  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }

  public APIKeyOut disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * The API Key is temporarily or permanently disabled.
   * @return disabled
  **/
  @ApiModelProperty(value = "The API Key is temporarily or permanently disabled.")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIKeyOut apIKeyOut = (APIKeyOut) o;
    return Objects.equals(this.apiKey, apIKeyOut.apiKey) &&
        Objects.equals(this.userId, apIKeyOut.userId) &&
        Objects.equals(this.admin, apIKeyOut.admin) &&
        Objects.equals(this.vetted, apIKeyOut.vetted) &&
        Objects.equals(this.learnable, apIKeyOut.learnable) &&
        Objects.equals(this.anonymized, apIKeyOut.anonymized) &&
        Objects.equals(this.partner, apIKeyOut.partner) &&
        Objects.equals(this.striped, apIKeyOut.striped) &&
        Objects.equals(this.corporate, apIKeyOut.corporate) &&
        Objects.equals(this.disabled, apIKeyOut.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, userId, admin, vetted, learnable, anonymized, partner, striped, corporate, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyOut {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    vetted: ").append(toIndentedString(vetted)).append("\n");
    sb.append("    learnable: ").append(toIndentedString(learnable)).append("\n");
    sb.append("    anonymized: ").append(toIndentedString(anonymized)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    striped: ").append(toIndentedString(striped)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

