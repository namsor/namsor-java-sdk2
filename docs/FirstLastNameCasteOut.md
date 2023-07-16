

# FirstLastNameCasteOut

Represents the output of inferring the LIKELY caste from a personal Hindu/Indian name.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**firstName** | **String** | The first name (also known as given name) |  [optional] |
|**lastName** | **String** | The last name (also known as family name, or surname) |  [optional] |
|**caste** | **String** | Most likely caste |  [optional] |
|**casteAlt** | **String** | Second best alternative : caste |  [optional] |
|**casteTop** | **List&lt;String&gt;** | List caste(top 10) |  [optional] |
|**score** | **Double** | Compatibility to NamSor_v1 Origin score value. Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for caste to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for caste OR casteAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |



