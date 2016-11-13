/*
 * Sample REST Application
 * The Application
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.BeanValidationException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import javax.validation.constraints.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.executable.ExecutableValidator;
import java.util.Set;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import io.swagger.client.model.HelloModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloApi {
    private ApiClient apiClient;

    public HelloApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HelloApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for helloRequest */
    private com.squareup.okhttp.Call helloRequestCall(String name, HelloModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/helloRequest".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call helloRequestValidateBeforeCall(String name, HelloModel body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { name, body };
            Method method = this.getClass().getMethod("helloRequestWithHttpInfo", String.class, HelloModel.class);
            Set<ConstraintViolation<Object>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = helloRequestCall(name, body, progressListener, progressRequestListener);
                return call;
            
            } else {
                Set<ConstraintViolation<Object>> violationsObj = (Set<ConstraintViolation<Object>>) violations;
                throw new BeanValidationException(violationsObj);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * helloRequest
     * 
     * @param name  (required)
     * @param body  (optional)
     * @return HelloModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HelloModel helloRequest(String name, HelloModel body) throws ApiException {
        ApiResponse<HelloModel> resp = helloRequestWithHttpInfo(name, body);
        return resp.getData();
    }

    /**
     * helloRequest
     * 
     * @param name  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;HelloModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HelloModel> helloRequestWithHttpInfo( @NotNull @Size(min=1,max=255) String name,  HelloModel body) throws ApiException {
        com.squareup.okhttp.Call call = helloRequestValidateBeforeCall(name, body, null, null);
        Type localVarReturnType = new TypeToken<HelloModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * helloRequest (asynchronously)
     * 
     * @param name  (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call helloRequestAsync(String name, HelloModel body, final ApiCallback<HelloModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = helloRequestValidateBeforeCall(name, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HelloModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for sayHello */
    private com.squareup.okhttp.Call sayHelloCall(String name, String firstName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/hello".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (firstName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstName", firstName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call sayHelloValidateBeforeCall(String name, String firstName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { name, firstName };
            Method method = this.getClass().getMethod("sayHelloWithHttpInfo", String.class, String.class);
            Set<ConstraintViolation<Object>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = sayHelloCall(name, firstName, progressListener, progressRequestListener);
                return call;
            
            } else {
                Set<ConstraintViolation<Object>> violationsObj = (Set<ConstraintViolation<Object>>) violations;
                throw new BeanValidationException(violationsObj);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String sayHello(String name, String firstName) throws ApiException {
        ApiResponse<String> resp = sayHelloWithHttpInfo(name, firstName);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> sayHelloWithHttpInfo( @NotNull @Size(min=1,max=255) String name,  @NotNull @Size(min=1,max=255) String firstName) throws ApiException {
        com.squareup.okhttp.Call call = sayHelloValidateBeforeCall(name, firstName, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sayHelloAsync(String name, String firstName, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sayHelloValidateBeforeCall(name, firstName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for sayHelloWithModel */
    private com.squareup.okhttp.Call sayHelloWithModelCall(String name, String firstName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/helloGreeting".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (firstName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstName", firstName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call sayHelloWithModelValidateBeforeCall(String name, String firstName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { name, firstName };
            Method method = this.getClass().getMethod("sayHelloWithModelWithHttpInfo", String.class, String.class);
            Set<ConstraintViolation<Object>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = sayHelloWithModelCall(name, firstName, progressListener, progressRequestListener);
                return call;
            
            } else {
                Set<ConstraintViolation<Object>> violationsObj = (Set<ConstraintViolation<Object>>) violations;
                throw new BeanValidationException(violationsObj);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @return HelloModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HelloModel sayHelloWithModel(String name, String firstName) throws ApiException {
        ApiResponse<HelloModel> resp = sayHelloWithModelWithHttpInfo(name, firstName);
        return resp.getData();
    }

    /**
     * 
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @return ApiResponse&lt;HelloModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HelloModel> sayHelloWithModelWithHttpInfo( @NotNull @Size(min=1,max=255) String name,  @NotNull @Size(min=1,max=255) String firstName) throws ApiException {
        com.squareup.okhttp.Call call = sayHelloWithModelValidateBeforeCall(name, firstName, null, null);
        Type localVarReturnType = new TypeToken<HelloModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param name  (required)
     * @param firstName  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sayHelloWithModelAsync(String name, String firstName, final ApiCallback<HelloModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sayHelloWithModelValidateBeforeCall(name, firstName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HelloModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for uploadFile */
    private com.squareup.okhttp.Call uploadFileCall(String name, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/uploadImage".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(String name, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        try {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            ExecutableValidator executableValidator = factory.getValidator().forExecutables();

            Object[] parameterValues = { name, file };
            Method method = this.getClass().getMethod("uploadFileWithHttpInfo", String.class, File.class);
            Set<ConstraintViolation<Object>> violations = executableValidator.validateParameters(this, method,
                    parameterValues);

            if (violations.size() == 0) {
                com.squareup.okhttp.Call call = uploadFileCall(name, file, progressListener, progressRequestListener);
                return call;
            
            } else {
                Set<ConstraintViolation<Object>> violationsObj = (Set<ConstraintViolation<Object>>) violations;
                throw new BeanValidationException(violationsObj);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
            
        
        
        
        
    }

    /**
     * uploads an image
     * 
     * @param name the name (required)
     * @param file file to upload (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String uploadFile(String name, File file) throws ApiException {
        ApiResponse<String> resp = uploadFileWithHttpInfo(name, file);
        return resp.getData();
    }

    /**
     * uploads an image
     * 
     * @param name the name (required)
     * @param file file to upload (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> uploadFileWithHttpInfo( @NotNull @Size(min=1,max=255) String name,  File file) throws ApiException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(name, file, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * uploads an image (asynchronously)
     * 
     * @param name the name (required)
     * @param file file to upload (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadFileAsync(String name, File file, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(name, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
