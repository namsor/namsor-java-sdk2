# AdminApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anonymize**](AdminApi.md#anonymize) | **GET** /api2/json/anonymize/{source}/{anonymized}/{token} | Activate/deactivate anonymization for a source.
[**apiKeyInfo**](AdminApi.md#apiKeyInfo) | **GET** /api2/json/apiKeyInfo | Read API Key info.
[**apiStatus**](AdminApi.md#apiStatus) | **GET** /api2/json/apiStatus | Prints the current status of the classifiers. A classifier name in apiStatus corresponds to a service name in apiServices.
[**apiUsage**](AdminApi.md#apiUsage) | **GET** /api2/json/apiUsage | Print current API usage.
[**apiUsageHistory**](AdminApi.md#apiUsageHistory) | **GET** /api2/json/apiUsageHistory | Print historical API usage.
[**apiUsageHistoryAggregate**](AdminApi.md#apiUsageHistoryAggregate) | **GET** /api2/json/apiUsageHistoryAggregate | Print historical API usage (in an aggregated view, by service, by day/hour/min).
[**availableServices**](AdminApi.md#availableServices) | **GET** /api2/json/apiServices | List of classification services and usage cost in Units per classification (default is 1&#x3D;ONE Unit). Some API endpoints (ex. Corridor) combine multiple classifiers.
[**learnable**](AdminApi.md#learnable) | **GET** /api2/json/learnable/{source}/{learnable}/{token} | Activate/deactivate learning from a source.
[**regions**](AdminApi.md#regions) | **GET** /api2/json/regions | Print basic source statistics.
[**softwareVersion**](AdminApi.md#softwareVersion) | **GET** /api2/json/softwareVersion | Get the current software version
[**taxonomyClasses**](AdminApi.md#taxonomyClasses) | **GET** /api2/json/taxonomyClasses/{classifierName} | Print the taxonomy classes valid for the given classifier.


<a name="anonymize"></a>
# **anonymize**
> APIKeyOut anonymize(source, anonymized, token)

Activate/deactivate anonymization for a source.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String source = "source_example"; // String | 
Boolean anonymized = true; // Boolean | 
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.anonymize(source, anonymized, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#anonymize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |
 **anonymized** | **Boolean**|  |
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiKeyInfo"></a>
# **apiKeyInfo**
> APIKeyOut apiKeyInfo()

Read API Key info.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIKeyOut result = apiInstance.apiKeyInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiKeyInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiStatus"></a>
# **apiStatus**
> APIClassifiersStatusOut apiStatus()

Prints the current status of the classifiers. A classifier name in apiStatus corresponds to a service name in apiServices.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIClassifiersStatusOut result = apiInstance.apiStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIClassifiersStatusOut**](APIClassifiersStatusOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiUsage"></a>
# **apiUsage**
> APIPeriodUsageOut apiUsage()

Print current API usage.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIPeriodUsageOut result = apiInstance.apiUsage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiUsage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIPeriodUsageOut**](APIPeriodUsageOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiUsageHistory"></a>
# **apiUsageHistory**
> APIUsageHistoryOut apiUsageHistory()

Print historical API usage.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIUsageHistoryOut result = apiInstance.apiUsageHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiUsageHistory");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIUsageHistoryOut**](APIUsageHistoryOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiUsageHistoryAggregate"></a>
# **apiUsageHistoryAggregate**
> APIUsageAggregatedOut apiUsageHistoryAggregate()

Print historical API usage (in an aggregated view, by service, by day/hour/min).

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIUsageAggregatedOut result = apiInstance.apiUsageHistoryAggregate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiUsageHistoryAggregate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIUsageAggregatedOut**](APIUsageAggregatedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="availableServices"></a>
# **availableServices**
> APIServicesOut availableServices()

List of classification services and usage cost in Units per classification (default is 1&#x3D;ONE Unit). Some API endpoints (ex. Corridor) combine multiple classifiers.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    APIServicesOut result = apiInstance.availableServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#availableServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIServicesOut**](APIServicesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="learnable"></a>
# **learnable**
> APIKeyOut learnable(source, learnable, token)

Activate/deactivate learning from a source.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String source = "source_example"; // String | The API Key to set as learnable/non learnable.
Boolean learnable = true; // Boolean | 
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.learnable(source, learnable, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#learnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**| The API Key to set as learnable/non learnable. |
 **learnable** | **Boolean**|  |
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="regions"></a>
# **regions**
> RegionOut regions()

Print basic source statistics.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    RegionOut result = apiInstance.regions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#regions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RegionOut**](RegionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="softwareVersion"></a>
# **softwareVersion**
> SoftwareVersionOut softwareVersion()

Get the current software version

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
try {
    SoftwareVersionOut result = apiInstance.softwareVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#softwareVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SoftwareVersionOut**](SoftwareVersionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="taxonomyClasses"></a>
# **taxonomyClasses**
> APIClassifierTaxonomyOut taxonomyClasses(classifierName)

Print the taxonomy classes valid for the given classifier.

### Example
```java
// Import classes:
//import com.namsor.sdk2.invoke.ApiClient;
//import com.namsor.sdk2.invoke.ApiException;
//import com.namsor.sdk2.invoke.Configuration;
//import com.namsor.sdk2.invoke.auth.*;
//import com.namsor.sdk2.api.AdminApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

AdminApi apiInstance = new AdminApi();
String classifierName = "classifierName_example"; // String | 
try {
    APIClassifierTaxonomyOut result = apiInstance.taxonomyClasses(classifierName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#taxonomyClasses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classifierName** | **String**|  |

### Return type

[**APIClassifierTaxonomyOut**](APIClassifierTaxonomyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

