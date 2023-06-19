# PersonalApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corridor**](PersonalApi.md#corridor) | **GET** /api2/json/corridor/{countryIso2From}/{firstNameFrom}/{lastNameFrom}/{countryIso2To}/{firstNameTo}/{lastNameTo} | [USES 20 UNITS PER NAME COUPLE] Infer several classifications for a cross border interaction between names (ex. remit, travel, intl com)
[**corridorBatch**](PersonalApi.md#corridorBatch) | **POST** /api2/json/corridorBatch | [USES 20 UNITS PER NAME PAIR] Infer several classifications for up to 100 cross border interaction between names (ex. remit, travel, intl com)
[**country**](PersonalApi.md#country) | **GET** /api2/json/country/{personalNameFull} | [USES 10 UNITS PER NAME] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.
[**countryBatch**](PersonalApi.md#countryBatch) | **POST** /api2/json/countryBatch | [USES 10 UNITS PER NAME] Infer the likely country of residence of up to 100 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.
[**diaspora**](PersonalApi.md#diaspora) | **GET** /api2/json/diaspora/{countryIso2}/{firstName}/{lastName} | [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
[**diasporaBatch**](PersonalApi.md#diasporaBatch) | **POST** /api2/json/diasporaBatch | [USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of up to 100 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
[**gender**](PersonalApi.md#gender) | **GET** /api2/json/gender/{firstName}/{lastName} | Infer the likely gender of a name.
[**gender1**](PersonalApi.md#gender1) | **GET** /api2/json/gender/{firstName} | Infer the likely gender of a just a fiven name, assuming default &#39;US&#39; local context. Please use preferably full names and local geographic context for better accuracy.
[**genderBatch**](PersonalApi.md#genderBatch) | **POST** /api2/json/genderBatch | Infer the likely gender of up to 100 names, detecting automatically the cultural context.
[**genderFull**](PersonalApi.md#genderFull) | **GET** /api2/json/genderFull/{fullName} | Infer the likely gender of a full name, ex. John H. Smith
[**genderFullBatch**](PersonalApi.md#genderFullBatch) | **POST** /api2/json/genderFullBatch | Infer the likely gender of up to 100 full names, detecting automatically the cultural context.
[**genderFullGeo**](PersonalApi.md#genderFullGeo) | **GET** /api2/json/genderFullGeo/{fullName}/{countryIso2} | Infer the likely gender of a full name, given a local context (ISO2 country code).
[**genderFullGeoBatch**](PersonalApi.md#genderFullGeoBatch) | **POST** /api2/json/genderFullGeoBatch | Infer the likely gender of up to 100 full names, with a given cultural context (country ISO2 code).
[**genderGeo**](PersonalApi.md#genderGeo) | **GET** /api2/json/genderGeo/{firstName}/{lastName}/{countryIso2} | Infer the likely gender of a name, given a local context (ISO2 country code).
[**genderGeoBatch**](PersonalApi.md#genderGeoBatch) | **POST** /api2/json/genderGeoBatch | Infer the likely gender of up to 100 names, each given a local context (ISO2 country code).
[**origin**](PersonalApi.md#origin) | **GET** /api2/json/origin/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.
[**originBatch**](PersonalApi.md#originBatch) | **POST** /api2/json/originBatch | [USES 10 UNITS PER NAME] Infer the likely country of origin of up to 100 names, detecting automatically the cultural context.
[**parseName**](PersonalApi.md#parseName) | **GET** /api2/json/parseName/{nameFull} | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. 
[**parseNameBatch**](PersonalApi.md#parseNameBatch) | **POST** /api2/json/parseNameBatch | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John.
[**parseNameGeo**](PersonalApi.md#parseNameGeo) | **GET** /api2/json/parseName/{nameFull}/{countryIso2} | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. For better accuracy, provide a geographic context.
[**parseNameGeoBatch**](PersonalApi.md#parseNameGeoBatch) | **POST** /api2/json/parseNameGeoBatch | Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. Giving a local context improves precision. 
[**religionFull**](PersonalApi.md#religionFull) | **GET** /api2/json/religionFull/{countryIso2}/{subDivisionIso31662}/{personalNameFull} | [USES 10 UNITS PER NAME] Infer the likely religion of a personal full name. NB: only for INDIA (as of current version).
[**religionFullBatch**](PersonalApi.md#religionFullBatch) | **POST** /api2/json/religionFullBatch | [USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal full names. NB: only for India as of currently.
[**subclassification**](PersonalApi.md#subclassification) | **GET** /api2/json/subclassification/{countryIso2}/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer the likely origin of a name at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).
[**subclassificationBatch**](PersonalApi.md#subclassificationBatch) | **POST** /api2/json/subclassificationBatch | [USES 10 UNITS PER NAME] Infer the likely origin of a list of up to 100 names at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).
[**subclassificationFull**](PersonalApi.md#subclassificationFull) | **GET** /api2/json/subclassificationFull/{countryIso2}/{fullName} | [USES 10 UNITS PER NAME] Infer the likely origin of a name at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).
[**subclassificationFullBatch**](PersonalApi.md#subclassificationFullBatch) | **POST** /api2/json/subclassificationFullBatch | [USES 10 UNITS PER NAME] Infer the likely origin of a list of up to 100 names at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).
[**usRaceEthnicity**](PersonalApi.md#usRaceEthnicity) | **GET** /api2/json/usRaceEthnicity/{firstName}/{lastName} | [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).
[**usRaceEthnicityBatch**](PersonalApi.md#usRaceEthnicityBatch) | **POST** /api2/json/usRaceEthnicityBatch | [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).
[**usRaceEthnicityZIP5**](PersonalApi.md#usRaceEthnicityZIP5) | **GET** /api2/json/usRaceEthnicityZIP5/{firstName}/{lastName}/{zip5Code} | [USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).
[**usZipRaceEthnicityBatch**](PersonalApi.md#usZipRaceEthnicityBatch) | **POST** /api2/json/usZipRaceEthnicityBatch | [USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).


<a name="corridor"></a>
# **corridor**
> CorridorOut corridor(countryIso2From, firstNameFrom, lastNameFrom, countryIso2To, firstNameTo, lastNameTo)

[USES 20 UNITS PER NAME COUPLE] Infer several classifications for a cross border interaction between names (ex. remit, travel, intl com)

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
String countryIso2From = "countryIso2From_example"; // String | 
String firstNameFrom = "firstNameFrom_example"; // String | 
String lastNameFrom = "lastNameFrom_example"; // String | 
String countryIso2To = "countryIso2To_example"; // String | 
String firstNameTo = "firstNameTo_example"; // String | 
String lastNameTo = "lastNameTo_example"; // String | 
try {
    CorridorOut result = apiInstance.corridor(countryIso2From, firstNameFrom, lastNameFrom, countryIso2To, firstNameTo, lastNameTo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#corridor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryIso2From** | **String**|  |
 **firstNameFrom** | **String**|  |
 **lastNameFrom** | **String**|  |
 **countryIso2To** | **String**|  |
 **firstNameTo** | **String**|  |
 **lastNameTo** | **String**|  |

### Return type

[**CorridorOut**](CorridorOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="corridorBatch"></a>
# **corridorBatch**
> BatchCorridorOut corridorBatch(batchCorridorIn)

[USES 20 UNITS PER NAME PAIR] Infer several classifications for up to 100 cross border interaction between names (ex. remit, travel, intl com)

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
BatchCorridorIn batchCorridorIn = new BatchCorridorIn(); // BatchCorridorIn | A list of name pairs, with country code (nameFrom -> nameTo).
try {
    BatchCorridorOut result = apiInstance.corridorBatch(batchCorridorIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#corridorBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchCorridorIn** | [**BatchCorridorIn**](BatchCorridorIn.md)| A list of name pairs, with country code (nameFrom -&gt; nameTo). | [optional]

### Return type

[**BatchCorridorOut**](BatchCorridorOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="country"></a>
# **country**
> PersonalNameGeoOut country(personalNameFull)

[USES 10 UNITS PER NAME] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.

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

[USES 10 UNITS PER NAME] Infer the likely country of residence of up to 100 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.

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

[USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)

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

[USES 20 UNITS PER NAME] Infer the likely ethnicity/diaspora of up to 100 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)

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

<a name="gender1"></a>
# **gender1**
> FirstLastNameGenderedOut gender1(firstName)

Infer the likely gender of a just a fiven name, assuming default &#39;US&#39; local context. Please use preferably full names and local geographic context for better accuracy.

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
try {
    FirstLastNameGenderedOut result = apiInstance.gender1(firstName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#gender1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**|  |

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

Infer the likely gender of up to 100 names, detecting automatically the cultural context.

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
> PersonalNameGenderedOut genderFull(fullName)

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
    PersonalNameGenderedOut result = apiInstance.genderFull(fullName);
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

[**PersonalNameGenderedOut**](PersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderFullBatch"></a>
# **genderFullBatch**
> BatchPersonalNameGenderedOut genderFullBatch(batchPersonalNameIn)

Infer the likely gender of up to 100 full names, detecting automatically the cultural context.

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
> PersonalNameGenderedOut genderFullGeo(fullName, countryIso2)

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
    PersonalNameGenderedOut result = apiInstance.genderFullGeo(fullName, countryIso2);
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

[**PersonalNameGenderedOut**](PersonalNameGenderedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="genderFullGeoBatch"></a>
# **genderFullGeoBatch**
> BatchPersonalNameGenderedOut genderFullGeoBatch(batchPersonalNameGeoIn)

Infer the likely gender of up to 100 full names, with a given cultural context (country ISO2 code).

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

Infer the likely gender of up to 100 names, each given a local context (ISO2 country code).

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

[USES 10 UNITS PER NAME] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.

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

[USES 10 UNITS PER NAME] Infer the likely country of origin of up to 100 names, detecting automatically the cultural context.

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

<a name="parseName"></a>
# **parseName**
> PersonalNameParsedOut parseName(nameFull)

Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. 

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
String nameFull = "nameFull_example"; // String | 
try {
    PersonalNameParsedOut result = apiInstance.parseName(nameFull);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameFull** | **String**|  |

### Return type

[**PersonalNameParsedOut**](PersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseNameBatch"></a>
# **parseNameBatch**
> BatchPersonalNameParsedOut parseNameBatch(batchPersonalNameIn)

Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John.

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
    BatchPersonalNameParsedOut result = apiInstance.parseNameBatch(batchPersonalNameIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parseNameBatch");
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

<a name="parseNameGeo"></a>
# **parseNameGeo**
> PersonalNameParsedOut parseNameGeo(nameFull, countryIso2)

Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. For better accuracy, provide a geographic context.

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
String nameFull = "nameFull_example"; // String | 
String countryIso2 = "countryIso2_example"; // String | 
try {
    PersonalNameParsedOut result = apiInstance.parseNameGeo(nameFull, countryIso2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parseNameGeo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nameFull** | **String**|  |
 **countryIso2** | **String**|  |

### Return type

[**PersonalNameParsedOut**](PersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseNameGeoBatch"></a>
# **parseNameGeoBatch**
> BatchPersonalNameParsedOut parseNameGeoBatch(batchPersonalNameGeoIn)

Infer the likely first/last name structure of a name, ex. John Smith or SMITH, John or SMITH; John. Giving a local context improves precision. 

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
BatchPersonalNameGeoIn batchPersonalNameGeoIn = new BatchPersonalNameGeoIn(); // BatchPersonalNameGeoIn | A list of personal names
try {
    BatchPersonalNameParsedOut result = apiInstance.parseNameGeoBatch(batchPersonalNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#parseNameGeoBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameGeoIn** | [**BatchPersonalNameGeoIn**](BatchPersonalNameGeoIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameParsedOut**](BatchPersonalNameParsedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="religionFull"></a>
# **religionFull**
> PersonalNameReligionedOut religionFull(countryIso2, subDivisionIso31662, personalNameFull)

[USES 10 UNITS PER NAME] Infer the likely religion of a personal full name. NB: only for INDIA (as of current version).

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
String subDivisionIso31662 = "subDivisionIso31662_example"; // String | 
String personalNameFull = "personalNameFull_example"; // String | 
try {
    PersonalNameReligionedOut result = apiInstance.religionFull(countryIso2, subDivisionIso31662, personalNameFull);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#religionFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryIso2** | **String**|  |
 **subDivisionIso31662** | **String**|  |
 **personalNameFull** | **String**|  |

### Return type

[**PersonalNameReligionedOut**](PersonalNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="religionFullBatch"></a>
# **religionFullBatch**
> BatchPersonalNameReligionedOut religionFullBatch(batchPersonalNameGeoSubdivisionIn)

[USES 10 UNITS PER NAME] Infer the likely religion of up to 100 personal full names. NB: only for India as of currently.

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
BatchPersonalNameGeoSubdivisionIn batchPersonalNameGeoSubdivisionIn = new BatchPersonalNameGeoSubdivisionIn(); // BatchPersonalNameGeoSubdivisionIn | A list of personal names
try {
    BatchPersonalNameReligionedOut result = apiInstance.religionFullBatch(batchPersonalNameGeoSubdivisionIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#religionFullBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchPersonalNameGeoSubdivisionIn** | [**BatchPersonalNameGeoSubdivisionIn**](BatchPersonalNameGeoSubdivisionIn.md)| A list of personal names | [optional]

### Return type

[**BatchPersonalNameReligionedOut**](BatchPersonalNameReligionedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subclassification"></a>
# **subclassification**
> FirstLastNameGeoSubclassificationOut subclassification(countryIso2, firstName, lastName)

[USES 10 UNITS PER NAME] Infer the likely origin of a name at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).

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
    FirstLastNameGeoSubclassificationOut result = apiInstance.subclassification(countryIso2, firstName, lastName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#subclassification");
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

[**FirstLastNameGeoSubclassificationOut**](FirstLastNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subclassificationBatch"></a>
# **subclassificationBatch**
> BatchFirstLastNameGeoSubclassificationOut subclassificationBatch(batchFirstLastNameGeoIn)

[USES 10 UNITS PER NAME] Infer the likely origin of a list of up to 100 names at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).

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
    BatchFirstLastNameGeoSubclassificationOut result = apiInstance.subclassificationBatch(batchFirstLastNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#subclassificationBatch");
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

<a name="subclassificationFull"></a>
# **subclassificationFull**
> FirstLastNameGeoSubclassificationOut subclassificationFull(countryIso2, fullName)

[USES 10 UNITS PER NAME] Infer the likely origin of a name at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).

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
String fullName = "fullName_example"; // String | 
try {
    FirstLastNameGeoSubclassificationOut result = apiInstance.subclassificationFull(countryIso2, fullName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#subclassificationFull");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryIso2** | **String**|  |
 **fullName** | **String**|  |

### Return type

[**FirstLastNameGeoSubclassificationOut**](FirstLastNameGeoSubclassificationOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subclassificationFullBatch"></a>
# **subclassificationFullBatch**
> BatchPersonalNameGeoSubclassificationOut subclassificationFullBatch(batchPersonalNameGeoIn)

[USES 10 UNITS PER NAME] Infer the likely origin of a list of up to 100 names at a country subclassification level (state or regeion). Initially, this is only supported for India (ISO2 code &#39;IN&#39;).

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
BatchPersonalNameGeoIn batchPersonalNameGeoIn = new BatchPersonalNameGeoIn(); // BatchPersonalNameGeoIn | A list of personal names
try {
    BatchPersonalNameGeoSubclassificationOut result = apiInstance.subclassificationFullBatch(batchPersonalNameGeoIn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonalApi#subclassificationFullBatch");
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

<a name="usRaceEthnicity"></a>
# **usRaceEthnicity**
> FirstLastNameUSRaceEthnicityOut usRaceEthnicity(firstName, lastName)

[USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).

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

[USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).

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

[USES 10 UNITS PER NAME] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).

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

[USES 10 UNITS PER NAME] Infer up-to 100 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code. Output is W_NL (white, non latino), HL (hispano latino),  A (asian, non latino), B_NL (black, non latino). Optionally add header X-OPTION-USRACEETHNICITY-TAXONOMY: USRACEETHNICITY-6CLASSES for two additional classes, AI_AN (American Indian or Alaskan Native) and PI (Pacific Islander).

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

