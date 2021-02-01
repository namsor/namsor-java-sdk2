# GeneralApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nameType**](GeneralApi.md#nameType) | **GET** /api2/json/nameType/{properNoun} | Infer the likely type of a proper noun (personal name, brand name, place name etc.)
[**nameTypeBatch**](GeneralApi.md#nameTypeBatch) | **POST** /api2/json/nameTypeBatch | Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
[**nameTypeGeo**](GeneralApi.md#nameTypeGeo) | **GET** /api2/json/nameTypeGeo/{properNoun}/{countryIso2} | Infer the likely type of a proper noun (personal name, brand name, place name etc.)
[**nameTypeGeoBatch**](GeneralApi.md#nameTypeGeoBatch) | **POST** /api2/json/nameTypeGeoBatch | Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)


<a name="nameType"></a>
# **nameType**
> ProperNounCategorizedOut nameType(properNoun)

Infer the likely type of a proper noun (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
String properNoun = "properNoun_example"; // String | 
try {
    ProperNounCategorizedOut result = apiInstance.nameType(properNoun);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#nameType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **properNoun** | **String**|  |

### Return type

[**ProperNounCategorizedOut**](ProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nameTypeBatch"></a>
# **nameTypeBatch**
> BatchProperNounCategorizedOut nameTypeBatch(batchNameIn)

Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
BatchNameIn batchNameIn = new BatchNameIn(); // BatchNameIn | A list of proper names
try {
    BatchProperNounCategorizedOut result = apiInstance.nameTypeBatch(batchNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#nameTypeBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchNameIn** | [**BatchNameIn**](BatchNameIn.md)| A list of proper names | [optional]

### Return type

[**BatchProperNounCategorizedOut**](BatchProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nameTypeGeo"></a>
# **nameTypeGeo**
> ProperNounCategorizedOut nameTypeGeo(properNoun, countryIso2)

Infer the likely type of a proper noun (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
String properNoun = "properNoun_example"; // String | 
String countryIso2 = "countryIso2_example"; // String | 
try {
    ProperNounCategorizedOut result = apiInstance.nameTypeGeo(properNoun, countryIso2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#nameTypeGeo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **properNoun** | **String**|  |
 **countryIso2** | **String**|  |

### Return type

[**ProperNounCategorizedOut**](ProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nameTypeGeoBatch"></a>
# **nameTypeGeoBatch**
> BatchProperNounCategorizedOut nameTypeGeoBatch(batchNameGeoIn)

Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
BatchNameGeoIn batchNameGeoIn = new BatchNameGeoIn(); // BatchNameGeoIn | A list of proper names
try {
    BatchProperNounCategorizedOut result = apiInstance.nameTypeGeoBatch(batchNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#nameTypeGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchNameGeoIn** | [**BatchNameGeoIn**](BatchNameGeoIn.md)| A list of proper names | [optional]

### Return type

[**BatchProperNounCategorizedOut**](BatchProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

