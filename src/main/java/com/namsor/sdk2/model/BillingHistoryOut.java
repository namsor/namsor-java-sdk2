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
import com.namsor.sdk2.model.InvoiceOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BillingHistoryOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T09:38:22.982+01:00[Europe/Berlin]")
public class BillingHistoryOut {
  public static final String SERIALIZED_NAME_STRIPE_INVOICES = "stripeInvoices";
  @SerializedName(SERIALIZED_NAME_STRIPE_INVOICES)
  private List<InvoiceOut> stripeInvoices = new ArrayList<InvoiceOut>();

  public static final String SERIALIZED_NAME_CORPORATE_INVOICES = "corporateInvoices";
  @SerializedName(SERIALIZED_NAME_CORPORATE_INVOICES)
  private List<InvoiceOut> corporateInvoices = new ArrayList<InvoiceOut>();

  public BillingHistoryOut stripeInvoices(List<InvoiceOut> stripeInvoices) {
    this.stripeInvoices = stripeInvoices;
    return this;
  }

  public BillingHistoryOut addStripeInvoicesItem(InvoiceOut stripeInvoicesItem) {
    if (this.stripeInvoices == null) {
      this.stripeInvoices = new ArrayList<InvoiceOut>();
    }
    this.stripeInvoices.add(stripeInvoicesItem);
    return this;
  }

   /**
   * Get stripeInvoices
   * @return stripeInvoices
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceOut> getStripeInvoices() {
    return stripeInvoices;
  }

  public void setStripeInvoices(List<InvoiceOut> stripeInvoices) {
    this.stripeInvoices = stripeInvoices;
  }

  public BillingHistoryOut corporateInvoices(List<InvoiceOut> corporateInvoices) {
    this.corporateInvoices = corporateInvoices;
    return this;
  }

  public BillingHistoryOut addCorporateInvoicesItem(InvoiceOut corporateInvoicesItem) {
    if (this.corporateInvoices == null) {
      this.corporateInvoices = new ArrayList<InvoiceOut>();
    }
    this.corporateInvoices.add(corporateInvoicesItem);
    return this;
  }

   /**
   * Get corporateInvoices
   * @return corporateInvoices
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceOut> getCorporateInvoices() {
    return corporateInvoices;
  }

  public void setCorporateInvoices(List<InvoiceOut> corporateInvoices) {
    this.corporateInvoices = corporateInvoices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingHistoryOut billingHistoryOut = (BillingHistoryOut) o;
    return Objects.equals(this.stripeInvoices, billingHistoryOut.stripeInvoices) &&
        Objects.equals(this.corporateInvoices, billingHistoryOut.corporateInvoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeInvoices, corporateInvoices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingHistoryOut {\n");
    sb.append("    stripeInvoices: ").append(toIndentedString(stripeInvoices)).append("\n");
    sb.append("    corporateInvoices: ").append(toIndentedString(corporateInvoices)).append("\n");
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

