# UtilityApi

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainsSourceLangDomainsTargetLangDomainsGet**](UtilityApi.md#domainsSourceLangDomainsTargetLangDomainsGet) | **GET** /domains/{source_lang_domains}/{target_lang_domains} | Lists available domains in a bilingual dataset
[**domainsSourceLangGet**](UtilityApi.md#domainsSourceLangGet) | **GET** /domains/{source_lang} | Lists available domains in a monolingual dataset
[**fieldsEndpointGet**](UtilityApi.md#fieldsEndpointGet) | **GET** /fields/{endpoint} | Lists available fields for specific endpoint
[**fieldsGet**](UtilityApi.md#fieldsGet) | **GET** /fields | Lists available fields
[**filtersEndpointGet**](UtilityApi.md#filtersEndpointGet) | **GET** /filters/{endpoint} | Lists available filters for specific endpoint
[**filtersGet**](UtilityApi.md#filtersGet) | **GET** /filters | Lists available filters
[**grammaticalFeaturesSourceLangGet**](UtilityApi.md#grammaticalFeaturesSourceLangGet) | **GET** /grammaticalFeatures/{source_lang} | Lists available grammatical features in a monolingual dataset
[**grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet**](UtilityApi.md#grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet) | **GET** /grammaticalFeatures/{source_lang_grammatical}/{target_lang_grammatical} | Lists available grammatical features in a bilingual dataset
[**languagesGet**](UtilityApi.md#languagesGet) | **GET** /languages | Returns the names of Dictionaries in the API
[**lexicalCategoriesSourceLangGet**](UtilityApi.md#lexicalCategoriesSourceLangGet) | **GET** /lexicalCategories/{source_lang} | Lists available lexical categories in a monolingual dataset
[**lexicalCategoriesSourceLangLexicalTargetLangLexicalGet**](UtilityApi.md#lexicalCategoriesSourceLangLexicalTargetLangLexicalGet) | **GET** /lexicalCategories/{source_lang_lexical}/{target_lang_lexical} | Lists available lexical categories in a bilingual dataset
[**registersSourceLangGet**](UtilityApi.md#registersSourceLangGet) | **GET** /registers/{source_lang} | Lists available registers in a  monolingual dataset
[**registersSourceLangRegistersTargetLangRegistersGet**](UtilityApi.md#registersSourceLangRegistersTargetLangRegistersGet) | **GET** /registers/{source_lang_registers}/{target_lang_registers} | Lists available registers in a bilingual dataset



## domainsSourceLangDomainsTargetLangDomainsGet

> UtilityLabels domainsSourceLangDomainsTargetLangDomainsGet(sourceLangDomains, targetLangDomains, appId, appKey)

Lists available domains in a bilingual dataset

Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given bilingual language dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLangDomains = "en"; // String | Language code of the source language in a bilingual dataset.
        String targetLangDomains = "en"; // String | Language code of the target language in a bilingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.domainsSourceLangDomainsTargetLangDomainsGet(sourceLangDomains, targetLangDomains, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#domainsSourceLangDomainsTargetLangDomainsGet");
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
 **sourceLangDomains** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangDomains** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **400** | source_lang and target_lang can not be same. |  -  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## domainsSourceLangGet

> UtilityLabels domainsSourceLangGet(sourceLang, appId, appKey)

Lists available domains in a monolingual dataset

Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given monolingual language dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.domainsSourceLangGet(sourceLang, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#domainsSourceLangGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## fieldsEndpointGet

> Filters fieldsEndpointGet(endpoint, appId, appKey)

Lists available fields for specific endpoint

Returns the lists of fields available to construct API requests for a given endpoint. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String endpoint = "entries"; // String | Name of the endpoint
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            Filters result = apiInstance.fieldsEndpointGet(endpoint, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#fieldsEndpointGet");
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
 **endpoint** | **String**| Name of the endpoint | [enum: entries, thesaurus]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**Filters**](Filters.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown endpoint.  |  -  |


## fieldsGet

> Filters fieldsGet(appId, appKey)

Lists available fields

Returns a list of the available fields to construct API requests. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            Filters result = apiInstance.fieldsGet(appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#fieldsGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**Filters**](Filters.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |


## filtersEndpointGet

> Filters filtersEndpointGet(endpoint, appId, appKey)

Lists available filters for specific endpoint

Returns a list of all the valid filters by endpoint to construct API requests. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String endpoint = "entries"; // String | Name of the endpoint.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            Filters result = apiInstance.filtersEndpointGet(endpoint, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#filtersEndpointGet");
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
 **endpoint** | **String**| Name of the endpoint. | [enum: entries, lemmas]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**Filters**](Filters.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown endpoint.  |  -  |


## filtersGet

> Filters filtersGet(appId, appKey)

Lists available filters

Returns a list of all the valid filters to construct API requests. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            Filters result = apiInstance.filtersGet(appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#filtersGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**Filters**](Filters.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |


## grammaticalFeaturesSourceLangGet

> UtilityLabels grammaticalFeaturesSourceLangGet(sourceLang, appId, appKey)

Lists available grammatical features in a monolingual dataset

Returns a list of the available [grammatical features](documentation/glossary?term&#x3D;grammaticalfeatures) for a given monolingual dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.grammaticalFeaturesSourceLangGet(sourceLang, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#grammaticalFeaturesSourceLangGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet

> UtilityLabels grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet(sourceLangGrammatical, targetLangGrammatical, appId, appKey)

Lists available grammatical features in a bilingual dataset

Returns a list of the available [grammatical features](documentation/glossary?term&#x3D;grammaticalfeatures) for a given bilingual dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLangGrammatical = "en"; // String | Language code of the source language in a bilingual dataset.
        String targetLangGrammatical = "en"; // String | Language code of the target language in a bilingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet(sourceLangGrammatical, targetLangGrammatical, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet");
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
 **sourceLangGrammatical** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangGrammatical** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **400** | source_lang and target_lang can not be same. |  -  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## languagesGet

> Languages languagesGet(appId, appKey, sourceLanguage, targetLanguage)

Returns the names of Dictionaries in the API

Returns the names of monolingual and bilingual language datasets available in the API 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        String sourceLanguage = "sourceLanguage_example"; // String | Source Language. If provided, output will be filtered by sourceLanguage.
        String targetLanguage = "targetLanguage_example"; // String | Target Language. If provided, output will be filtered by targetLanguage.
        try {
            Languages result = apiInstance.languagesGet(appId, appKey, sourceLanguage, targetLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#languagesGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |
 **sourceLanguage** | **String**| Source Language. If provided, output will be filtered by sourceLanguage. | [optional]
 **targetLanguage** | **String**| Target Language. If provided, output will be filtered by targetLanguage. | [optional]

### Return type

[**Languages**](Languages.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **400** | source_lang and target_lang can not be same. |  -  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## lexicalCategoriesSourceLangGet

> UtilityLabels lexicalCategoriesSourceLangGet(sourceLang, appId, appKey)

Lists available lexical categories in a monolingual dataset

Returns a list of available [lexical categories](documentation/glossary?term&#x3D;lexicalcategory) for a given language dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.lexicalCategoriesSourceLangGet(sourceLang, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#lexicalCategoriesSourceLangGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## lexicalCategoriesSourceLangLexicalTargetLangLexicalGet

> UtilityLabels lexicalCategoriesSourceLangLexicalTargetLangLexicalGet(sourceLangLexical, targetLangLexical, appId, appKey)

Lists available lexical categories in a bilingual dataset

Returns a list of available [lexical categories](documentation/glossary?term&#x3D;lexicalcategory) for a given bilingual dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLangLexical = "en"; // String | Language code of the source language in a bilingual dataset.
        String targetLangLexical = "en"; // String | Language code of the target language in a bilingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.lexicalCategoriesSourceLangLexicalTargetLangLexicalGet(sourceLangLexical, targetLangLexical, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#lexicalCategoriesSourceLangLexicalTargetLangLexicalGet");
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
 **sourceLangLexical** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangLexical** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## registersSourceLangGet

> UtilityLabels registersSourceLangGet(sourceLang, appId, appKey)

Lists available registers in a  monolingual dataset

Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given monolingual language dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLang = "en-gb"; // String | Language code of the source language in a monolingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.registersSourceLangGet(sourceLang, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#registersSourceLangGet");
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
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |


## registersSourceLangRegistersTargetLangRegistersGet

> UtilityLabels registersSourceLangRegistersTargetLangRegistersGet(sourceLangRegisters, targetLangRegisters, appId, appKey)

Lists available registers in a bilingual dataset

Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given bilingual language dataset. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://od-api.oxforddictionaries.com/api/v2");

        UtilityApi apiInstance = new UtilityApi(defaultClient);
        String sourceLangRegisters = "en"; // String | Language code of the source language in a bilingual dataset.
        String targetLangRegisters = "en"; // String | Language code of the target language in a bilingual dataset.
        String appId = "appId_example"; // String | App ID Authentication Parameter
        String appKey = "appKey_example"; // String | App Key Authentication Parameter
        try {
            UtilityLabels result = apiInstance.registersSourceLangRegistersTargetLangRegistersGet(sourceLangRegisters, targetLangRegisters, appId, appKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilityApi#registersSourceLangRegistersTargetLangRegistersGet");
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
 **sourceLangRegisters** | **String**| Language code of the source language in a bilingual dataset. | [enum: en, ar, de, el, es, ha, hi, id, it, mr, ms, nso, pt, qu, ru, te, tk, tn, tpi, tt, ur, xh, zh, zu]
 **targetLangRegisters** | **String**| Language code of the target language in a bilingual dataset. | [enum: en, ar, de, el, es, fa, ha, hi, id, ig, it, ka, mr, ms, nso, pt, qu, ro, ru, tg, tk, tn, tpi, tt, xh, yo, zh, zu]
 **appId** | **String**| App ID Authentication Parameter |
 **appKey** | **String**| App Key Authentication Parameter |

### Return type

[**UtilityLabels**](UtilityLabels.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. |  * X-Request-Id - A unique ID generated for the request. When reporting a problem with a specific request, include the returned X-Request-Id.  <br>  |
| **400** | source_lang and target_lang can not be same. |  -  |
| **404** | Unknown sourceLanguage and/or targetLanguage. |  -  |

