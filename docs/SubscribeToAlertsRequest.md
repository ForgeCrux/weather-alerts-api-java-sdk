

# SubscribeToAlertsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address to notify |  |
|**region** | **String** | Region name or code to watch |  |
|**minSeverity** | [**MinSeverityEnum**](#MinSeverityEnum) | Only notify for alerts at or above this severity |  [optional] |



## Enum: MinSeverityEnum

| Name | Value |
|---- | -----|
| MINOR | &quot;MINOR&quot; |
| MODERATE | &quot;MODERATE&quot; |
| SEVERE | &quot;SEVERE&quot; |
| EXTREME | &quot;EXTREME&quot; |



