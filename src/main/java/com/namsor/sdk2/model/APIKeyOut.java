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
 * APIKeyOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T09:54:19.925+01:00[Europe/Berlin]")
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

  public APIKeyOut userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
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
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(value = "")
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
   * Get vetted
   * @return vetted
  **/
  @ApiModelProperty(value = "")
  public Boolean getVetted() {
    return vetted;
  }

  public void setVetted(Boolean vetted) {
    this.vetted = vetted;
  }

  public APIKeyOut partner(Boolean partner) {
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @ApiModelProperty(value = "")
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
   * Get striped
   * @return striped
  **/
  @ApiModelProperty(value = "")
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
   * Get corporate
   * @return corporate
  **/
  @ApiModelProperty(value = "")
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
        Objects.equals(this.partner, apIKeyOut.partner) &&
        Objects.equals(this.striped, apIKeyOut.striped) &&
        Objects.equals(this.corporate, apIKeyOut.corporate) &&
        Objects.equals(this.disabled, apIKeyOut.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, userId, admin, vetted, partner, striped, corporate, disabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIKeyOut {\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    vetted: ").append(toIndentedString(vetted)).append("\n");
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
