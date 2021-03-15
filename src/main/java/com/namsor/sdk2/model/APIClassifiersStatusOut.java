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
import com.namsor.sdk2.model.APIClassifierOut;
import com.namsor.sdk2.model.SoftwareVersionOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * APIClassifiersStatusOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-15T09:38:22.982+01:00[Europe/Berlin]")
public class APIClassifiersStatusOut {
  public static final String SERIALIZED_NAME_SOFTWARE_VERSION = "softwareVersion";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_VERSION)
  private SoftwareVersionOut softwareVersion = null;

  public static final String SERIALIZED_NAME_CLASSIFIERS = "classifiers";
  @SerializedName(SERIALIZED_NAME_CLASSIFIERS)
  private List<APIClassifierOut> classifiers = new ArrayList<APIClassifierOut>();

  public APIClassifiersStatusOut softwareVersion(SoftwareVersionOut softwareVersion) {
    this.softwareVersion = softwareVersion;
    return this;
  }

   /**
   * Get softwareVersion
   * @return softwareVersion
  **/
  @ApiModelProperty(value = "")
  public SoftwareVersionOut getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(SoftwareVersionOut softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public APIClassifiersStatusOut classifiers(List<APIClassifierOut> classifiers) {
    this.classifiers = classifiers;
    return this;
  }

  public APIClassifiersStatusOut addClassifiersItem(APIClassifierOut classifiersItem) {
    if (this.classifiers == null) {
      this.classifiers = new ArrayList<APIClassifierOut>();
    }
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * Get classifiers
   * @return classifiers
  **/
  @ApiModelProperty(value = "")
  public List<APIClassifierOut> getClassifiers() {
    return classifiers;
  }

  public void setClassifiers(List<APIClassifierOut> classifiers) {
    this.classifiers = classifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIClassifiersStatusOut apIClassifiersStatusOut = (APIClassifiersStatusOut) o;
    return Objects.equals(this.softwareVersion, apIClassifiersStatusOut.softwareVersion) &&
        Objects.equals(this.classifiers, apIClassifiersStatusOut.classifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareVersion, classifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIClassifiersStatusOut {\n");
    sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
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

