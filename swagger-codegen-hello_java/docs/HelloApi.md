# HelloApi

All URIs are relative to *https://localhost/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**helloRequest**](HelloApi.md#helloRequest) | **POST** /helloRequest | helloRequest
[**sayHello**](HelloApi.md#sayHello) | **GET** /hello | 
[**sayHelloWithModel**](HelloApi.md#sayHelloWithModel) | **GET** /helloGreeting | 
[**uploadFile**](HelloApi.md#uploadFile) | **POST** /uploadImage | uploads an image


<a name="helloRequest"></a>
# **helloRequest**
> HelloModel helloRequest(name, body)

helloRequest



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloApi;


HelloApi apiInstance = new HelloApi();
String name = "name_example"; // String | 
HelloModel body = new HelloModel(); // HelloModel | 
try {
    HelloModel result = apiInstance.helloRequest(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelloApi#helloRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **body** | [**HelloModel**](HelloModel.md)|  | [optional]

### Return type

[**HelloModel**](HelloModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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
> HelloModel sayHelloWithModel(name, firstName)





### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloApi;


HelloApi apiInstance = new HelloApi();
String name = "name_example"; // String | 
String firstName = "firstName_example"; // String | 
try {
    HelloModel result = apiInstance.sayHelloWithModel(name, firstName);
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
 **firstName** | **String**|  |

### Return type

[**HelloModel**](HelloModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadFile"></a>
# **uploadFile**
> String uploadFile(name, file)

uploads an image



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloApi;


HelloApi apiInstance = new HelloApi();
String name = "name_example"; // String | the name
File file = new File("/path/to/file.txt"); // File | file to upload
try {
    String result = apiInstance.uploadFile(name, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HelloApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| the name |
 **file** | **File**| file to upload | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, application/xml

