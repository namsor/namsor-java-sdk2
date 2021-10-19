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


package com.namsor.sdk2.api;

import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.model.BatchNameGeoIn;
import com.namsor.sdk2.model.BatchNameIn;
import com.namsor.sdk2.model.BatchProperNounCategorizedOut;
import com.namsor.sdk2.model.ProperNounCategorizedOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralApi
 */
@Ignore
public class GeneralApiTest {

    private final GeneralApi api = new GeneralApi();

    
    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nameTypeTest() throws ApiException {
        String properNoun = null;
        ProperNounCategorizedOut response = api.nameType(properNoun);

        // TODO: test validations
    }
    
    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nameTypeBatchTest() throws ApiException {
        BatchNameIn batchNameIn = null;
        BatchProperNounCategorizedOut response = api.nameTypeBatch(batchNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nameTypeGeoTest() throws ApiException {
        String properNoun = null;
        String countryIso2 = null;
        ProperNounCategorizedOut response = api.nameTypeGeo(properNoun, countryIso2);

        // TODO: test validations
    }
    
    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nameTypeGeoBatchTest() throws ApiException {
        BatchNameGeoIn batchNameGeoIn = null;
        BatchProperNounCategorizedOut response = api.nameTypeGeoBatch(batchNameGeoIn);

        // TODO: test validations
    }
    
}
