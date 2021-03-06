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
import tokyo.northside.odapi.model.Lemmatron;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class LemmasApi {
  private ApiClient apiClient;

  public LemmasApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LemmasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check a word exists in the dictionary and retrieve its root form
   *  Use this to check if a word exists in the dictionary, or what &#39;root&#39; form it links to (e.g., swimming &gt; swim). The response tells you the possible [lemmas](documentation/glossary?term&#x3D;lemma) for a given [inflected](documentation/glossary?term&#x3D;inflection) word. This can then be combined with other endpoints to retrieve more information.  The results can be filtered by lexicalCategories and/or grammaticalFeatures. Filters can be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;. 
   * @param sourceLang Language code of the source language in a monolingual dataset. (required)
   * @param wordId The identifier for an Entry (case-sensitive). (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param grammaticalFeatures Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  (optional)
   * @param lexicalCategory Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  (optional)
   * @return Lemmatron
   * @throws ApiException if fails to make API call
   */
  public Lemmatron lemmasSourceLangWordIdGet(String sourceLang, String wordId, String appId, String appKey, String grammaticalFeatures, String lexicalCategory) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling lemmasSourceLangWordIdGet");
    }
    
    // verify the required parameter 'wordId' is set
    if (wordId == null) {
      throw new ApiException(400, "Missing the required parameter 'wordId' when calling lemmasSourceLangWordIdGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling lemmasSourceLangWordIdGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling lemmasSourceLangWordIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/lemmas/{source_lang}/{word_id}"
      .replaceAll("\\{" + "source_lang" + "\\}", apiClient.escapeString(sourceLang.toString()))
      .replaceAll("\\{" + "word_id" + "\\}", apiClient.escapeString(wordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("grammaticalFeatures", grammaticalFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPair("lexicalCategory", lexicalCategory));

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

    TypeReference<Lemmatron> localVarReturnType = new TypeReference<Lemmatron>() {};
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
