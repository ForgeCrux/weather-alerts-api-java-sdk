package com.probestack.sdk.api;

import com.probestack.sdk.ApiClient;
import com.probestack.sdk.BaseApi;

import com.probestack.sdk.model.AddTaskCommentRequest;
import com.probestack.sdk.model.CreateTaskRequest;
import com.probestack.sdk.model.ListTasks200Response;
import com.probestack.sdk.model.Task;
import com.probestack.sdk.model.UpdateTaskRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-09-02T04:51:02.135816264Z[GMT]", comments = "Generator version: 7.9.0")public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add a comment to a task
     * Adds a new comment with optional tags to the specified task&#39;s activity log.
     * <p><b>201</b> - Comment added
     * @param taskId Unique ID of the task (required)
     * @param addTaskCommentRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addTaskComment(String taskId, AddTaskCommentRequest addTaskCommentRequest) throws RestClientException {
        addTaskCommentWithHttpInfo(taskId, addTaskCommentRequest);
    }

    /**
     * Add a comment to a task
     * Adds a new comment with optional tags to the specified task&#39;s activity log.
     * <p><b>201</b> - Comment added
     * @param taskId Unique ID of the task (required)
     * @param addTaskCommentRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addTaskCommentWithHttpInfo(String taskId, AddTaskCommentRequest addTaskCommentRequest) throws RestClientException {
        Object localVarPostBody = addTaskCommentRequest;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling addTaskComment");
        }
        
        // verify the required parameter 'addTaskCommentRequest' is set
        if (addTaskCommentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addTaskCommentRequest' when calling addTaskComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tasks/{taskId}/comments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new task
     * Creates a new task with a title and optional description, assignee, priority and due date.
     * <p><b>201</b> - Task created
     * @param createTaskRequest  (required)
     * @return Task
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Task createTask(CreateTaskRequest createTaskRequest) throws RestClientException {
        return createTaskWithHttpInfo(createTaskRequest).getBody();
    }

    /**
     * Create a new task
     * Creates a new task with a title and optional description, assignee, priority and due date.
     * <p><b>201</b> - Task created
     * @param createTaskRequest  (required)
     * @return ResponseEntity&lt;Task&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Task> createTaskWithHttpInfo(CreateTaskRequest createTaskRequest) throws RestClientException {
        Object localVarPostBody = createTaskRequest;
        
        // verify the required parameter 'createTaskRequest' is set
        if (createTaskRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createTaskRequest' when calling createTask");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Task> localReturnType = new ParameterizedTypeReference<Task>() {};
        return apiClient.invokeAPI("/tasks", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a task
     * Permanently deletes a task by ID.
     * <p><b>204</b> - Task deleted successfully
     * @param taskId Unique ID of the task to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteTask(String taskId) throws RestClientException {
        deleteTaskWithHttpInfo(taskId);
    }

    /**
     * Delete a task
     * Permanently deletes a task by ID.
     * <p><b>204</b> - Task deleted successfully
     * @param taskId Unique ID of the task to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTaskWithHttpInfo(String taskId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling deleteTask");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/tasks/{taskId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a task by ID
     * Retrieves a single task by its unique identifier.
     * <p><b>200</b> - Task found
     * <p><b>404</b> - Task not found
     * @param taskId Unique ID of the task (required)
     * @return Task
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Task getTaskById(String taskId) throws RestClientException {
        return getTaskByIdWithHttpInfo(taskId).getBody();
    }

    /**
     * Get a task by ID
     * Retrieves a single task by its unique identifier.
     * <p><b>200</b> - Task found
     * <p><b>404</b> - Task not found
     * @param taskId Unique ID of the task (required)
     * @return ResponseEntity&lt;Task&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Task> getTaskByIdWithHttpInfo(String taskId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling getTaskById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Task> localReturnType = new ParameterizedTypeReference<Task>() {};
        return apiClient.invokeAPI("/tasks/{taskId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List all tasks
     * Returns tasks, optionally filtered by status, with an optional page-size limit.
     * <p><b>200</b> - A list of tasks
     * @param status Filter tasks by status (optional)
     * @param limit Maximum number of tasks to return (optional, default to 20)
     * @return ListTasks200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListTasks200Response listTasks(String status, Integer limit) throws RestClientException {
        return listTasksWithHttpInfo(status, limit).getBody();
    }

    /**
     * List all tasks
     * Returns tasks, optionally filtered by status, with an optional page-size limit.
     * <p><b>200</b> - A list of tasks
     * @param status Filter tasks by status (optional)
     * @param limit Maximum number of tasks to return (optional, default to 20)
     * @return ResponseEntity&lt;ListTasks200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListTasks200Response> listTasksWithHttpInfo(String status, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListTasks200Response> localReturnType = new ParameterizedTypeReference<ListTasks200Response>() {};
        return apiClient.invokeAPI("/tasks", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing task
     * Updates fields of an existing task, including its status and completion flag.
     * <p><b>200</b> - Task updated
     * @param taskId Unique ID of the task to update (required)
     * @param updateTaskRequest  (required)
     * @return Task
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Task updateTask(String taskId, UpdateTaskRequest updateTaskRequest) throws RestClientException {
        return updateTaskWithHttpInfo(taskId, updateTaskRequest).getBody();
    }

    /**
     * Update an existing task
     * Updates fields of an existing task, including its status and completion flag.
     * <p><b>200</b> - Task updated
     * @param taskId Unique ID of the task to update (required)
     * @param updateTaskRequest  (required)
     * @return ResponseEntity&lt;Task&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Task> updateTaskWithHttpInfo(String taskId, UpdateTaskRequest updateTaskRequest) throws RestClientException {
        Object localVarPostBody = updateTaskRequest;
        
        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskId' when calling updateTask");
        }
        
        // verify the required parameter 'updateTaskRequest' is set
        if (updateTaskRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTaskRequest' when calling updateTask");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taskId", taskId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Task> localReturnType = new ParameterizedTypeReference<Task>() {};
        return apiClient.invokeAPI("/tasks/{taskId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
