/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.13
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.namsor.sdk2.api;

import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.model.BatchCorridorIn;
import com.namsor.sdk2.model.BatchCorridorOut;
import com.namsor.sdk2.model.BatchFirstLastNameDiasporaedOut;
import com.namsor.sdk2.model.BatchFirstLastNameGenderedOut;
import com.namsor.sdk2.model.BatchFirstLastNameGeoIn;
import com.namsor.sdk2.model.BatchFirstLastNameGeoZippedIn;
import com.namsor.sdk2.model.BatchFirstLastNameIn;
import com.namsor.sdk2.model.BatchFirstLastNameOriginedOut;
import com.namsor.sdk2.model.BatchFirstLastNameUSRaceEthnicityOut;
import com.namsor.sdk2.model.BatchParsedFullNameGeoIn;
import com.namsor.sdk2.model.BatchParsedFullNameIn;
import com.namsor.sdk2.model.BatchPersonalNameGenderedOut;
import com.namsor.sdk2.model.BatchPersonalNameGeoIn;
import com.namsor.sdk2.model.BatchPersonalNameGeoOut;
import com.namsor.sdk2.model.BatchPersonalNameIn;
import com.namsor.sdk2.model.BatchPersonalNameParsedOut;
import com.namsor.sdk2.model.CorridorOut;
import com.namsor.sdk2.model.FirstLastNameDiasporaedOut;
import com.namsor.sdk2.model.FirstLastNameGenderedOut;
import com.namsor.sdk2.model.FirstLastNameOriginedOut;
import com.namsor.sdk2.model.FirstLastNameUSRaceEthnicityOut;
import com.namsor.sdk2.model.PersonalNameGenderedOut;
import com.namsor.sdk2.model.PersonalNameGeoOut;
import com.namsor.sdk2.model.PersonalNameParsedOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonalApi
 */
@Ignore
public class PersonalApiTest {

    private final PersonalApi api = new PersonalApi();

    
    /**
     * [USES 20 UNITS PER NAME COUPLE] Infer several classifications for a cross border interaction between names (ex. remit, travel, intl com)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void corridorTest() throws ApiException {
        String countryIso2From = null;
        String firstNameFrom = null;
        String lastNameFrom = null;
        String countryIso2To = null;
        String firstNameTo = null;
        String lastNameTo = null;
        CorridorOut response = api.corridor(countryIso2From, firstNameFrom, lastNameFrom, countryIso2To, firstNameTo, lastNameTo);

        // TODO: test validations
    }
    
    /**
     * [USES 20 UNITS PER NAME PAIR] Infer several classifications for up to 100 cross border interaction between names (ex. remit, travel, intl com)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void corridorBatchTest() throws ApiException {
        BatchCorridorIn batchCorridorIn = null;
        BatchCorridorOut response = api.corridorBatch(batchCorridorIn);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countryTest() throws ApiException {
        String personalNameFull = null;
        PersonalNameGeoOut response = api.country(personalNameFull);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer the likely country of residence of up to 100 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countryBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameGeoOut response = api.countryBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void diasporaTest() throws ApiException {
        String countryIso2 = null;
        String firstName = null;
        String lastName = null;
        FirstLastNameDiasporaedOut response = api.diaspora(countryIso2, firstName, lastName);

        // TODO: test validations
    }
    
    /**
     * [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of up to 100 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void diasporaBatchTest() throws ApiException {
        BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = null;
        BatchFirstLastNameDiasporaedOut response = api.diasporaBatch(batchFirstLastNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        FirstLastNameGenderedOut response = api.gender(firstName, lastName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 names, detecting automatically the cultural context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchFirstLastNameGenderedOut response = api.genderBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a full name, ex. John H. Smith
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderFullTest() throws ApiException {
        String fullName = null;
        PersonalNameGenderedOut response = api.genderFull(fullName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 full names, detecting automatically the cultural context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderFullBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameGenderedOut response = api.genderFullBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a full name, given a local context (ISO2 country code).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderFullGeoTest() throws ApiException {
        String fullName = null;
        String countryIso2 = null;
        PersonalNameGenderedOut response = api.genderFullGeo(fullName, countryIso2);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 full names, with a given cultural context (country ISO2 code).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderFullGeoBatchTest() throws ApiException {
        BatchPersonalNameGeoIn batchPersonalNameGeoIn = null;
        BatchPersonalNameGenderedOut response = api.genderFullGeoBatch(batchPersonalNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a name, given a local context (ISO2 country code).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderGeoTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        String countryIso2 = null;
        FirstLastNameGenderedOut response = api.genderGeo(firstName, lastName, countryIso2);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 names, each given a local context (ISO2 country code).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderGeoBatchTest() throws ApiException {
        BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = null;
        BatchFirstLastNameGenderedOut response = api.genderGeoBatch(batchFirstLastNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void originTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        FirstLastNameOriginedOut response = api.origin(firstName, lastName);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer the likely country of origin of up to 100 names, detecting automatically the cultural context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void originBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchFirstLastNameOriginedOut response = api.originBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseNameTest() throws ApiException {
        String nameFull = null;
        PersonalNameParsedOut response = api.parseName(nameFull);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseNameBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameParsedOut response = api.parseNameBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. For better accuracy, provide a geographic context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseNameGeoTest() throws ApiException {
        String nameFull = null;
        String countryIso2 = null;
        PersonalNameParsedOut response = api.parseNameGeo(nameFull, countryIso2);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. Giving a local context improves precision. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseNameGeoBatchTest() throws ApiException {
        BatchPersonalNameGeoIn batchPersonalNameGeoIn = null;
        BatchPersonalNameParsedOut response = api.parseNameGeoBatch(batchPersonalNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 fully parsed names, detecting automatically the cultural context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parsedGenderBatchTest() throws ApiException {
        BatchParsedFullNameIn batchParsedFullNameIn = null;
        BatchFirstLastNameGenderedOut response = api.parsedGenderBatch(batchParsedFullNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 fully parsed names, detecting automatically the cultural context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parsedGenderGeoBatchTest() throws ApiException {
        BatchParsedFullNameGeoIn batchParsedFullNameGeoIn = null;
        BatchFirstLastNameGenderedOut response = api.parsedGenderGeoBatch(batchParsedFullNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usRaceEthnicityTest() throws ApiException {
        String firstName = null;
        String lastName = null;
        FirstLastNameUSRaceEthnicityOut response = api.usRaceEthnicity(firstName, lastName);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usRaceEthnicityBatchTest() throws ApiException {
        BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = null;
        BatchFirstLastNameUSRaceEthnicityOut response = api.usRaceEthnicityBatch(batchFirstLastNameGeoIn);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usRaceEthnicityZIP5Test() throws ApiException {
        String firstName = null;
        String lastName = null;
        String zip5Code = null;
        FirstLastNameUSRaceEthnicityOut response = api.usRaceEthnicityZIP5(firstName, lastName, zip5Code);

        // TODO: test validations
    }
    
    /**
     * [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usZipRaceEthnicityBatchTest() throws ApiException {
        BatchFirstLastNameGeoZippedIn batchFirstLastNameGeoZippedIn = null;
        BatchFirstLastNameUSRaceEthnicityOut response = api.usZipRaceEthnicityBatch(batchFirstLastNameGeoZippedIn);

        // TODO: test validations
    }
    
}
