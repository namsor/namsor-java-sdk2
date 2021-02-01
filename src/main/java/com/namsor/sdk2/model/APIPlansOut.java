/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.12
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
import com.namsor.sdk2.model.APIPlanOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * APIPlansOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T08:53:23.316+01:00[Europe/Berlin]")
public class APIPlansOut {
  public static final String SERIALIZED_NAME_USAGE_RATIO_FOR_DUPPLICATES = "usageRatioForDupplicates";
  @SerializedName(SERIALIZED_NAME_USAGE_RATIO_FOR_DUPPLICATES)
  private Long usageRatioForDupplicates;

  public static final String SERIALIZED_NAME_CURRENCY_ISO3 = "currencyIso3";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ISO3)
  private String currencyIso3;

  public static final String SERIALIZED_NAME_CURRENCY_SYMBOL = "currencySymbol";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SYMBOL)
  private String currencySymbol;

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<APIPlanOut> plans = new ArrayList<APIPlanOut>();

  public APIPlansOut usageRatioForDupplicates(Long usageRatioForDupplicates) {
    this.usageRatioForDupplicates = usageRatioForDupplicates;
    return this;
  }

   /**
   * Get usageRatioForDupplicates
   * @return usageRatioForDupplicates
  **/
  @ApiModelProperty(value = "")
  public Long getUsageRatioForDupplicates() {
    return usageRatioForDupplicates;
  }

  public void setUsageRatioForDupplicates(Long usageRatioForDupplicates) {
    this.usageRatioForDupplicates = usageRatioForDupplicates;
  }

  public APIPlansOut currencyIso3(String currencyIso3) {
    this.currencyIso3 = currencyIso3;
    return this;
  }

   /**
   * Get currencyIso3
   * @return currencyIso3
  **/
  @ApiModelProperty(value = "")
  public String getCurrencyIso3() {
    return currencyIso3;
  }

  public void setCurrencyIso3(String currencyIso3) {
    this.currencyIso3 = currencyIso3;
  }

  public APIPlansOut currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public APIPlansOut plans(List<APIPlanOut> plans) {
    this.plans = plans;
    return this;
  }

  public APIPlansOut addPlansItem(APIPlanOut plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<APIPlanOut>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @ApiModelProperty(value = "")
  public List<APIPlanOut> getPlans() {
    return plans;
  }

  public void setPlans(List<APIPlanOut> plans) {
    this.plans = plans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIPlansOut apIPlansOut = (APIPlansOut) o;
    return Objects.equals(this.usageRatioForDupplicates, apIPlansOut.usageRatioForDupplicates) &&
        Objects.equals(this.currencyIso3, apIPlansOut.currencyIso3) &&
        Objects.equals(this.currencySymbol, apIPlansOut.currencySymbol) &&
        Objects.equals(this.plans, apIPlansOut.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageRatioForDupplicates, currencyIso3, currencySymbol, plans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIPlansOut {\n");
    sb.append("    usageRatioForDupplicates: ").append(toIndentedString(usageRatioForDupplicates)).append("\n");
    sb.append("    currencyIso3: ").append(toIndentedString(currencyIso3)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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

