/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.10
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
import com.namsor.sdk2.model.InvoiceItemOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * InvoiceOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-07T20:31:24.687+02:00[Europe/Berlin]")
public class InvoiceOut {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<InvoiceItemOut> items = new ArrayList<InvoiceItemOut>();

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoiceId";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_IS_STRIPED = "isStriped";
  @SerializedName(SERIALIZED_NAME_IS_STRIPED)
  private Boolean isStriped;

  public static final String SERIALIZED_NAME_STRIPE_CUSTOMER_ID = "stripeCustomerId";
  @SerializedName(SERIALIZED_NAME_STRIPE_CUSTOMER_ID)
  private String stripeCustomerId;

  public static final String SERIALIZED_NAME_AMOUNT_DUE = "amountDue";
  @SerializedName(SERIALIZED_NAME_AMOUNT_DUE)
  private Long amountDue;

  public static final String SERIALIZED_NAME_AMOUNT_PAID = "amountPaid";
  @SerializedName(SERIALIZED_NAME_AMOUNT_PAID)
  private Long amountPaid;

  public static final String SERIALIZED_NAME_AMOUNT_REMAINING = "amountRemaining";
  @SerializedName(SERIALIZED_NAME_AMOUNT_REMAINING)
  private Long amountRemaining;

  public static final String SERIALIZED_NAME_ATTEMPTED = "attempted";
  @SerializedName(SERIALIZED_NAME_ATTEMPTED)
  private Boolean attempted;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private OffsetDateTime invoiceDate;

  public static final String SERIALIZED_NAME_DUE_DATE = "dueDate";
  @SerializedName(SERIALIZED_NAME_DUE_DATE)
  private OffsetDateTime dueDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INVOICE_PDF = "invoicePdf";
  @SerializedName(SERIALIZED_NAME_INVOICE_PDF)
  private String invoicePdf;

  public static final String SERIALIZED_NAME_PERIOD_START = "periodStart";
  @SerializedName(SERIALIZED_NAME_PERIOD_START)
  private OffsetDateTime periodStart;

  public static final String SERIALIZED_NAME_PERIOD_END = "periodEnd";
  @SerializedName(SERIALIZED_NAME_PERIOD_END)
  private OffsetDateTime periodEnd;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private String receiptNumber;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoiceStatus";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private String invoiceStatus;

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private Long subTotal;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Long tax;

