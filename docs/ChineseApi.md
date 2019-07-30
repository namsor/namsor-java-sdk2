# ChineseApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chineseNameCandidates**](ChineseApi.md#chineseNameCandidates) | **GET** /api2/json/chineseNameCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin} | Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming
[**chineseNameCandidatesBatch**](ChineseApi.md#chineseNameCandidatesBatch) | **POST** /api2/json/chineseNameCandidatesBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
[**chineseNameCandidatesGenderBatch**](ChineseApi.md#chineseNameCandidatesGenderBatch) | **POST** /api2/json/chineseNameCandidatesGenderBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname) ex. Wang Xiaoming.
[**chineseNameGenderCandidates**](ChineseApi.md#chineseNameGenderCandidates) | **GET** /api2/json/chineseNameGenderCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin}/{knownGender} | Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming - having a known gender (&#39;male&#39; or &#39;female&#39;)
[**chineseNameMatch**](ChineseApi.md#chineseNameMatch) | **GET** /api2/json/chineseNameMatch/{chineseSurnameLatin}/{chineseGivenNameLatin}/{chineseName} | Return a score for matching Chinese name ex. 王晓明 with a romanized name ex. Wang Xiaoming
[**chineseNameMatchBatch**](ChineseApi.md#chineseNameMatchBatch) | **POST** /api2/json/chineseNameMatchBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming
[**genderChineseName**](ChineseApi.md#genderChineseName) | **GET** /api2/json/genderChineseName/{chineseName} | Infer the likely gender of a Chinese full name ex. 王晓明
[**genderChineseNameBatch**](ChineseApi.md#genderChineseNameBatch) | **POST** /api2/json/genderChineseNameBatch | Infer the likely gender of up to 100 full names ex. 王晓明
[**genderChineseNamePinyin**](ChineseApi.md#genderChineseNamePinyin) | **GET** /api2/json/genderChineseNamePinyin/{chineseSurnameLatin}/{chineseGivenNameLatin} | Infer the likely gender of a Chinese name in LATIN (Pinyin).
[**genderChineseNamePinyinBatch**](ChineseApi.md#genderChineseNamePinyinBatch) | **POST** /api2/json/genderChineseNamePinyinBatch | Infer the likely gender of up to 100 Chinese names in LATIN (Pinyin).
[**parseChineseName**](ChineseApi.md#parseChineseName) | **GET** /api2/json/parseChineseName/{chineseName} | Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name)
[**parseChineseNameBatch**](ChineseApi.md#parseChineseNameBatch) | **POST** /api2/json/parseChineseNameBatch | Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name).
[**pinyinChineseName**](ChineseApi.md#pinyinChineseName) | **GET** /api2/json/pinyinChineseName/{chineseName} | Romanize the Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name)
[**pinyinChineseNameBatch**](ChineseApi.md#pinyinChineseNameBatch) | **POST** /api2/json/pinyinChineseNameBatch | Romanize a list of Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name).


<a name="chineseNameCandidates"></a>
# **chineseNameCandidates**
> RomanizedNameOut chineseNameCandidates(chineseSurnameLatin, chineseGivenNameLatin)

Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseSurnameLatin = "chineseSurnameLatin_example"; // String | 
String chineseGivenNameLatin = "chineseGivenNameLatin_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.chineseNameCandidates(chineseSurnameLatin, chineseGivenNameLatin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameCandidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseSurnameLatin** | **String**|  |
 **chineseGivenNameLatin** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chineseNameCandidatesBatch"></a>
# **chineseNameCandidatesBatch**
> BatchNameMatchCandidatesOut chineseNameCandidatesBatch(batchFirstLastNameIn)

Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal Chinese names in LATIN, firstName = chineseGivenName; lastName=chineseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.chineseNameCandidatesBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameCandidatesBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal Chinese names in LATIN, firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chineseNameCandidatesGenderBatch"></a>
# **chineseNameCandidatesGenderBatch**
> BatchNameMatchCandidatesOut chineseNameCandidatesGenderBatch(batchFirstLastNameIn)

Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname) ex. Wang Xiaoming.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal Chinese names in LATIN, firstName = chineseGivenName; lastName=chineseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.chineseNameCandidatesGenderBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameCandidatesGenderBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal Chinese names in LATIN, firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="chineseNameGenderCandidates"></a>
# **chineseNameGenderCandidates**
> RomanizedNameOut chineseNameGenderCandidates(chineseSurnameLatin, chineseGivenNameLatin, knownGender)

Identify Chinese name candidates, based on the romanized name ex. Wang Xiaoming - having a known gender (&#39;male&#39; or &#39;female&#39;)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseSurnameLatin = "chineseSurnameLatin_example"; // String | 
String chineseGivenNameLatin = "chineseGivenNameLatin_example"; // String | 
String knownGender = "knownGender_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.chineseNameGenderCandidates(chineseSurnameLatin, chineseGivenNameLatin, knownGender);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameGenderCandidates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseSurnameLatin** | **String**|  |
 **chineseGivenNameLatin** | **String**|  |
 **knownGender** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chineseNameMatch"></a>
# **chineseNameMatch**
> RomanizedNameOut chineseNameMatch(chineseSurnameLatin, chineseGivenNameLatin, chineseName)

Return a score for matching Chinese name ex. 王晓明 with a romanized name ex. Wang Xiaoming

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseSurnameLatin = "chineseSurnameLatin_example"; // String | 
String chineseGivenNameLatin = "chineseGivenNameLatin_example"; // String | 
String chineseName = "chineseName_example"; // String | 
try {
    RomanizedNameOut result = apiInstance.chineseNameMatch(chineseSurnameLatin, chineseGivenNameLatin, chineseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameMatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseSurnameLatin** | **String**|  |
 **chineseGivenNameLatin** | **String**|  |
 **chineseName** | **String**|  |

### Return type

[**RomanizedNameOut**](RomanizedNameOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="chineseNameMatchBatch"></a>
# **chineseNameMatchBatch**
> BatchNameMatchCandidatesOut chineseNameMatchBatch(batchFirstLastNameIn)

Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname), ex. Wang Xiaoming

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal Chinese names in LATIN, firstName = chineseGivenName; lastName=chineseSurname
try {
    BatchNameMatchCandidatesOut result = apiInstance.chineseNameMatchBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#chineseNameMatchBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal Chinese names in LATIN, firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname | [optional]

### Return type

[**BatchNameMatchCandidatesOut**](BatchNameMatchCandidatesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genderChineseName"></a>
# **genderChineseName**
> PersonalNameGenderedOut genderChineseName(chineseName)

Infer the likely gender of a Chinese full name ex. 王晓明

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseName = "chineseName_example"; // String | 
try {
    PersonalNameGenderedOut result = apiInstance.genderChineseName(chineseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#genderChineseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseName** | **String**|  |

### Return type

[**PersonalNameGenderedOut**](PersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderChineseNameBatch"></a>
# **genderChineseNameBatch**
> BatchPersonalNameGenderedOut genderChineseNameBatch(batchPersonalNameIn)

Infer the likely gender of up to 100 full names ex. 王晓明

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names, with a country ISO2 code
try {
    BatchPersonalNameGenderedOut result = apiInstance.genderChineseNameBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#genderChineseNameBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameIn** | [**BatchPersonalNameIn**](BatchPersonalNameIn.md)| A list of personal names, with a country ISO2 code | [optional]

### Return type

[**BatchPersonalNameGenderedOut**](BatchPersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genderChineseNamePinyin"></a>
# **genderChineseNamePinyin**
> FirstLastNameGenderedOut genderChineseNamePinyin(chineseSurnameLatin, chineseGivenNameLatin)

Infer the likely gender of a Chinese name in LATIN (Pinyin).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseSurnameLatin = "chineseSurnameLatin_example"; // String | 
String chineseGivenNameLatin = "chineseGivenNameLatin_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.genderChineseNamePinyin(chineseSurnameLatin, chineseGivenNameLatin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#genderChineseNamePinyin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseSurnameLatin** | **String**|  |
 **chineseGivenNameLatin** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderChineseNamePinyinBatch"></a>
# **genderChineseNamePinyinBatch**
> BatchFirstLastNameGenderedOut genderChineseNamePinyinBatch(batchFirstLastNameIn)

Infer the likely gender of up to 100 Chinese names in LATIN (Pinyin).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of names, with country code.
try {
    BatchFirstLastNameGenderedOut result = apiInstance.genderChineseNamePinyinBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#genderChineseNamePinyinBatch");
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

<a name="parseChineseName"></a>
# **parseChineseName**
> PersonalNameParsedOut parseChineseName(chineseName)

Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseName = "chineseName_example"; // String | 
try {
    PersonalNameParsedOut result = apiInstance.parseChineseName(chineseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#parseChineseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseName** | **String**|  |

### Return type

[**PersonalNameParsedOut**](PersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseChineseNameBatch"></a>
# **parseChineseNameBatch**
> BatchPersonalNameParsedOut parseChineseNameBatch(batchPersonalNameIn)

Infer the likely first/last name structure of a name, ex. 王晓明 -&gt; 王(surname) 晓明(given name).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names
try {
    BatchPersonalNameParsedOut result = apiInstance.parseChineseNameBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#parseChineseNameBatch");
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

<a name="pinyinChineseName"></a>
# **pinyinChineseName**
> PersonalNameParsedOut pinyinChineseName(chineseName)

Romanize the Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
String chineseName = "chineseName_example"; // String | 
try {
    PersonalNameParsedOut result = apiInstance.pinyinChineseName(chineseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#pinyinChineseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chineseName** | **String**|  |

### Return type

[**PersonalNameParsedOut**](PersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pinyinChineseNameBatch"></a>
# **pinyinChineseNameBatch**
> BatchPersonalNameParsedOut pinyinChineseNameBatch(batchPersonalNameIn)

Romanize a list of Chinese name to Pinyin, ex. 王晓明 -&gt; Wang (surname) Xiaoming (given name).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.ChineseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ChineseApi apiInstance = new ChineseApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of Chinese names
try {
    BatchPersonalNameParsedOut result = apiInstance.pinyinChineseNameBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChineseApi#pinyinChineseNameBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameIn** | [**BatchPersonalNameIn**](BatchPersonalNameIn.md)| A list of Chinese names | [optional]

### Return type

[**BatchPersonalNameParsedOut**](BatchPersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

