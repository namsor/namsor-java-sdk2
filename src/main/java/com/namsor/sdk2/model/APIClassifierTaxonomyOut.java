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
import java.util.ArrayList;
import java.util.List;

/**
 * APIClassifierTaxonomyOut
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-15T12:23:01.598+01:00[Europe/Berlin]")
public class APIClassifierTaxonomyOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_TAXONOMY_CLASSES = "taxonomyClasses";
  @SerializedName(SERIALIZED_NAME_TAXONOMY_CLASSES)
  private List<String> taxonomyClasses = new ArrayList<String>();

  public APIClassifierTaxonomyOut classifierName(String classifierName) {
    this.classifierName = classifierName;
    return this;
  }

   /**
   * Get classifierName
   * @return classifierName
  **/
  @ApiModelProperty(value = "")
  public String getClassifierName() {
    return classifierName;
  }

  public void setClassifierName(String classifierName) {
    this.classifierName = classifierName;
  }

  public APIClassifierTaxonomyOut taxonomyClasses(List<String> taxonomyClasses) {
    this.taxonomyClasses = taxonomyClasses;
    return this;
  }

  public APIClassifierTaxonomyOut addTaxonomyClassesItem(String taxonomyClassesItem) {
    if (this.taxonomyClasses == null) {
      this.taxonomyClasses = new ArrayList<String>();
    }
    this.taxonomyClasses.add(taxonomyClassesItem);
    return this;
  }

   /**
   * Get taxonomyClasses
   * @return taxonomyClasses
  **/
  @ApiModelProperty(value = "")
  public List<String> getTaxonomyClasses() {
    return taxonomyClasses;
  }

  public void setTaxonomyClasses(List<String> taxonomyClasses) {
    this.taxonomyClasses = taxonomyClasses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIClassifierTaxonomyOut apIClassifierTaxonomyOut = (APIClassifierTaxonomyOut) o;
    return Objects.equals(this.classifierName, apIClassifierTaxonomyOut.classifierName) &&
        Objects.equals(this.taxonomyClasses, apIClassifierTaxonomyOut.taxonomyClasses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierName, taxonomyClasses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIClassifierTaxonomyOut {\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    taxonomyClasses: ").append(toIndentedString(taxonomyClasses)).append("\n");
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

