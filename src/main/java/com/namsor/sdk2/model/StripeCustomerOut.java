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
import com.namsor.sdk2.model.StripeCardOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StripeCustomerOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-04-18T01:11:00.312+02:00[Europe/Berlin]")
public class StripeCustomerOut {
  public static final String SERIALIZED_NAME_STRIPE_CUSTOMER_ID = "stripeCustomerId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUSTOMER_ID)
  private String stripeCustomerId;

  public static final String SERIALIZED_NAME_SOURCE_COUNTRY = "sourceCountry";
  @SerializedName(SERIALIZED_NAME_SOURCE_COUNTRY)
  private String sourceCountry;

  public static final String SERIALIZED_NAME_SOURCE_CURRENCY = "sourceCurrency";
  @SerializedName(SERIALIZED_NAME_SOURCE_CURRENCY)
  private String sourceCurrency;

  public static final String SERIALIZED_NAME_STRIPED_CARDS = "stripedCards";
  @SerializedName(SERIALIZED_NAME_STRIPED_CARDS)
  private List<StripeCardOut> stripedCards = new ArrayList<StripeCardOut>();

  public StripeCustomerOut stripeCustomerId(String stripeCustomerId) {
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

  public StripeCustomerOut sourceCountry(String sourceCountry) {
    this.sourceCountry = sourceCountry;
    return this;
  }

   /**
   * Get sourceCountry
   * @return sourceCountry
  **/
  @ApiModelProperty(value = "")
  public String getSourceCountry() {
    return sourceCountry;
  }

  public void setSourceCountry(String sourceCountry) {
    this.sourceCountry = sourceCountry;
  }

  public StripeCustomerOut sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

   /**
   * Get sourceCurrency
   * @return sourceCurrency
  **/
  @ApiModelProperty(value = "")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public StripeCustomerOut stripedCards(List<StripeCardOut> stripedCards) {
    this.stripedCards = stripedCards;
    return this;
  }

  public StripeCustomerOut addStripedCardsItem(StripeCardOut stripedCardsItem) {
    if (this.stripedCards == null) {
      this.stripedCards = new ArrayList<StripeCardOut>();
    }
    this.stripedCards.add(stripedCardsItem);
    return this;
  }

   /**
   * Get stripedCards
   * @return stripedCards
  **/
  @ApiModelProperty(value = "")
  public List<StripeCardOut> getStripedCards() {
    return stripedCards;
  }

  public void setStripedCards(List<StripeCardOut> stripedCards) {
    this.stripedCards = stripedCards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeCustomerOut stripeCustomerOut = (StripeCustomerOut) o;
    return Objects.equals(this.stripeCustomerId, stripeCustomerOut.stripeCustomerId) &&
        Objects.equals(this.sourceCountry, stripeCustomerOut.sourceCountry) &&
        Objects.equals(this.sourceCurrency, stripeCustomerOut.sourceCurrency) &&
        Objects.equals(this.stripedCards, stripeCustomerOut.stripedCards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeCustomerId, sourceCountry, sourceCurrency, stripedCards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeCustomerOut {\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    sourceCountry: ").append(toIndentedString(sourceCountry)).append("\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    stripedCards: ").append(toIndentedString(stripedCards)).append("\n");
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

