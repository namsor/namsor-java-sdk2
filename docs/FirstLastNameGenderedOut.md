
# FirstLastNameGenderedOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**likelyGender** | [**LikelyGenderEnum**](#LikelyGenderEnum) | Most likely gender |  [optional]
**genderScale** | **Double** | Compatibility to NamSor_v1 Gender Scale M[-1..U..+1]F value |  [optional]
**score** | **Double** |  |  [optional]
**probabilityCalibrated** | **Double** |  |  [optional]


<a name="LikelyGenderEnum"></a>
## Enum: LikelyGenderEnum
Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
UNKNOWN | &quot;unknown&quot;



