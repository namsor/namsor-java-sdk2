

# APIBillingPeriodUsageOut

The current billing period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** | User API Key. |  [optional] |
|**subscriptionStarted** | **Long** | Datetime when the user subscribed to the plan. |  [optional] |
|**periodStarted** | **Long** | Datetime when the the plan&#39;s current period started. |  [optional] |
|**periodEnded** | **Long** | Datetime when the the plan&#39;s current period endend. |  [optional] |
|**stripeCurrentPeriodEnd** | **Long** | Datetime when the the plan&#39;s current period endend (in Stripe). Internal and Stripe periodicity should ~coincide. |  [optional] |
|**stripeCurrentPeriodStart** | **Long** | Datetime when the the plan&#39;s current period started (in Stripe). Internal and Stripe periodicity should ~coincide. |  [optional] |
|**billingStatus** | **String** | Current period billing status ex OPEN. |  [optional] |
|**usage** | **Long** | Current period usage in units (NB some API endpoints use more than one unit). |  [optional] |
|**softLimit** | **Long** | Current period soft limit (reaching the limit sends an email notification). |  [optional] |
|**hardLimit** | **Long** | Current period hard limit (reaching the limit sends an email notification and blocks the API Key). |  [optional] |



