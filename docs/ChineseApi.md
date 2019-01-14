# ChineseApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chineseNameCandidates**](ChineseApi.md#chineseNameCandidates) | **GET** /api2/json/chineseNameCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin} | Identify Chinese name candidates, based on the romanized name.
[**chineseNameCandidatesBatch**](ChineseApi.md#chineseNameCandidatesBatch) | **POST** /api2/json/chineseNameCandidatesBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).
[**chineseNameCandidatesGenderBatch**](ChineseApi.md#chineseNameCandidatesGenderBatch) | **POST** /api2/json/chineseNameCandidatesGenderBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).
[**chineseNameGenderCandidates**](ChineseApi.md#chineseNameGenderCandidates) | **GET** /api2/json/chineseNameGenderCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin}/{knownGender} | Identify Chinese name candidates, based on the romanized name - having a known gender (&#39;male&#39; or &#39;female&#39;)


<a name="chineseNameCandidates"></a>
# **chineseNameCandidates**
> RomanizedNameOut chineseNameCandidates(chineseSurnameLatin, chineseGivenNameLatin)

Identify Chinese name candidates, based on the romanized name.

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

Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).

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

Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).

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

Identify Chinese name candidates, based on the romanized name - having a known gender (&#39;male&#39; or &#39;female&#39;)

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

