package com.probestack.sdk.api;

import com.probestack.sdk.ApiClient;
import com.probestack.sdk.BaseApi;

import com.probestack.sdk.model.AlertSubscription;
import java.math.BigDecimal;
import com.probestack.sdk.model.CurrentWeather;
import com.probestack.sdk.model.GetWeatherForecast200Response;
import com.probestack.sdk.model.ListActiveAlerts200Response;
import com.probestack.sdk.model.SubscribeToAlertsRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2026-09-21T06:27:09.379277030Z[GMT]", comments = "Generator version: 7.9.0")public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Get current weather for a location
     * Returns the current temperature, conditions, and wind for a latitude/longitude pair.
     * <p><b>200</b> - Current weather
     * @param lat Latitude of the location (required)
     * @param lon Longitude of the location (required)
     * @param units Unit system for the response (optional, default to METRIC)
     * @return CurrentWeather
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrentWeather getCurrentWeather(BigDecimal lat, BigDecimal lon, String units) throws RestClientException {
        return getCurrentWeatherWithHttpInfo(lat, lon, units).getBody();
    }

    /**
     * Get current weather for a location
     * Returns the current temperature, conditions, and wind for a latitude/longitude pair.
     * <p><b>200</b> - Current weather
     * @param lat Latitude of the location (required)
     * @param lon Longitude of the location (required)
     * @param units Unit system for the response (optional, default to METRIC)
     * @return ResponseEntity&lt;CurrentWeather&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CurrentWeather> getCurrentWeatherWithHttpInfo(BigDecimal lat, BigDecimal lon, String units) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lat' when calling getCurrentWeather");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lon' when calling getCurrentWeather");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lat", lat));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lon", lon));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "units", units));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CurrentWeather> localReturnType = new ParameterizedTypeReference<CurrentWeather>() {};
        return apiClient.invokeAPI("/weather/current", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a multi-day weather forecast
     * Returns a daily forecast for the given location for up to 14 days.
     * <p><b>200</b> - Forecast days
     * @param lat Latitude of the location (required)
     * @param lon Longitude of the location (required)
     * @param days Number of forecast days to return (1-14) (optional, default to 5)
     * @return GetWeatherForecast200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetWeatherForecast200Response getWeatherForecast(BigDecimal lat, BigDecimal lon, Integer days) throws RestClientException {
        return getWeatherForecastWithHttpInfo(lat, lon, days).getBody();
    }

    /**
     * Get a multi-day weather forecast
     * Returns a daily forecast for the given location for up to 14 days.
     * <p><b>200</b> - Forecast days
     * @param lat Latitude of the location (required)
     * @param lon Longitude of the location (required)
     * @param days Number of forecast days to return (1-14) (optional, default to 5)
     * @return ResponseEntity&lt;GetWeatherForecast200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetWeatherForecast200Response> getWeatherForecastWithHttpInfo(BigDecimal lat, BigDecimal lon, Integer days) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lat' when calling getWeatherForecast");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lon' when calling getWeatherForecast");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lat", lat));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lon", lon));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "days", days));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetWeatherForecast200Response> localReturnType = new ParameterizedTypeReference<GetWeatherForecast200Response>() {};
        return apiClient.invokeAPI("/weather/forecast", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List active weather alerts for a region
     * Returns currently active severe-weather alerts (storms, floods, heat) for a named region.
     * <p><b>200</b> - Active alerts
     * @param region Region name or code to check for active alerts (required)
     * @param severity Minimum severity to include (optional)
     * @return ListActiveAlerts200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListActiveAlerts200Response listActiveAlerts(String region, String severity) throws RestClientException {
        return listActiveAlertsWithHttpInfo(region, severity).getBody();
    }

    /**
     * List active weather alerts for a region
     * Returns currently active severe-weather alerts (storms, floods, heat) for a named region.
     * <p><b>200</b> - Active alerts
     * @param region Region name or code to check for active alerts (required)
     * @param severity Minimum severity to include (optional)
     * @return ResponseEntity&lt;ListActiveAlerts200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListActiveAlerts200Response> listActiveAlertsWithHttpInfo(String region, String severity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling listActiveAlerts");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "severity", severity));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ListActiveAlerts200Response> localReturnType = new ParameterizedTypeReference<ListActiveAlerts200Response>() {};
        return apiClient.invokeAPI("/alerts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Subscribe an email to weather alerts for a region
     * Registers an email address to receive notifications when new alerts are issued for a region.
     * <p><b>201</b> - Subscription created
     * @param subscribeToAlertsRequest  (required)
     * @return AlertSubscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AlertSubscription subscribeToAlerts(SubscribeToAlertsRequest subscribeToAlertsRequest) throws RestClientException {
        return subscribeToAlertsWithHttpInfo(subscribeToAlertsRequest).getBody();
    }

    /**
     * Subscribe an email to weather alerts for a region
     * Registers an email address to receive notifications when new alerts are issued for a region.
     * <p><b>201</b> - Subscription created
     * @param subscribeToAlertsRequest  (required)
     * @return ResponseEntity&lt;AlertSubscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlertSubscription> subscribeToAlertsWithHttpInfo(SubscribeToAlertsRequest subscribeToAlertsRequest) throws RestClientException {
        Object localVarPostBody = subscribeToAlertsRequest;
        
        // verify the required parameter 'subscribeToAlertsRequest' is set
        if (subscribeToAlertsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscribeToAlertsRequest' when calling subscribeToAlerts");
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

        ParameterizedTypeReference<AlertSubscription> localReturnType = new ParameterizedTypeReference<AlertSubscription>() {};
        return apiClient.invokeAPI("/alerts/subscriptions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cancel an alert subscription
     * Removes an existing alert subscription by its ID.
     * <p><b>204</b> - Subscription cancelled
     * @param subscriptionId Unique ID of the subscription to cancel (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void unsubscribeFromAlerts(String subscriptionId) throws RestClientException {
        unsubscribeFromAlertsWithHttpInfo(subscriptionId);
    }

    /**
     * Cancel an alert subscription
     * Removes an existing alert subscription by its ID.
     * <p><b>204</b> - Subscription cancelled
     * @param subscriptionId Unique ID of the subscription to cancel (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> unsubscribeFromAlertsWithHttpInfo(String subscriptionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling unsubscribeFromAlerts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscriptionId", subscriptionId);

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
        return apiClient.invokeAPI("/alerts/subscriptions/{subscriptionId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
