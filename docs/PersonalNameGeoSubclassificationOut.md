

# PersonalNameGeoSubclassificationOut

Classified names at sub country level (region or state)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**script** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**explanation** | **String** |  |  [optional] |
|**name** | **String** | The input name. |  [optional] |
|**countryIso2** | **String** | The input country ISO2 code |  [optional] |
|**subClassification** | **String** | Most likely subclassification ISO_3166-2 code |  [optional] |
|**subClassificationAlt** | **String** | Second best alternative : subclassification ISO_3166-2 code |  [optional] |
|**subclassificationTop** | **List&lt;String&gt;** | List subclassification ISO_3166-2 codes (top 10) |  [optional] |
|**score** | **Double** | Compatibility to NamSor_v1 Origin score value. Higher score is better, but score is not normalized. Use calibratedProbability if available.  |  [optional] |
|**probabilityCalibrated** | **Double** | The calibrated probability for subclassification to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |
|**probabilityAltCalibrated** | **Double** | The calibrated probability for subclassification OR subclassificationAlt to have been guessed correctly. -1 &#x3D; still calibrating.  |  [optional] |



