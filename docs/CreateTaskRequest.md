

# CreateTaskRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Short title of the task |  |
|**description** | **String** | Longer description of the task |  [optional] |
|**assignee** | **String** | Email of the person assigned to the task |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | Priority level of the task |  [optional] |
|**dueDate** | **LocalDate** | Due date for the task (YYYY-MM-DD) |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |



