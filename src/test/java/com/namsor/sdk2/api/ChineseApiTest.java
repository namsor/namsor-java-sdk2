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
import com.namsor.sdk2.model.BatchFirstLastNameGenderedOut;
import com.namsor.sdk2.model.BatchFirstLastNameIn;
import com.namsor.sdk2.model.BatchNameMatchCandidatesOut;
import com.namsor.sdk2.model.BatchPersonalNameGenderedOut;
import com.namsor.sdk2.model.BatchPersonalNameIn;
import com.namsor.sdk2.model.BatchPersonalNameParsedOut;
import com.namsor.sdk2.model.FirstLastNameGenderedOut;
import com.namsor.sdk2.model.PersonalNameGenderedOut;
import com.namsor.sdk2.model.PersonalNameParsedOut;
import com.namsor.sdk2.model.RomanizedNameOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChineseApi
 */
@Ignore
public class ChineseApiTest {

    private final ChineseApi api = new ChineseApi();

    
    /**
     * Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameCandidatesTest() throws ApiException {
        String chineseSurnameLatin = null;
        String chineseGivenNameLatin = null;
        RomanizedNameOut response = api.chineseNameCandidates(chineseSurnameLatin, chineseGivenNameLatin);

        // TODO: test validations
    }
    
    /**
     * Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameCandidatesBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.chineseNameCandidatesBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname) ex. Wang Xiaoming.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameCandidatesGenderBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.chineseNameCandidatesGenderBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming - having a known gender (&#39;male&#39; or &#39;female&#39;)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameGenderCandidatesTest() throws ApiException {
        String chineseSurnameLatin = null;
        String chineseGivenNameLatin = null;
        String knownGender = null;
        RomanizedNameOut response = api.chineseNameGenderCandidates(chineseSurnameLatin, chineseGivenNameLatin, knownGender);

        // TODO: test validations
    }
    
    /**
     * Return a score for matching Chinese name ex. 王晓明 with a romanized name ex. Wang Xiaoming
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameMatchTest() throws ApiException {
        String chineseSurnameLatin = null;
        String chineseGivenNameLatin = null;
        String chineseName = null;
        RomanizedNameOut response = api.chineseNameMatch(chineseSurnameLatin, chineseGivenNameLatin, chineseName);

        // TODO: test validations
    }
    
    /**
     * Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chineseNameMatchBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.chineseNameMatchBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a Chinese full name ex. 王晓明
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderChineseNameTest() throws ApiException {
        String chineseName = null;
        PersonalNameGenderedOut response = api.genderChineseName(chineseName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 full names ex. 王晓明
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderChineseNameBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameGenderedOut response = api.genderChineseNameBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a Chinese name in LATIN (Pinyin).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderChineseNamePinyinTest() throws ApiException {
        String chineseSurnameLatin = null;
        String chineseGivenNameLatin = null;
        FirstLastNameGenderedOut response = api.genderChineseNamePinyin(chineseSurnameLatin, chineseGivenNameLatin);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 Chinese names in LATIN (Pinyin).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderChineseNamePinyinBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchFirstLastNameGenderedOut response = api.genderChineseNamePinyinBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseChineseNameTest() throws ApiException {
        String chineseName = null;
        PersonalNameParsedOut response = api.parseChineseName(chineseName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseChineseNameBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameParsedOut response = api.parseChineseNameBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * Romanize the Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pinyinChineseNameTest() throws ApiException {
        String chineseName = null;
        PersonalNameParsedOut response = api.pinyinChineseName(chineseName);

        // TODO: test validations
    }
    
    /**
     * Romanize a list of Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pinyinChineseNameBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameParsedOut response = api.pinyinChineseNameBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
}
