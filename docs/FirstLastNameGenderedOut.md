
# FirstLastNameGenderedOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**script** | **String** |  |  [optional]
**id** | **String** |  |  [optional]
**firstName** | **String** | The first name (also known as given name) |  [optional]
**lastName** | **String** | The last name (also known as family name, or surname) |  [optional]
**likelyGender** | [**LikelyGenderEnum**](#LikelyGenderEnum) | Most likely gender |  [optional]
**genderScale** | **Double** | Compatibility to NamSor_v1 Gender Scale M[-1..U..+1]F value |  [optional]
**score** | **Double** | Compatibility to NamSor_v1 Gender score value. Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional]
**probabilityCalibrated** | **Double** | The calibrated probability for inferred gender to have been guessed correctly. |  [optional]


<a name="LikelyGenderEnum"></a>
## Enum: LikelyGenderEnum
Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
UNKNOWN | &quot;unknown&quot;



