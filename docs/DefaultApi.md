# DefaultApi

All URIs are relative to *https://api.taskmanager.example.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTaskComment**](DefaultApi.md#addTaskComment) | **POST** /tasks/{taskId}/comments | Add a comment to a task |
| [**createTask**](DefaultApi.md#createTask) | **POST** /tasks | Create a new task |
| [**deleteTask**](DefaultApi.md#deleteTask) | **DELETE** /tasks/{taskId} | Delete a task |
| [**getTaskById**](DefaultApi.md#getTaskById) | **GET** /tasks/{taskId} | Get a task by ID |
| [**listTasks**](DefaultApi.md#listTasks) | **GET** /tasks | List all tasks |
| [**updateTask**](DefaultApi.md#updateTask) | **PUT** /tasks/{taskId} | Update an existing task |



## addTaskComment

> addTaskComment(taskId, addTaskCommentRequest)

Add a comment to a task

Adds a new comment with optional tags to the specified task&#39;s activity log.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String taskId = "taskId_example"; // String | Unique ID of the task
        AddTaskCommentRequest addTaskCommentRequest = new AddTaskCommentRequest(); // AddTaskCommentRequest | 
        try {
            apiInstance.addTaskComment(taskId, addTaskCommentRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addTaskComment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| Unique ID of the task | |
| **addTaskCommentRequest** | [**AddTaskCommentRequest**](AddTaskCommentRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Comment added |  -  |


## createTask

> Task createTask(createTaskRequest)

Create a new task

Creates a new task with a title and optional description, assignee, priority and due date.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | 
        try {
            Task result = apiInstance.createTask(createTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)|  | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Task created |  -  |


## deleteTask

> deleteTask(taskId)

Delete a task

Permanently deletes a task by ID.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String taskId = "taskId_example"; // String | Unique ID of the task to delete
        try {
            apiInstance.deleteTask(taskId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| Unique ID of the task to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Task deleted successfully |  -  |


## getTaskById

> Task getTaskById(taskId)

Get a task by ID

Retrieves a single task by its unique identifier.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String taskId = "taskId_example"; // String | Unique ID of the task
        try {
            Task result = apiInstance.getTaskById(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTaskById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| Unique ID of the task | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task found |  -  |
| **404** | Task not found |  -  |


## listTasks

> ListTasks200Response listTasks(status, limit)

List all tasks

Returns tasks, optionally filtered by status, with an optional page-size limit.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String status = "OPEN"; // String | Filter tasks by status
        Integer limit = 20; // Integer | Maximum number of tasks to return
        try {
            ListTasks200Response result = apiInstance.listTasks(status, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listTasks");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | **String**| Filter tasks by status | [optional] [enum: OPEN, IN_PROGRESS, DONE] |
| **limit** | **Integer**| Maximum number of tasks to return | [optional] [default to 20] |

### Return type

[**ListTasks200Response**](ListTasks200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of tasks |  -  |


## updateTask

> Task updateTask(taskId, updateTaskRequest)

Update an existing task

Updates fields of an existing task, including its status and completion flag.

### Example

```java
// Import classes:
import com.probestack.sdk.ApiClient;
import com.probestack.sdk.ApiException;
import com.probestack.sdk.Configuration;
import com.probestack.sdk.models.*;
import com.probestack.sdk.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.taskmanager.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String taskId = "taskId_example"; // String | Unique ID of the task to update
        UpdateTaskRequest updateTaskRequest = new UpdateTaskRequest(); // UpdateTaskRequest | 
        try {
            Task result = apiInstance.updateTask(taskId, updateTaskRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateTask");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**| Unique ID of the task to update | |
| **updateTaskRequest** | [**UpdateTaskRequest**](UpdateTaskRequest.md)|  | |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task updated |  -  |

