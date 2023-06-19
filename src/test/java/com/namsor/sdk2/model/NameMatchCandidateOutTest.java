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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NameMatchCandidateOut
 */
public class NameMatchCandidateOutTest {
    private final NameMatchCandidateOut model = new NameMatchCandidateOut();

    /**
     * Model tests for NameMatchCandidateOut
     */
    @Test
    public void testNameMatchCandidateOut() {
        // TODO: test NameMatchCandidateOut
    }

    /**
     * Test the property 'candidateName'
     */
    @Test
    public void candidateNameTest() {
        // TODO: test candidateName
    }

    /**
     * Test the property 'probability'
     */
    @Test
    public void probabilityTest() {
        // TODO: test probability
    }

    /**
     * Test the property 'predScoreGivenName'
     */
    @Test
    public void predScoreGivenNameTest() {
        // TODO: test predScoreGivenName
    }

    /**
     * Test the property 'predScoreFamilyName'
     */
    @Test
    public void predScoreFamilyNameTest() {
        // TODO: test predScoreFamilyName
    }

}
