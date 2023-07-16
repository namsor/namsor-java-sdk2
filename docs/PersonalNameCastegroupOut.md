

# PersonalNameCastegroupOut

Caste group-coded names

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**name** | **String** | The input name. |  [optional] |
|**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**castegroup** | **String** | Most likely caste group |  [optional] |
|**castegroupAlt** | **String** | Second best alternative : caste group  |  [optional] |
|**castegroupTop** | **List&lt;String&gt;** | List caste group (top 10) |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |



