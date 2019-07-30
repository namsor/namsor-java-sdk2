/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.5
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
import java.util.ArrayList;
import java.util.List;

/**
 * SoftwareVersionOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-30T14:11:33.108+02:00[Europe/Berlin]")
public class SoftwareVersionOut {
  public static final String SERIALIZED_NAME_SOFTWARE_NAME_AND_VERSION = "softwareNameAndVersion";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_NAME_AND_VERSION)
  private String softwareNameAndVersion;

  public static final String SERIALIZED_NAME_SOFTWARE_VERSION = "softwareVersion";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_VERSION)
  private List<Integer> softwareVersion = new ArrayList<Integer>();

  public SoftwareVersionOut softwareNameAndVersion(String softwareNameAndVersion) {
    this.softwareNameAndVersion = softwareNameAndVersion;
    return this;
  }

   /**
   * Get softwareNameAndVersion
   * @return softwareNameAndVersion
  **/
  @ApiModelProperty(value = "")
  public String getSoftwareNameAndVersion() {
    return softwareNameAndVersion;
  }

  public void setSoftwareNameAndVersion(String softwareNameAndVersion) {
    this.softwareNameAndVersion = softwareNameAndVersion;
  }

  public SoftwareVersionOut softwareVersion(List<Integer> softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

  public SoftwareVersionOut addSoftwareVersionItem(Integer softwareVersionItem) {
    if (this.softwareVersion == null) {
      this.softwareVersion = new ArrayList<Integer>();
    }
    this.softwareVersion.add(softwareVersionItem);
    return this;
  }

   /**
   * Get softwareVersion
   * @return softwareVersion
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(List<Integer> softwareVersion) {
    this.softwareVersion = softwareVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareVersionOut softwareVersionOut = (SoftwareVersionOut) o;
    return Objects.equals(this.softwareNameAndVersion, softwareVersionOut.softwareNameAndVersion) &&
        Objects.equals(this.softwareVersion, softwareVersionOut.softwareVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareNameAndVersion, softwareVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareVersionOut {\n");
    sb.append("    softwareNameAndVersion: ").append(toIndentedString(softwareNameAndVersion)).append("\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
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

