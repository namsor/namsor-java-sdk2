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
import com.namsor.sdk2.model.BatchFirstLastNamePhoneCodedOut;
import com.namsor.sdk2.model.BatchFirstLastNamePhoneNumberGeoIn;
import com.namsor.sdk2.model.BatchFirstLastNamePhoneNumberIn;
import com.namsor.sdk2.model.FirstLastNamePhoneCodedOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SocialApi
 */
@Ignore
public class SocialApiTest {

    private final SocialApi api = new SocialApi();

    
    /**
     * [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneCodeTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String phoneNumber = null;
        FirstLastNamePhoneCodedOut response = api.phoneCode(firstName, lastName, phoneNumber);

        // TODO: test validations
    }
    
    /**
     * [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneCodeBatchTest() throws ApiException {
        BatchFirstLastNamePhoneNumberIn batchFirstLastNamePhoneNumberIn = null;
        BatchFirstLastNamePhoneCodedOut response = api.phoneCodeBatch(batchFirstLastNamePhoneNumberIn);

        // TODO: test validations
    }
    
    /**
     * [USES 11 UNITS PER NAME] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneCodeGeoTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String phoneNumber = null;
        String countryIso2 = null;
        FirstLastNamePhoneCodedOut response = api.phoneCodeGeo(firstName, lastName, phoneNumber, countryIso2);

        // TODO: test validations
    }
    
    /**
     * [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, with a local context (ISO2 country of residence).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneCodeGeoBatchTest() throws ApiException {
        BatchFirstLastNamePhoneNumberGeoIn batchFirstLastNamePhoneNumberGeoIn = null;
        BatchFirstLastNamePhoneCodedOut response = api.phoneCodeGeoBatch(batchFirstLastNamePhoneNumberGeoIn);

        // TODO: test validations
    }
    
    /**
     * [CREDITS 1 UNIT] Feedback loop to better infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void phoneCodeGeoFeedbackLoopTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String phoneNumber = null;
        String phoneNumberE164 = null;
        String countryIso2 = null;
        FirstLastNamePhoneCodedOut response = api.phoneCodeGeoFeedbackLoop(firstName, lastName, phoneNumber, phoneNumberE164, countryIso2);

        // TODO: test validations
    }
    
}
