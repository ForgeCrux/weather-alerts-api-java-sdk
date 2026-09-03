

# UpdateTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Updated title |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | New status for the task |  |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional] |
|**completed** | **Boolean** | Whether the task is fully completed |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| DONE | &quot;DONE&quot; |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



