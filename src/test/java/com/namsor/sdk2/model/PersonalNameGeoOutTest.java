/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.30
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
import com.namsor.sdk2.model.ReligionStatOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PersonalNameGeoOut
 */
public class PersonalNameGeoOutTest {
    private final PersonalNameGeoOut model = new PersonalNameGeoOut();

    /**
     * Model tests for PersonalNameGeoOut
     */
    @Test
    public void testPersonalNameGeoOut() {
        // TODO: test PersonalNameGeoOut
    }

    /**
     * Test the property 'script'
     */
    @Test
    public void scriptTest() {
        // TODO: test script
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'explanation'
     */
    @Test
    public void explanationTest() {
        // TODO: test explanation
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'score'
     */
    @Test
    public void scoreTest() {
        // TODO: test score
    }

    /**
     * Test the property 'country'
     */
    @Test
    public void countryTest() {
        // TODO: test country
    }

    /**
     * Test the property 'countryAlt'
     */
    @Test
    public void countryAltTest() {
        // TODO: test countryAlt
    }

    /**
     * Test the property 'region'
     */
    @Test
    public void regionTest() {
        // TODO: test region
    }

    /**
     * Test the property 'topRegion'
     */
    @Test
    public void topRegionTest() {
        // TODO: test topRegion
    }

    /**
     * Test the property 'subRegion'
     */
    @Test
    public void subRegionTest() {
        // TODO: test subRegion
    }

    /**
     * Test the property 'countriesTop'
     */
    @Test
    public void countriesTopTest() {
        // TODO: test countriesTop
    }

    /**
     * Test the property 'probabilityCalibrated'
     */
    @Test
    public void probabilityCalibratedTest() {
        // TODO: test probabilityCalibrated
    }

    /**
     * Test the property 'probabilityAltCalibrated'
     */
    @Test
    public void probabilityAltCalibratedTest() {
        // TODO: test probabilityAltCalibrated
    }

    /**
     * Test the property 'religionStats'
     */
    @Test
    public void religionStatsTest() {
        // TODO: test religionStats
    }

    /**
     * Test the property 'religionStatsAlt'
     */
    @Test
    public void religionStatsAltTest() {
        // TODO: test religionStatsAlt
    }

}