  public static final String SERIALIZED_NAME_TAX_PERCENT = "taxPercent";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENT)
  private Long taxPercent;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public InvoiceOut items(List<InvoiceItemOut> items) {
    this.items = items;
    return this;
  }

  public InvoiceOut addItemsItem(InvoiceItemOut itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<InvoiceItemOut>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceItemOut> getItems() {
    return items;
  }

  public void setItems(List<InvoiceItemOut> items) {
    this.items = items;
  }

  public InvoiceOut userId(String userId) {
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

  public InvoiceOut invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public InvoiceOut isStriped(Boolean isStriped) {
    this.isStriped = isStriped;
    return this;
  }

   /**
   * Get isStriped
   * @return isStriped
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsStriped() {
    return isStriped;
  }

  public void setIsStriped(Boolean isStriped) {
    this.isStriped = isStriped;
  }

  public InvoiceOut stripeCustomerId(String stripeCustomerId) {
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

  public InvoiceOut amountDue(Long amountDue) {
    this.amountDue = amountDue;
    return this;
  }

   /**
   * Get amountDue
   * @return amountDue
  **/
  @ApiModelProperty(value = "")
  public Long getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(Long amountDue) {
    this.amountDue = amountDue;
  }

  public InvoiceOut amountPaid(Long amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(value = "")
  public Long getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Long amountPaid) {
    this.amountPaid = amountPaid;
  }

  public InvoiceOut amountRemaining(Long amountRemaining) {
    this.amountRemaining = amountRemaining;
    return this;
  }

   /**
   * Get amountRemaining
   * @return amountRemaining
  **/
  @ApiModelProperty(value = "")
  public Long getAmountRemaining() {
    return amountRemaining;
  }

  public void setAmountRemaining(Long amountRemaining) {
    this.amountRemaining = amountRemaining;
  }

  public InvoiceOut attempted(Boolean attempted) {
    this.attempted = attempted;
    return this;
  }

   /**
   * Get attempted
   * @return attempted
  **/
  @ApiModelProperty(value = "")
  public Boolean getAttempted() {
    return attempted;
  }

  public void setAttempted(Boolean attempted) {
    this.attempted = attempted;
  }

  public InvoiceOut currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public InvoiceOut invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public InvoiceOut dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public InvoiceOut description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InvoiceOut invoicePdf(String invoicePdf) {
    this.invoicePdf = invoicePdf;
    return this;
  }

   /**
   * Get invoicePdf
   * @return invoicePdf
  **/
  @ApiModelProperty(value = "")
  public String getInvoicePdf() {
    return invoicePdf;
  }

  public void setInvoicePdf(String invoicePdf) {
    this.invoicePdf = invoicePdf;
  }

  public InvoiceOut periodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Get periodStart
   * @return periodStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }

  public InvoiceOut periodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Get periodEnd
   * @return periodEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(OffsetDateTime periodEnd) {
    this.periodEnd = periodEnd;
  }

  public InvoiceOut receiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @ApiModelProperty(value = "")
  public String getReceiptNumber() {
    return receiptNumber;
  }

  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  public InvoiceOut invoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * Get invoiceStatus
   * @return invoiceStatus
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }

  public InvoiceOut subTotal(Long subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public Long getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Long subTotal) {
    this.subTotal = subTotal;
  }

  public InvoiceOut tax(Long tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public Long getTax() {
    return tax;
  }

  public void setTax(Long tax) {
    this.tax = tax;
  }

  public InvoiceOut taxPercent(Long taxPercent) {
    this.taxPercent = taxPercent;
    return this;
  }

   /**
   * Get taxPercent
   * @return taxPercent
  **/
  @ApiModelProperty(value = "")
  public Long getTaxPercent() {
    return taxPercent;
  }

  public void setTaxPercent(Long taxPercent) {
    this.taxPercent = taxPercent;
  }

  public InvoiceOut total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceOut invoiceOut = (InvoiceOut) o;
    return Objects.equals(this.items, invoiceOut.items) &&
        Objects.equals(this.userId, invoiceOut.userId) &&
        Objects.equals(this.invoiceId, invoiceOut.invoiceId) &&
        Objects.equals(this.isStriped, invoiceOut.isStriped) &&
        Objects.equals(this.stripeCustomerId, invoiceOut.stripeCustomerId) &&
        Objects.equals(this.amountDue, invoiceOut.amountDue) &&
        Objects.equals(this.amountPaid, invoiceOut.amountPaid) &&
        Objects.equals(this.amountRemaining, invoiceOut.amountRemaining) &&
        Objects.equals(this.attempted, invoiceOut.attempted) &&
        Objects.equals(this.currency, invoiceOut.currency) &&
        Objects.equals(this.invoiceDate, invoiceOut.invoiceDate) &&
        Objects.equals(this.dueDate, invoiceOut.dueDate) &&
        Objects.equals(this.description, invoiceOut.description) &&
        Objects.equals(this.invoicePdf, invoiceOut.invoicePdf) &&
        Objects.equals(this.periodStart, invoiceOut.periodStart) &&
        Objects.equals(this.periodEnd, invoiceOut.periodEnd) &&
        Objects.equals(this.receiptNumber, invoiceOut.receiptNumber) &&
        Objects.equals(this.invoiceStatus, invoiceOut.invoiceStatus) &&
        Objects.equals(this.subTotal, invoiceOut.subTotal) &&
        Objects.equals(this.tax, invoiceOut.tax) &&
        Objects.equals(this.taxPercent, invoiceOut.taxPercent) &&
        Objects.equals(this.total, invoiceOut.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, userId, invoiceId, isStriped, stripeCustomerId, amountDue, amountPaid, amountRemaining, attempted, currency, invoiceDate, dueDate, description, invoicePdf, periodStart, periodEnd, receiptNumber, invoiceStatus, subTotal, tax, taxPercent, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceOut {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    isStriped: ").append(toIndentedString(isStriped)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountRemaining: ").append(toIndentedString(amountRemaining)).append("\n");
    sb.append("    attempted: ").append(toIndentedString(attempted)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invoicePdf: ").append(toIndentedString(invoicePdf)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxPercent: ").append(toIndentedString(taxPercent)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

