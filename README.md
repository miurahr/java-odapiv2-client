# tokyo.northside.odapi.v2 - Kotlin client library for Oxford Dictionaries API v2

This projects aims to facilitate the interaction with the Oxford Dictionaries API.
A complete documentation for the OD API can be reached at:
https://developer.oxforddictionaries.com/documentation.

A development status is considered `ALPHA`.
A programming interface will be changed.

- Oxford Dictionary API version: 2.5.1
- Generate date: 2021-12-27T11:50:35.407+09:00[Asia/Tokyo]
- Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Use

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>tokyo.northside</groupId>
  <artifactId>java-odapiv2-client</artifactId>
  <version>2.5.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
implement "tokyo.northside:java-odapiv2-client:2.5.1"
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import tokyo.northside.odapi.*;
import tokyo.northside.odapi.auth.*;
import org.openapitools.client.model.*;
import tokyo.northside.odapi.v2.EntriesApi;

public class EntriesApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EntriesApi* | [**entriesSourceLangWordIdGet**](docs/EntriesApi.md#entriesSourceLangWordIdGet) | **GET** /entries/{source_lang}/{word_id} | Retrieve dictionary information for a given word
*InflectionsApi* | [**inflectionsSourceLangWordIdGet**](docs/InflectionsApi.md#inflectionsSourceLangWordIdGet) | **GET** /inflections/{source_lang}/{word_id} | Retrieves the inflected forms of a given word.
*LemmasApi* | [**lemmasSourceLangWordIdGet**](docs/LemmasApi.md#lemmasSourceLangWordIdGet) | **GET** /lemmas/{source_lang}/{word_id} | Check a word exists in the dictionary and retrieve its root form
*SearchApi* | [**searchSourceLangGet**](docs/SearchApi.md#searchSourceLangGet) | **GET** /search/{source_lang} | Retrieves possible dictionary matches to an input string
*SearchApi* | [**searchThesaurusSourceLangGet**](docs/SearchApi.md#searchThesaurusSourceLangGet) | **GET** /search/thesaurus/{source_lang} | Retrieves possible dictionary matches to an input string
*SearchApi* | [**searchTranslationsSourceLangSearchTargetLangSearchGet**](docs/SearchApi.md#searchTranslationsSourceLangSearchTargetLangSearchGet) | **GET** /search/translations/{source_lang_search}/{target_lang_search} | Retrieves possible headwords with translations
*SentencesApi* | [**sentencesSourceLangWordIdGet**](docs/SentencesApi.md#sentencesSourceLangWordIdGet) | **GET** /sentences/{source_lang}/{word_id} | Retrieve real example sentences of a word in use
*ThesaurusApi* | [**thesaurusSourceLangWordIdGet**](docs/ThesaurusApi.md#thesaurusSourceLangWordIdGet) | **GET** /thesaurus/{source_lang}/{word_id} | Retrieve words that are similar to a given word
*TranslationsApi* | [**translationsSourceLangTranslateTargetLangTranslateWordIdGet**](docs/TranslationsApi.md#translationsSourceLangTranslateTargetLangTranslateWordIdGet) | **GET** /translations/{source_lang_translate}/{target_lang_translate}/{word_id} | Retrieve translations for a given word
*UtilityApi* | [**domainsSourceLangDomainsTargetLangDomainsGet**](docs/UtilityApi.md#domainsSourceLangDomainsTargetLangDomainsGet) | **GET** /domains/{source_lang_domains}/{target_lang_domains} | Lists available domains in a bilingual dataset
*UtilityApi* | [**domainsSourceLangGet**](docs/UtilityApi.md#domainsSourceLangGet) | **GET** /domains/{source_lang} | Lists available domains in a monolingual dataset
*UtilityApi* | [**fieldsEndpointGet**](docs/UtilityApi.md#fieldsEndpointGet) | **GET** /fields/{endpoint} | Lists available fields for specific endpoint
*UtilityApi* | [**fieldsGet**](docs/UtilityApi.md#fieldsGet) | **GET** /fields | Lists available fields
*UtilityApi* | [**filtersEndpointGet**](docs/UtilityApi.md#filtersEndpointGet) | **GET** /filters/{endpoint} | Lists available filters for specific endpoint
*UtilityApi* | [**filtersGet**](docs/UtilityApi.md#filtersGet) | **GET** /filters | Lists available filters
*UtilityApi* | [**grammaticalFeaturesSourceLangGet**](docs/UtilityApi.md#grammaticalFeaturesSourceLangGet) | **GET** /grammaticalFeatures/{source_lang} | Lists available grammatical features in a monolingual dataset
*UtilityApi* | [**grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet**](docs/UtilityApi.md#grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet) | **GET** /grammaticalFeatures/{source_lang_grammatical}/{target_lang_grammatical} | Lists available grammatical features in a bilingual dataset
*UtilityApi* | [**languagesGet**](docs/UtilityApi.md#languagesGet) | **GET** /languages | Returns the names of Dictionaries in the API
*UtilityApi* | [**lexicalCategoriesSourceLangGet**](docs/UtilityApi.md#lexicalCategoriesSourceLangGet) | **GET** /lexicalCategories/{source_lang} | Lists available lexical categories in a monolingual dataset
*UtilityApi* | [**lexicalCategoriesSourceLangLexicalTargetLangLexicalGet**](docs/UtilityApi.md#lexicalCategoriesSourceLangLexicalTargetLangLexicalGet) | **GET** /lexicalCategories/{source_lang_lexical}/{target_lang_lexical} | Lists available lexical categories in a bilingual dataset
*UtilityApi* | [**registersSourceLangGet**](docs/UtilityApi.md#registersSourceLangGet) | **GET** /registers/{source_lang} | Lists available registers in a  monolingual dataset
*UtilityApi* | [**registersSourceLangRegistersTargetLangRegistersGet**](docs/UtilityApi.md#registersSourceLangRegistersTargetLangRegistersGet) | **GET** /registers/{source_lang_registers}/{target_lang_registers} | Lists available registers in a bilingual dataset
*WordsApi* | [**wordsSourceLangGet**](docs/WordsApi.md#wordsSourceLangGet) | **GET** /words/{source_lang} | Check if an inflected form exists in the dictionary and retrieve the entries data of its root form.


## Documentation for Models

- [BilingualEntry](docs/BilingualEntry.md)
- [BilingualHeadwordEntry](docs/BilingualHeadwordEntry.md)
- [BilingualLexicalEntry](docs/BilingualLexicalEntry.md)
- [BilingualSense](docs/BilingualSense.md)
- [BilingualSenseConstructions](docs/BilingualSenseConstructions.md)
- [DatasetCrossLink](docs/DatasetCrossLink.md)
- [DomainClassesList](docs/DomainClassesList.md)
- [DomainsList](docs/DomainsList.md)
- [Entry](docs/Entry.md)
- [ErrorSchema](docs/ErrorSchema.md)
- [Filters](docs/Filters.md)
- [FiltersResults](docs/FiltersResults.md)
- [HeadwordEntry](docs/HeadwordEntry.md)
- [HeadwordInflection](docs/HeadwordInflection.md)
- [HeadwordLemmatron](docs/HeadwordLemmatron.md)
- [HeadwordThesaurus](docs/HeadwordThesaurus.md)
- [InflectedForm](docs/InflectedForm.md)
- [InflectionLexicalEntry](docs/InflectionLexicalEntry.md)
- [Inflections](docs/Inflections.md)
- [Languages](docs/Languages.md)
- [LanguagesResults](docs/LanguagesResults.md)
- [LanguagesSourceLanguage](docs/LanguagesSourceLanguage.md)
- [LanguagesTargetLanguage](docs/LanguagesTargetLanguage.md)
- [Lemmatron](docs/Lemmatron.md)
- [LemmatronLexicalEntry](docs/LemmatronLexicalEntry.md)
- [LexicalCategory](docs/LexicalCategory.md)
- [LexicalEntry](docs/LexicalEntry.md)
- [RegionsList](docs/RegionsList.md)
- [RegistersList](docs/RegistersList.md)
- [RetrieveEntry](docs/RetrieveEntry.md)
- [RetrieveTranslations](docs/RetrieveTranslations.md)
- [SemanticClassesList](docs/SemanticClassesList.md)
- [Sense](docs/Sense.md)
- [SenseConstructions](docs/SenseConstructions.md)
- [SenseLink](docs/SenseLink.md)
- [SentencesEntry](docs/SentencesEntry.md)
- [SentencesLexicalEntry](docs/SentencesLexicalEntry.md)
- [SentencesResults](docs/SentencesResults.md)
- [Thesaurus](docs/Thesaurus.md)
- [ThesaurusEntry](docs/ThesaurusEntry.md)
- [ThesaurusLexicalEntry](docs/ThesaurusLexicalEntry.md)
- [ThesaurusLink](docs/ThesaurusLink.md)
- [ThesaurusSense](docs/ThesaurusSense.md)
- [ToneGroup](docs/ToneGroup.md)
- [ToneGroupTones](docs/ToneGroupTones.md)
- [UtilityLabels](docs/UtilityLabels.md)
- [UtilityLabelsResults](docs/UtilityLabelsResults.md)
- [Wordlist](docs/Wordlist.md)
- [WordlistMetadata](docs/WordlistMetadata.md)
- [WordlistResults](docs/WordlistResults.md)


## Documentation for Authorization

All endpoints require authorization. Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
