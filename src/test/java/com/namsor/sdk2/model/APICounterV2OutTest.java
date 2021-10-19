/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.16
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
import com.namsor.sdk2.model.APIKeyOut;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for APICounterV2Out
 */
public class APICounterV2OutTest {
    private final APICounterV2Out model = new APICounterV2Out();

    /**
     * Model tests for APICounterV2Out
     */
    @Test
    public void testAPICounterV2Out() {
        // TODO: test APICounterV2Out
    }

    /**
     * Test the property 'apiKey'
     */
    @Test
    public void apiKeyTest() {
        // TODO: test apiKey
    }

    /**
     * Test the property 'apiService'
     */
    @Test
    public void apiServiceTest() {
        // TODO: test apiService
    }

    /**
     * Test the property 'createdDateTime'
     */
    @Test
    public void createdDateTimeTest() {
        // TODO: test createdDateTime
    }

    /**
     * Test the property 'totalUsage'
     */
    @Test
    public void totalUsageTest() {
        // TODO: test totalUsage
    }

    /**
     * Test the property 'lastFlushedDateTime'
     */
    @Test
    public void lastFlushedDateTimeTest() {
        // TODO: test lastFlushedDateTime
    }

    /**
     * Test the property 'lastUsedDateTime'
     */
    @Test
    public void lastUsedDateTimeTest() {
        // TODO: test lastUsedDateTime
    }

    /**
     * Test the property 'serviceFeaturesUsage'
     */
    @Test
    public void serviceFeaturesUsageTest() {
        // TODO: test serviceFeaturesUsage
    }

}
