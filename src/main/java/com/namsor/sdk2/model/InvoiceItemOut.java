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
 * InvoiceItemOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-01-14T09:54:19.925+01:00[Europe/Berlin]")
public class InvoiceItemOut {
  public static final String SERIALIZED_NAME_ITEM_ID = "itemId";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private String subscription;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ITEM = "subscriptionItem";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ITEM)
  private String subscriptionItem;

  public static final String SERIALIZED_NAME_INVOICE_ITEM_TYPE = "invoiceItemType";
  @SerializedName(SERIALIZED_NAME_INVOICE_ITEM_TYPE)
  private String invoiceItemType;

  public static final String SERIALIZED_NAME_PLAN_NICKNAME = "planNickname";
  @SerializedName(SERIALIZED_NAME_PLAN_NICKNAME)
  private String planNickname;

  public static final String SERIALIZED_NAME_PLAN_DESC = "planDesc";
  @SerializedName(SERIALIZED_NAME_PLAN_DESC)
  private String planDesc;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public InvoiceItemOut itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(value = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public InvoiceItemOut amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public InvoiceItemOut currency(String currency) {
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

  public InvoiceItemOut description(String description) {
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

  public InvoiceItemOut quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public InvoiceItemOut subscription(String subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public String getSubscription() {
    return subscription;
  }

  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }

  public InvoiceItemOut subscriptionItem(String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
    return this;
  }

   /**
   * Get subscriptionItem
   * @return subscriptionItem
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionItem() {
    return subscriptionItem;
  }

  public void setSubscriptionItem(String subscriptionItem) {
    this.subscriptionItem = subscriptionItem;
  }

  public InvoiceItemOut invoiceItemType(String invoiceItemType) {
    this.invoiceItemType = invoiceItemType;
    return this;
  }

   /**
   * Get invoiceItemType
   * @return invoiceItemType
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceItemType() {
    return invoiceItemType;
  }

  public void setInvoiceItemType(String invoiceItemType) {
    this.invoiceItemType = invoiceItemType;
  }

  public InvoiceItemOut planNickname(String planNickname) {
    this.planNickname = planNickname;
    return this;
  }

   /**
   * Get planNickname
   * @return planNickname
  **/
  @ApiModelProperty(value = "")
  public String getPlanNickname() {
    return planNickname;
  }

  public void setPlanNickname(String planNickname) {
    this.planNickname = planNickname;
  }

  public InvoiceItemOut planDesc(String planDesc) {
    this.planDesc = planDesc;
    return this;
  }

   /**
   * Get planDesc
   * @return planDesc
  **/
  @ApiModelProperty(value = "")
  public String getPlanDesc() {
    return planDesc;
  }

  public void setPlanDesc(String planDesc) {
    this.planDesc = planDesc;
  }

  public InvoiceItemOut planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * Get planName
   * @return planName
  **/
  @ApiModelProperty(value = "")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceItemOut invoiceItemOut = (InvoiceItemOut) o;
    return Objects.equals(this.itemId, invoiceItemOut.itemId) &&
        Objects.equals(this.amount, invoiceItemOut.amount) &&
        Objects.equals(this.currency, invoiceItemOut.currency) &&
        Objects.equals(this.description, invoiceItemOut.description) &&
        Objects.equals(this.quantity, invoiceItemOut.quantity) &&
        Objects.equals(this.subscription, invoiceItemOut.subscription) &&
        Objects.equals(this.subscriptionItem, invoiceItemOut.subscriptionItem) &&
        Objects.equals(this.invoiceItemType, invoiceItemOut.invoiceItemType) &&
        Objects.equals(this.planNickname, invoiceItemOut.planNickname) &&
        Objects.equals(this.planDesc, invoiceItemOut.planDesc) &&
        Objects.equals(this.planName, invoiceItemOut.planName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, amount, currency, description, quantity, subscription, subscriptionItem, invoiceItemType, planNickname, planDesc, planName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceItemOut {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    subscriptionItem: ").append(toIndentedString(subscriptionItem)).append("\n");
    sb.append("    invoiceItemType: ").append(toIndentedString(invoiceItemType)).append("\n");
    sb.append("    planNickname: ").append(toIndentedString(planNickname)).append("\n");
    sb.append("    planDesc: ").append(toIndentedString(planDesc)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
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

