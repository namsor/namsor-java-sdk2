/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * OpenAPI spec version: 2.0.11
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.namsor.sdk2.api;

import com.namsor.sdk2.invoke.ApiCallback;
import com.namsor.sdk2.invoke.ApiClient;
import com.namsor.sdk2.invoke.ApiException;
import com.namsor.sdk2.invoke.ApiResponse;
import com.namsor.sdk2.invoke.Configuration;
import com.namsor.sdk2.invoke.Pair;
import com.namsor.sdk2.invoke.ProgressRequestBody;
import com.namsor.sdk2.invoke.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.namsor.sdk2.model.ProperNounCategorizedOut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralApi {
    private ApiClient apiClient;

    public GeneralApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeneralApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for nameType
     * @param properNoun  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call nameTypeCall(String properNoun, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api2/json/nameType/{properNoun}"
            .replaceAll("\\{" + "properNoun" + "\\}", apiClient.escapeString(properNoun.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call nameTypeValidateBeforeCall(String properNoun, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'properNoun' is set
        if (properNoun == null) {
            throw new ApiException("Missing the required parameter 'properNoun' when calling nameType(Async)");
        }
        

        com.squareup.okhttp.Call call = nameTypeCall(properNoun, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @return ProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProperNounCategorizedOut nameType(String properNoun) throws ApiException {
        ApiResponse<ProperNounCategorizedOut> resp = nameTypeWithHttpInfo(properNoun);
        return resp.getData();
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @return ApiResponse&lt;ProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProperNounCategorizedOut> nameTypeWithHttpInfo(String properNoun) throws ApiException {
        com.squareup.okhttp.Call call = nameTypeValidateBeforeCall(properNoun, null, null);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param properNoun  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nameTypeAsync(String properNoun, final ApiCallback<ProperNounCategorizedOut> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = nameTypeValidateBeforeCall(properNoun, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for nameType1
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call nameType1Call(String properNoun, String countryIso2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api2/json/nameType/{properNoun}/{countryIso2}"
            .replaceAll("\\{" + "properNoun" + "\\}", apiClient.escapeString(properNoun.toString()))
            .replaceAll("\\{" + "countryIso2" + "\\}", apiClient.escapeString(countryIso2.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
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

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call nameType1ValidateBeforeCall(String properNoun, String countryIso2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'properNoun' is set
        if (properNoun == null) {
            throw new ApiException("Missing the required parameter 'properNoun' when calling nameType1(Async)");
        }
        
        // verify the required parameter 'countryIso2' is set
        if (countryIso2 == null) {
            throw new ApiException("Missing the required parameter 'countryIso2' when calling nameType1(Async)");
        }
        

        com.squareup.okhttp.Call call = nameType1Call(properNoun, countryIso2, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @return ProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProperNounCategorizedOut nameType1(String properNoun, String countryIso2) throws ApiException {
        ApiResponse<ProperNounCategorizedOut> resp = nameType1WithHttpInfo(properNoun, countryIso2);
        return resp.getData();
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @return ApiResponse&lt;ProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProperNounCategorizedOut> nameType1WithHttpInfo(String properNoun, String countryIso2) throws ApiException {
        com.squareup.okhttp.Call call = nameType1ValidateBeforeCall(properNoun, countryIso2, null, null);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call nameType1Async(String properNoun, String countryIso2, final ApiCallback<ProperNounCategorizedOut> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = nameType1ValidateBeforeCall(properNoun, countryIso2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}