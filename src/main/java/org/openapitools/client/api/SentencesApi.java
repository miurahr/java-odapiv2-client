/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorSchema;
import org.openapitools.client.model.SentencesResults;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentencesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SentencesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SentencesApi(ApiClient apiClient) {
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
     * Build call for sentencesSourceLangWordIdGet
     * @param sourceLang Language code of the source language. (required)
     * @param wordId The identifier for an Entry (case-sensitive). (required)
     * @param appId App ID Authentication Parameter (required)
     * @param appKey App Key Authentication Parameter (required)
     * @param strictMatch Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. </td><td>  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  </td></tr>
        <tr><td> 404 </td><td> No entry was found matching the selection parameters; OR an invalid filter was specified.  </td><td>  -  </td></tr>
        <tr><td> 414 </td><td> URL is too long. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error. An error occurred during processing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sentencesSourceLangWordIdGetCall(String sourceLang, String wordId, String appId, String appKey, Boolean strictMatch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/sentences/{source_lang}/{word_id}"
            .replaceAll("\\{" + "source_lang" + "\\}", localVarApiClient.escapeString(sourceLang.toString()))
            .replaceAll("\\{" + "word_id" + "\\}", localVarApiClient.escapeString(wordId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (strictMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("strictMatch", strictMatch));
        }

        if (appId != null) {
            localVarHeaderParams.put("app_id", localVarApiClient.parameterToString(appId));
        }

        if (appKey != null) {
            localVarHeaderParams.put("app_key", localVarApiClient.parameterToString(appKey));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sentencesSourceLangWordIdGetValidateBeforeCall(String sourceLang, String wordId, String appId, String appKey, Boolean strictMatch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'sourceLang' is set
        if (sourceLang == null) {
            throw new ApiException("Missing the required parameter 'sourceLang' when calling sentencesSourceLangWordIdGet(Async)");
        }
        
        // verify the required parameter 'wordId' is set
        if (wordId == null) {
            throw new ApiException("Missing the required parameter 'wordId' when calling sentencesSourceLangWordIdGet(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling sentencesSourceLangWordIdGet(Async)");
        }
        
        // verify the required parameter 'appKey' is set
        if (appKey == null) {
            throw new ApiException("Missing the required parameter 'appKey' when calling sentencesSourceLangWordIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = sentencesSourceLangWordIdGetCall(sourceLang, wordId, appId, appKey, strictMatch, _callback);
        return localVarCall;

    }

    /**
     * Retrieve real example sentences of a word in use
     *  Use this to retrieve sentences extracted from a corpus of real-world language, including news and blog content. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 
     * @param sourceLang Language code of the source language. (required)
     * @param wordId The identifier for an Entry (case-sensitive). (required)
     * @param appId App ID Authentication Parameter (required)
     * @param appKey App Key Authentication Parameter (required)
     * @param strictMatch Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). (optional, default to false)
     * @return SentencesResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. </td><td>  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  </td></tr>
        <tr><td> 404 </td><td> No entry was found matching the selection parameters; OR an invalid filter was specified.  </td><td>  -  </td></tr>
        <tr><td> 414 </td><td> URL is too long. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error. An error occurred during processing. </td><td>  -  </td></tr>
     </table>
     */
    public SentencesResults sentencesSourceLangWordIdGet(String sourceLang, String wordId, String appId, String appKey, Boolean strictMatch) throws ApiException {
        ApiResponse<SentencesResults> localVarResp = sentencesSourceLangWordIdGetWithHttpInfo(sourceLang, wordId, appId, appKey, strictMatch);
        return localVarResp.getData();
    }

    /**
     * Retrieve real example sentences of a word in use
     *  Use this to retrieve sentences extracted from a corpus of real-world language, including news and blog content. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 
     * @param sourceLang Language code of the source language. (required)
     * @param wordId The identifier for an Entry (case-sensitive). (required)
     * @param appId App ID Authentication Parameter (required)
     * @param appKey App Key Authentication Parameter (required)
     * @param strictMatch Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). (optional, default to false)
     * @return ApiResponse&lt;SentencesResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. </td><td>  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  </td></tr>
        <tr><td> 404 </td><td> No entry was found matching the selection parameters; OR an invalid filter was specified.  </td><td>  -  </td></tr>
        <tr><td> 414 </td><td> URL is too long. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error. An error occurred during processing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SentencesResults> sentencesSourceLangWordIdGetWithHttpInfo(String sourceLang, String wordId, String appId, String appKey, Boolean strictMatch) throws ApiException {
        okhttp3.Call localVarCall = sentencesSourceLangWordIdGetValidateBeforeCall(sourceLang, wordId, appId, appKey, strictMatch, null);
        Type localVarReturnType = new TypeToken<SentencesResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve real example sentences of a word in use (asynchronously)
     *  Use this to retrieve sentences extracted from a corpus of real-world language, including news and blog content. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 
     * @param sourceLang Language code of the source language. (required)
     * @param wordId The identifier for an Entry (case-sensitive). (required)
     * @param appId App ID Authentication Parameter (required)
     * @param appKey App Key Authentication Parameter (required)
     * @param strictMatch Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response. </td><td>  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  </td></tr>
        <tr><td> 404 </td><td> No entry was found matching the selection parameters; OR an invalid filter was specified.  </td><td>  -  </td></tr>
        <tr><td> 414 </td><td> URL is too long. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal error. An error occurred during processing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sentencesSourceLangWordIdGetAsync(String sourceLang, String wordId, String appId, String appKey, Boolean strictMatch, final ApiCallback<SentencesResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = sentencesSourceLangWordIdGetValidateBeforeCall(sourceLang, wordId, appId, appKey, strictMatch, _callback);
        Type localVarReturnType = new TypeToken<SentencesResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
