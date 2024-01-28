

# PersonalNameUSRaceEthnicityOut

Represents the output of inferring the LIKELY US 'race/ethnicity' from a personal name, given US country of residence and (optionally) a ZIP5 code.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**name** | **String** | The input name. |  [optional] |
|**raceEthnicityAlt** | [**RaceEthnicityAltEnum**](#RaceEthnicityAltEnum) | Second most likely US &#39;race&#39;/ethnicity |  [optional] |
|**raceEthnicity** | [**RaceEthnicityEnum**](#RaceEthnicityEnum) | Most likely US &#39;race&#39;/ethnicity |  [optional] |
|**score** | **Double** | Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**raceEthnicitiesTop** | **List&lt;String&gt;** | List &#39;race&#39;/ethnicities |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for raceEthnicity to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for raceEthnicity OR raceEthnicityAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |



## Enum: RaceEthnicityAltEnum

| Name | Value |
|---- | -----|
| W_NL | &quot;W_NL&quot; |
| HL | &quot;HL&quot; |
| A | &quot;A&quot; |
| B_NL | &quot;B_NL&quot; |
| AI_AN | &quot;AI_AN&quot; |
| PI | &quot;PI&quot; |



## Enum: RaceEthnicityEnum

| Name | Value |
|---- | -----|
| W_NL | &quot;W_NL&quot; |
| HL | &quot;HL&quot; |
| A | &quot;A&quot; |
| B_NL | &quot;B_NL&quot; |
| AI_AN | &quot;AI_AN&quot; |
| PI | &quot;PI&quot; |



