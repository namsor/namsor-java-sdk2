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
 * BillingInfoInOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T10:14:57.526+01:00[Europe/Berlin]")
public class BillingInfoInOut {
  public static final String SERIALIZED_NAME_BILLING_EMAIL = "billingEmail";
  @SerializedName(SERIALIZED_NAME_BILLING_EMAIL)
  private String billingEmail;

  public static final String SERIALIZED_NAME_PREFERRED_CURRENCY = "preferredCurrency";
  @SerializedName(SERIALIZED_NAME_PREFERRED_CURRENCY)
  private String preferredCurrency;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customerName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customerPhone";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
  private String customerPhone;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_CITY = "addressCity";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CITY)
  private String addressCity;

  public static final String SERIALIZED_NAME_ADDRESS_POSTAL_CODE = "addressPostalCode";
  @SerializedName(SERIALIZED_NAME_ADDRESS_POSTAL_CODE)
  private String addressPostalCode;

  public static final String SERIALIZED_NAME_ADDRESS_STATE = "addressState";
  @SerializedName(SERIALIZED_NAME_ADDRESS_STATE)
  private String addressState;

  public static final String SERIALIZED_NAME_ADDRESS_COUNTRY = "addressCountry";
  @SerializedName(SERIALIZED_NAME_ADDRESS_COUNTRY)
  private String addressCountry;

  public static final String SERIALIZED_NAME_VAT_I_D = "vatID";
  @SerializedName(SERIALIZED_NAME_VAT_I_D)
  private String vatID;

  public BillingInfoInOut billingEmail(String billingEmail) {
    this.billingEmail = billingEmail;
    return this;
  }

   /**
   * Get billingEmail
   * @return billingEmail
  **/
  @ApiModelProperty(value = "")
  public String getBillingEmail() {
    return billingEmail;
  }

  public void setBillingEmail(String billingEmail) {
    this.billingEmail = billingEmail;
  }

  public BillingInfoInOut preferredCurrency(String preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
    return this;
  }

   /**
   * Get preferredCurrency
   * @return preferredCurrency
  **/
  @ApiModelProperty(value = "")
  public String getPreferredCurrency() {
    return preferredCurrency;
  }

  public void setPreferredCurrency(String preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
  }

  public BillingInfoInOut customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public BillingInfoInOut customerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

   /**
   * Get customerPhone
   * @return customerPhone
  **/
  @ApiModelProperty(value = "")
  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public BillingInfoInOut addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Get addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public BillingInfoInOut addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Get addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public BillingInfoInOut addressCity(String addressCity) {
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Get addressCity
   * @return addressCity
  **/
  @ApiModelProperty(value = "")
  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }

  public BillingInfoInOut addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

   /**
   * Get addressPostalCode
   * @return addressPostalCode
  **/
  @ApiModelProperty(value = "")
  public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }

  public BillingInfoInOut addressState(String addressState) {
    this.addressState = addressState;
    return this;
  }

   /**
   * Get addressState
   * @return addressState
  **/
  @ApiModelProperty(value = "")
  public String getAddressState() {
    return addressState;
  }

  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }

  public BillingInfoInOut addressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * Get addressCountry
   * @return addressCountry
  **/
  @ApiModelProperty(value = "")
  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }

  public BillingInfoInOut vatID(String vatID) {
    this.vatID = vatID;
    return this;
  }

   /**
   * Get vatID
   * @return vatID
  **/
  @ApiModelProperty(value = "")
  public String getVatID() {
    return vatID;
  }

  public void setVatID(String vatID) {
    this.vatID = vatID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInfoInOut billingInfoInOut = (BillingInfoInOut) o;
    return Objects.equals(this.billingEmail, billingInfoInOut.billingEmail) &&
        Objects.equals(this.preferredCurrency, billingInfoInOut.preferredCurrency) &&
        Objects.equals(this.customerName, billingInfoInOut.customerName) &&
        Objects.equals(this.customerPhone, billingInfoInOut.customerPhone) &&
        Objects.equals(this.addressLine1, billingInfoInOut.addressLine1) &&
        Objects.equals(this.addressLine2, billingInfoInOut.addressLine2) &&
        Objects.equals(this.addressCity, billingInfoInOut.addressCity) &&
        Objects.equals(this.addressPostalCode, billingInfoInOut.addressPostalCode) &&
        Objects.equals(this.addressState, billingInfoInOut.addressState) &&
        Objects.equals(this.addressCountry, billingInfoInOut.addressCountry) &&
        Objects.equals(this.vatID, billingInfoInOut.vatID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingEmail, preferredCurrency, customerName, customerPhone, addressLine1, addressLine2, addressCity, addressPostalCode, addressState, addressCountry, vatID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInfoInOut {\n");
    sb.append("    billingEmail: ").append(toIndentedString(billingEmail)).append("\n");
    sb.append("    preferredCurrency: ").append(toIndentedString(preferredCurrency)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
    sb.append("    vatID: ").append(toIndentedString(vatID)).append("\n");
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

