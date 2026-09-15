# DefaultApi

All URIs are relative to *https://api.weather.example.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentWeather**](DefaultApi.md#getCurrentWeather) | **GET** /weather/current | Get current weather for a location |
| [**getWeatherForecast**](DefaultApi.md#getWeatherForecast) | **GET** /weather/forecast | Get a multi-day weather forecast |
| [**listActiveAlerts**](DefaultApi.md#listActiveAlerts) | **GET** /alerts | List active weather alerts for a region |
| [**subscribeToAlerts**](DefaultApi.md#subscribeToAlerts) | **POST** /alerts/subscriptions | Subscribe an email to weather alerts for a region |
| [**unsubscribeFromAlerts**](DefaultApi.md#unsubscribeFromAlerts) | **DELETE** /alerts/subscriptions/{subscriptionId} | Cancel an alert subscription |



## getCurrentWeather

> CurrentWeather getCurrentWeather(lat, lon, units)

Get current weather for a location

Returns the current temperature, conditions, and wind for a latitude/longitude pair.

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
        defaultClient.setBasePath("https://api.weather.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal lat = new BigDecimal(78); // BigDecimal | Latitude of the location
        BigDecimal lon = new BigDecimal(78); // BigDecimal | Longitude of the location
        String units = "METRIC"; // String | Unit system for the response
        try {
            CurrentWeather result = apiInstance.getCurrentWeather(lat, lon, units);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCurrentWeather");
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
| **lat** | **BigDecimal**| Latitude of the location | |
| **lon** | **BigDecimal**| Longitude of the location | |
| **units** | **String**| Unit system for the response | [optional] [default to METRIC] [enum: METRIC, IMPERIAL] |

### Return type

[**CurrentWeather**](CurrentWeather.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current weather |  -  |


## getWeatherForecast

> GetWeatherForecast200Response getWeatherForecast(lat, lon, days)

Get a multi-day weather forecast

Returns a daily forecast for the given location for up to 14 days.

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
        defaultClient.setBasePath("https://api.weather.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal lat = new BigDecimal(78); // BigDecimal | Latitude of the location
        BigDecimal lon = new BigDecimal(78); // BigDecimal | Longitude of the location
        Integer days = 5; // Integer | Number of forecast days to return (1-14)
        try {
            GetWeatherForecast200Response result = apiInstance.getWeatherForecast(lat, lon, days);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getWeatherForecast");
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
| **lat** | **BigDecimal**| Latitude of the location | |
| **lon** | **BigDecimal**| Longitude of the location | |
| **days** | **Integer**| Number of forecast days to return (1-14) | [optional] [default to 5] |

### Return type

[**GetWeatherForecast200Response**](GetWeatherForecast200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Forecast days |  -  |


## listActiveAlerts

> ListActiveAlerts200Response listActiveAlerts(region, severity)

List active weather alerts for a region

Returns currently active severe-weather alerts (storms, floods, heat) for a named region.

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
        defaultClient.setBasePath("https://api.weather.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String region = "region_example"; // String | Region name or code to check for active alerts
        String severity = "MINOR"; // String | Minimum severity to include
        try {
            ListActiveAlerts200Response result = apiInstance.listActiveAlerts(region, severity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listActiveAlerts");
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
| **region** | **String**| Region name or code to check for active alerts | |
| **severity** | **String**| Minimum severity to include | [optional] [enum: MINOR, MODERATE, SEVERE, EXTREME] |

### Return type

[**ListActiveAlerts200Response**](ListActiveAlerts200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Active alerts |  -  |


## subscribeToAlerts

> AlertSubscription subscribeToAlerts(subscribeToAlertsRequest)

Subscribe an email to weather alerts for a region

Registers an email address to receive notifications when new alerts are issued for a region.

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
        defaultClient.setBasePath("https://api.weather.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SubscribeToAlertsRequest subscribeToAlertsRequest = new SubscribeToAlertsRequest(); // SubscribeToAlertsRequest | 
        try {
            AlertSubscription result = apiInstance.subscribeToAlerts(subscribeToAlertsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#subscribeToAlerts");
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
| **subscribeToAlertsRequest** | [**SubscribeToAlertsRequest**](SubscribeToAlertsRequest.md)|  | |

### Return type

[**AlertSubscription**](AlertSubscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Subscription created |  -  |


## unsubscribeFromAlerts

> unsubscribeFromAlerts(subscriptionId)

Cancel an alert subscription

Removes an existing alert subscription by its ID.

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
        defaultClient.setBasePath("https://api.weather.example.com/v2");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | Unique ID of the subscription to cancel
        try {
            apiInstance.unsubscribeFromAlerts(subscriptionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#unsubscribeFromAlerts");
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
| **subscriptionId** | **String**| Unique ID of the subscription to cancel | |

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
| **204** | Subscription cancelled |  -  |

