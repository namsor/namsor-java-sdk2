# namsor-sdk2

NamSor API v2
- API version: 2.0.2-beta
  - Build date: 2019-01-18T02:05:58.814+01:00[Europe/Berlin]

NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 1000 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 

  For more information, please visit [http://www.namsor.com/](http://www.namsor.com/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.namsor</groupId>
  <artifactId>namsor-sdk2</artifactId>
  <version>2.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.namsor:namsor-sdk2:2.0.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/namsor-sdk2-2.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.namsor.sdk2.invoke.*;
import com.namsor.sdk2.invoke.auth.*;
import com.namsor.sdk2.model.*;
import com.namsor.sdk2.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://v2.namsor.com/NamSorAPIv2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**apiUsage**](docs/AdminApi.md#apiUsage) | **GET** /api2/json/apiUsage | Print current API usage.
*AdminApi* | [**apiUsageHistory**](docs/AdminApi.md#apiUsageHistory) | **GET** /api2/json/apiUsageHistory | Print historical API usage.
*AdminApi* | [**apiUsageHistoryAggregate**](docs/AdminApi.md#apiUsageHistoryAggregate) | **GET** /api2/json/apiUsageHistoryAggregate | Print historical API usage (in an aggregated view, by service, by day/hour/min).
*AdminApi* | [**availablePlans**](docs/AdminApi.md#availablePlans) | **GET** /api2/json/availablePlans | List all available plans in the default currency (usd).
*AdminApi* | [**availablePlans1**](docs/AdminApi.md#availablePlans1) | **GET** /api2/json/availablePlans/{token} | List all available plans in the user&#39;s preferred currency.
*AdminApi* | [**availableServices**](docs/AdminApi.md#availableServices) | **GET** /api2/json/apiServices | List of API services and usage cost in Units (default is 1&#x3D;ONE Unit).
*AdminApi* | [**billingCurrencies**](docs/AdminApi.md#billingCurrencies) | **GET** /api2/json/billingCurrencies | List possible currency options for billing (USD, EUR, GBP, ...)
*AdminApi* | [**billingHistory**](docs/AdminApi.md#billingHistory) | **GET** /api2/json/billingHistory/{token} | Read the history billing information (invoices paid via Stripe or manually).
*AdminApi* | [**billingInfo**](docs/AdminApi.md#billingInfo) | **GET** /api2/json/billingInfo/{token} | Read the billing information (company name, address, phone, vat ID)
*AdminApi* | [**charge**](docs/AdminApi.md#charge) | **POST** /api2/json/charge | Create a Stripe Customer, based on a payment card token (from secure StripeJS) and email.
*AdminApi* | [**corporateKey**](docs/AdminApi.md#corporateKey) | **GET** /api2/json/corporateKey/{apiKey}/{corporate} | Setting an API Key to a corporate status.
*AdminApi* | [**debugLevel**](docs/AdminApi.md#debugLevel) | **GET** /api2/json/debugLevel/{logger}/{level} | Update debug level for a classifier
*AdminApi* | [**invalidateCache**](docs/AdminApi.md#invalidateCache) | **GET** /api2/json/invalidateCache | Invalidate system caches.
*AdminApi* | [**namsorCounter**](docs/AdminApi.md#namsorCounter) | **GET** /api2/json/namsorCounter | Get the overall API counter
*AdminApi* | [**paymentInfo**](docs/AdminApi.md#paymentInfo) | **GET** /api2/json/paymentInfo/{token} | Get the Stripe payment information associated with the current google auth session token.
*AdminApi* | [**procureKey**](docs/AdminApi.md#procureKey) | **GET** /api2/json/procureKey/{token} | Procure an API Key (sent via Email), based on an auth token. Keep your API Key secret.
*AdminApi* | [**redeployUI**](docs/AdminApi.md#redeployUI) | **GET** /api2/json/redeployUI | Redeploy UI from current dev branch.
*AdminApi* | [**redeployUI1**](docs/AdminApi.md#redeployUI1) | **GET** /api2/json/redeployUI/{live} | Redeploy UI from current dev branch.
*AdminApi* | [**removeUserAccount**](docs/AdminApi.md#removeUserAccount) | **GET** /api2/json/removeUserAccount/{token} | Subscribe to a give API plan, using the user&#39;s preferred or default currency.
*AdminApi* | [**shutdown**](docs/AdminApi.md#shutdown) | **GET** /api2/json/shutdown | Stop learning and shutdown system.
*AdminApi* | [**softwareVersion**](docs/AdminApi.md#softwareVersion) | **GET** /api2/json/softwareVersion | Get the current software version
*AdminApi* | [**sourceStats**](docs/AdminApi.md#sourceStats) | **GET** /api2/json/sourceStats/{source} | Print basic source statistics.
*AdminApi* | [**stats**](docs/AdminApi.md#stats) | **GET** /api2/json/stats | Print basic system statistics.
*AdminApi* | [**stripeConnect**](docs/AdminApi.md#stripeConnect) | **GET** /api2/json/stripeConnect | Connects a Stripe Account.
*AdminApi* | [**subscribePlan**](docs/AdminApi.md#subscribePlan) | **GET** /api2/json/subscribePlan/{planName}/{token} | Subscribe to a give API plan, using the user&#39;s preferred or default currency.
*AdminApi* | [**updateBillingInfo**](docs/AdminApi.md#updateBillingInfo) | **POST** /api2/json/updateBillingInfo/{token} | Sets or update the billing information (company name, address, phone, vat ID)
*AdminApi* | [**updateLimit**](docs/AdminApi.md#updateLimit) | **GET** /api2/json/updateLimit/{usageLimit}/{hardOrSoft}/{token} | Modifies the hard/soft limit on the API plan&#39;s overages (default is 0$ soft limit).
*AdminApi* | [**updatePaymentDefault**](docs/AdminApi.md#updatePaymentDefault) | **GET** /api2/json/updatePaymentDefault/{defautSourceId}/{token} | Update the default Stripe card associated with the current google auth session token.
*AdminApi* | [**userInfo**](docs/AdminApi.md#userInfo) | **GET** /api2/json/userInfo/{token} | Get the user profile associated with the current google auth session token.
*AdminApi* | [**verifyEmail**](docs/AdminApi.md#verifyEmail) | **GET** /api2/json/verifyEmail/{emailToken} | Verifies an email, based on token sent to that email
*AdminApi* | [**verifyRemoveEmail**](docs/AdminApi.md#verifyRemoveEmail) | **GET** /api2/json/verifyRemoveEmail/{emailToken} | Verifies an email, based on token sent to that email
*AdminApi* | [**vet**](docs/AdminApi.md#vet) | **GET** /api2/json/vetting/{source}/{vetted} | Vetting of a source.
*ChineseApi* | [**chineseNameCandidates**](docs/ChineseApi.md#chineseNameCandidates) | **GET** /api2/json/chineseNameCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin} | Identify Chinese name candidates, based on the romanized name.
*ChineseApi* | [**chineseNameCandidatesBatch**](docs/ChineseApi.md#chineseNameCandidatesBatch) | **POST** /api2/json/chineseNameCandidatesBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).
*ChineseApi* | [**chineseNameCandidatesGenderBatch**](docs/ChineseApi.md#chineseNameCandidatesGenderBatch) | **POST** /api2/json/chineseNameCandidatesGenderBatch | Identify Chinese name candidates, based on the romanized name (firstName &#x3D; chineseGivenName; lastName&#x3D;chineseSurname).
*ChineseApi* | [**chineseNameGenderCandidates**](docs/ChineseApi.md#chineseNameGenderCandidates) | **GET** /api2/json/chineseNameGenderCandidates/{chineseSurnameLatin}/{chineseGivenNameLatin}/{knownGender} | Identify Chinese name candidates, based on the romanized name - having a known gender (&#39;male&#39; or &#39;female&#39;)
*PersonalApi* | [**country**](docs/PersonalApi.md#country) | **GET** /api2/json/country/{personalNameFull} | [USES 10 UNITS] Infer the likely country of residence of a personal full name, or one surname. Assumes names as they are in the country of residence OR the country of origin.
*PersonalApi* | [**countryBatch**](docs/PersonalApi.md#countryBatch) | **POST** /api2/json/countryBatch | [USES 10 UNITS] Infer the likely country of residence of up to 1000 personal full names, or surnames. Assumes names as they are in the country of residence OR the country of origin.
*PersonalApi* | [**diaspora**](docs/PersonalApi.md#diaspora) | **GET** /api2/json/diaspora/{countryIso2}/{firstName}/{lastName} | [USES 20 UNITS] Infer the likely ethnicity/diaspora of a personal name, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
*PersonalApi* | [**diasporaBatch**](docs/PersonalApi.md#diasporaBatch) | **POST** /api2/json/diasporaBatch | [USES 20 UNITS] Infer the likely ethnicity/diaspora of up to 1000 personal names, given a country of residence ISO2 code (ex. US, CA, AU, NZ etc.)
*PersonalApi* | [**gender**](docs/PersonalApi.md#gender) | **GET** /api2/json/gender/{firstName}/{lastName} | Infer the likely gender of a name.
*PersonalApi* | [**genderBatch**](docs/PersonalApi.md#genderBatch) | **POST** /api2/json/genderBatch | Infer the likely gender of up to 1000 names, detecting automatically the cultural context.
*PersonalApi* | [**genderFull**](docs/PersonalApi.md#genderFull) | **GET** /api2/json/genderFull/{fullName} | Infer the likely gender of a full name, ex. John H. Smith
*PersonalApi* | [**genderFullBatch**](docs/PersonalApi.md#genderFullBatch) | **POST** /api2/json/genderFullBatch | Infer the likely gender of up to 1000 full names, detecting automatically the cultural context.
*PersonalApi* | [**genderFullGeo**](docs/PersonalApi.md#genderFullGeo) | **GET** /api2/json/genderFullGeo/{fullName}/{countryIso2} | Infer the likely gender of a full name, given a local context (ISO2 country code).
*PersonalApi* | [**genderFullGeoBatch**](docs/PersonalApi.md#genderFullGeoBatch) | **POST** /api2/json/genderFullGeoBatch | Infer the likely gender of up to 1000 full names, with a given cultural context (country ISO2 code).
*PersonalApi* | [**genderGeo**](docs/PersonalApi.md#genderGeo) | **GET** /api2/json/genderGeo/{firstName}/{lastName}/{countryIso2} | Infer the likely gender of a name, given a local context (ISO2 country code).
*PersonalApi* | [**genderGeoBatch**](docs/PersonalApi.md#genderGeoBatch) | **POST** /api2/json/genderGeoBatch | Infer the likely gender of up to 1000 names, each given a local context (ISO2 country code).
*PersonalApi* | [**origin**](docs/PersonalApi.md#origin) | **GET** /api2/json/origin/{firstName}/{lastName} | [USES 10 UNITS] Infer the likely country of origin of a personal name. Assumes names as they are in the country of origin. For US, CA, AU, NZ and other melting-pots : use &#39;diaspora&#39; instead.
*PersonalApi* | [**originBatch**](docs/PersonalApi.md#originBatch) | **POST** /api2/json/originBatch | [USES 10 UNITS] Infer the likely country of origin of up to 1000 names, detecting automatically the cultural context.
*PersonalApi* | [**parsedGenderBatch**](docs/PersonalApi.md#parsedGenderBatch) | **POST** /api2/json/parsedGenderBatch | Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.
*PersonalApi* | [**parsedGenderGeoBatch**](docs/PersonalApi.md#parsedGenderGeoBatch) | **POST** /api2/json/parsedGenderGeoBatch | Infer the likely gender of up to 1000 fully parsed names, detecting automatically the cultural context.
*PersonalApi* | [**usRaceEthnicity**](docs/PersonalApi.md#usRaceEthnicity) | **GET** /api2/json/usRaceEthnicity/{firstName}/{lastName} | [USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy.
*PersonalApi* | [**usRaceEthnicityBatch**](docs/PersonalApi.md#usRaceEthnicityBatch) | **POST** /api2/json/usRaceEthnicityBatch | [USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy.
*PersonalApi* | [**usRaceEthnicityZIP5**](docs/PersonalApi.md#usRaceEthnicityZIP5) | **GET** /api2/json/usRaceEthnicityZIP5/{firstName}/{lastName}/{zip5Code} | [USES 10 UNITS] Infer a US resident&#39;s likely race/ethnicity according to US Census taxonomy, using (optional) ZIP5 code info.
*PersonalApi* | [**usZipRaceEthnicityBatch**](docs/PersonalApi.md#usZipRaceEthnicityBatch) | **POST** /api2/json/usZipRaceEthnicityBatch | [USES 10 UNITS] Infer up-to 1000 US resident&#39;s likely race/ethnicity according to US Census taxonomy, with (optional) ZIP code.
*SocialApi* | [**phonePrefix**](docs/SocialApi.md#phonePrefix) | **GET** /api2/json/phoneCode/{firstName}/{lastName}/{phoneNumber} | [USES 11 UNITS] Infer the likely country and phone prefix, given a personal name and formatted / unformatted phone number.
*SocialApi* | [**phonePrefixBatch**](docs/SocialApi.md#phonePrefixBatch) | **POST** /api2/json/phoneCodeBatch | [USES 11 UNITS] Infer the likely country and phone prefix, of up to 1000 personal names, detecting automatically the local context given a name and formatted / unformatted phone number.


## Documentation for Models

 - [APIBillingPeriodUsageOut](docs/APIBillingPeriodUsageOut.md)
 - [APICounterV2Out](docs/APICounterV2Out.md)
 - [APIKeyOut](docs/APIKeyOut.md)
 - [APIPeriodUsageOut](docs/APIPeriodUsageOut.md)
 - [APIPlanOut](docs/APIPlanOut.md)
 - [APIPlanSubscriptionOut](docs/APIPlanSubscriptionOut.md)
 - [APIPlansOut](docs/APIPlansOut.md)
 - [APIServiceOut](docs/APIServiceOut.md)
 - [APIServicesOut](docs/APIServicesOut.md)
 - [APIUsageAggregatedOut](docs/APIUsageAggregatedOut.md)
 - [BatchFirstLastNameDiasporaedOut](docs/BatchFirstLastNameDiasporaedOut.md)
 - [BatchFirstLastNameGenderIn](docs/BatchFirstLastNameGenderIn.md)
 - [BatchFirstLastNameGenderedOut](docs/BatchFirstLastNameGenderedOut.md)
 - [BatchFirstLastNameGeoIn](docs/BatchFirstLastNameGeoIn.md)
 - [BatchFirstLastNameGeoZippedIn](docs/BatchFirstLastNameGeoZippedIn.md)
 - [BatchFirstLastNameIn](docs/BatchFirstLastNameIn.md)
 - [BatchFirstLastNameOriginedOut](docs/BatchFirstLastNameOriginedOut.md)
 - [BatchFirstLastNamePhoneCodedOut](docs/BatchFirstLastNamePhoneCodedOut.md)
 - [BatchFirstLastNamePhoneNumberIn](docs/BatchFirstLastNamePhoneNumberIn.md)
 - [BatchFirstLastNameUSRaceEthnicityOut](docs/BatchFirstLastNameUSRaceEthnicityOut.md)
 - [BatchNameMatchCandidatesOut](docs/BatchNameMatchCandidatesOut.md)
 - [BatchParsedFullNameGeoIn](docs/BatchParsedFullNameGeoIn.md)
 - [BatchParsedFullNameIn](docs/BatchParsedFullNameIn.md)
 - [BatchPersonalNameGenderedOut](docs/BatchPersonalNameGenderedOut.md)
 - [BatchPersonalNameGeoIn](docs/BatchPersonalNameGeoIn.md)
 - [BatchPersonalNameGeoOut](docs/BatchPersonalNameGeoOut.md)
 - [BatchPersonalNameIn](docs/BatchPersonalNameIn.md)
 - [BillingHistoryOut](docs/BillingHistoryOut.md)
 - [BillingInfoInOut](docs/BillingInfoInOut.md)
 - [ClassifierMetricsOut](docs/ClassifierMetricsOut.md)
 - [CurrenciesOut](docs/CurrenciesOut.md)
 - [DeployUIOut](docs/DeployUIOut.md)
 - [ExpectedClassMetricsOut](docs/ExpectedClassMetricsOut.md)
 - [FirstLastNameDiasporaedOut](docs/FirstLastNameDiasporaedOut.md)
 - [FirstLastNameGenderIn](docs/FirstLastNameGenderIn.md)
 - [FirstLastNameGenderedOut](docs/FirstLastNameGenderedOut.md)
 - [FirstLastNameGeoIn](docs/FirstLastNameGeoIn.md)
 - [FirstLastNameGeoZippedIn](docs/FirstLastNameGeoZippedIn.md)
 - [FirstLastNameIn](docs/FirstLastNameIn.md)
 - [FirstLastNameOriginedOut](docs/FirstLastNameOriginedOut.md)
 - [FirstLastNamePhoneCodedOut](docs/FirstLastNamePhoneCodedOut.md)
 - [FirstLastNamePhoneNumberIn](docs/FirstLastNamePhoneNumberIn.md)
 - [FirstLastNameUSRaceEthnicityOut](docs/FirstLastNameUSRaceEthnicityOut.md)
 - [InlineObject](docs/InlineObject.md)
 - [InvoiceItemOut](docs/InvoiceItemOut.md)
 - [InvoiceOut](docs/InvoiceOut.md)
 - [NamSorCounterOut](docs/NamSorCounterOut.md)
 - [NameMatchCandidateOut](docs/NameMatchCandidateOut.md)
 - [NameMatchCandidatesOut](docs/NameMatchCandidatesOut.md)
 - [ParsedFullNameGeoIn](docs/ParsedFullNameGeoIn.md)
 - [ParsedFullNameIn](docs/ParsedFullNameIn.md)
 - [PersonalNameGenderedOut](docs/PersonalNameGenderedOut.md)
 - [PersonalNameGeoIn](docs/PersonalNameGeoIn.md)
 - [PersonalNameGeoOut](docs/PersonalNameGeoOut.md)
 - [PersonalNameIn](docs/PersonalNameIn.md)
 - [RomanizedNameOut](docs/RomanizedNameOut.md)
 - [SoftwareVersionOut](docs/SoftwareVersionOut.md)
 - [SourceDetailedMetricsOut](docs/SourceDetailedMetricsOut.md)
 - [SourceMetricsOut](docs/SourceMetricsOut.md)
 - [StripeCardOut](docs/StripeCardOut.md)
 - [StripeCustomerOut](docs/StripeCustomerOut.md)
 - [SystemMetricsOut](docs/SystemMetricsOut.md)
 - [UserInfoOut](docs/UserInfoOut.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: X-API-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@namsor.com

