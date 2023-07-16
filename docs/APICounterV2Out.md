

# APICounterV2Out

Detailed usage as reported by the deduplicating API counter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | [**APIKeyOut**](APIKeyOut.md) |  |  [optional] |
|**apiService** | **String** | The apiService corresponds to the classifier name. |  [optional] |
|**hostAddress** | **String** | The processing hostAddress. |  [optional] |
|**createdDateTime** | **Long** | The create datetime of the counter. |  [optional] |
|**totalUsage** | **Long** | The usage of the counter. |  [optional] |
|**lastFlushedDateTime** | **Long** | The flush datetime of the counter. |  [optional] |
|**lastUsedDateTime** | **Long** | The last usage datetime of the counter. |  [optional] |
|**serviceFeaturesUsage** | **Map&lt;String, Long&gt;** | Usage of special features, such as Chinese, Japanese. |  [optional] |



