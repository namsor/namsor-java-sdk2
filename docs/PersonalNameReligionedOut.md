

# PersonalNameReligionedOut

religious-coded names

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**name** | **String** | The input name. |  [optional] |
|**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**religion** | **String** | Most likely religion |  [optional] |
|**religionAlt** | **String** | Second best alternative : religion  |  [optional] |
|**religionsTop** | **List&lt;String&gt;** | List countries (top 10) |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for country to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for country OR countryAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |



