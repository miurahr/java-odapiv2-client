# InflectionsApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**inflectionsSourceLangWordIdGet**](InflectionsApi.md#inflectionsSourceLangWordIdGet) | **GET** /inflections/{source_lang}/{word_id} | Retrieves the inflected forms of a given word.



## inflectionsSourceLangWordIdGet

> Inflections inflectionsSourceLangWordIdGet(sourceLang, wordId, appId, appKey, strictMatch)

Retrieves the inflected forms of a given word.

Retrieve all the [inflections](documentation/glossary?term&#x3D;inflection) of a given word_id. The inflections are given for a lexicalEntry with a specific lexicalCategory. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InflectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        InflectionsApi apiInstance = new InflectionsApi(defaultClient);
        String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
        String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        Boolean strictMatch = false; // Boolean | Specifies whether diacritics must match exactly. If \"false\", near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both).
        try {
            Inflections result = apiInstance.inflectionsSourceLangWordIdGet(sourceLang, wordId, appId, appKey, strictMatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InflectionsApi#inflectionsSourceLangWordIdGet");
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
 **sourceLang** | **String**| Language code of the source language in a monolingual dataset. | [enum: en-gb, en-us, es, hi, lv, ro, sw, ta]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **strictMatch** | **Boolean**| Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). | [optional] [default to false]

### Return type

[**Inflections**](Inflections.md)

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

