# EntriesApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entriesSourceLangWordIdGet**](EntriesApi.md#entriesSourceLangWordIdGet) | **GET** /entries/{source_lang}/{word_id} | Retrieve dictionary information for a given word


<a name="entriesSourceLangWordIdGet"></a>
# **entriesSourceLangWordIdGet**
> RetrieveEntry entriesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, grammaticalFeatures, lexicalCategory, domains, registers, strictMatch)

Retrieve dictionary information for a given word

 Use this to retrieve definitions, [pronunciations](documentation/glossary?term&#x3D;pronunciation), example sentences, [grammatical information](documentation/glossary?term&#x3D;grammaticalfeatures) and [word origins](documentation/glossary?term&#x3D;etymology).  TIP: Entries ONLY works for dictionary headwords. You may need to use the Lemmas endpoint first to link an inflected form back to its headword (e.g., pixels --&gt; pixel). Alternatively, you can use the Words endpoint, a feature that enables you to retrieve definitions, pronunciations, word origins, and grammatical data across headwords and inflected words with just one call to the API.  Use filters to limit the [entry](documentation/glossary?term&#x3D;entry) information that is returned. For example, you may only require definitions and not everything else, or just [pronunciations](documentation/glossary?term&#x3D;pronunciation). The full list of filters can be retrieved from the filters Utility endpoint. You can also specify values within the filter using &#39;&#x3D;&#39;. For example &#39;grammaticalFeatures&#x3D;singular&#39;. Filters can also be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;.  &lt;div id&#x3D;\&quot;dictionary_entries_filters\&quot;&gt;&lt;/div&gt; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EntriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

    EntriesApi apiInstance = new EntriesApi(defaultClient);
    String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
    String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
    String appId = "appId_example"; // String | App ID Authentication Parameter
    String appKey = "appKey_example"; // String | App Key Authentication Parameter
    List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of data fields to return for the matched entries. Valid field names are 'definitions', 'domains', 'etymologies', 'examples', 'pronunciations', 'regions', 'registers' and 'variantForms'. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned. 
    String grammaticalFeatures = "grammaticalFeatures_example"; // String | Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \"id\" matches the values in the grammaticalFeatures parameter. ```@javascript {   \"grammaticalFeatures\": [                           {                               \"id\": \"mass\",                               \"text\": \"Mass\",                               \"type\": \"Countability\"                           }                       ] } ``` 
    String lexicalCategory = "lexicalCategory_example"; // String | Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \"id\" matches the values in the lexicalCategory parameter. ```@javascript {   \"lexicalCategory\": {                   \"id\": \"adjective\",                   \"text\": \"Adjective\"               } } ``` 
    String domains = "domains_example"; // String | Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \"id\" matches the values in the domains parameter.  ```@javascript {   \"domains\": [     {       \"id\": \"jazz\",       \"text\": \"Jazz\"      }] } ``` 
    String registers = "registers_example"; // String | Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \"id\" matches the values in the registers parameter.  ```@javascript {   \"registers\": [     {       \"id\": \"informal\",       \"text\": \"Informal\"      }] } ``` 
    Boolean strictMatch = false; // Boolean | Specifies whether diacritics must match exactly. If \"false\", near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both).
    try {
      RetrieveEntry result = apiInstance.entriesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, grammaticalFeatures, lexicalCategory, domains, registers, strictMatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EntriesApi#entriesSourceLangWordIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceLang** | **String**| Language code of the source language in a monolingual dataset. | [enum: en-gb, en-us, es, fr, gu, hi, lv, ro, sw, ta]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of data fields to return for the matched entries. Valid field names are &#39;definitions&#39;, &#39;domains&#39;, &#39;etymologies&#39;, &#39;examples&#39;, &#39;pronunciations&#39;, &#39;regions&#39;, &#39;registers&#39; and &#39;variantForms&#39;. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned.  | [optional] [enum: definitions, domains, etymologies, examples, pronunciations, regions, registers, variantForms]
 **grammaticalFeatures** | **String**| Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  | [optional]
 **lexicalCategory** | **String**| Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  | [optional]
 **domains** | **String**| Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \&quot;id\&quot; matches the values in the domains parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;domains\&quot;: [     {       \&quot;id\&quot;: \&quot;jazz\&quot;,       \&quot;text\&quot;: \&quot;Jazz\&quot;      }] } &#x60;&#x60;&#x60;  | [optional]
 **registers** | **String**| Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \&quot;id\&quot; matches the values in the registers parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;registers\&quot;: [     {       \&quot;id\&quot;: \&quot;informal\&quot;,       \&quot;text\&quot;: \&quot;Informal\&quot;      }] } &#x60;&#x60;&#x60;  | [optional]
 **strictMatch** | **Boolean**| Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). | [optional] [default to false]

### Return type

[**RetrieveEntry**](RetrieveEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
**400** | Invalid value for filters such as lexicalCategory, registers, domains, etc. Invalid value for fields projections accepted. It is not possible to project a non-existing field.  |  -  |
**404** | No entry was found matching the selection parameters; OR an invalid filter was specified.  |  -  |
**414** | URL is too long. |  -  |
**500** | Internal error. An error occurred during processing. |  -  |

