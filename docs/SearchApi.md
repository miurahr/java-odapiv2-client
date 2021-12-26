# SearchApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchSourceLangGet**](SearchApi.md#searchSourceLangGet) | **GET** /search/{source_lang} | Retrieves possible dictionary matches to an input string
[**searchThesaurusSourceLangGet**](SearchApi.md#searchThesaurusSourceLangGet) | **GET** /search/thesaurus/{source_lang} | Retrieves possible dictionary matches to an input string
[**searchTranslationsSourceLangSearchTargetLangSearchGet**](SearchApi.md#searchTranslationsSourceLangSearchTargetLangSearchGet) | **GET** /search/translations/{source_lang_search}/{target_lang_search} | Retrieves possible headwords with translations


<a name="searchSourceLangGet"></a>
# **searchSourceLangGet**
> Wordlist searchSourceLangGet(sourceLang, q, appId, appKey, prefix, limit, offset)

Retrieves possible dictionary matches to an input string

 Use this to retrieve possible [headword](documentation/glossary?term&#x3D;headword) matches for a given string of text. The results are calculated using headword matching, fuzzy matching, and [lemmatization](documentation/glossary?term&#x3D;lemma).    &lt;div id&#x3D;\&quot;search\&quot;&gt;&lt;/div&gt; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
    String q = "q_example"; // String | Search string
    String appId = "appId_example"; // String | App ID Authentication Parameter
    String appKey = "appKey_example"; // String | App Key Authentication Parameter
    Boolean prefix = true; // Boolean | Use prefix=true to return only results that start with the value of the \"q\" parameter.
    Integer limit = 56; // Integer | Restricts number of returned results. Default and max. is 5000.
    Integer offset = 56; // Integer | Pagination - results offset.  The sum of offset and limit must not exceed 10000.
    try {
      Wordlist result = apiInstance.searchSourceLangGet(sourceLang, q, appId, appKey, prefix, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchSourceLangGet");
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
 **q** | **String**| Search string |
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **prefix** | **Boolean**| Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. | [optional]
 **limit** | **Integer**| Restricts number of returned results. Default and max. is 5000. | [optional]
 **offset** | **Integer**| Pagination - results offset.  The sum of offset and limit must not exceed 10000. | [optional]

### Return type

[**Wordlist**](Wordlist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. The Search endpoint is able to retrieve a max of 10000 results per query. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
**400** | source_lang and target_lang can not be same; no words matching source_lang and/or translations; offset and limit exceeded 10000 together. |  -  |
**404** | No entry was found matching the selection parameters.  |  -  |
**500** | Internal error. An error occurred during processing. |  -  |

<a name="searchThesaurusSourceLangGet"></a>
# **searchThesaurusSourceLangGet**
> Wordlist searchThesaurusSourceLangGet(sourceLang, q, appId, appKey, prefix, limit, offset)

Retrieves possible dictionary matches to an input string

 Use this to retrieve possible [headword](documentation/glossary?term&#x3D;headword) matches for a given string of text. The results are calculated using headword matching, fuzzy matching, and [lemmatization](documentation/glossary?term&#x3D;lemma).    &lt;div id&#x3D;\&quot;search\&quot;&gt;&lt;/div&gt; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String sourceLang = "en"; // String | Language code of the source language in a Thesaurus dataset.
    String q = "q_example"; // String | Search string
    String appId = "appId_example"; // String | App ID Authentication Parameter
    String appKey = "appKey_example"; // String | App Key Authentication Parameter
    Boolean prefix = true; // Boolean | Use prefix=true to return only results that start with the value of the \"q\" parameter.
    Integer limit = 56; // Integer | Restricts number of returned results. Default and max. is 5000.
    Integer offset = 56; // Integer | Pagination - results offset.  The sum of offset and limit must not exceed 10000.
    try {
      Wordlist result = apiInstance.searchThesaurusSourceLangGet(sourceLang, q, appId, appKey, prefix, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchThesaurusSourceLangGet");
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
 **q** | **String**| Search string |
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **prefix** | **Boolean**| Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. | [optional]
 **limit** | **Integer**| Restricts number of returned results. Default and max. is 5000. | [optional]
 **offset** | **Integer**| Pagination - results offset.  The sum of offset and limit must not exceed 10000. | [optional]

### Return type

[**Wordlist**](Wordlist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. The Search endpoint is able to retrieve a max of 10000 results per query. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
**400** | source_lang and target_lang can not be same; no words matching source_lang and/or translations; offset and limit exceeded 10000 together. |  -  |
**404** | No entry was found matching the selection parameters.  |  -  |
**500** | Internal error. An error occurred during processing. |  -  |

<a name="searchTranslationsSourceLangSearchTargetLangSearchGet"></a>
# **searchTranslationsSourceLangSearchTargetLangSearchGet**
> Wordlist searchTranslationsSourceLangSearchTargetLangSearchGet(sourceLangSearch, targetLangSearch, q, appId, appKey, prefix, limit, offset)

Retrieves possible headwords with translations

 Use this to find possible headwords with translations for a given word.  &lt;div id&#x3D;\&quot;search_translation\&quot;&gt;&lt;/div&gt; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String sourceLangSearch = "en"; // String | Language code of the source language in a bilingual dataset.
    String targetLangSearch = "en"; // String | Language code of the target language in a bilingual dataset.
    String q = "q_example"; // String | Search string
    String appId = "appId_example"; // String | App ID Authentication Parameter
    String appKey = "appKey_example"; // String | App Key Authentication Parameter
    Boolean prefix = true; // Boolean | Use prefix=true to return only results that start with the value of the \"q\" parameter.
    Integer limit = 56; // Integer | Restricts number of returned results. Default and max. is 5000.
    Integer offset = 56; // Integer | pagination - results offset.  The sum of offset and limit must not exceed 10000.
    try {
      Wordlist result = apiInstance.searchTranslationsSourceLangSearchTargetLangSearchGet(sourceLangSearch, targetLangSearch, q, appId, appKey, prefix, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchTranslationsSourceLangSearchTargetLangSearchGet");
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
 **sourceLangSearch** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangSearch** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **q** | **String**| Search string |
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **prefix** | **Boolean**| Use prefix&#x3D;true to return only results that start with the value of the \&quot;q\&quot; parameter. | [optional]
 **limit** | **Integer**| Restricts number of returned results. Default and max. is 5000. | [optional]
 **offset** | **Integer**| pagination - results offset.  The sum of offset and limit must not exceed 10000. | [optional]

### Return type

[**Wordlist**](Wordlist.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. The Search endpoint is able to retrieve a max of 10000 results per query. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
**400** | source_lang and target_lang can not be same; no words matching source_lang and/or translations; offset and limit exceeded 10000 together. |  -  |
**404** | No entry was found matching the selection parameters.  |  -  |
**500** | Internal error. An error occurred during processing. |  -  |

