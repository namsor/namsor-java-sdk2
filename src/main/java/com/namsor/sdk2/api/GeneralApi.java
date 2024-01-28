/*
 * NamSor API v2
 * NamSor API v2 : enpoints to process personal names (gender, cultural origin or ethnicity) in all alphabets or languages. By default, enpoints use 1 unit per name (ex. Gender), but Ethnicity classification uses 10 to 20 units per name depending on taxonomy. Use GET methods for small tests, but prefer POST methods for higher throughput (batch processing of up to 100 names at a time). Need something you can't find here? We have many more features coming soon. Let us know, we'll do our best to add it! 
 *
 * The version of the OpenAPI document: 2.0.29
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


import com.namsor.sdk2.model.BatchNameGeoIn;
import com.namsor.sdk2.model.BatchNameIn;
import com.namsor.sdk2.model.BatchProperNounCategorizedOut;
import com.namsor.sdk2.model.ProperNounCategorizedOut;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GeneralApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeneralApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeneralApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for nameType
     * @param properNoun  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeCall(String properNoun, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api2/json/nameType/{properNoun}"
            .replace("{" + "properNoun" + "}", localVarApiClient.escapeString(properNoun.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call nameTypeValidateBeforeCall(String properNoun, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'properNoun' is set
        if (properNoun == null) {
            throw new ApiException("Missing the required parameter 'properNoun' when calling nameType(Async)");
        }

        return nameTypeCall(properNoun, _callback);

    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @return ProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public ProperNounCategorizedOut nameType(String properNoun) throws ApiException {
        ApiResponse<ProperNounCategorizedOut> localVarResp = nameTypeWithHttpInfo(properNoun);
        return localVarResp.getData();
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @return ApiResponse&lt;ProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProperNounCategorizedOut> nameTypeWithHttpInfo(String properNoun) throws ApiException {
        okhttp3.Call localVarCall = nameTypeValidateBeforeCall(properNoun, null);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param properNoun  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeAsync(String properNoun, final ApiCallback<ProperNounCategorizedOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = nameTypeValidateBeforeCall(properNoun, _callback);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for nameTypeBatch
     * @param batchNameIn A list of proper names (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeBatchCall(BatchNameIn batchNameIn, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = batchNameIn;

        // create path and map variables
        String localVarPath = "/api2/json/nameTypeBatch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call nameTypeBatchValidateBeforeCall(BatchNameIn batchNameIn, final ApiCallback _callback) throws ApiException {
        return nameTypeBatchCall(batchNameIn, _callback);

    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     * 
     * @param batchNameIn A list of proper names (optional)
     * @return BatchProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public BatchProperNounCategorizedOut nameTypeBatch(BatchNameIn batchNameIn) throws ApiException {
        ApiResponse<BatchProperNounCategorizedOut> localVarResp = nameTypeBatchWithHttpInfo(batchNameIn);
        return localVarResp.getData();
    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     * 
     * @param batchNameIn A list of proper names (optional)
     * @return ApiResponse&lt;BatchProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchProperNounCategorizedOut> nameTypeBatchWithHttpInfo(BatchNameIn batchNameIn) throws ApiException {
        okhttp3.Call localVarCall = nameTypeBatchValidateBeforeCall(batchNameIn, null);
        Type localVarReturnType = new TypeToken<BatchProperNounCategorizedOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param batchNameIn A list of proper names (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeBatchAsync(BatchNameIn batchNameIn, final ApiCallback<BatchProperNounCategorizedOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = nameTypeBatchValidateBeforeCall(batchNameIn, _callback);
        Type localVarReturnType = new TypeToken<BatchProperNounCategorizedOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for nameTypeGeo
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeGeoCall(String properNoun, String countryIso2, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api2/json/nameTypeGeo/{properNoun}/{countryIso2}"
            .replace("{" + "properNoun" + "}", localVarApiClient.escapeString(properNoun.toString()))
            .replace("{" + "countryIso2" + "}", localVarApiClient.escapeString(countryIso2.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call nameTypeGeoValidateBeforeCall(String properNoun, String countryIso2, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'properNoun' is set
        if (properNoun == null) {
            throw new ApiException("Missing the required parameter 'properNoun' when calling nameTypeGeo(Async)");
        }

        // verify the required parameter 'countryIso2' is set
        if (countryIso2 == null) {
            throw new ApiException("Missing the required parameter 'countryIso2' when calling nameTypeGeo(Async)");
        }

        return nameTypeGeoCall(properNoun, countryIso2, _callback);

    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @return ProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public ProperNounCategorizedOut nameTypeGeo(String properNoun, String countryIso2) throws ApiException {
        ApiResponse<ProperNounCategorizedOut> localVarResp = nameTypeGeoWithHttpInfo(properNoun, countryIso2);
        return localVarResp.getData();
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @return ApiResponse&lt;ProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProperNounCategorizedOut> nameTypeGeoWithHttpInfo(String properNoun, String countryIso2) throws ApiException {
        okhttp3.Call localVarCall = nameTypeGeoValidateBeforeCall(properNoun, countryIso2, null);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Infer the likely type of a proper noun (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param properNoun  (required)
     * @param countryIso2  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A typed name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeGeoAsync(String properNoun, String countryIso2, final ApiCallback<ProperNounCategorizedOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = nameTypeGeoValidateBeforeCall(properNoun, countryIso2, _callback);
        Type localVarReturnType = new TypeToken<ProperNounCategorizedOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for nameTypeGeoBatch
     * @param batchNameGeoIn A list of proper names (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeGeoBatchCall(BatchNameGeoIn batchNameGeoIn, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = batchNameGeoIn;

        // create path and map variables
        String localVarPath = "/api2/json/nameTypeGeoBatch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call nameTypeGeoBatchValidateBeforeCall(BatchNameGeoIn batchNameGeoIn, final ApiCallback _callback) throws ApiException {
        return nameTypeGeoBatchCall(batchNameGeoIn, _callback);

    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     * 
     * @param batchNameGeoIn A list of proper names (optional)
     * @return BatchProperNounCategorizedOut
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public BatchProperNounCategorizedOut nameTypeGeoBatch(BatchNameGeoIn batchNameGeoIn) throws ApiException {
        ApiResponse<BatchProperNounCategorizedOut> localVarResp = nameTypeGeoBatchWithHttpInfo(batchNameGeoIn);
        return localVarResp.getData();
    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.)
     * 
     * @param batchNameGeoIn A list of proper names (optional)
     * @return ApiResponse&lt;BatchProperNounCategorizedOut&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchProperNounCategorizedOut> nameTypeGeoBatchWithHttpInfo(BatchNameGeoIn batchNameGeoIn) throws ApiException {
        okhttp3.Call localVarCall = nameTypeGeoBatchValidateBeforeCall(batchNameGeoIn, null);
        Type localVarReturnType = new TypeToken<BatchProperNounCategorizedOut>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Infer the likely common type of up to 100 proper nouns (personal name, brand name, place name etc.) (asynchronously)
     * 
     * @param batchNameGeoIn A list of proper names (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of commonTypeized names. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Missing or incorrect API Key </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Email not Verified, or API Limit Reached, or API Key Disabled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request (ex. too many names) </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call nameTypeGeoBatchAsync(BatchNameGeoIn batchNameGeoIn, final ApiCallback<BatchProperNounCategorizedOut> _callback) throws ApiException {

        okhttp3.Call localVarCall = nameTypeGeoBatchValidateBeforeCall(batchNameGeoIn, _callback);
        Type localVarReturnType = new TypeToken<BatchProperNounCategorizedOut>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
