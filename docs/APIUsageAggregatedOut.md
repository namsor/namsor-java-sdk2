
# APIUsageAggregatedOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeUnit** | **String** | Time unit is DAY, WEEK or MONTH depending on prior usage |  [optional]
**periodStart** | **Long** | Start datetime of the reporting period |  [optional]
**periodEnd** | **Long** | End datetime of the reporting period |  [optional]
**totalUsage** | **Long** | Total usage in the current period |  [optional]
**historyTruncated** | **Boolean** | If the history was truncaded due to data limit |  [optional]
**data** | [**List&lt;List&lt;Integer&gt;&gt;**](List.md) | Data points : usage per DAY, WEEK or MONTH and per apiService |  [optional]
**colHeaders** | **List&lt;String&gt;** | apiServices as column headers  |  [optional]
**rowHeaders** | **List&lt;String&gt;** | dates as row headers  |  [optional]



