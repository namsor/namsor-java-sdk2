

# FirstLastNameGeoOut

Represents the output of inferring the LIKELY country of Origin from a personal name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**firstName** | **String** | The first name (also known as given name) |  [optional] |
|**lastName** | **String** | The last name (also known as family name, or surname) |  [optional] |
|**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**country** | **String** | Most likely country  |  [optional] |
|**countryAlt** | **String** | Second best alternative : country  |  [optional] |
|**region** | **String** | Most likely region (based on country ISO2 code) |  [optional] |
|**topRegion** | **String** | Most likely top region (based on country ISO2 code) |  [optional] |
|**subRegion** | **String** | Most likely sub region (based on country ISO2 code) |  [optional] |
|**countriesTop** | **List&lt;String&gt;** | List countries (top 10) |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**religionStats** | [**List&lt;ReligionStatOut&gt;**](ReligionStatOut.md) | Geographic religious statistics, assuming country is correctly predicted. |  [optional] |
|**religionStatsAlt** | [**List&lt;ReligionStatOut&gt;**](ReligionStatOut.md) | Geographic religious statistics, for country best alternative. |  [optional] |



