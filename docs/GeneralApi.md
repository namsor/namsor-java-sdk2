# GeneralApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**nameType**](GeneralApi.md#nameType) | **GET** /api2/json/nameType/{properNoun} | Infer the likely type of a proper noun (personal name, brand name, place name etc.) |
| [**nameTypeBatch**](GeneralApi.md#nameTypeBatch) | **POST** /api2/json/nameTypeBatch | Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.) |
| [**nameTypeGeo**](GeneralApi.md#nameTypeGeo) | **GET** /api2/json/nameTypeGeo/{properNoun}/{countryIso2} | Infer the likely type of a proper noun (personal name, brand name, place name etc.) |
| [**nameTypeGeoBatch**](GeneralApi.md#nameTypeGeoBatch) | **POST** /api2/json/nameTypeGeoBatch | Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.) |


<a id="nameType"></a>
# **nameType**
> ProperNounCategorizedOut nameType(properNoun)

Infer the likely type of a proper noun (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    String properNoun = "properNoun_example"; // String | 
    try {
      ProperNounCategorizedOut result = apiInstance.nameType(properNoun);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#nameType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **properNoun** | **String**|  | |

### Return type

[**ProperNounCategorizedOut**](ProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A typed name. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |

<a id="nameTypeBatch"></a>
# **nameTypeBatch**
> BatchProperNounCategorizedOut nameTypeBatch(batchNameIn)

Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    BatchNameIn batchNameIn = new BatchNameIn(); // BatchNameIn | A list of proper names
    try {
      BatchProperNounCategorizedOut result = apiInstance.nameTypeBatch(batchNameIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#nameTypeBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchNameIn** | [**BatchNameIn**](BatchNameIn.md)| A list of proper names | [optional] |

### Return type

[**BatchProperNounCategorizedOut**](BatchProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of commonTypeized names. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |
| **400** | Bad request (ex. too many names) |  -  |

<a id="nameTypeGeo"></a>
# **nameTypeGeo**
> ProperNounCategorizedOut nameTypeGeo(properNoun, countryIso2)

Infer the likely type of a proper noun (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    String properNoun = "properNoun_example"; // String | 
    String countryIso2 = "countryIso2_example"; // String | 
    try {
      ProperNounCategorizedOut result = apiInstance.nameTypeGeo(properNoun, countryIso2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#nameTypeGeo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **properNoun** | **String**|  | |
| **countryIso2** | **String**|  | |

### Return type

[**ProperNounCategorizedOut**](ProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A typed name. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |

<a id="nameTypeGeoBatch"></a>
# **nameTypeGeoBatch**
> BatchProperNounCategorizedOut nameTypeGeoBatch(batchNameGeoIn)

Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    BatchNameGeoIn batchNameGeoIn = new BatchNameGeoIn(); // BatchNameGeoIn | A list of proper names
    try {
      BatchProperNounCategorizedOut result = apiInstance.nameTypeGeoBatch(batchNameGeoIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#nameTypeGeoBatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchNameGeoIn** | [**BatchNameGeoIn**](BatchNameGeoIn.md)| A list of proper names | [optional] |

### Return type

[**BatchProperNounCategorizedOut**](BatchProperNounCategorizedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of commonTypeized names. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |
| **400** | Bad request (ex. too many names) |  -  |

