# PersonalApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**country**](PersonalApi.md#country) | **GET** /api2/json/country/{personalNameFull} | [USES 10 UNITS] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.
[**countryBatch**](PersonalApi.md#countryBatch) | **POST** /api2/json/countryBatch | [USES 10 UNITS] Infer the likely country of residence of up to 1000 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.
[**diaspora**](PersonalApi.md#diaspora) | **GET** /api2/json/diaspora/{countryIso2}/{firstName}/{lastName} | [USES 20 UNITS] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
[**diasporaBatch**](PersonalApi.md#diasporaBatch) | **POST** /api2/json/diasporaBatch | [USES 20 UNITS] Infer the likely ethnicity/diaspora of up to 1000 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
[**gender**](PersonalApi.md#gender) | **GET** /api2/json/gender/{firstName}/{lastName} | Infer the likely gender of a name.
[**genderBatch**](PersonalApi.md#genderBatch) | **POST** /api2/json/genderBatch | Infer the likely gender of up to 1000 names, detecting automatically the cultural context.
[**genderFull**](PersonalApi.md#genderFull) | **GET** /api2/json/genderFull/{fullName} | Infer the likely gender of a full name, ex. John H. Smith
[**genderFullBatch**](PersonalApi.md#genderFullBatch) | **POST** /api2/json/genderFullBatch | Infer the likely gender of up to 1000 full names, detecting automatically the cultural context.
[**genderFullGeo**](PersonalApi.md#genderFullGeo) | **GET** /api2/json/genderFullGeo/{fullName}/{countryIso2} | Infer the likely gender of a full name, given a local context (ISO2 country code).
[**genderFullGeoBatch**](PersonalApi.md#genderFullGeoBatch) | **POST** /api2/json/genderFullGeoBatch | Infer the likely gender of up to 1000 full names, with a given cultural context (country ISO2 code).
[**genderGeo**](PersonalApi.md#genderGeo) | **GET** /api2/json/genderGeo/{firstName}/{lastName}/{countryIso2} | Infer the likely gender of a name, given a local context (ISO2 country code).
[**genderGeoBatch**](PersonalApi.md#genderGeoBatch) | **POST** /api2/json/genderGeoBatch | Infer the likely gender of up to 1000 names, each given a local context (ISO2 country code).
[**origin**](PersonalApi.md#origin) | **GET** /api2/json/origin/{firstName}/{lastName} | [USES 10 UNITS] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.
[**originBatch**](PersonalApi.md#originBatch) | **POST** /api2/json/originBatch | [USES 10 UNITS] Infer the likely country of origin of up to 1000 names, detecting automatically the cultural context.
[**parsedGenderBatch**](PersonalApi.md#parsedGenderBatch) | **POST** /api2/json/parsedGenderBatch | Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.
[**parsedGenderGeoBatch**](PersonalApi.md#parsedGenderGeoBatch) | **POST** /api2/json/parsedGenderGeoBatch | Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.
[**usRaceEthnicity**](PersonalApi.md#usRaceEthnicity) | **GET** /api2/json/usRaceEthnicity/{firstName}/{lastName} | [USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy.
[**usRaceEthnicityBatch**](PersonalApi.md#usRaceEthnicityBatch) | **POST** /api2/json/usRaceEthnicityBatch | [USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy.
[**usRaceEthnicityZIP5**](PersonalApi.md#usRaceEthnicityZIP5) | **GET** /api2/json/usRaceEthnicityZIP5/{firstName}/{lastName}/{zip5Code} | [USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info.
[**usZipRaceEthnicityBatch**](PersonalApi.md#usZipRaceEthnicityBatch) | **POST** /api2/json/usZipRaceEthnicityBatch | [USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code.


<a name="country"></a>
# **country**
> PersonalNameGeoOut country(personalNameFull)

[USES 10 UNITS] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String personalNameFull = "personalNameFull_example"; // String | 
try {
    PersonalNameGeoOut result = apiInstance.country(personalNameFull);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#country");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personalNameFull** | **String**|  |

### Return type

[**PersonalNameGeoOut**](PersonalNameGeoOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="countryBatch"></a>
# **countryBatch**
> BatchPersonalNameGeoOut countryBatch(batchPersonalNameIn)

[USES 10 UNITS] Infer the likely country of residence of up to 1000 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names
try {
    BatchPersonalNameGeoOut result = apiInstance.countryBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#countryBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameIn** | [**BatchPersonalNameIn**](BatchPersonalNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameGeoOut**](BatchPersonalNameGeoOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="diaspora"></a>
# **diaspora**
> FirstLastNameDiasporaedOut diaspora(countryIso2, firstName, lastName)

[USES 20 UNITS] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String countryIso2 = "countryIso2_example"; // String | 
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameDiasporaedOut result = apiInstance.diaspora(countryIso2, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#diaspora");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryIso2** | **String**|  |
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameDiasporaedOut**](FirstLastNameDiasporaedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="diasporaBatch"></a>
# **diasporaBatch**
> BatchFirstLastNameDiasporaedOut diasporaBatch(batchFirstLastNameGeoIn)

[USES 20 UNITS] Infer the likely ethnicity/diaspora of up to 1000 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = new BatchFirstLastNameGeoIn(); // BatchFirstLastNameGeoIn | A list of personal names
try {
    BatchFirstLastNameDiasporaedOut result = apiInstance.diasporaBatch(batchFirstLastNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#diasporaBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoIn** | [**BatchFirstLastNameGeoIn**](BatchFirstLastNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameDiasporaedOut**](BatchFirstLastNameDiasporaedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gender"></a>
# **gender**
> FirstLastNameGenderedOut gender(firstName, lastName)

Infer the likely gender of a name.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.gender(firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#gender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderBatch"></a>
# **genderBatch**
> BatchFirstLastNameGenderedOut genderBatch(batchFirstLastNameIn)

Infer the likely gender of up to 1000 names, detecting automatically the cultural context.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal names
try {
    BatchFirstLastNameGenderedOut result = apiInstance.genderBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameGenderedOut**](BatchFirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genderFull"></a>
# **genderFull**
> FirstLastNameGenderedOut genderFull(fullName)

Infer the likely gender of a full name, ex. John H. Smith

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String fullName = "fullName_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.genderFull(fullName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderFullBatch"></a>
# **genderFullBatch**
> BatchPersonalNameGenderedOut genderFullBatch(batchPersonalNameIn)

Infer the likely gender of up to 1000 full names, detecting automatically the cultural context.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchPersonalNameIn batchPersonalNameIn = new BatchPersonalNameIn(); // BatchPersonalNameIn | A list of personal names
try {
    BatchPersonalNameGenderedOut result = apiInstance.genderFullBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderFullBatch");
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

<a name="genderFullGeo"></a>
# **genderFullGeo**
> FirstLastNameGenderedOut genderFullGeo(fullName, countryIso2)

Infer the likely gender of a full name, given a local context (ISO2 country code).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String fullName = "fullName_example"; // String | 
String countryIso2 = "countryIso2_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.genderFullGeo(fullName, countryIso2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderFullGeo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **String**|  |
 **countryIso2** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderFullGeoBatch"></a>
# **genderFullGeoBatch**
> BatchPersonalNameGenderedOut genderFullGeoBatch(batchPersonalNameGeoIn)

Infer the likely gender of up to 1000 full names, with a given cultural context (country ISO2 code).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchPersonalNameGeoIn batchPersonalNameGeoIn = new BatchPersonalNameGeoIn(); // BatchPersonalNameGeoIn | A list of personal names, with a country ISO2 code
try {
    BatchPersonalNameGenderedOut result = apiInstance.genderFullGeoBatch(batchPersonalNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderFullGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameGeoIn** | [**BatchPersonalNameGeoIn**](BatchPersonalNameGeoIn.md)| A list of personal names, with a country ISO2 code | [optional]

### Return type

[**BatchPersonalNameGenderedOut**](BatchPersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="genderGeo"></a>
# **genderGeo**
> FirstLastNameGenderedOut genderGeo(firstName, lastName, countryIso2)

Infer the likely gender of a name, given a local context (ISO2 country code).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String countryIso2 = "countryIso2_example"; // String | 
try {
    FirstLastNameGenderedOut result = apiInstance.genderGeo(firstName, lastName, countryIso2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderGeo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **countryIso2** | **String**|  |

### Return type

[**FirstLastNameGenderedOut**](FirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderGeoBatch"></a>
# **genderGeoBatch**
> BatchFirstLastNameGenderedOut genderGeoBatch(batchFirstLastNameGeoIn)

Infer the likely gender of up to 1000 names, each given a local context (ISO2 country code).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = new BatchFirstLastNameGeoIn(); // BatchFirstLastNameGeoIn | A list of names, with country code.
try {
    BatchFirstLastNameGenderedOut result = apiInstance.genderGeoBatch(batchFirstLastNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#genderGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoIn** | [**BatchFirstLastNameGeoIn**](BatchFirstLastNameGeoIn.md)| A list of names, with country code. | [optional]

### Return type

[**BatchFirstLastNameGenderedOut**](BatchFirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="origin"></a>
# **origin**
> FirstLastNameOriginedOut origin(firstName, lastName)

[USES 10 UNITS] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameOriginedOut result = apiInstance.origin(firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#origin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameOriginedOut**](FirstLastNameOriginedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="originBatch"></a>
# **originBatch**
> BatchFirstLastNameOriginedOut originBatch(batchFirstLastNameIn)

[USES 10 UNITS] Infer the likely country of origin of up to 1000 names, detecting automatically the cultural context.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameIn batchFirstLastNameIn = new BatchFirstLastNameIn(); // BatchFirstLastNameIn | A list of personal names
try {
    BatchFirstLastNameOriginedOut result = apiInstance.originBatch(batchFirstLastNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#originBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameIn** | [**BatchFirstLastNameIn**](BatchFirstLastNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameOriginedOut**](BatchFirstLastNameOriginedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="parsedGenderBatch"></a>
# **parsedGenderBatch**
> BatchFirstLastNameGenderedOut parsedGenderBatch(batchParsedFullNameIn)

Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchParsedFullNameIn batchParsedFullNameIn = new BatchParsedFullNameIn(); // BatchParsedFullNameIn | A list of personal names
try {
    BatchFirstLastNameGenderedOut result = apiInstance.parsedGenderBatch(batchParsedFullNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parsedGenderBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchParsedFullNameIn** | [**BatchParsedFullNameIn**](BatchParsedFullNameIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameGenderedOut**](BatchFirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="parsedGenderGeoBatch"></a>
# **parsedGenderGeoBatch**
> BatchFirstLastNameGenderedOut parsedGenderGeoBatch(batchParsedFullNameGeoIn)

Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchParsedFullNameGeoIn batchParsedFullNameGeoIn = new BatchParsedFullNameGeoIn(); // BatchParsedFullNameGeoIn | A list of personal names
try {
    BatchFirstLastNameGenderedOut result = apiInstance.parsedGenderGeoBatch(batchParsedFullNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parsedGenderGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchParsedFullNameGeoIn** | [**BatchParsedFullNameGeoIn**](BatchParsedFullNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameGenderedOut**](BatchFirstLastNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usRaceEthnicity"></a>
# **usRaceEthnicity**
> FirstLastNameUSRaceEthnicityOut usRaceEthnicity(firstName, lastName)

[USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
try {
    FirstLastNameUSRaceEthnicityOut result = apiInstance.usRaceEthnicity(firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#usRaceEthnicity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |

### Return type

[**FirstLastNameUSRaceEthnicityOut**](FirstLastNameUSRaceEthnicityOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usRaceEthnicityBatch"></a>
# **usRaceEthnicityBatch**
> BatchFirstLastNameUSRaceEthnicityOut usRaceEthnicityBatch(batchFirstLastNameGeoIn)

[USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameGeoIn batchFirstLastNameGeoIn = new BatchFirstLastNameGeoIn(); // BatchFirstLastNameGeoIn | A list of personal names
try {
    BatchFirstLastNameUSRaceEthnicityOut result = apiInstance.usRaceEthnicityBatch(batchFirstLastNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#usRaceEthnicityBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoIn** | [**BatchFirstLastNameGeoIn**](BatchFirstLastNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameUSRaceEthnicityOut**](BatchFirstLastNameUSRaceEthnicityOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usRaceEthnicityZIP5"></a>
# **usRaceEthnicityZIP5**
> FirstLastNameUSRaceEthnicityOut usRaceEthnicityZIP5(firstName, lastName, zip5Code)

[USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
String firstName = "firstName_example"; // String | 
String lastName = "lastName_example"; // String | 
String zip5Code = "zip5Code_example"; // String | 
try {
    FirstLastNameUSRaceEthnicityOut result = apiInstance.usRaceEthnicityZIP5(firstName, lastName, zip5Code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#usRaceEthnicityZIP5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |
 **lastName** | **String**|  |
 **zip5Code** | **String**|  |

### Return type

[**FirstLastNameUSRaceEthnicityOut**](FirstLastNameUSRaceEthnicityOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usZipRaceEthnicityBatch"></a>
# **usZipRaceEthnicityBatch**
> BatchFirstLastNameUSRaceEthnicityOut usZipRaceEthnicityBatch(batchFirstLastNameGeoZippedIn)

[USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.PersonalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

PersonalApi apiInstance = new PersonalApi();
BatchFirstLastNameGeoZippedIn batchFirstLastNameGeoZippedIn = new BatchFirstLastNameGeoZippedIn(); // BatchFirstLastNameGeoZippedIn | A list of personal names
try {
    BatchFirstLastNameUSRaceEthnicityOut result = apiInstance.usZipRaceEthnicityBatch(batchFirstLastNameGeoZippedIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#usZipRaceEthnicityBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchFirstLastNameGeoZippedIn** | [**BatchFirstLastNameGeoZippedIn**](BatchFirstLastNameGeoZippedIn.md)| A list of personal names | [optional]

### Return type

[**BatchFirstLastNameUSRaceEthnicityOut**](BatchFirstLastNameUSRaceEthnicityOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

