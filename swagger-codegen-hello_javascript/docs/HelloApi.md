# SampleRestApplication.HelloApi

All URIs are relative to *https://localhost/services*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayHello**](HelloApi.md#sayHello) | **GET** /hello | 
[**sayHelloWithModel**](HelloApi.md#sayHelloWithModel) | **GET** /helloGreeting | 


<a name="sayHello"></a>
# **sayHello**
> &#39;String&#39; sayHello(name, firstName)





### Example
```javascript
var SampleRestApplication = require('sample_rest_application');

var apiInstance = new SampleRestApplication.HelloApi();

var name = "name_example"; // String | 

var firstName = "firstName_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sayHello(name, firstName, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | 
 **firstName** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sayHelloWithModel"></a>
# **sayHelloWithModel**
> HelloModel sayHelloWithModel(name)





### Example
```javascript
var SampleRestApplication = require('sample_rest_application');

var apiInstance = new SampleRestApplication.HelloApi();

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.sayHelloWithModel(name, callback);
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

