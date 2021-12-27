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
import tokyo.northside.odapi.model.RetrieveEntry;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-27T22:47:07.450+09:00[Asia/Tokyo]")
public class EntriesApi {
  private ApiClient apiClient;

  public EntriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EntriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve dictionary information for a given word
   *  Use this to retrieve definitions, [pronunciations](documentation/glossary?term&#x3D;pronunciation), example sentences, [grammatical information](documentation/glossary?term&#x3D;grammaticalfeatures) and [word origins](documentation/glossary?term&#x3D;etymology).  TIP: Entries ONLY works for dictionary headwords. You may need to use the Lemmas endpoint first to link an inflected form back to its headword (e.g., pixels --&gt; pixel). Alternatively, you can use the Words endpoint, a feature that enables you to retrieve definitions, pronunciations, word origins, and grammatical data across headwords and inflected words with just one call to the API.  Use filters to limit the [entry](documentation/glossary?term&#x3D;entry) information that is returned. For example, you may only require definitions and not everything else, or just [pronunciations](documentation/glossary?term&#x3D;pronunciation). The full list of filters can be retrieved from the filters Utility endpoint. You can also specify values within the filter using &#39;&#x3D;&#39;. For example &#39;grammaticalFeatures&#x3D;singular&#39;. Filters can also be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;.  &lt;div id&#x3D;\&quot;dictionary_entries_filters\&quot;&gt;&lt;/div&gt; 
   * @param sourceLang Language code of the source language in a monolingual dataset. (required)
   * @param wordId The identifier for an Entry (case-sensitive). (required)
   * @param appId App ID Authentication Parameter (required)
   * @param appKey App Key Authentication Parameter (required)
   * @param fields A comma-separated list of data fields to return for the matched entries. Valid field names are &#39;definitions&#39;, &#39;domains&#39;, &#39;etymologies&#39;, &#39;examples&#39;, &#39;pronunciations&#39;, &#39;regions&#39;, &#39;registers&#39; and &#39;variantForms&#39;. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned.  (optional
   * @param grammaticalFeatures Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  (optional)
   * @param lexicalCategory Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  (optional)
   * @param domains Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \&quot;id\&quot; matches the values in the domains parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;domains\&quot;: [     {       \&quot;id\&quot;: \&quot;jazz\&quot;,       \&quot;text\&quot;: \&quot;Jazz\&quot;      }] } &#x60;&#x60;&#x60;  (optional)
   * @param registers Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \&quot;id\&quot; matches the values in the registers parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;registers\&quot;: [     {       \&quot;id\&quot;: \&quot;informal\&quot;,       \&quot;text\&quot;: \&quot;Informal\&quot;      }] } &#x60;&#x60;&#x60;  (optional)
   * @param strictMatch Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). (optional, default to false)
   * @return RetrieveEntry
   * @throws ApiException if fails to make API call
   */
  public RetrieveEntry entriesSourceLangWordIdGet(String sourceLang, String wordId, String appId, String appKey, List<String> fields, String grammaticalFeatures, String lexicalCategory, String domains, String registers, Boolean strictMatch) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling entriesSourceLangWordIdGet");
    }
    
    // verify the required parameter 'wordId' is set
    if (wordId == null) {
      throw new ApiException(400, "Missing the required parameter 'wordId' when calling entriesSourceLangWordIdGet");
    }
    
    // verify the required parameter 'appId' is set
    if (appId == null) {
      throw new ApiException(400, "Missing the required parameter 'appId' when calling entriesSourceLangWordIdGet");
    }
    
    // verify the required parameter 'appKey' is set
    if (appKey == null) {
      throw new ApiException(400, "Missing the required parameter 'appKey' when calling entriesSourceLangWordIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/entries/{source_lang}/{word_id}"
      .replaceAll("\\{" + "source_lang" + "\\}", apiClient.escapeString(sourceLang.toString()))
      .replaceAll("\\{" + "word_id" + "\\}", apiClient.escapeString(wordId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPair("grammaticalFeatures", grammaticalFeatures));
    localVarQueryParams.addAll(apiClient.parameterToPair("lexicalCategory", lexicalCategory));
    localVarQueryParams.addAll(apiClient.parameterToPair("domains", domains));
    localVarQueryParams.addAll(apiClient.parameterToPair("registers", registers));
    localVarQueryParams.addAll(apiClient.parameterToPair("strictMatch", strictMatch));

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
