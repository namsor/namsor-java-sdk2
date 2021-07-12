/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.14
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
 * API tests for JapaneseApi
 */
@Ignore
public class JapaneseApiTest {

    private final JapaneseApi api = new JapaneseApi();

    
    /**
     * Infer the likely gender of a Japanese full name ex. 王晓明
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderJapaneseNameFullTest() throws ApiException {
        String japaneseName = null;
        PersonalNameGenderedOut response = api.genderJapaneseNameFull(japaneseName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 full names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderJapaneseNameFullBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameGenderedOut response = api.genderJapaneseNameFullBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of a Japanese name in LATIN (Pinyin).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderJapaneseNamePinyinTest() throws ApiException {
        String japaneseSurname = null;
        String japaneseGivenName = null;
        FirstLastNameGenderedOut response = api.genderJapaneseNamePinyin(japaneseSurname, japaneseGivenName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely gender of up to 100 Japanese names in LATIN (Pinyin).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void genderJapaneseNamePinyinBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchFirstLastNameGenderedOut response = api.genderJapaneseNamePinyinBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Identify japanese name candidates in KANJI, based on the romanized name (firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname) with KNOWN gender, ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameGenderKanjiCandidatesBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.japaneseNameGenderKanjiCandidatesBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Identify japanese name candidates in KANJI, based on the romanized name ex. Yamamoto Sanae - and a known gender.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameKanjiCandidatesTest() throws ApiException {
        String japaneseSurnameLatin = null;
        String japaneseGivenNameLatin = null;
        String knownGender = null;
        RomanizedNameOut response = api.japaneseNameKanjiCandidates(japaneseSurnameLatin, japaneseGivenNameLatin, knownGender);

        // TODO: test validations
    }
    
    /**
     * Identify japanese name candidates in KANJI, based on the romanized name ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameKanjiCandidates1Test() throws ApiException {
        String japaneseSurnameLatin = null;
        String japaneseGivenNameLatin = null;
        RomanizedNameOut response = api.japaneseNameKanjiCandidates1(japaneseSurnameLatin, japaneseGivenNameLatin);

        // TODO: test validations
    }
    
    /**
     * Identify japanese name candidates in KANJI, based on the romanized name (firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname), ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameKanjiCandidatesBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.japaneseNameKanjiCandidatesBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Romanize japanese name, based on the name in Kanji.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameLatinCandidatesTest() throws ApiException {
        String japaneseSurnameKanji = null;
        String japaneseGivenNameKanji = null;
        RomanizedNameOut response = api.japaneseNameLatinCandidates(japaneseSurnameKanji, japaneseGivenNameKanji);

        // TODO: test validations
    }
    
    /**
     * Romanize japanese names, based on the name in KANJI
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameLatinCandidatesBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.japaneseNameLatinCandidatesBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * Return a score for matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameMatchTest() throws ApiException {
        String japaneseSurnameLatin = null;
        String japaneseGivenNameLatin = null;
        String japaneseName = null;
        RomanizedNameOut response = api.japaneseNameMatch(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName);

        // TODO: test validations
    }
    
    /**
     * Return a score for matching a list of Japanese names in KANJI ex. 山本 早苗 with romanized names ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameMatchBatchTest() throws ApiException {
        BatchFirstLastNameIn batchFirstLastNameIn = null;
        BatchNameMatchCandidatesOut response = api.japaneseNameMatchBatch(batchFirstLastNameIn);

        // TODO: test validations
    }
    
    /**
     * [CREDITS 1 UNIT] Feedback loop to better perform matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void japaneseNameMatchFeedbackLoopTest() throws ApiException {
        String japaneseSurnameLatin = null;
        String japaneseGivenNameLatin = null;
        String japaneseName = null;
        RomanizedNameOut response = api.japaneseNameMatchFeedbackLoop(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseJapaneseNameTest() throws ApiException {
        String japaneseName = null;
        PersonalNameParsedOut response = api.parseJapaneseName(japaneseName);

        // TODO: test validations
    }
    
    /**
     * Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void parseJapaneseNameBatchTest() throws ApiException {
        BatchPersonalNameIn batchPersonalNameIn = null;
        BatchPersonalNameParsedOut response = api.parseJapaneseNameBatch(batchPersonalNameIn);

        // TODO: test validations
    }
    
}
