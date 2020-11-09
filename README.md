# namsor-sdk2 classifies personal names accurately by gender, country of origin, or ethnicity.

NamSor API v2
- API version: 2.0.11
  - Build date: 2020-11-01T10:54:33.640+01:00[Europe/Berlin]

NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 

Refer to the [NamSor API Doc](https://v2.namsor.com/NamSorAPIv2/apidoc.html) for detailed API documentation.

Also, have a look at the Wiki [NamSor Wiki Doc](https://github.com/namsor/namsor-tools-v2/wiki/NamSor-Tools-V2) for release notes and taxonomies. 

For more information, please visit [http://www.namsor.com/](http://www.namsor.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*11


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.namsor</groupId>
  <artifactId>namsor-sdk2</artifactId>
  <version>2.0.11</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.namsor:namsor-sdk2:2.0.11"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/namsor-sdk2-2.0.11.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package com.namsor.namsorsample;

import com.namsor.sdk2.invoke.*;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.model.*;
import com.namsor.sdk2.api.PersonalApi;

import java.io.File;
import java.util.*;

public class PersonalApiSample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PersonalApi apiInstance = new PersonalApi();
        
        // should contain 10 to 100 names at a time, per API call
        BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal names
        batchFirstLastNameIn.setPersonalNames(new ArrayList());
        FirstLastNameIn name1 = new FirstLastNameIn();
        name1.setId("123");
        name1.setFirstName("Mary");
        name1.setLastName("O'Neil");
        batchFirstLastNameIn.getPersonalNames().add(name1);
        FirstLastNameIn name2 = new FirstLastNameIn();
        name2.setId("234");
        name2.setFirstName("Roberto");
        name2.setLastName("Rossini");
        batchFirstLastNameIn.getPersonalNames().add(name2);
        try {
            BatchFirstLastNameOriginedOut result = apiInstance.originBatch(batchFirstLastNameIn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonalApi#originBatch");
            e.printStackTrace();
        }
    }
}


```
This will output the following : 
```javascript
class BatchFirstLastNameOriginedOut {
    personalNames: [class FirstLastNameOriginedOut {
        id: 123
        firstName: Mary
        lastName: O'Neil
        countryOrigin: IE
        countryOriginAlt: GB
        countriesOriginTop: [IE, GB, KE, GH, LR, FR, TZ, NG, IL, EG]
        score: 26.729154354675913
        regionOrigin: Europe
        topRegionOrigin: Europe
        subRegionOrigin: Northern Europe
        probabilityCalibrated: 0.9303604468868103
        probabilityAltCalibrated: 0.9930598411485871
    }, class FirstLastNameOriginedOut {
        id: 123
        firstName: Roberto
        lastName: Rossini
        countryOrigin: IT
        countryOriginAlt: ES
        countriesOriginTop: [IT, ES, CH, ID, PT, ZA, IL, AT, FI, FR]
        score: 36.490714227516584
        regionOrigin: Europe
        topRegionOrigin: Europe
        subRegionOrigin: Southern Europe
        probabilityCalibrated: 0.9824811693994274
        probabilityAltCalibrated: 0.9930598411485871
    }]
}
```

## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Documentation for API Endpoints

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PersonalApi* | [**gender**](docs/PersonalApi.md#gender) | **GET** /api2/json/gender/{firstName}/{lastName} | Infer the likely gender of a name.
*PersonalApi* | [**genderBatch**](docs/PersonalApi.md#genderBatch) | **POST** /api2/json/genderBatch | Infer the likely gender of up to 100 names, detecting automatically the cultural context.
*PersonalApi* | [**genderFull**](docs/PersonalApi.md#genderFull) | **GET** /api2/json/genderFull/{fullName} | Infer the likely gender of a full name, ex. John H. Smith
*PersonalApi* | [**genderFullBatch**](docs/PersonalApi.md#genderFullBatch) | **POST** /api2/json/genderFullBatch | Infer the likely gender of up to 100 full names, detecting automatically the cultural context.
*PersonalApi* | [**genderFullGeo**](docs/PersonalApi.md#genderFullGeo) | **GET** /api2/json/genderFullGeo/{fullName}/{countryIso2} | Infer the likely gender of a full name, given a local context (ISO2 country code).
*PersonalApi* | [**genderFullGeoBatch**](docs/PersonalApi.md#genderFullGeoBatch) | **POST** /api2/json/genderFullGeoBatch | Infer the likely gender of up to 100 full names, with a given cultural context (country ISO2 code).
*PersonalApi* | [**genderGeo**](docs/PersonalApi.md#genderGeo) | **GET** /api2/json/genderGeo/{firstName}/{lastName}/{countryIso2} | Infer the likely gender of a name, given a local context (ISO2 country code).
*PersonalApi* | [**genderGeoBatch**](docs/PersonalApi.md#genderGeoBatch) | **POST** /api2/json/genderGeoBatch | Infer the likely gender of up to 100 names, each given a local context (ISO2 country code).
*PersonalApi* | [**country**](docs/PersonalApi.md#country) | **GET** /api2/json/country/{personalNameFull} | [USES 10 UNITS PER NAME] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.
*PersonalApi* | [**countryBatch**](docs/PersonalApi.md#countryBatch) | **POST** /api2/json/countryBatch | [USES 10 UNITS PER NAME] Infer the likely country of residence of up to 100 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.
*PersonalApi* | [**origin**](docs/PersonalApi.md#origin) | **GET** /api2/json/origin/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.
*PersonalApi* | [**originBatch**](docs/PersonalApi.md#originBatch) | **POST** /api2/json/originBatch | [USES 10 UNITS PER NAME] Infer the likely country of origin of up to 100 names, detecting automatically the cultural context.
*PersonalApi* | [**diaspora**](docs/PersonalApi.md#diaspora) | **GET** /api2/json/diaspora/{countryIso2}/{firstName}/{lastName} | [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
*PersonalApi* | [**diasporaBatch**](docs/PersonalApi.md#diasporaBatch) | **POST** /api2/json/diasporaBatch | [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of up to 100 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
*PersonalApi* | [**usRaceEthnicity**](docs/PersonalApi.md#usRaceEthnicity) | **GET** /api2/json/usRaceEthnicity/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino).
*PersonalApi* | [**usRaceEthnicityBatch**](docs/PersonalApi.md#usRaceEthnicityBatch) | **POST** /api2/json/usRaceEthnicityBatch | [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy.
*PersonalApi* | [**usRaceEthnicityZIP5**](docs/PersonalApi.md#usRaceEthnicityZIP5) | **GET** /api2/json/usRaceEthnicityZIP5/{firstName}/{lastName}/{zip5Code} | [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino).
*PersonalApi* | [**usZipRaceEthnicityBatch**](docs/PersonalApi.md#usZipRaceEthnicityBatch) | **POST** /api2/json/usZipRaceEthnicityBatch | [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code.
*PersonalApi* | [**parseName**](docs/PersonalApi.md#parseName) | **GET** /api2/json/parseName/{nameFull} | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. 
*PersonalApi* | [**parseNameBatch**](docs/PersonalApi.md#parseNameBatch) | **POST** /api2/json/parseNameBatch | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John.
*PersonalApi* | [**parseNameGeo**](docs/PersonalApi.md#parseNameGeo) | **GET** /api2/json/parseName/{nameFull}/{countryIso2} | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. For better accuracy, provide a geographic context.
*PersonalApi* | [**parseNameGeoBatch**](docs/PersonalApi.md#parseNameGeoBatch) | **POST** /api2/json/parseNameGeoBatch | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. Giving a local context improves precision. 
*PersonalApi* | [**parsedGenderBatch**](docs/PersonalApi.md#parsedGenderBatch) | **POST** /api2/json/parsedGenderBatch | Infer the likely gender of up to 100 fully parsed names, detecting automatically the cultural context.
*PersonalApi* | [**parsedGenderGeoBatch**](docs/PersonalApi.md#parsedGenderGeoBatch) | **POST** /api2/json/parsedGenderGeoBatch | Infer the likely gender of up to 100 fully parsed names, detecting automatically the cultural context.
*AdminApi* | [**apiStatus**](docs/AdminApi.md#apiStatus) | **GET** /api2/json/apiStatus | Prints the current status of the classifiers.
*AdminApi* | [**apiUsage**](docs/AdminApi.md#apiUsage) | **GET** /api2/json/apiUsage | Print current API usage.
*AdminApi* | [**apiUsageHistory**](docs/AdminApi.md#apiUsageHistory) | **GET** /api2/json/apiUsageHistory | Print historical API usage.
*AdminApi* | [**apiUsageHistoryAggregate**](docs/AdminApi.md#apiUsageHistoryAggregate) | **GET** /api2/json/apiUsageHistoryAggregate | Print historical API usage (in an aggregated view, by service, by day/hour/min).
*AdminApi* | [**softwareVersion**](docs/AdminApi.md#softwareVersion) | **GET** /api2/json/softwareVersion | Get the current software version
*ChineseApi* | [**chineseNameCandidates**](docs/ChineseApi.md#chineseNameCandidates) | **GET** /api2/json/chineseNameCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin} | Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming
*ChineseApi* | [**chineseNameCandidatesBatch**](docs/ChineseApi.md#chineseNameCandidatesBatch) | **POST** /api2/json/chineseNameCandidatesBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
*ChineseApi* | [**chineseNameCandidatesGenderBatch**](docs/ChineseApi.md#chineseNameCandidatesGenderBatch) | **POST** /api2/json/chineseNameCandidatesGenderBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname) ex. Wang Xiaoming.
*ChineseApi* | [**chineseNameGenderCandidates**](docs/ChineseApi.md#chineseNameGenderCandidates) | **GET** /api2/json/chineseNameGenderCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin}/{knownGender} | Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming - having a known gender (&#39;male&#39; or &#39;female&#39;)
*ChineseApi* | [**chineseNameMatch**](docs/ChineseApi.md#chineseNameMatch) | **GET** /api2/json/chineseNameMatch/{chineseSurnameLatin}/{chineseGivenNameLatin}/{chineseName} | Return a score for matching Chinese name ex. 王晓明 with a romanized name ex. Wang Xiaoming
*ChineseApi* | [**chineseNameMatchBatch**](docs/ChineseApi.md#chineseNameMatchBatch) | **POST** /api2/json/chineseNameMatchBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
*ChineseApi* | [**genderChineseName**](docs/ChineseApi.md#genderChineseName) | **GET** /api2/json/genderChineseName/{chineseName} | Infer the likely gender of a Chinese full name ex. 王晓明
*ChineseApi* | [**genderChineseNameBatch**](docs/ChineseApi.md#genderChineseNameBatch) | **POST** /api2/json/genderChineseNameBatch | Infer the likely gender of up to 100 full names ex. 王晓明
*ChineseApi* | [**genderChineseNamePinyin**](docs/ChineseApi.md#genderChineseNamePinyin) | **GET** /api2/json/genderChineseNamePinyin/{chineseSurnameLatin}/{chineseGivenNameLatin} | Infer the likely gender of a Chinese name in LATIN (Pinyin).
*ChineseApi* | [**genderChineseNamePinyinBatch**](docs/ChineseApi.md#genderChineseNamePinyinBatch) | **POST** /api2/json/genderChineseNamePinyinBatch | Infer the likely gender of up to 100 Chinese names in LATIN (Pinyin).
*ChineseApi* | [**parseChineseName**](docs/ChineseApi.md#parseChineseName) | **GET** /api2/json/parseChineseName/{chineseName} | Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name)
*ChineseApi* | [**parseChineseNameBatch**](docs/ChineseApi.md#parseChineseNameBatch) | **POST** /api2/json/parseChineseNameBatch | Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name).
*ChineseApi* | [**pinyinChineseName**](docs/ChineseApi.md#pinyinChineseName) | **GET** /api2/json/pinyinChineseName/{chineseName} | Romanize the Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name)
*ChineseApi* | [**pinyinChineseNameBatch**](docs/ChineseApi.md#pinyinChineseNameBatch) | **POST** /api2/json/pinyinChineseNameBatch | Romanize a list of Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name).
*GeneralApi* | [**nameType**](docs/GeneralApi.md#nameType) | **GET** /api2/json/nameType/{properNoun} | Infer the likely type of a proper noun (personal name, brand name, place name etc.)
*GeneralApi* | [**nameType1**](docs/GeneralApi.md#nameType1) | **GET** /api2/json/nameType/{properNoun}/{countryIso2} | Infer the likely type of a proper noun (personal name, brand name, place name etc.)
*JapaneseApi* | [**genderJapaneseNameFull**](docs/JapaneseApi.md#genderJapaneseNameFull) | **GET** /api2/json/genderJapaneseNameFull/{japaneseName} | Infer the likely gender of a Japanese full name ex. 王晓明
*JapaneseApi* | [**genderJapaneseNameFullBatch**](docs/JapaneseApi.md#genderJapaneseNameFullBatch) | **POST** /api2/json/genderJapaneseNameFullBatch | Infer the likely gender of up to 100 full names
*JapaneseApi* | [**genderJapaneseNamePinyin**](docs/JapaneseApi.md#genderJapaneseNamePinyin) | **GET** /api2/json/genderJapaneseName/{japaneseSurname}/{japaneseGivenName} | Infer the likely gender of a Japanese name in LATIN (Pinyin).
*JapaneseApi* | [**genderJapaneseNamePinyinBatch**](docs/JapaneseApi.md#genderJapaneseNamePinyinBatch) | **POST** /api2/json/genderJapaneseNameBatch | Infer the likely gender of up to 100 Japanese names in LATIN (Pinyin).
*JapaneseApi* | [**japaneseNameKanjiCandidates**](docs/JapaneseApi.md#japaneseNameKanjiCandidates) | **GET** /api2/json/japaneseNameKanjiCandidates/{japaneseSurnameLatin}/{japaneseGivenNameLatin} | Identify japanese name candidates in KANJI, based on the romanized name ex. Yamamoto Sanae
*JapaneseApi* | [**japaneseNameKanjiCandidatesBatch**](docs/JapaneseApi.md#japaneseNameKanjiCandidatesBatch) | **POST** /api2/json/japaneseNameKanjiCandidatesBatch | Identify japanese name candidates in KANJI, based on the romanized name (firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname), ex. Yamamoto Sanae
*JapaneseApi* | [**japaneseNameLatinCandidates**](docs/JapaneseApi.md#japaneseNameLatinCandidates) | **GET** /api2/json/japaneseNameLatinCandidates/{japaneseSurnameKanji}/{japaneseGivenNameKanji} | Romanize japanese name, based on the name in Kanji.
*JapaneseApi* | [**japaneseNameLatinCandidatesBatch**](docs/JapaneseApi.md#japaneseNameLatinCandidatesBatch) | **POST** /api2/json/japaneseNameLatinCandidatesBatch | Romanize japanese names, based on the name in KANJI
*JapaneseApi* | [**japaneseNameMatch**](docs/JapaneseApi.md#japaneseNameMatch) | **GET** /api2/json/japaneseNameMatch/{japaneseSurnameLatin}/{japaneseGivenNameLatin}/{japaneseName} | Return a score for matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
*JapaneseApi* | [**japaneseNameMatchBatch**](docs/JapaneseApi.md#japaneseNameMatchBatch) | **POST** /api2/json/japaneseNameMatchBatch | Return a score for matching a list of Japanese names in KANJI ex. 山本 早苗 with romanized names ex. Yamamoto Sanae
*JapaneseApi* | [**japaneseNameMatchFeedbackLoop**](docs/JapaneseApi.md#japaneseNameMatchFeedbackLoop) | **GET** /api2/json/japaneseNameMatchFeedbackLoop/{japaneseSurnameLatin}/{japaneseGivenNameLatin}/{japaneseName} | [CREDITS 1 UNIT] Feedback loop to better perform matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
*JapaneseApi* | [**parseJapaneseName**](docs/JapaneseApi.md#parseJapaneseName) | **GET** /api2/json/parseJapaneseName/{japaneseName} | Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae
*JapaneseApi* | [**parseJapaneseNameBatch**](docs/JapaneseApi.md#parseJapaneseNameBatch) | **POST** /api2/json/parseJapaneseNameBatch | Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae 
*SocialApi* | [**phoneCode**](docs/SocialApi.md#phoneCode) | **GET** /api2/json/phoneCode/{firstName}/{lastName}/{phoneNumber} | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.
*SocialApi* | [**phoneCodeBatch**](docs/SocialApi.md#phoneCodeBatch) | **POST** /api2/json/phoneCodeBatch | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.
*SocialApi* | [**phoneCodeGeo**](docs/SocialApi.md#phoneCodeGeo) | **GET** /api2/json/phoneCodeGeo/{firstName}/{lastName}/{phoneNumber}/{countryIso2} | [USES 11 UNITS PER NAME] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).
*SocialApi* | [**phoneCodeGeoBatch**](docs/SocialApi.md#phoneCodeGeoBatch) | **POST** /api2/json/phoneCodeGeoBatch | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, with a local context (ISO2 country of residence).
*SocialApi* | [**phoneCodeGeoFeedbackLoop**](docs/SocialApi.md#phoneCodeGeoFeedbackLoop) | **GET** /api2/json/phoneCodeGeoFeedbackLoop/{firstName}/{lastName}/{phoneNumber}/{phoneNumberE164}/{countryIso2} | [CREDITS 1 UNIT] Feedback loop to better infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).


## Documentation for Models

 - [APIBillingPeriodUsageOut](docs/APIBillingPeriodUsageOut.md)
 - [APIClassifierOut](docs/APIClassifierOut.md)
 - [APIClassifierTaxonomyOut](docs/APIClassifierTaxonomyOut.md)
 - [APIClassifiersStatusOut](docs/APIClassifiersStatusOut.md)
 - [APICounterV2Out](docs/APICounterV2Out.md)
 - [APIKeyOut](docs/APIKeyOut.md)
 - [APIPeriodUsageOut](docs/APIPeriodUsageOut.md)
 - [APIPlanOut](docs/APIPlanOut.md)
 - [APIPlanSubscriptionOut](docs/APIPlanSubscriptionOut.md)
 - [APIPlansOut](docs/APIPlansOut.md)
 - [APIServiceOut](docs/APIServiceOut.md)
 - [APIServicesOut](docs/APIServicesOut.md)
 - [APIUsageAggregatedOut](docs/APIUsageAggregatedOut.md)
 - [BatchFirstLastNameDiasporaedOut](docs/BatchFirstLastNameDiasporaedOut.md)
 - [BatchFirstLastNameGenderIn](docs/BatchFirstLastNameGenderIn.md)
 - [BatchFirstLastNameGenderedOut](docs/BatchFirstLastNameGenderedOut.md)
 - [BatchFirstLastNameGeoIn](docs/BatchFirstLastNameGeoIn.md)
 - [BatchFirstLastNameGeoZippedIn](docs/BatchFirstLastNameGeoZippedIn.md)
 - [BatchFirstLastNameIn](docs/BatchFirstLastNameIn.md)
 - [BatchFirstLastNameOriginedOut](docs/BatchFirstLastNameOriginedOut.md)
 - [BatchFirstLastNamePhoneCodedOut](docs/BatchFirstLastNamePhoneCodedOut.md)
 - [BatchFirstLastNamePhoneNumberGeoIn](docs/BatchFirstLastNamePhoneNumberGeoIn.md)
 - [BatchFirstLastNamePhoneNumberIn](docs/BatchFirstLastNamePhoneNumberIn.md)
 - [BatchFirstLastNameUSRaceEthnicityOut](docs/BatchFirstLastNameUSRaceEthnicityOut.md)
 - [BatchMatchPersonalFirstLastNameIn](docs/BatchMatchPersonalFirstLastNameIn.md)
 - [BatchNameMatchCandidatesOut](docs/BatchNameMatchCandidatesOut.md)
 - [BatchNameMatchedOut](docs/BatchNameMatchedOut.md)
 - [BatchParsedFullNameGeoIn](docs/BatchParsedFullNameGeoIn.md)
 - [BatchParsedFullNameIn](docs/BatchParsedFullNameIn.md)
 - [BatchPersonalNameGenderedOut](docs/BatchPersonalNameGenderedOut.md)
 - [BatchPersonalNameGeoIn](docs/BatchPersonalNameGeoIn.md)
 - [BatchPersonalNameGeoOut](docs/BatchPersonalNameGeoOut.md)
 - [BatchPersonalNameIn](docs/BatchPersonalNameIn.md)
 - [BatchPersonalNameParsedOut](docs/BatchPersonalNameParsedOut.md)
 - [BillingHistoryOut](docs/BillingHistoryOut.md)
 - [BillingInfoInOut](docs/BillingInfoInOut.md)
 - [CacheMetricsOut](docs/CacheMetricsOut.md)
 - [ClassifierMetricsOut](docs/ClassifierMetricsOut.md)
 - [CurrenciesOut](docs/CurrenciesOut.md)
 - [DeployUIOut](docs/DeployUIOut.md)
 - [ExpectedClassMetricsOut](docs/ExpectedClassMetricsOut.md)
 - [FeedbackLoopOut](docs/FeedbackLoopOut.md)
 - [FirstLastNameDiasporaedOut](docs/FirstLastNameDiasporaedOut.md)
 - [FirstLastNameGenderIn](docs/FirstLastNameGenderIn.md)
 - [FirstLastNameGenderedOut](docs/FirstLastNameGenderedOut.md)
 - [FirstLastNameGeoIn](docs/FirstLastNameGeoIn.md)
 - [FirstLastNameGeoZippedIn](docs/FirstLastNameGeoZippedIn.md)
 - [FirstLastNameIn](docs/FirstLastNameIn.md)
 - [FirstLastNameOriginedOut](docs/FirstLastNameOriginedOut.md)
 - [FirstLastNameOut](docs/FirstLastNameOut.md)
 - [FirstLastNamePhoneCodedOut](docs/FirstLastNamePhoneCodedOut.md)
 - [FirstLastNamePhoneNumberGeoIn](docs/FirstLastNamePhoneNumberGeoIn.md)
 - [FirstLastNamePhoneNumberIn](docs/FirstLastNamePhoneNumberIn.md)
 - [FirstLastNameUSRaceEthnicityOut](docs/FirstLastNameUSRaceEthnicityOut.md)
 - [InlineObject](docs/InlineObject.md)
 - [InvoiceItemOut](docs/InvoiceItemOut.md)
 - [InvoiceOut](docs/InvoiceOut.md)
 - [MatchPersonalFirstLastNameIn](docs/MatchPersonalFirstLastNameIn.md)
 - [NamSorCounterOut](docs/NamSorCounterOut.md)
 - [NameMatchCandidateOut](docs/NameMatchCandidateOut.md)
 - [NameMatchCandidatesOut](docs/NameMatchCandidatesOut.md)
 - [NameMatchedOut](docs/NameMatchedOut.md)
 - [ParsedFullNameGeoIn](docs/ParsedFullNameGeoIn.md)
 - [ParsedFullNameIn](docs/ParsedFullNameIn.md)
 - [PersonalNameGenderedOut](docs/PersonalNameGenderedOut.md)
 - [PersonalNameGeoIn](docs/PersonalNameGeoIn.md)
 - [PersonalNameGeoOut](docs/PersonalNameGeoOut.md)
 - [PersonalNameIn](docs/PersonalNameIn.md)
 - [PersonalNameParsedOut](docs/PersonalNameParsedOut.md)
 - [ProperNounCategorizedOut](docs/ProperNounCategorizedOut.md)
 - [RomanizedNameOut](docs/RomanizedNameOut.md)
 - [SoftwareVersionOut](docs/SoftwareVersionOut.md)
 - [SourceDetailedMetricsOut](docs/SourceDetailedMetricsOut.md)
 - [SourceMetricsOut](docs/SourceMetricsOut.md)
 - [StripeCardOut](docs/StripeCardOut.md)
 - [StripeCustomerOut](docs/StripeCustomerOut.md)
 - [SystemMetricsOut](docs/SystemMetricsOut.md)
 - [UserInfoOut](docs/UserInfoOut.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@namsor.com

