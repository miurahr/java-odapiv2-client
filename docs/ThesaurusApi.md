# ThesaurusApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**thesaurusSourceLangWordIdGet**](ThesaurusApi.md#thesaurusSourceLangWordIdGet) | **GET** /thesaurus/{source_lang}/{word_id} | Retrieve words that are similar to a given word



## thesaurusSourceLangWordIdGet

> Thesaurus thesaurusSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, strictMatch)

Retrieve words that are similar to a given word

Use this to retrieve words that are similar/opposite in meaning to the input word ([synonym](documentation/glossary?term&#x3D;synonym)/[antonym](documentation/glossary?term&#x3D;antonym)).  Tip: Some Entries responses contain sense-level links to a Thesaurus entry by the property \&quot;thesaurusLink\&quot;. For instance:  &#x60;&#x60;&#x60;@javascript   {     \&quot;thesaurusLinks\&quot;: [                             {                                 \&quot;entry_id\&quot;: \&quot;abide_by\&quot;,                                 \&quot;sense_id\&quot;: \&quot;t_en_gb0000029.003\&quot;                             }                         ]   }  &#x60;&#x60;&#x60; &lt;div id&#x3D;\&quot;synonyms\&quot;&gt;&lt;/div&gt; 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThesaurusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        ThesaurusApi apiInstance = new ThesaurusApi(defaultClient);
        String sourceLang = "en"; // String | Language code of the source language in a Thesaurus dataset.
        String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of data fields to return for the matched entries. What to return - if specified, either 'synonyms', 'antonyms' or 'synonyms,antonyms' It cannot be empty. 
        Boolean strictMatch = false; // Boolean | Specifies whether diacritics must match exactly. If \"false\", near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both).
        try {
            Thesaurus result = apiInstance.thesaurusSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, strictMatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThesaurusApi#thesaurusSourceLangWordIdGet");
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
 **sourceLang** | **String**| Language code of the source language in a Thesaurus dataset. | [enum: en]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of data fields to return for the matched entries. What to return - if specified, either &#39;synonyms&#39;, &#39;antonyms&#39; or &#39;synonyms,antonyms&#39; It cannot be empty.  | [optional] [enum: synonyms, antonyms]
 **strictMatch** | **Boolean**| Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). | [optional] [default to false]

### Return type

[**Thesaurus**](Thesaurus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **400** | Invalid value for filters such as lexicalCategory, registers, domains, etc. Invalid value for fields projections accepted. It is not possible to project a non-existing field.  |  -  |
| **404** | No entry was found matching the selection parameters; OR an invalid filter was specified.  |  -  |
| **414** | URL is too long. |  -  |
| **500** | Internal error. An error occurred during processing. |  -  |

