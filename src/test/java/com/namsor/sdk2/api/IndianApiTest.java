/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * The version of the OpenAPI document: 2.0.29
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.namsor.sdk2.api;

import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.model.BatchFirstLastNameCasteOut;
import com.namsor.sdk2.model.BatchFirstLastNameCastegroupOut;
import com.namsor.sdk2.model.BatchFirstLastNameGeoIn;
import com.namsor.sdk2.model.BatchFirstLastNameGeoSubclassificationOut;
import com.namsor.sdk2.model.BatchFirstLastNameGeoSubdivisionIn;
import com.namsor.sdk2.model.BatchFirstLastNameReligionedOut;
import com.namsor.sdk2.model.BatchFirstLastNameSubdivisionIn;
import com.namsor.sdk2.model.BatchPersonalNameCastegroupOut;
import com.namsor.sdk2.model.BatchPersonalNameGeoIn;
import com.namsor.sdk2.model.BatchPersonalNameGeoSubclassificationOut;
import com.namsor.sdk2.model.BatchPersonalNameReligionedOut;
import com.namsor.sdk2.model.BatchPersonalNameSubdivisionIn;
import com.namsor.sdk2.model.FirstLastNameCasteOut;
import com.namsor.sdk2.model.FirstLastNameCastegroupOut;
import com.namsor.sdk2.model.FirstLastNameGeoSubclassificationOut;
import com.namsor.sdk2.model.FirstLastNameReligionedOut;
import com.namsor.sdk2.model.PersonalNameCastegroupOut;
import com.namsor.sdk2.model.PersonalNameGeoSubclassificationOut;
import com.namsor.sdk2.model.PersonalNameReligionedOut;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IndianApi
 */
@Disabled
public class IndianApiTest {

    private final IndianApi api = new IndianApi();

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name caste of up to 100 personal Indian Hindu names. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void casteIndianBatchTest() throws ApiException {
        BatchFirstLastNameGeoSubdivisionIn batchFirstLastNameGeoSubdivisionIn = null;
        BatchFirstLastNameCasteOut response = api.casteIndianBatch(batchFirstLastNameGeoSubdivisionIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a first / last name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void castegroupIndianTest() throws ApiException {
        String subDivisionIso31662 = null;
        String firstName = null;
        String lastName = null;
        FirstLastNameCastegroupOut response = api.castegroupIndian(subDivisionIso31662, firstName, lastName);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal first / last names. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void castegroupIndianBatchTest() throws ApiException {
        BatchFirstLastNameSubdivisionIn batchFirstLastNameSubdivisionIn = null;
        BatchFirstLastNameCastegroupOut response = api.castegroupIndianBatch(batchFirstLastNameSubdivisionIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a personal full name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void castegroupIndianFullTest() throws ApiException {
        String subDivisionIso31662 = null;
        String personalNameFull = null;
        PersonalNameCastegroupOut response = api.castegroupIndianFull(subDivisionIso31662, personalNameFull);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal full names. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void castegroupIndianFullBatchTest() throws ApiException {
        BatchPersonalNameSubdivisionIn batchPersonalNameSubdivisionIn = null;
        BatchPersonalNameCastegroupOut response = api.castegroupIndianFullBatch(batchPersonalNameSubdivisionIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian name caste of a personal Hindu name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void castegroupIndianHinduTest() throws ApiException {
        String subDivisionIso31662 = null;
        String firstName = null;
        String lastName = null;
        FirstLastNameCasteOut response = api.castegroupIndianHindu(subDivisionIso31662, firstName, lastName);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian full name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void religionTest() throws ApiException {
        String subDivisionIso31662 = null;
        String personalNameFull = null;
        PersonalNameReligionedOut response = api.religion(subDivisionIso31662, personalNameFull);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian first/last name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void religion1Test() throws ApiException {
        String subDivisionIso31662 = null;
        String firstName = null;
        String lastName = null;
        FirstLastNameReligionedOut response = api.religion1(subDivisionIso31662, firstName, lastName);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal first/last Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void religionIndianBatchTest() throws ApiException {
        BatchFirstLastNameSubdivisionIn batchFirstLastNameSubdivisionIn = null;
        BatchFirstLastNameReligionedOut response = api.religionIndianBatch(batchFirstLastNameSubdivisionIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal full Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void religionIndianFullBatchTest() throws ApiException {
        BatchPersonalNameSubdivisionIn batchPersonalNameSubdivisionIn = null;
        BatchPersonalNameReligionedOut response = api.religionIndianFullBatch(batchPersonalNameSubdivisionIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subclassificationIndianTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        FirstLastNameGeoSubclassificationOut response = api.subclassificationIndian(firstName, lastName);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subclassificationIndianBatchTest() throws ApiException {
        BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = null;
        BatchFirstLastNameGeoSubclassificationOut response = api.subclassificationIndianBatch(batchFirstLastNameGeoIn);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subclassificationIndianFullTest() throws ApiException {
        String fullName = null;
        PersonalNameGeoSubclassificationOut response = api.subclassificationIndianFull(fullName);
        // TODO: test validations
    }

    /**
     * [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subclassificationIndianFullBatchTest() throws ApiException {
        BatchPersonalNameGeoIn batchPersonalNameGeoIn = null;
        BatchPersonalNameGeoSubclassificationOut response = api.subclassificationIndianFullBatch(batchPersonalNameGeoIn);
        // TODO: test validations
    }

}
