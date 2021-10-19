
# PersonalNameGeoOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**name** | **String** | The input name. |  [optional]
**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional]
**country** | **String** | Most likely country  |  [optional]
**countryAlt** | **String** | Second best alternative : country  |  [optional]
**region** | **String** | Most likely region (based on country ISO2 code) |  [optional]
**topRegion** | **String** | Most likely top region (based on country ISO2 code) |  [optional]
**subRegion** | **String** | Most likely sub region (based on country ISO2 code) |  [optional]
**countriesTop** | **List&lt;String&gt;** | List countries (top 10) |  [optional]
**probabilityCalibrated** | **Double** | The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional]
**probabilityAltCalibrated** | **Double** | The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional]



