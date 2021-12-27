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
import org.openapitools.client.model.*;
import tokyo.northside.odapi.Pair;

import org.openapitools.client.model.ErrorSchema;
import org.openapitools.client.model.RetrieveEntry;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T11:50:35.407+09:00[Asia/Tokyo]")
public class WordsApi {
  private ApiClient apiClient;

  public WordsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WordsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check if an inflected form exists in the dictionary and retrieve the entries data of its root form.
   *  Use this endpoint to retrieve definitions, examples and other information for a given dictionary word or an inflection (e.g., running &gt; run). The response contains information about the lemmas to which the given word/inflected form is linked.  The results can be filtered by lexicalCategories, domains, registers or grammaticalFeatures. Filters can be combined.  In addition, users can use fields to project some of the properties.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;. 
   * @param sourceLang Language code of the source language in a monolingual dataset. (required)
   * @param q The word or inflection to retrieve. This parameter is NOT case-sensitive. (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param fields A comma-separated list of data fields to return for the matched entries. Valid field names are &#39;definitions&#39;, &#39;domains&#39;, &#39;etymologies&#39;, &#39;examples&#39;, &#39;pronunciations&#39;, &#39;regions&#39;, &#39;registers&#39; and &#39;variantForms&#39;. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned.  (optional
   * @param grammaticalFeatures Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  (optional)
   * @param lexicalCategory Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  (optional)
   * @param domains Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \&quot;id\&quot; matches the values in the domains parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;domains\&quot;: [     {       \&quot;id\&quot;: \&quot;jazz\&quot;,       \&quot;text\&quot;: \&quot;Jazz\&quot;      }] } &#x60;&#x60;&#x60;  (optional)
   * @param registers Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \&quot;id\&quot; matches the values in the registers parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;registers\&quot;: [     {       \&quot;id\&quot;: \&quot;informal\&quot;,       \&quot;text\&quot;: \&quot;Informal\&quot;      }] } &#x60;&#x60;&#x60;  (optional)
   * @return RetrieveEntry
   * @throws ApiException if fails to make API call
   */
  public RetrieveEntry wordsSourceLangGet(String sourceLang, String q, String appId, String appKey, List<String> fields, String grammaticalFeatures, String lexicalCategory, String domains, String registers) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling wordsSourceLangGet");
    }
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling wordsSourceLangGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling wordsSourceLangGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling wordsSourceLangGet");
    }
    
    // create path and map variables
    String localVarPath = "/words/{source_lang}"
      .replaceAll("\\{" + "source_lang" + "\\}", apiClient.escapeString(sourceLang.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPair("grammaticalFeatures", grammaticalFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPair("lexicalCategory", lexicalCategory));
    localVarQueryParams.addAll(apiClient.parameterToPair("domains", domains));
    localVarQueryParams.addAll(apiClient.parameterToPair("registers", registers));

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

    TypeReference<RetrieveEntry> localVarReturnType = new TypeReference<RetrieveEntry>() {};
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