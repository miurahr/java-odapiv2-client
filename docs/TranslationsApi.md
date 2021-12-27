# TranslationsApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**translationsSourceLangTranslateTargetLangTranslateWordIdGet**](TranslationsApi.md#translationsSourceLangTranslateTargetLangTranslateWordIdGet) | **GET** /translations/{source_lang_translate}/{target_lang_translate}/{word_id} | Retrieve translations for a given word



## translationsSourceLangTranslateTargetLangTranslateWordIdGet

> RetrieveTranslations translationsSourceLangTranslateTargetLangTranslateWordIdGet(sourceLangTranslate, targetLangTranslate, wordId, appId, appKey, strictMatch, fields, grammaticalFeatures, lexicalCategory, domains, registers)

Retrieve translations for a given word

 Use this to return translations for a given word. In the event that a word in the dataset does not have a direct translation, the response will be a [definition](documentation/glossary?term&#x3D;entry) in the target language.    &lt;div id&#x3D;\&quot;translation\&quot;&gt;&lt;/div&gt; 

### Example

```java
// Import classes:
import tokyo.northside.odapi.ApiClient;
import tokyo.northside.odapi.ApiException;
import tokyo.northside.odapi.Configuration;
import tokyo.northside.odapi.models.*;
import tokyo.northside.odapi.v2.TranslationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        TranslationsApi apiInstance = new TranslationsApi(defaultClient);
        String sourceLangTranslate = "en"; // String | Language code of the source language in a bilingual dataset.
        String targetLangTranslate = "en"; // String | Language code of the target language in a bilingual dataset.
        String wordId = "ace"; // String | The identifier for an Entry (case-sensitive).
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        Boolean strictMatch = false; // Boolean | Specifies whether diacritics must match exactly. If \"false\", near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both).
        List<String> fields = Arrays.asList(); // List<String> | A comma-separated list of data fields to return for the matched entries. Valid field names are 'definitions', 'domains', 'etymologies', 'examples', 'pronunciations', 'regions', 'registers', 'variantForms', 'translations'. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned. 
        String grammaticalFeatures = "grammaticalFeatures_example"; // String | Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \"id\" matches the values in the grammaticalFeatures parameter. ```@javascript {   \"grammaticalFeatures\": [                           {                               \"id\": \"mass\",                               \"text\": \"Mass\",                               \"type\": \"Countability\"                           }                       ] } ``` 
        String lexicalCategory = "lexicalCategory_example"; // String | Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \"id\" matches the values in the lexicalCategory parameter. ```@javascript {   \"lexicalCategory\": {                   \"id\": \"adjective\",                   \"text\": \"Adjective\"               } } ``` 
        String domains = "domains_example"; // String | Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \"id\" matches the values in the domains parameter.  ```@javascript {   \"domains\": [     {       \"id\": \"jazz\",       \"text\": \"Jazz\"      }] } ``` 
        String registers = "registers_example"; // String | Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \"id\" matches the values in the registers parameter.  ```@javascript {   \"registers\": [     {       \"id\": \"informal\",       \"text\": \"Informal\"      }] } ``` 
        try {
            RetrieveTranslations result = apiInstance.translationsSourceLangTranslateTargetLangTranslateWordIdGet(sourceLangTranslate, targetLangTranslate, wordId, appId, appKey, strictMatch, fields, grammaticalFeatures, lexicalCategory, domains, registers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranslationsApi#translationsSourceLangTranslateTargetLangTranslateWordIdGet");
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
 **sourceLangTranslate** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangTranslate** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **wordId** | **String**| The identifier for an Entry (case-sensitive). | [default to ace]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **strictMatch** | **Boolean**| Specifies whether diacritics must match exactly. If \&quot;false\&quot;, near-homographs for the given word_id will also be selected (e.g., *rose* matches both *rose* and *rosé*; similarly *rosé* matches both). | [optional] [default to false]
 **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of data fields to return for the matched entries. Valid field names are &#39;definitions&#39;, &#39;domains&#39;, &#39;etymologies&#39;, &#39;examples&#39;, &#39;pronunciations&#39;, &#39;regions&#39;, &#39;registers&#39;, &#39;variantForms&#39;, &#39;translations&#39;. (a) If not specified, all available fields for each word_id are returned. (b) If specified and empty, the minimum payload for each word_id is returned. (c) If more field names are specified, then the minimum payload plus the specified fields for each word_id are returned.  | [optional] [enum: definitions, domains, etymologies, examples, pronunciations, regions, registers, variantForms, translations]
 **grammaticalFeatures** | **String**| Selection filter: a comma-separated list of grammatical features ids to match on (default: all features). The available grammatical features for a given language (or language pair) can be obtained from the /grammaticalfeatures/ endpoint.  The filter keeps all the entries in the response whose grammaticalFeatures \&quot;id\&quot; matches the values in the grammaticalFeatures parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;grammaticalFeatures\&quot;: [                           {                               \&quot;id\&quot;: \&quot;mass\&quot;,                               \&quot;text\&quot;: \&quot;Mass\&quot;,                               \&quot;type\&quot;: \&quot;Countability\&quot;                           }                       ] } &#x60;&#x60;&#x60;  | [optional]
 **lexicalCategory** | **String**| Selection filter: a comma-separated list of lexical categories ids to match on (default: all categories). The available lexical categories for a given language (or language pair) can be obtained from the /lexicalcategories/ endpoint.  The filter keeps all the entries in the response whose lexicalCategory \&quot;id\&quot; matches the values in the lexicalCategory parameter. &#x60;&#x60;&#x60;@javascript {   \&quot;lexicalCategory\&quot;: {                   \&quot;id\&quot;: \&quot;adjective\&quot;,                   \&quot;text\&quot;: \&quot;Adjective\&quot;               } } &#x60;&#x60;&#x60;  | [optional]
 **domains** | **String**| Selection filter: a comma-separated list of domains ids to match on (default: all domains). The available domains for a given language (or language pair) can be obtained from the /domains/ endpoint.  The filter keeps all the senses and subsenses in the response whose domains \&quot;id\&quot; matches the values in the domains parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;domains\&quot;: [     {       \&quot;id\&quot;: \&quot;jazz\&quot;,       \&quot;text\&quot;: \&quot;Jazz\&quot;      }] } &#x60;&#x60;&#x60;  | [optional]
 **registers** | **String**| Selection filter: a comma-separated list of registers ids to match on (default: all registers). The available registers for a given language (or language pair) can be obtained from the /registers/ endpoint.  The filter keeps all the senses and subsenses in the response whose registers \&quot;id\&quot; matches the values in the registers parameter.  &#x60;&#x60;&#x60;@javascript {   \&quot;registers\&quot;: [     {       \&quot;id\&quot;: \&quot;informal\&quot;,       \&quot;text\&quot;: \&quot;Informal\&quot;      }] } &#x60;&#x60;&#x60;  | [optional]

### Return type

[**RetrieveTranslations**](RetrieveTranslations.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | no bilingual entry is found matching supplied source_lang and id and/or that entry has no senses with translations in the target language.  |  -  |
| **414** | URL is too long. |  -  |
| **500** | Internal error. An error occurred during processing. |  -  |

