# AdminApi

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCredits**](AdminApi.md#addCredits) | **GET** /api2/json/addCredits/{apiKey}/{usageCredits}/{userMessage} | Add usage credits to an API Key.
[**anonymize**](AdminApi.md#anonymize) | **GET** /api2/json/anonymize/{source}/{anonymized} | Activate/deactivate anonymization for a source.
[**apiUsage**](AdminApi.md#apiUsage) | **GET** /api2/json/apiUsage | Print current API usage.
[**apiUsageHistory**](AdminApi.md#apiUsageHistory) | **GET** /api2/json/apiUsageHistory | Print historical API usage.
[**apiUsageHistoryAggregate**](AdminApi.md#apiUsageHistoryAggregate) | **GET** /api2/json/apiUsageHistoryAggregate | Print historical API usage (in an aggregated view, by service, by day/hour/min).
[**availablePlans**](AdminApi.md#availablePlans) | **GET** /api2/json/availablePlans | List all available plans in the default currency (usd).
[**availablePlans1**](AdminApi.md#availablePlans1) | **GET** /api2/json/availablePlans/{token} | List all available plans in the user&#39;s preferred currency.
[**availableServices**](AdminApi.md#availableServices) | **GET** /api2/json/apiServices | List of API services and usage cost in Units (default is 1&#x3D;ONE Unit).
[**billingCurrencies**](AdminApi.md#billingCurrencies) | **GET** /api2/json/billingCurrencies | List possible currency options for billing (USD, EUR, GBP, ...)
[**billingHistory**](AdminApi.md#billingHistory) | **GET** /api2/json/billingHistory/{token} | Read the history billing information (invoices paid via Stripe or manually).
[**billingInfo**](AdminApi.md#billingInfo) | **GET** /api2/json/billingInfo/{token} | Read the billing information (company name, address, phone, vat ID)
[**charge**](AdminApi.md#charge) | **POST** /api2/json/charge | Create a Stripe Customer, based on a payment card token (from secure StripeJS) and email.
[**corporateKey**](AdminApi.md#corporateKey) | **GET** /api2/json/corporateKey/{apiKey}/{corporate} | Setting an API Key to a corporate status.
[**debugLevel**](AdminApi.md#debugLevel) | **GET** /api2/json/debugLevel/{logger}/{level} | Update debug level for a classifier
[**flush**](AdminApi.md#flush) | **GET** /api2/json/flush | Flush counters.
[**invalidateCache**](AdminApi.md#invalidateCache) | **GET** /api2/json/invalidateCache | Invalidate system caches.
[**learnable**](AdminApi.md#learnable) | **GET** /api2/json/learnable/{source}/{learnable} | Activate/deactivate learning from a source.
[**namsorCounter**](AdminApi.md#namsorCounter) | **GET** /api2/json/namsorCounter | Get the overall API counter
[**paymentInfo**](AdminApi.md#paymentInfo) | **GET** /api2/json/paymentInfo/{token} | Get the Stripe payment information associated with the current google auth session token.
[**procureKey**](AdminApi.md#procureKey) | **GET** /api2/json/procureKey/{token} | Procure an API Key (sent via Email), based on an auth token. Keep your API Key secret.
[**redeployUI**](AdminApi.md#redeployUI) | **GET** /api2/json/redeployUI/{live} | Redeploy UI from current dev branch.
[**redeployUI1**](AdminApi.md#redeployUI1) | **GET** /api2/json/redeployUI | Redeploy UI from current dev branch.
[**removeUserAccount**](AdminApi.md#removeUserAccount) | **GET** /api2/json/removeUserAccount/{token} | Remove the user account.
[**removeUserAccountOnBehalf**](AdminApi.md#removeUserAccountOnBehalf) | **GET** /api2/json/removeUserAccountOnBehalf/{apiKey} | Remove (on behalf) a user account.
[**shutdown**](AdminApi.md#shutdown) | **GET** /api2/json/shutdown | Stop learning and shutdown system.
[**softwareVersion**](AdminApi.md#softwareVersion) | **GET** /api2/json/softwareVersion | Get the current software version
[**sourceStats**](AdminApi.md#sourceStats) | **GET** /api2/json/sourceStats/{source} | Print basic source statistics.
[**stats**](AdminApi.md#stats) | **GET** /api2/json/stats | Print basic system statistics.
[**stripeConnect**](AdminApi.md#stripeConnect) | **GET** /api2/json/stripeConnect | Connects a Stripe Account.
[**subscribePlan**](AdminApi.md#subscribePlan) | **GET** /api2/json/subscribePlan/{planName}/{token} | Subscribe to a give API plan, using the user&#39;s preferred or default currency.
[**subscribePlanOnBehalf**](AdminApi.md#subscribePlanOnBehalf) | **GET** /api2/json/subscribePlanOnBehalf/{planName}/{apiKey} | Subscribe to a give API plan, using the user&#39;s preferred or default currency (admin only).
[**updateBillingInfo**](AdminApi.md#updateBillingInfo) | **POST** /api2/json/updateBillingInfo/{token} | Sets or update the billing information (company name, address, phone, vat ID)
[**updateLimit**](AdminApi.md#updateLimit) | **GET** /api2/json/updateLimit/{usageLimit}/{hardOrSoft}/{token} | Modifies the hard/soft limit on the API plan&#39;s overages (default is 0$ soft limit).
[**updatePaymentDefault**](AdminApi.md#updatePaymentDefault) | **GET** /api2/json/updatePaymentDefault/{defautSourceId}/{token} | Update the default Stripe card associated with the current google auth session token.
[**userInfo**](AdminApi.md#userInfo) | **GET** /api2/json/userInfo/{token} | Get the user profile associated with the current google auth session token.
[**verifyEmail**](AdminApi.md#verifyEmail) | **GET** /api2/json/verifyEmail/{emailToken} | Verifies an email, based on token sent to that email
[**verifyRemoveEmail**](AdminApi.md#verifyRemoveEmail) | **GET** /api2/json/verifyRemoveEmail/{emailToken} | Verifies an email, based on token sent to that email
[**vet**](AdminApi.md#vet) | **GET** /api2/json/vetting/{source}/{vetted} | Vetting of a source.


<a name="addCredits"></a>
# **addCredits**
> SystemMetricsOut addCredits(apiKey, usageCredits, userMessage)

Add usage credits to an API Key.

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
String apiKey = "apiKey_example"; // String | 
Long usageCredits = 56L; // Long | 
String userMessage = "userMessage_example"; // String | 
try {
    SystemMetricsOut result = apiInstance.addCredits(apiKey, usageCredits, userMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#addCredits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **usageCredits** | **Long**|  |
 **userMessage** | **String**|  |

### Return type

[**SystemMetricsOut**](SystemMetricsOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="anonymize"></a>
# **anonymize**
> anonymize(source, anonymized)

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
try {
    apiInstance.anonymize(source, anonymized);
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

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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
> APIPeriodUsageOut apiUsageHistory()

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
    APIPeriodUsageOut result = apiInstance.apiUsageHistory();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiUsageHistory");
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

<a name="apiUsageHistoryAggregate"></a>
# **apiUsageHistoryAggregate**
> APIPeriodUsageOut apiUsageHistoryAggregate()

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
    APIPeriodUsageOut result = apiInstance.apiUsageHistoryAggregate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#apiUsageHistoryAggregate");
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

<a name="availablePlans"></a>
# **availablePlans**
> APIPlansOut availablePlans()

List all available plans in the default currency (usd).

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
    APIPlansOut result = apiInstance.availablePlans();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#availablePlans");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIPlansOut**](APIPlansOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="availablePlans1"></a>
# **availablePlans1**
> APIPlansOut availablePlans1(token)

List all available plans in the user&#39;s preferred currency.

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
String token = "token_example"; // String | 
try {
    APIPlansOut result = apiInstance.availablePlans1(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#availablePlans1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**APIPlansOut**](APIPlansOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="availableServices"></a>
# **availableServices**
> APIPlansOut availableServices()

List of API services and usage cost in Units (default is 1&#x3D;ONE Unit).

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
    APIPlansOut result = apiInstance.availableServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#availableServices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIPlansOut**](APIPlansOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingCurrencies"></a>
# **billingCurrencies**
> CurrenciesOut billingCurrencies()

List possible currency options for billing (USD, EUR, GBP, ...)

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
    CurrenciesOut result = apiInstance.billingCurrencies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#billingCurrencies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrenciesOut**](CurrenciesOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingHistory"></a>
# **billingHistory**
> BillingHistoryOut billingHistory(token)

Read the history billing information (invoices paid via Stripe or manually).

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
String token = "token_example"; // String | 
try {
    BillingHistoryOut result = apiInstance.billingHistory(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#billingHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**BillingHistoryOut**](BillingHistoryOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="billingInfo"></a>
# **billingInfo**
> BillingInfoInOut billingInfo(token)

Read the billing information (company name, address, phone, vat ID)

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
String token = "token_example"; // String | 
try {
    BillingInfoInOut result = apiInstance.billingInfo(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#billingInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**BillingInfoInOut**](BillingInfoInOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="charge"></a>
# **charge**
> APIKeyOut charge(inlineObject)

Create a Stripe Customer, based on a payment card token (from secure StripeJS) and email.

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
InlineObject inlineObject = new InlineObject(); // InlineObject | 
try {
    APIKeyOut result = apiInstance.charge(inlineObject);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#charge");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="corporateKey"></a>
# **corporateKey**
> corporateKey(apiKey, corporate)

Setting an API Key to a corporate status.

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
String apiKey = "apiKey_example"; // String | 
Boolean corporate = true; // Boolean | 
try {
    apiInstance.corporateKey(apiKey, corporate);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#corporateKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |
 **corporate** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="debugLevel"></a>
# **debugLevel**
> debugLevel(logger, level)

Update debug level for a classifier

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
String logger = "logger_example"; // String | 
String level = "level_example"; // String | 
try {
    apiInstance.debugLevel(logger, level);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#debugLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **logger** | **String**|  |
 **level** | **String**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="flush"></a>
# **flush**
> flush()

Flush counters.

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
    apiInstance.flush();
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#flush");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="invalidateCache"></a>
# **invalidateCache**
> invalidateCache()

Invalidate system caches.

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
    apiInstance.invalidateCache();
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#invalidateCache");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="learnable"></a>
# **learnable**
> learnable(source, learnable)

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
String source = "source_example"; // String | 
Boolean learnable = true; // Boolean | 
try {
    apiInstance.learnable(source, learnable);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#learnable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |
 **learnable** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="namsorCounter"></a>
# **namsorCounter**
> SoftwareVersionOut namsorCounter()

Get the overall API counter

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
    SoftwareVersionOut result = apiInstance.namsorCounter();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#namsorCounter");
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

<a name="paymentInfo"></a>
# **paymentInfo**
> APIKeyOut paymentInfo(token)

Get the Stripe payment information associated with the current google auth session token.

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
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.paymentInfo(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#paymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="procureKey"></a>
# **procureKey**
> APIKeyOut procureKey(token)

Procure an API Key (sent via Email), based on an auth token. Keep your API Key secret.

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
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.procureKey(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#procureKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redeployUI"></a>
# **redeployUI**
> redeployUI(live)

Redeploy UI from current dev branch.

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
Boolean live = true; // Boolean | 
try {
    apiInstance.redeployUI(live);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#redeployUI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **live** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="redeployUI1"></a>
# **redeployUI1**
> redeployUI1()

Redeploy UI from current dev branch.

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
    apiInstance.redeployUI1();
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#redeployUI1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeUserAccount"></a>
# **removeUserAccount**
> APIPlanSubscriptionOut removeUserAccount(token)

Remove the user account.

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
String token = "token_example"; // String | 
try {
    APIPlanSubscriptionOut result = apiInstance.removeUserAccount(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#removeUserAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**APIPlanSubscriptionOut**](APIPlanSubscriptionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeUserAccountOnBehalf"></a>
# **removeUserAccountOnBehalf**
> APIPlanSubscriptionOut removeUserAccountOnBehalf(apiKey)

Remove (on behalf) a user account.

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
String apiKey = "apiKey_example"; // String | 
try {
    APIPlanSubscriptionOut result = apiInstance.removeUserAccountOnBehalf(apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#removeUserAccountOnBehalf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**|  |

### Return type

[**APIPlanSubscriptionOut**](APIPlanSubscriptionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="shutdown"></a>
# **shutdown**
> shutdown()

Stop learning and shutdown system.

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
    apiInstance.shutdown();
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#shutdown");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

<a name="sourceStats"></a>
# **sourceStats**
> SystemMetricsOut sourceStats(source)

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
String source = "source_example"; // String | 
try {
    SystemMetricsOut result = apiInstance.sourceStats(source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#sourceStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |

### Return type

[**SystemMetricsOut**](SystemMetricsOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stats"></a>
# **stats**
> SystemMetricsOut stats()

Print basic system statistics.

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
    SystemMetricsOut result = apiInstance.stats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#stats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemMetricsOut**](SystemMetricsOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stripeConnect"></a>
# **stripeConnect**
> stripeConnect(scope, code, error, errorDescription)

Connects a Stripe Account.

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
String scope = "scope_example"; // String | 
String code = "code_example"; // String | 
String error = "error_example"; // String | 
String errorDescription = "errorDescription_example"; // String | 
try {
    apiInstance.stripeConnect(scope, code, error, errorDescription);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#stripeConnect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**|  | [optional]
 **code** | **String**|  | [optional]
 **error** | **String**|  | [optional]
 **errorDescription** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="subscribePlan"></a>
# **subscribePlan**
> APIPlanSubscriptionOut subscribePlan(planName, token)

Subscribe to a give API plan, using the user&#39;s preferred or default currency.

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
String planName = "planName_example"; // String | 
String token = "token_example"; // String | 
try {
    APIPlanSubscriptionOut result = apiInstance.subscribePlan(planName, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#subscribePlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planName** | **String**|  |
 **token** | **String**|  |

### Return type

[**APIPlanSubscriptionOut**](APIPlanSubscriptionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscribePlanOnBehalf"></a>
# **subscribePlanOnBehalf**
> APIPlanSubscriptionOut subscribePlanOnBehalf(planName, apiKey)

Subscribe to a give API plan, using the user&#39;s preferred or default currency (admin only).

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
String planName = "planName_example"; // String | 
String apiKey = "apiKey_example"; // String | 
try {
    APIPlanSubscriptionOut result = apiInstance.subscribePlanOnBehalf(planName, apiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#subscribePlanOnBehalf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planName** | **String**|  |
 **apiKey** | **String**|  |

### Return type

[**APIPlanSubscriptionOut**](APIPlanSubscriptionOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBillingInfo"></a>
# **updateBillingInfo**
> BillingInfoInOut updateBillingInfo(token, billingInfoInOut)

Sets or update the billing information (company name, address, phone, vat ID)

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
String token = "token_example"; // String | 
BillingInfoInOut billingInfoInOut = new BillingInfoInOut(); // BillingInfoInOut | 
try {
    BillingInfoInOut result = apiInstance.updateBillingInfo(token, billingInfoInOut);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#updateBillingInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |
 **billingInfoInOut** | [**BillingInfoInOut**](BillingInfoInOut.md)|  | [optional]

### Return type

[**BillingInfoInOut**](BillingInfoInOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json;charset=UTF-8
 - **Accept**: application/json

<a name="updateLimit"></a>
# **updateLimit**
> APIPeriodUsageOut updateLimit(usageLimit, hardOrSoft, token)

Modifies the hard/soft limit on the API plan&#39;s overages (default is 0$ soft limit).

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
Integer usageLimit = 56; // Integer | 
Boolean hardOrSoft = true; // Boolean | 
String token = "token_example"; // String | 
try {
    APIPeriodUsageOut result = apiInstance.updateLimit(usageLimit, hardOrSoft, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#updateLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usageLimit** | **Integer**|  |
 **hardOrSoft** | **Boolean**|  |
 **token** | **String**|  |

### Return type

[**APIPeriodUsageOut**](APIPeriodUsageOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentDefault"></a>
# **updatePaymentDefault**
> APIKeyOut updatePaymentDefault(defautSourceId, token)

Update the default Stripe card associated with the current google auth session token.

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
String defautSourceId = "defautSourceId_example"; // String | 
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.updatePaymentDefault(defautSourceId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#updatePaymentDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defautSourceId** | **String**|  |
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userInfo"></a>
# **userInfo**
> APIKeyOut userInfo(token)

Get the user profile associated with the current google auth session token.

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
String token = "token_example"; // String | 
try {
    APIKeyOut result = apiInstance.userInfo(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#userInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyEmail"></a>
# **verifyEmail**
> APIKeyOut verifyEmail(emailToken)

Verifies an email, based on token sent to that email

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
String emailToken = "emailToken_example"; // String | 
try {
    APIKeyOut result = apiInstance.verifyEmail(emailToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#verifyEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailToken** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyRemoveEmail"></a>
# **verifyRemoveEmail**
> APIKeyOut verifyRemoveEmail(emailToken)

Verifies an email, based on token sent to that email

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
String emailToken = "emailToken_example"; // String | 
try {
    APIKeyOut result = apiInstance.verifyRemoveEmail(emailToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#verifyRemoveEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailToken** | **String**|  |

### Return type

[**APIKeyOut**](APIKeyOut.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="vet"></a>
# **vet**
> vet(source, vetted)

Vetting of a source.

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
Boolean vetted = true; // Boolean | 
try {
    apiInstance.vet(source, vetted);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#vet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |
 **vetted** | **Boolean**|  |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

