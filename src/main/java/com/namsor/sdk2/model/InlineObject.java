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

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T12:23:01.598+01:00[Europe/Berlin]")
public class InlineObject {
  public static final String SERIALIZED_NAME_STRIPE_TOKEN = "stripeToken";
  @SerializedName(SERIALIZED_NAME_STRIPE_TOKEN)
  private String stripeToken;

  public static final String SERIALIZED_NAME_STRIPE_EMAIL = "stripeEmail";
  @SerializedName(SERIALIZED_NAME_STRIPE_EMAIL)
  private String stripeEmail;

  public InlineObject stripeToken(String stripeToken) {
    this.stripeToken = stripeToken;
    return this;
  }

   /**
   * Get stripeToken
   * @return stripeToken
  **/
  @ApiModelProperty(value = "")
  public String getStripeToken() {
    return stripeToken;
  }

  public void setStripeToken(String stripeToken) {
    this.stripeToken = stripeToken;
  }

  public InlineObject stripeEmail(String stripeEmail) {
    this.stripeEmail = stripeEmail;
    return this;
  }

   /**
   * Get stripeEmail
   * @return stripeEmail
  **/
  @ApiModelProperty(value = "")
  public String getStripeEmail() {
    return stripeEmail;
  }

  public void setStripeEmail(String stripeEmail) {
    this.stripeEmail = stripeEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.stripeToken, inlineObject.stripeToken) &&
        Objects.equals(this.stripeEmail, inlineObject.stripeEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeToken, stripeEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    sb.append("    stripeToken: ").append(toIndentedString(stripeToken)).append("\n");
    sb.append("    stripeEmail: ").append(toIndentedString(stripeEmail)).append("\n");
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

