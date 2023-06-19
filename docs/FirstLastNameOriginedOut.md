
# FirstLastNameOriginedOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**explanation** | **String** |  |  [optional]
**firstName** | **String** | The first name (also known as given name) |  [optional]
**lastName** | **String** | The last name (also known as family name, or surname) |  [optional]
**countryOrigin** | **String** | Most likely country of Origin |  [optional]
**countryOriginAlt** | **String** | Second best alternative : country of Origin |  [optional]
**countriesOriginTop** | **List&lt;String&gt;** | List countries of Origin (top 10) |  [optional]
**score** | **Double** | Compatibility to NamSor_v1 Origin score value. Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional]
**regionOrigin** | **String** | Most likely region of Origin (based on countryOrigin ISO2 code) |  [optional]
**topRegionOrigin** | **String** | Most likely top region of Origin (based on countryOrigin ISO2 code) |  [optional]
**subRegionOrigin** | **String** | Most likely sub region of Origin (based on countryOrigin ISO2 code) |  [optional]
**probabilityCalibrated** | **Double** | The calibrated probability for countryOrigin to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional]
**probabilityAltCalibrated** | **Double** | The calibrated probability for countryOrigin OR countryOriginAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional]
**religionStats** | [**List&lt;ReligionStatOut&gt;**](ReligionStatOut.md) | Geographic religious statistics, assuming country of origin is correctly predicted. |  [optional]
**religionStatsAlt** | [**List&lt;ReligionStatOut&gt;**](ReligionStatOut.md) | Geographic religious statistics, assuming country of origin OR best alternative is correctly predicted. |  [optional]



