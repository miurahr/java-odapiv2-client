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

package tokyo.northside.odapi.v2;

import com.fasterxml.jackson.core.type.TypeReference;

import tokyo.northside.odapi.ApiException;
import tokyo.northside.odapi.ApiClient;
import tokyo.northside.odapi.Configuration;
import tokyo.northside.odapi.model.*;
import tokyo.northside.odapi.Pair;

import tokyo.northside.odapi.model.ErrorSchema;
import tokyo.northside.odapi.model.Wordlist;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieves possible dictionary matches to an input string
   *  Use this to retrieve possible [headword](documentation/glossary?term&#x3D;headword) matches for a given string of text. The results are calculated using headword matching, fuzzy matching, and [lemmatization](documentation/glossary?term&#x3D;lemma).    &lt;div id&#x3D;\&quot;search\&quot;&gt;&lt;/div&gt; 
   * @param sourceLang Language code of the source language in a monolingual dataset. (required)
   * @param q Search string (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param prefix Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. (optional)
   * @param limit Restricts number of returned results. Default and max. is 5000. (optional)
   * @param offset Pagination - results offset.  The sum of offset and limit must not exceed 10000. (optional)
   * @return Wordlist
   * @throws ApiException if fails to make API call
   */
  public Wordlist searchSourceLangGet(String sourceLang, String q, String appId, String appKey, Boolean prefix, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling searchSourceLangGet");
    }
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling searchSourceLangGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling searchSourceLangGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling searchSourceLangGet");
    }
    
    // create path and map variables
    String localVarPath = "/search/{source_lang}"
      .replaceAll("\\{" + "source_lang" + "\\}", apiClient.escapeString(sourceLang.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
    localVarQueryParams.addAll(apiClient.parameterToPair("prefix", prefix));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

    if (appId != null)
      localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));
if (appKey != null)
      localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Wordlist> localVarReturnType = new TypeReference<Wordlist>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * Retrieves possible dictionary matches to an input string
   *  Use this to retrieve possible [headword](documentation/glossary?term&#x3D;headword) matches for a given string of text. The results are calculated using headword matching, fuzzy matching, and [lemmatization](documentation/glossary?term&#x3D;lemma).    &lt;div id&#x3D;\&quot;search\&quot;&gt;&lt;/div&gt; 
   * @param sourceLang Language code of the source language in a Thesaurus dataset. (required)
   * @param q Search string (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param prefix Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. (optional)
   * @param limit Restricts number of returned results. Default and max. is 5000. (optional)
   * @param offset Pagination - results offset.  The sum of offset and limit must not exceed 10000. (optional)
   * @return Wordlist
   * @throws ApiException if fails to make API call
   */
  public Wordlist searchThesaurusSourceLangGet(String sourceLang, String q, String appId, String appKey, Boolean prefix, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling searchThesaurusSourceLangGet");
    }
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling searchThesaurusSourceLangGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling searchThesaurusSourceLangGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling searchThesaurusSourceLangGet");
    }
    
    // create path and map variables
    String localVarPath = "/search/thesaurus/{source_lang}"
      .replaceAll("\\{" + "source_lang" + "\\}", apiClient.escapeString(sourceLang.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
    localVarQueryParams.addAll(apiClient.parameterToPair("prefix", prefix));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

    if (appId != null)
      localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));
if (appKey != null)
      localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Wordlist> localVarReturnType = new TypeReference<Wordlist>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * Retrieves possible headwords with translations
   *  Use this to find possible headwords with translations for a given word.  &lt;div id&#x3D;\&quot;search_translation\&quot;&gt;&lt;/div&gt; 
   * @param sourceLangSearch Language code of the source language in a bilingual dataset. (required)
   * @param targetLangSearch Language code of the target language in a bilingual dataset. (required)
   * @param q Search string (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param prefix Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. (optional)
   * @param limit Restricts number of returned results. Default and max. is 5000. (optional)
   * @param offset pagination - results offset.  The sum of offset and limit must not exceed 10000. (optional)
   * @return Wordlist
   * @throws ApiException if fails to make API call
   */
  public Wordlist searchTranslationsSourceLangSearchTargetLangSearchGet(String sourceLangSearch, String targetLangSearch, String q, String appId, String appKey, Boolean prefix, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLangSearch' is set
    if (sourceLangSearch == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLangSearch' when calling searchTranslationsSourceLangSearchTargetLangSearchGet");
    }
    
    // verify the required parameter 'targetLangSearch' is set
    if (targetLangSearch == null) {
      throw new ApiException(400, "Missing the required parameter 'targetLangSearch' when calling searchTranslationsSourceLangSearchTargetLangSearchGet");
    }
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling searchTranslationsSourceLangSearchTargetLangSearchGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling searchTranslationsSourceLangSearchTargetLangSearchGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling searchTranslationsSourceLangSearchTargetLangSearchGet");
    }
    
    // create path and map variables
    String localVarPath = "/search/translations/{source_lang_search}/{target_lang_search}"
      .replaceAll("\\{" + "source_lang_search" + "\\}", apiClient.escapeString(sourceLangSearch.toString()))
      .replaceAll("\\{" + "target_lang_search" + "\\}", apiClient.escapeString(targetLangSearch.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
    localVarQueryParams.addAll(apiClient.parameterToPair("prefix", prefix));
    localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

    if (appId != null)
      localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));
if (appKey != null)
      localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<Wordlist> localVarReturnType = new TypeReference<Wordlist>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
