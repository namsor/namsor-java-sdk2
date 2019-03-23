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
 * DeployUIOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-23T08:48:45.717+01:00[Europe/Berlin]")
public class DeployUIOut {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Boolean succeeded;

  public DeployUIOut errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public DeployUIOut succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Get succeeded
   * @return succeeded
  **/
  @ApiModelProperty(value = "")
  public Boolean getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployUIOut deployUIOut = (DeployUIOut) o;
    return Objects.equals(this.errorMessage, deployUIOut.errorMessage) &&
        Objects.equals(this.succeeded, deployUIOut.succeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, succeeded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployUIOut {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
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

