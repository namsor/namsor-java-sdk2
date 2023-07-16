# SocialApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**phoneCode**](SocialApi.md#phoneCode) | **GET** /api2/json/phoneCode/{firstName}/{lastName}/{phoneNumber} | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number. |
| [**phoneCodeBatch**](SocialApi.md#phoneCodeBatch) | **POST** /api2/json/phoneCodeBatch | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, detecting automatically the local context given a name and formatted / unformatted phone number. |
| [**phoneCodeGeo**](SocialApi.md#phoneCodeGeo) | **GET** /api2/json/phoneCodeGeo/{firstName}/{lastName}/{phoneNumber}/{countryIso2} | [USES 11 UNITS PER NAME] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence). |
| [**phoneCodeGeoBatch**](SocialApi.md#phoneCodeGeoBatch) | **POST** /api2/json/phoneCodeGeoBatch | [USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, with a local context (ISO2 country of residence). |
| [**phoneCodeGeoFeedbackLoop**](SocialApi.md#phoneCodeGeoFeedbackLoop) | **GET** /api2/json/phoneCodeGeoFeedbackLoop/{firstName}/{lastName}/{phoneNumber}/{phoneNumberE164}/{countryIso2} | [CREDITS 1 UNIT] Feedback loop to better infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence). |


<a id="phoneCode"></a>
# **phoneCode**
> FirstLastNamePhoneCodedOut phoneCode(firstName, lastName, phoneNumber)

[USES 11 UNITS PER NAME] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.SocialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SocialApi apiInstance = new SocialApi(defaultClient);
    String firstName = "firstName_example"; // String | 
    String lastName = "lastName_example"; // String | 
    String phoneNumber = "phoneNumber_example"; // String | 
    try {
      FirstLastNamePhoneCodedOut result = apiInstance.phoneCode(firstName, lastName, phoneNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialApi#phoneCode");
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
| **firstName** | **String**|  | |
| **lastName** | **String**|  | |
| **phoneNumber** | **String**|  | |

### Return type

[**FirstLastNamePhoneCodedOut**](FirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A name with country and phone code. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |

<a id="phoneCodeBatch"></a>
# **phoneCodeBatch**
> BatchFirstLastNamePhoneCodedOut phoneCodeBatch(batchFirstLastNamePhoneNumberIn)

[USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.SocialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SocialApi apiInstance = new SocialApi(defaultClient);
    BatchFirstLastNamePhoneNumberIn batchFirstLastNamePhoneNumberIn = new BatchFirstLastNamePhoneNumberIn(); // BatchFirstLastNamePhoneNumberIn | A list of personal names
    try {
      BatchFirstLastNamePhoneCodedOut result = apiInstance.phoneCodeBatch(batchFirstLastNamePhoneNumberIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialApi#phoneCodeBatch");
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
| **batchFirstLastNamePhoneNumberIn** | [**BatchFirstLastNamePhoneNumberIn**](BatchFirstLastNamePhoneNumberIn.md)| A list of personal names | [optional] |

### Return type

[**BatchFirstLastNamePhoneCodedOut**](BatchFirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of genderized names. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |
| **400** | Bad request (ex. too many names) |  -  |

<a id="phoneCodeGeo"></a>
# **phoneCodeGeo**
> FirstLastNamePhoneCodedOut phoneCodeGeo(firstName, lastName, phoneNumber, countryIso2)

[USES 11 UNITS PER NAME] Infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.SocialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SocialApi apiInstance = new SocialApi(defaultClient);
    String firstName = "firstName_example"; // String | 
    String lastName = "lastName_example"; // String | 
    String phoneNumber = "phoneNumber_example"; // String | 
    String countryIso2 = "countryIso2_example"; // String | 
    try {
      FirstLastNamePhoneCodedOut result = apiInstance.phoneCodeGeo(firstName, lastName, phoneNumber, countryIso2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialApi#phoneCodeGeo");
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
| **firstName** | **String**|  | |
| **lastName** | **String**|  | |
| **phoneNumber** | **String**|  | |
| **countryIso2** | **String**|  | |

### Return type

[**FirstLastNamePhoneCodedOut**](FirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A name with country and phone code. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |

<a id="phoneCodeGeoBatch"></a>
# **phoneCodeGeoBatch**
> BatchFirstLastNamePhoneCodedOut phoneCodeGeoBatch(batchFirstLastNamePhoneNumberGeoIn)

[USES 11 UNITS PER NAME] Infer the likely country and phone prefix, of up to 100 personal names, with a local context (ISO2 country of residence).

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.SocialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SocialApi apiInstance = new SocialApi(defaultClient);
    BatchFirstLastNamePhoneNumberGeoIn batchFirstLastNamePhoneNumberGeoIn = new BatchFirstLastNamePhoneNumberGeoIn(); // BatchFirstLastNamePhoneNumberGeoIn | A list of personal names
    try {
      BatchFirstLastNamePhoneCodedOut result = apiInstance.phoneCodeGeoBatch(batchFirstLastNamePhoneNumberGeoIn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialApi#phoneCodeGeoBatch");
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
| **batchFirstLastNamePhoneNumberGeoIn** | [**BatchFirstLastNamePhoneNumberGeoIn**](BatchFirstLastNamePhoneNumberGeoIn.md)| A list of personal names | [optional] |

### Return type

[**BatchFirstLastNamePhoneCodedOut**](BatchFirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of genderized names. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |
| **400** | Bad request (ex. too many names) |  -  |

<a id="phoneCodeGeoFeedbackLoop"></a>
# **phoneCodeGeoFeedbackLoop**
> FirstLastNamePhoneCodedOut phoneCodeGeoFeedbackLoop(firstName, lastName, phoneNumber, phoneNumberE164, countryIso2)

[CREDITS 1 UNIT] Feedback loop to better infer the likely phone prefix, given a personal name and formatted / unformatted phone number, with a local context (ISO2 country of residence).

### Example
```java
// Import classes:
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.invoke.models.*;
import com.namsor.sdk2.api.SocialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://v2.namsor.com/NamSorAPIv2");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    SocialApi apiInstance = new SocialApi(defaultClient);
    String firstName = "firstName_example"; // String | 
    String lastName = "lastName_example"; // String | 
    String phoneNumber = "phoneNumber_example"; // String | 
    String phoneNumberE164 = "phoneNumberE164_example"; // String | 
    String countryIso2 = "countryIso2_example"; // String | 
    try {
      FirstLastNamePhoneCodedOut result = apiInstance.phoneCodeGeoFeedbackLoop(firstName, lastName, phoneNumber, phoneNumberE164, countryIso2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SocialApi#phoneCodeGeoFeedbackLoop");
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
| **firstName** | **String**|  | |
| **lastName** | **String**|  | |
| **phoneNumber** | **String**|  | |
| **phoneNumberE164** | **String**|  | |
| **countryIso2** | **String**|  | |

### Return type

[**FirstLastNamePhoneCodedOut**](FirstLastNamePhoneCodedOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A name with country and phone code. |  -  |
| **401** | Missing or incorrect API Key |  -  |
| **403** | Email not Verified, or API Limit Reached, or API Key Disabled |  -  |

