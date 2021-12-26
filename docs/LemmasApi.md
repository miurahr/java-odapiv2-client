# LemmasApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lemmasSourceLangWordIdGet**](LemmasApi.md#lemmasSourceLangWordIdGet) | **GET** /lemmas/{source_lang}/{word_id} | Check a word exists in the dictionary and retrieve its root form


<a name="lemmasSourceLangWordIdGet"></a>
# **lemmasSourceLangWordIdGet**
> Lemmatron lemmasSourceLangWordIdGet(sourceLang, wordId, appId, appKey, grammaticalFeatures, lexicalCategory)

Check a word exists in the dictionary and retrieve its root form

 Use this to check if a word exists in the dictionary, or what &#39;root&#39; form it links to (e.g., swimming &gt; swim). The response tells you the possible [lemmas](documentation/glossary?term&#x3D;lemma) for a given [inflected](documentation/glossary?term&#x3D;inflection) word. This can then be combined with other endpoints to retrieve more information.  The results can be filtered by lexicalCategories and/or grammaticalFeatures. Filters can be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LemmasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

    LemmasApi apiInstance = new LemmasApi(defaultClient);
    String sourceLang = "en"; // String | Language code of the source language in a monolingual dataset.
    String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
    String appId = "appId_example"; // String | App ID Authentication Parameter
    String appKey = "appKey_example"; // String | App Key Authentication Parameter
    String grammaticalFeatures = "grammaticalFeatures_example"; // String | Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \"id\" matches the values in the grammaticalFeatures parameter. ```@javascript {   \"grammaticalFeatures\": [                           {                               \"id\": \"mass\",                               \"text\": \"Mass\",                               \"type\": \"Countability\"                           }                       ] } ``` 
    String lexicalCategory = "lexicalCategory_example"; // String | Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \"id\" matches the values in the lexicalCategory parameter. ```@javascript {   \"lexicalCategory\": {                   \"id\": \"adjective\",                   \"text\": \"Adjective\"               } } ``` 
    try {
      Lemmatron result = apiInstance.lemmasSourceLangWordIdGet(sourceLang, wordId, appId, appKey, grammaticalFeatures, lexicalCategory);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LemmasApi#lemmasSourceLangWordIdGet");
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
 **sourceLang** | **String**| Language code of the source language in a monolingual dataset. | [enum: en, de, es, hi, it, lv, pt, ro, sw, ta, tn]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **grammaticalFeatures** | **String**| Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  | [optional]
 **lexicalCategory** | **String**| Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  | [optional]

### Return type

[**Lemmatron**](Lemmatron.md)

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

