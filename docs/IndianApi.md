# IndianApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**casteIndianBatch**](IndianApi.md#casteIndianBatch) | **POST** /api2/json/casteIndianBatch | [USES 10 UNITS PER NAME] Infer the likely Indian name caste of up to 100 personal Indian Hindu names. 
[**castegroupIndian**](IndianApi.md#castegroupIndian) | **GET** /api2/json/castegroupIndian/{subDivisionIso31662}/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a first / last name.
[**castegroupIndianBatch**](IndianApi.md#castegroupIndianBatch) | **POST** /api2/json/castegroupIndianBatch | [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal first / last names. 
[**castegroupIndianFull**](IndianApi.md#castegroupIndianFull) | **GET** /api2/json/castegroupIndianFull/{subDivisionIso31662}/{personalNameFull} | [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a personal full name.
[**castegroupIndianFullBatch**](IndianApi.md#castegroupIndianFullBatch) | **POST** /api2/json/castegroupIndianFullBatch | [USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal full names. 
[**castegroupIndianHindu**](IndianApi.md#castegroupIndianHindu) | **GET** /api2/json/casteIndian/{subDivisionIso31662}/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely Indian name caste of a personal Hindu name.
[**religion**](IndianApi.md#religion) | **GET** /api2/json/religionIndianFull/{subDivisionIso31662}/{personalNameFull} | [USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian full name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).
[**religion1**](IndianApi.md#religion1) | **GET** /api2/json/religionIndian/{subDivisionIso31662}/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian first/last name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).
[**religionIndianBatch**](IndianApi.md#religionIndianBatch) | **POST** /api2/json/religionIndianBatch | [USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal first/last Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).
[**religionIndianFullBatch**](IndianApi.md#religionIndianFullBatch) | **POST** /api2/json/religionIndianFullBatch | [USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal full Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).
[**subclassificationIndian**](IndianApi.md#subclassificationIndian) | **GET** /api2/json/subclassificationIndian/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.
[**subclassificationIndianBatch**](IndianApi.md#subclassificationIndianBatch) | **POST** /api2/json/subclassificationIndianBatch | [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.
[**subclassificationIndianFull**](IndianApi.md#subclassificationIndianFull) | **GET** /api2/json/subclassificationIndianFull/{fullName} | [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.
[**subclassificationIndianFullBatch**](IndianApi.md#subclassificationIndianFullBatch) | **POST** /api2/json/subclassificationIndianFullBatch | [USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.


<a name="casteIndianBatch"></a>
# **casteIndianBatch**
> BatchFirstLastNameCasteOut casteIndianBatch(batchFirstLastNameGeoSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely Indian name caste of up to 100 personal Indian Hindu names. 

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchFirstLastNameGeoSubdivisionIn batchFirstLastNameGeoSubdivisionIn = new BatchFirstLastNameGeoSubdivisionIn(); // BatchFirstLastNameGeoSubdivisionIn | A list of personal names
try {
    BatchFirstLastNameCasteOut result = apiInstance.casteIndianBatch(batchFirstLastNameGeoSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#casteIndianBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoSubdivisionIn** | [**BatchFirstLastNameGeoSubdivisionIn**](BatchFirstLastNameGeoSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameCasteOut**](BatchFirstLastNameCasteOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="castegroupIndian"></a>
# **castegroupIndian**
> FirstLastNameCastegroupOut castegroupIndian(subDivisionIso31662, firstName, lastName)

[USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a first / last name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameCastegroupOut result = apiInstance.castegroupIndian(subDivisionIso31662, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#castegroupIndian");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subDivisionIso31662** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameCastegroupOut**](FirstLastNameCastegroupOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="castegroupIndianBatch"></a>
# **castegroupIndianBatch**
> BatchFirstLastNameCastegroupOut castegroupIndianBatch(batchFirstLastNameSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal first / last names. 

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchFirstLastNameSubdivisionIn batchFirstLastNameSubdivisionIn = new BatchFirstLastNameSubdivisionIn(); // BatchFirstLastNameSubdivisionIn | A list of personal names
try {
    BatchFirstLastNameCastegroupOut result = apiInstance.castegroupIndianBatch(batchFirstLastNameSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#castegroupIndianBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameSubdivisionIn** | [**BatchFirstLastNameSubdivisionIn**](BatchFirstLastNameSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameCastegroupOut**](BatchFirstLastNameCastegroupOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="castegroupIndianFull"></a>
# **castegroupIndianFull**
> PersonalNameCastegroupOut castegroupIndianFull(subDivisionIso31662, personalNameFull)

[USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of a personal full name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String personalNameFull = "personalNameFull_example"; // String | 
try {
    PersonalNameCastegroupOut result = apiInstance.castegroupIndianFull(subDivisionIso31662, personalNameFull);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#castegroupIndianFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subDivisionIso31662** | **String**|  |
 **personalNameFull** | **String**|  |

### Return type

[**PersonalNameCastegroupOut**](PersonalNameCastegroupOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="castegroupIndianFullBatch"></a>
# **castegroupIndianFullBatch**
> BatchPersonalNameCastegroupOut castegroupIndianFullBatch(batchPersonalNameSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely Indian name castegroup of up to 100 personal full names. 

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchPersonalNameSubdivisionIn batchPersonalNameSubdivisionIn = new BatchPersonalNameSubdivisionIn(); // BatchPersonalNameSubdivisionIn | A list of personal names
try {
    BatchPersonalNameCastegroupOut result = apiInstance.castegroupIndianFullBatch(batchPersonalNameSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#castegroupIndianFullBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameSubdivisionIn** | [**BatchPersonalNameSubdivisionIn**](BatchPersonalNameSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameCastegroupOut**](BatchPersonalNameCastegroupOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="castegroupIndianHindu"></a>
# **castegroupIndianHindu**
> FirstLastNameCasteOut castegroupIndianHindu(subDivisionIso31662, firstName, lastName)

[USES 10 UNITS PER NAME] Infer the likely Indian name caste of a personal Hindu name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameCasteOut result = apiInstance.castegroupIndianHindu(subDivisionIso31662, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#castegroupIndianHindu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subDivisionIso31662** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameCasteOut**](FirstLastNameCasteOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="religion"></a>
# **religion**
> PersonalNameReligionedOut religion(subDivisionIso31662, personalNameFull)

[USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian full name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String personalNameFull = "personalNameFull_example"; // String | 
try {
    PersonalNameReligionedOut result = apiInstance.religion(subDivisionIso31662, personalNameFull);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#religion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subDivisionIso31662** | **String**|  |
 **personalNameFull** | **String**|  |

### Return type

[**PersonalNameReligionedOut**](PersonalNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="religion1"></a>
# **religion1**
> FirstLastNameReligionedOut religion1(subDivisionIso31662, firstName, lastName)

[USES 10 UNITS PER NAME] Infer the likely religion of a personal Indian first/last name, provided the Indian state or Union territory (NB/ this can be inferred using the subclassification endpoint).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameReligionedOut result = apiInstance.religion1(subDivisionIso31662, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#religion1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subDivisionIso31662** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameReligionedOut**](FirstLastNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="religionIndianBatch"></a>
# **religionIndianBatch**
> BatchFirstLastNameReligionedOut religionIndianBatch(batchFirstLastNameSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal first/last Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchFirstLastNameSubdivisionIn batchFirstLastNameSubdivisionIn = new BatchFirstLastNameSubdivisionIn(); // BatchFirstLastNameSubdivisionIn | A list of personal names
try {
    BatchFirstLastNameReligionedOut result = apiInstance.religionIndianBatch(batchFirstLastNameSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#religionIndianBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameSubdivisionIn** | [**BatchFirstLastNameSubdivisionIn**](BatchFirstLastNameSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameReligionedOut**](BatchFirstLastNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="religionIndianFullBatch"></a>
# **religionIndianFullBatch**
> BatchPersonalNameReligionedOut religionIndianFullBatch(batchPersonalNameSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal full Indian names, provided the subclassification at State or Union territory level (NB/ can be inferred using the subclassification endpoint).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchPersonalNameSubdivisionIn batchPersonalNameSubdivisionIn = new BatchPersonalNameSubdivisionIn(); // BatchPersonalNameSubdivisionIn | A list of personal names
try {
    BatchPersonalNameReligionedOut result = apiInstance.religionIndianFullBatch(batchPersonalNameSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#religionIndianFullBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameSubdivisionIn** | [**BatchPersonalNameSubdivisionIn**](BatchPersonalNameSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameReligionedOut**](BatchPersonalNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subclassificationIndian"></a>
# **subclassificationIndian**
> FirstLastNameGeoSubclassificationOut subclassificationIndian(firstName, lastName)

[USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameGeoSubclassificationOut result = apiInstance.subclassificationIndian(firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#subclassificationIndian");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameGeoSubclassificationOut**](FirstLastNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subclassificationIndianBatch"></a>
# **subclassificationIndianBatch**
> BatchFirstLastNameGeoSubclassificationOut subclassificationIndianBatch(batchFirstLastNameGeoIn)

[USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = new BatchFirstLastNameGeoIn(); // BatchFirstLastNameGeoIn | A list of personal names
try {
    BatchFirstLastNameGeoSubclassificationOut result = apiInstance.subclassificationIndianBatch(batchFirstLastNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#subclassificationIndianBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoIn** | [**BatchFirstLastNameGeoIn**](BatchFirstLastNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameGeoSubclassificationOut**](BatchFirstLastNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subclassificationIndianFull"></a>
# **subclassificationIndianFull**
> PersonalNameGeoSubclassificationOut subclassificationIndianFull(fullName)

[USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on the name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
String fullName = "fullName_example"; // String | 
try {
    PersonalNameGeoSubclassificationOut result = apiInstance.subclassificationIndianFull(fullName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#subclassificationIndianFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **String**|  |

### Return type

[**PersonalNameGeoSubclassificationOut**](PersonalNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subclassificationIndianFullBatch"></a>
# **subclassificationIndianFullBatch**
> BatchPersonalNameGeoSubclassificationOut subclassificationIndianFullBatch(batchPersonalNameGeoIn)

[USES 10 UNITS PER NAME] Infer the likely Indian state of Union territory according to ISO 3166-2:IN based on a list of up to 100 names.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.IndianApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

IndianApi apiInstance = new IndianApi();
BatchPersonalNameGeoIn batchPersonalNameGeoIn = new BatchPersonalNameGeoIn(); // BatchPersonalNameGeoIn | A list of personal names
try {
    BatchPersonalNameGeoSubclassificationOut result = apiInstance.subclassificationIndianFullBatch(batchPersonalNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndianApi#subclassificationIndianFullBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameGeoIn** | [**BatchPersonalNameGeoIn**](BatchPersonalNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameGeoSubclassificationOut**](BatchPersonalNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

