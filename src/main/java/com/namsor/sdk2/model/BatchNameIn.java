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
import com.namsor.sdk2.model.FactIn;
import com.namsor.sdk2.model.NameIn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BatchNameIn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:33:14.621+02:00[Europe/Berlin]")
public class BatchNameIn {
  public static final String SERIALIZED_NAME_PROPER_NOUNS = "properNouns";
  @SerializedName(SERIALIZED_NAME_PROPER_NOUNS)
  private List<NameIn> properNouns = new ArrayList<NameIn>();

  public static final String SERIALIZED_NAME_FACTS = "facts";
  @SerializedName(SERIALIZED_NAME_FACTS)
  private List<FactIn> facts = new ArrayList<FactIn>();

  public BatchNameIn properNouns(List<NameIn> properNouns) {
    this.properNouns = properNouns;
    return this;
  }

  public BatchNameIn addProperNounsItem(NameIn properNounsItem) {
    if (this.properNouns == null) {
      this.properNouns = new ArrayList<NameIn>();
    }
    this.properNouns.add(properNounsItem);
    return this;
  }

   /**
   * Get properNouns
   * @return properNouns
  **/
  @ApiModelProperty(value = "")
  public List<NameIn> getProperNouns() {
    return properNouns;
  }

  public void setProperNouns(List<NameIn> properNouns) {
    this.properNouns = properNouns;
  }

  public BatchNameIn facts(List<FactIn> facts) {
    this.facts = facts;
    return this;
  }

  public BatchNameIn addFactsItem(FactIn factsItem) {
    if (this.facts == null) {
      this.facts = new ArrayList<FactIn>();
    }
    this.facts.add(factsItem);
    return this;
  }

   /**
   * Get facts
   * @return facts
  **/
  @ApiModelProperty(value = "")
  public List<FactIn> getFacts() {
    return facts;
  }

  public void setFacts(List<FactIn> facts) {
    this.facts = facts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchNameIn batchNameIn = (BatchNameIn) o;
    return Objects.equals(this.properNouns, batchNameIn.properNouns) &&
        Objects.equals(this.facts, batchNameIn.facts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properNouns, facts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchNameIn {\n");
    sb.append("    properNouns: ").append(toIndentedString(properNouns)).append("\n");
    sb.append("    facts: ").append(toIndentedString(facts)).append("\n");
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

