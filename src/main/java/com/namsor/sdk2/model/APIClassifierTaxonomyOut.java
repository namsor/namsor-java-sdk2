/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.26
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T20:11:11.018+02:00[Europe/Berlin]")
public class APIClassifierTaxonomyOut {
  public static final String SERIALIZED_NAME_CLASSIFIER_NAME = "classifierName";
  @SerializedName(SERIALIZED_NAME_CLASSIFIER_NAME)
  private String classifierName;

  public static final String SERIALIZED_NAME_TAXONOMY_CLASSES = "taxonomyClasses";
  @SerializedName(SERIALIZED_NAME_TAXONOMY_CLASSES)
  private List<String> taxonomyClasses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CLASSIFYING_SCRIPTS = "classifyingScripts";
  @SerializedName(SERIALIZED_NAME_CLASSIFYING_SCRIPTS)
  private List<String> classifyingScripts = new ArrayList<String>();

  public APIClassifierTaxonomyOut classifierName(String classifierName) {
    this.classifierName = classifierName;
    return this;
  }

   /**
   * Name of the classifier as per apiStatus (corresponds also to the name of the service in apiServices)
   * @return classifierName
  **/
  @ApiModelProperty(value = "Name of the classifier as per apiStatus (corresponds also to the name of the service in apiServices)")
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
   * The taxonomy classes this classifier classifies to
   * @return taxonomyClasses
  **/
  @ApiModelProperty(value = "The taxonomy classes this classifier classifies to")
  public List<String> getTaxonomyClasses() {
    return taxonomyClasses;
  }

  public void setTaxonomyClasses(List<String> taxonomyClasses) {
    this.taxonomyClasses = taxonomyClasses;
  }

  public APIClassifierTaxonomyOut classifyingScripts(List<String> classifyingScripts) {
    this.classifyingScripts = classifyingScripts;
    return this;
  }

  public APIClassifierTaxonomyOut addClassifyingScriptsItem(String classifyingScriptsItem) {
    if (this.classifyingScripts == null) {
      this.classifyingScripts = new ArrayList<String>();
    }
    this.classifyingScripts.add(classifyingScriptsItem);
    return this;
  }

   /**
   * The scripts / alphabets this classifiers classifies to
   * @return classifyingScripts
  **/
  @ApiModelProperty(value = "The scripts / alphabets this classifiers classifies to")
  public List<String> getClassifyingScripts() {
    return classifyingScripts;
  }

  public void setClassifyingScripts(List<String> classifyingScripts) {
    this.classifyingScripts = classifyingScripts;
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
        Objects.equals(this.taxonomyClasses, apIClassifierTaxonomyOut.taxonomyClasses) &&
        Objects.equals(this.classifyingScripts, apIClassifierTaxonomyOut.classifyingScripts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classifierName, taxonomyClasses, classifyingScripts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIClassifierTaxonomyOut {\n");
    sb.append("    classifierName: ").append(toIndentedString(classifierName)).append("\n");
    sb.append("    taxonomyClasses: ").append(toIndentedString(taxonomyClasses)).append("\n");
    sb.append("    classifyingScripts: ").append(toIndentedString(classifyingScripts)).append("\n");
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

