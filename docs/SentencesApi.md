# SentencesApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sentencesSourceLangWordIdGet**](SentencesApi.md#sentencesSourceLangWordIdGet) | **GET** /sentences/{source_lang}/{word_id} | Retrieve real example sentences of a word in use



## sentencesSourceLangWordIdGet

> SentencesResults sentencesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, strictMatch)

Retrieve real example sentences of a word in use

 Use this to retrieve sentences extracted from a corpus of real-world language, including news and blog content. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SentencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        SentencesApi apiInstance = new SentencesApi(defaultClient);
        String sourceLang = "en"; // String | Language code of the source language.
        String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        Boolean strictMatch = false; // Boolean | Specifies whether diacritics must match exactly. If \"false\", near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both).
        try {
            SentencesResults result = apiInstance.sentencesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, strictMatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SentencesApi#sentencesSourceLangWordIdGet");
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
 **sourceLang** | **String**| Language code of the source language. | [enum: en, es]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **strictMatch** | **Boolean**| Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). | [optional] [default to false]

### Return type

[**SentencesResults**](SentencesResults.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | No entry was found matching the selection parameters; OR an invalid filter was specified.  |  -  |
| **414** | URL is too long. |  -  |
| **500** | Internal error. An error occurred during processing. |  -  |

