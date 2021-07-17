/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.15
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
import com.namsor.sdk2.model.FirstLastNameDiasporaedOut;
import com.namsor.sdk2.model.FirstLastNameGenderedOut;
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represent multiple classifications for corridor sender and receiver (gender, country, origin, diaspora)
 */
@ApiModel(description = "Represent multiple classifications for corridor sender and receiver (gender, country, origin, diaspora)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-17T18:27:27.141+02:00[Europe/Berlin]")
public class CorridorOut {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_GENDERED_OUT = "FirstLastNameGenderedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_GENDERED_OUT)
  private FirstLastNameGenderedOut firstLastNameGenderedOut = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT = "FirstLastNameOriginedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_ORIGINED_OUT)
  private FirstLastNameOriginedOut firstLastNameOriginedOut = null;

  public static final String SERIALIZED_NAME_FIRST_LAST_NAME_DIASPORAED_OUT = "FirstLastNameDiasporaedOut";
  @SerializedName(SERIALIZED_NAME_FIRST_LAST_NAME_DIASPORAED_OUT)
  private FirstLastNameDiasporaedOut firstLastNameDiasporaedOut = null;

  public static final String SERIALIZED_NAME_SCRIPT = "script";
  @SerializedName(SERIALIZED_NAME_SCRIPT)
  private String script;

  public CorridorOut id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CorridorOut firstLastNameGenderedOut(FirstLastNameGenderedOut firstLastNameGenderedOut) {
    this.firstLastNameGenderedOut = firstLastNameGenderedOut;
    return this;
  }

   /**
   * Get firstLastNameGenderedOut
   * @return firstLastNameGenderedOut
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameGenderedOut getFirstLastNameGenderedOut() {
    return firstLastNameGenderedOut;
  }

  public void setFirstLastNameGenderedOut(FirstLastNameGenderedOut firstLastNameGenderedOut) {
    this.firstLastNameGenderedOut = firstLastNameGenderedOut;
  }

  public CorridorOut firstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
    return this;
  }

   /**
   * Get firstLastNameOriginedOut
   * @return firstLastNameOriginedOut
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameOriginedOut getFirstLastNameOriginedOut() {
    return firstLastNameOriginedOut;
  }

  public void setFirstLastNameOriginedOut(FirstLastNameOriginedOut firstLastNameOriginedOut) {
    this.firstLastNameOriginedOut = firstLastNameOriginedOut;
  }

  public CorridorOut firstLastNameDiasporaedOut(FirstLastNameDiasporaedOut firstLastNameDiasporaedOut) {
    this.firstLastNameDiasporaedOut = firstLastNameDiasporaedOut;
    return this;
  }

   /**
   * Get firstLastNameDiasporaedOut
   * @return firstLastNameDiasporaedOut
  **/
  @ApiModelProperty(value = "")
  public FirstLastNameDiasporaedOut getFirstLastNameDiasporaedOut() {
    return firstLastNameDiasporaedOut;
  }

  public void setFirstLastNameDiasporaedOut(FirstLastNameDiasporaedOut firstLastNameDiasporaedOut) {
    this.firstLastNameDiasporaedOut = firstLastNameDiasporaedOut;
  }

  public CorridorOut script(String script) {
    this.script = script;
    return this;
  }

   /**
   * Get script
   * @return script
  **/
  @ApiModelProperty(value = "")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorridorOut corridorOut = (CorridorOut) o;
    return Objects.equals(this.id, corridorOut.id) &&
        Objects.equals(this.firstLastNameGenderedOut, corridorOut.firstLastNameGenderedOut) &&
        Objects.equals(this.firstLastNameOriginedOut, corridorOut.firstLastNameOriginedOut) &&
        Objects.equals(this.firstLastNameDiasporaedOut, corridorOut.firstLastNameDiasporaedOut) &&
        Objects.equals(this.script, corridorOut.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstLastNameGenderedOut, firstLastNameOriginedOut, firstLastNameDiasporaedOut, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorridorOut {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstLastNameGenderedOut: ").append(toIndentedString(firstLastNameGenderedOut)).append("\n");
    sb.append("    firstLastNameOriginedOut: ").append(toIndentedString(firstLastNameOriginedOut)).append("\n");
    sb.append("    firstLastNameDiasporaedOut: ").append(toIndentedString(firstLastNameDiasporaedOut)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

