# SocialApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phoneCode**](SocialApi.md#phoneCode) | **GET** /api2/json/phoneCode/{firstName}/{lastName}/{phoneNumber} | [USES 11 UNITS] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.
[**phoneCodeBatch**](SocialApi.md#phoneCodeBatch) | **POST** /api2/json/phoneCodeBatch | [USES 11 UNITS] Infer the likely country and phone prefix, of up to 1000 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.
[**phoneCodeGeo**](SocialApi.md#phoneCodeGeo) | **GET** /api2/json/phoneCodeGeo/{firstName}/{lastName}/{phoneNumber}/{countryIso2} | [USES 11 UNITS] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).
[**phoneCodeGeoBatch**](SocialApi.md#phoneCodeGeoBatch) | **POST** /api2/json/phoneCodeGeoBatch | [USES 11 UNITS] Infer the likely country and phone prefix, of up to 1000 personal names, with a local context (ISO2 country of residence).


<a name="phoneCode"></a>
# **phoneCode**
> FirstLastNamePhoneCodedOut phoneCode(firstName, lastName, phoneNumber)

[USES 11 UNITS] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SocialApi apiInstance = new SocialApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String phoneNumber = "phoneNumber_example"; // String | 
try {
    FirstLastNamePhoneCodedOut result = apiInstance.phoneCode(firstName, lastName, phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#phoneCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **phoneNumber** | **String**|  |

### Return type

[**FirstLastNamePhoneCodedOut**](FirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="phoneCodeBatch"></a>
# **phoneCodeBatch**
> BatchFirstLastNamePhoneCodedOut phoneCodeBatch(batchFirstLastNamePhoneNumberIn)

[USES 11 UNITS] Infer the likely country and phone prefix, of up to 1000 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SocialApi apiInstance = new SocialApi();
BatchFirstLastNamePhoneNumberIn batchFirstLastNamePhoneNumberIn = new BatchFirstLastNamePhoneNumberIn(); // BatchFirstLastNamePhoneNumberIn | A list of personal names
try {
    BatchFirstLastNamePhoneCodedOut result = apiInstance.phoneCodeBatch(batchFirstLastNamePhoneNumberIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#phoneCodeBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNamePhoneNumberIn** | [**BatchFirstLastNamePhoneNumberIn**](BatchFirstLastNamePhoneNumberIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNamePhoneCodedOut**](BatchFirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="phoneCodeGeo"></a>
# **phoneCodeGeo**
> FirstLastNamePhoneCodedOut phoneCodeGeo(firstName, lastName, phoneNumber, countryIso2)

[USES 11 UNITS] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SocialApi apiInstance = new SocialApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String phoneNumber = "phoneNumber_example"; // String | 
String countryIso2 = "countryIso2_example"; // String | 
try {
    FirstLastNamePhoneCodedOut result = apiInstance.phoneCodeGeo(firstName, lastName, phoneNumber, countryIso2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#phoneCodeGeo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **phoneNumber** | **String**|  |
 **countryIso2** | **String**|  |

### Return type

[**FirstLastNamePhoneCodedOut**](FirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="phoneCodeGeoBatch"></a>
# **phoneCodeGeoBatch**
> BatchFirstLastNamePhoneCodedOut phoneCodeGeoBatch(batchFirstLastNamePhoneNumberGeoIn)

[USES 11 UNITS] Infer the likely country and phone prefix, of up to 1000 personal names, with a local context (ISO2 country of residence).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.SocialApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

SocialApi apiInstance = new SocialApi();
BatchFirstLastNamePhoneNumberGeoIn batchFirstLastNamePhoneNumberGeoIn = new BatchFirstLastNamePhoneNumberGeoIn(); // BatchFirstLastNamePhoneNumberGeoIn | A list of personal names
try {
    BatchFirstLastNamePhoneCodedOut result = apiInstance.phoneCodeGeoBatch(batchFirstLastNamePhoneNumberGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SocialApi#phoneCodeGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNamePhoneNumberGeoIn** | [**BatchFirstLastNamePhoneNumberGeoIn**](BatchFirstLastNamePhoneNumberGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNamePhoneCodedOut**](BatchFirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

