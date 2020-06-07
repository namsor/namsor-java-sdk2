# JapaneseApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderJapaneseNameFull**](JapaneseApi.md#genderJapaneseNameFull) | **GET** /api2/json/genderJapaneseNameFull/{japaneseName} | Infer the likely gender of a Japanese full name ex. 王晓明
[**genderJapaneseNameFullBatch**](JapaneseApi.md#genderJapaneseNameFullBatch) | **POST** /api2/json/genderJapaneseNameFullBatch | Infer the likely gender of up to 100 full names
[**genderJapaneseNamePinyin**](JapaneseApi.md#genderJapaneseNamePinyin) | **GET** /api2/json/genderJapaneseName/{japaneseSurname}/{japaneseGivenName} | Infer the likely gender of a Japanese name in LATIN (Pinyin).
[**genderJapaneseNamePinyinBatch**](JapaneseApi.md#genderJapaneseNamePinyinBatch) | **POST** /api2/json/genderJapaneseNameBatch | Infer the likely gender of up to 100 Japanese names in LATIN (Pinyin).
[**japaneseNameKanjiCandidates**](JapaneseApi.md#japaneseNameKanjiCandidates) | **GET** /api2/json/japaneseNameKanjiCandidates/{japaneseSurnameLatin}/{japaneseGivenNameLatin} | Identify japanese name candidates in KANJI, based on the romanized name ex. Yamamoto Sanae
[**japaneseNameKanjiCandidatesBatch**](JapaneseApi.md#japaneseNameKanjiCandidatesBatch) | **POST** /api2/json/japaneseNameKanjiCandidatesBatch | Identify japanese name candidates in KANJI, based on the romanized name (firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname), ex. Yamamoto Sanae
[**japaneseNameLatinCandidates**](JapaneseApi.md#japaneseNameLatinCandidates) | **GET** /api2/json/japaneseNameLatinCandidates/{japaneseSurnameKanji}/{japaneseGivenNameKanji} | Romanize japanese name, based on the name in Kanji.
[**japaneseNameLatinCandidatesBatch**](JapaneseApi.md#japaneseNameLatinCandidatesBatch) | **POST** /api2/json/japaneseNameLatinCandidatesBatch | Romanize japanese names, based on the name in KANJI
[**japaneseNameMatch**](JapaneseApi.md#japaneseNameMatch) | **GET** /api2/json/japaneseNameMatch/{japaneseSurnameLatin}/{japaneseGivenNameLatin}/{japaneseName} | Return a score for matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
[**japaneseNameMatchBatch**](JapaneseApi.md#japaneseNameMatchBatch) | **POST** /api2/json/japaneseNameMatchBatch | Return a score for matching a list of Japanese names in KANJI ex. 山本 早苗 with romanized names ex. Yamamoto Sanae
[**japaneseNameMatchFeedbackLoop**](JapaneseApi.md#japaneseNameMatchFeedbackLoop) | **GET** /api2/json/japaneseNameMatchFeedbackLoop/{japaneseSurnameLatin}/{japaneseGivenNameLatin}/{japaneseName} | [CREDITS 1 UNIT] Feedback loop to better perform matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae
[**parseJapaneseName**](JapaneseApi.md#parseJapaneseName) | **GET** /api2/json/parseJapaneseName/{japaneseName} | Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae
[**parseJapaneseNameBatch**](JapaneseApi.md#parseJapaneseNameBatch) | **POST** /api2/json/parseJapaneseNameBatch | Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae 


<a name="genderJapaneseNameFull"></a>
# **genderJapaneseNameFull**
> PersonalNameGenderedOut genderJapaneseNameFull(japaneseName)

Infer the likely gender of a Japanese full name ex. 王晓明

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseName = "japaneseName_example"; // String | 
try {
    PersonalNameGenderedOut result = apiInstance.genderJapaneseNameFull(japaneseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#genderJapaneseNameFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseName** | **String**|  |

### Return type

[**PersonalNameGenderedOut**](PersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderJapaneseNameFullBatch"></a>
# **genderJapaneseNameFullBatch**
> BatchPersonalNameGenderedOut genderJapaneseNameFullBatch(batchPersonalNameIn)

Infer the likely gender of up to 100 full names

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names
try {
    BatchPersonalNameGenderedOut result = apiInstance.genderJapaneseNameFullBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#genderJapaneseNameFullBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameIn** | [**BatchPersonalNameIn**](BatchPersonalNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameGenderedOut**](BatchPersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genderJapaneseNamePinyin"></a>
# **genderJapaneseNamePinyin**
> FirstLastNameGenderedOut genderJapaneseNamePinyin(japaneseSurname, japaneseGivenName)

Infer the likely gender of a Japanese name in LATIN (Pinyin).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseSurname = "japaneseSurname_example"; // String | 
String japaneseGivenName = "japaneseGivenName_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.genderJapaneseNamePinyin(japaneseSurname, japaneseGivenName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#genderJapaneseNamePinyin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseSurname** | **String**|  |
 **japaneseGivenName** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderJapaneseNamePinyinBatch"></a>
# **genderJapaneseNamePinyinBatch**
> BatchFirstLastNameGenderedOut genderJapaneseNamePinyinBatch(batchFirstLastNameIn)

Infer the likely gender of up to 100 Japanese names in LATIN (Pinyin).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of names, with country code.
try {
    BatchFirstLastNameGenderedOut result = apiInstance.genderJapaneseNamePinyinBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#genderJapaneseNamePinyinBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of names, with country code. | [optional]

### Return type

[**BatchFirstLastNameGenderedOut**](BatchFirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="japaneseNameKanjiCandidates"></a>
# **japaneseNameKanjiCandidates**
> RomanizedNameOut japaneseNameKanjiCandidates(japaneseSurnameLatin, japaneseGivenNameLatin)

Identify japanese name candidates in KANJI, based on the romanized name ex. Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseSurnameLatin = "japaneseSurnameLatin_example"; // String | 
String japaneseGivenNameLatin = "japaneseGivenNameLatin_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.japaneseNameKanjiCandidates(japaneseSurnameLatin, japaneseGivenNameLatin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameKanjiCandidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseSurnameLatin** | **String**|  |
 **japaneseGivenNameLatin** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="japaneseNameKanjiCandidatesBatch"></a>
# **japaneseNameKanjiCandidatesBatch**
> BatchNameMatchCandidatesOut japaneseNameKanjiCandidatesBatch(batchFirstLastNameIn)

Identify japanese name candidates in KANJI, based on the romanized name (firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname), ex. Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal japanese names in LATIN, firstName = japaneseGivenName; lastName=japaneseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.japaneseNameKanjiCandidatesBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameKanjiCandidatesBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal japanese names in LATIN, firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="japaneseNameLatinCandidates"></a>
# **japaneseNameLatinCandidates**
> RomanizedNameOut japaneseNameLatinCandidates(japaneseSurnameKanji, japaneseGivenNameKanji)

Romanize japanese name, based on the name in Kanji.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseSurnameKanji = "japaneseSurnameKanji_example"; // String | 
String japaneseGivenNameKanji = "japaneseGivenNameKanji_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.japaneseNameLatinCandidates(japaneseSurnameKanji, japaneseGivenNameKanji);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameLatinCandidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseSurnameKanji** | **String**|  |
 **japaneseGivenNameKanji** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="japaneseNameLatinCandidatesBatch"></a>
# **japaneseNameLatinCandidatesBatch**
> BatchNameMatchCandidatesOut japaneseNameLatinCandidatesBatch(batchFirstLastNameIn)

Romanize japanese names, based on the name in KANJI

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal japanese names in KANJI, firstName = japaneseGivenName; lastName=japaneseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.japaneseNameLatinCandidatesBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameLatinCandidatesBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal japanese names in KANJI, firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="japaneseNameMatch"></a>
# **japaneseNameMatch**
> RomanizedNameOut japaneseNameMatch(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName)

Return a score for matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseSurnameLatin = "japaneseSurnameLatin_example"; // String | 
String japaneseGivenNameLatin = "japaneseGivenNameLatin_example"; // String | 
String japaneseName = "japaneseName_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.japaneseNameMatch(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseSurnameLatin** | **String**|  |
 **japaneseGivenNameLatin** | **String**|  |
 **japaneseName** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="japaneseNameMatchBatch"></a>
# **japaneseNameMatchBatch**
> BatchNameMatchCandidatesOut japaneseNameMatchBatch(batchFirstLastNameIn)

Return a score for matching a list of Japanese names in KANJI ex. 山本 早苗 with romanized names ex. Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal Japanese names in LATIN, firstName = japaneseGivenName; lastName=japaneseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.japaneseNameMatchBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameMatchBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal Japanese names in LATIN, firstName &#x3D; japaneseGivenName; lastName&#x3D;japaneseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="japaneseNameMatchFeedbackLoop"></a>
# **japaneseNameMatchFeedbackLoop**
> RomanizedNameOut japaneseNameMatchFeedbackLoop(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName)

[CREDITS 1 UNIT] Feedback loop to better perform matching Japanese name in KANJI ex. 山本 早苗 with a romanized name ex. Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseSurnameLatin = "japaneseSurnameLatin_example"; // String | 
String japaneseGivenNameLatin = "japaneseGivenNameLatin_example"; // String | 
String japaneseName = "japaneseName_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.japaneseNameMatchFeedbackLoop(japaneseSurnameLatin, japaneseGivenNameLatin, japaneseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#japaneseNameMatchFeedbackLoop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseSurnameLatin** | **String**|  |
 **japaneseGivenNameLatin** | **String**|  |
 **japaneseName** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseJapaneseName"></a>
# **parseJapaneseName**
> PersonalNameParsedOut parseJapaneseName(japaneseName)

Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
String japaneseName = "japaneseName_example"; // String | 
try {
    PersonalNameParsedOut result = apiInstance.parseJapaneseName(japaneseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#parseJapaneseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **japaneseName** | **String**|  |

### Return type

[**PersonalNameParsedOut**](PersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseJapaneseNameBatch"></a>
# **parseJapaneseNameBatch**
> BatchPersonalNameParsedOut parseJapaneseNameBatch(batchPersonalNameIn)

Infer the likely first/last name structure of a name, ex. 山本 早苗 or Yamamoto Sanae 

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.JapaneseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

JapaneseApi apiInstance = new JapaneseApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names
try {
    BatchPersonalNameParsedOut result = apiInstance.parseJapaneseNameBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JapaneseApi#parseJapaneseNameBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameIn** | [**BatchPersonalNameIn**](BatchPersonalNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameParsedOut**](BatchPersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

