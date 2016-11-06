# HelloApi

All URIs are relative to *https://localhost/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayHello**](HelloApi.md#sayHello) | **GET** /hello | 
[**sayHelloWithModel**](HelloApi.md#sayHelloWithModel) | **GET** /helloGreeting | 


<a name="sayHello"></a>
# **sayHello**
> String sayHello(name, firstName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloApi;


HelloApi apiInstance = new HelloApi();
String name = "name_example"; // String | 
String firstName = "firstName_example"; // String | 
try {
    String result = apiInstance.sayHello(name, firstName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelloApi#sayHello");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **firstName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sayHelloWithModel"></a>
# **sayHelloWithModel**
> HelloModel sayHelloWithModel(name)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloApi;


HelloApi apiInstance = new HelloApi();
String name = "name_example"; // String | 
try {
    HelloModel result = apiInstance.sayHelloWithModel(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelloApi#sayHelloWithModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**HelloModel**](HelloModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

