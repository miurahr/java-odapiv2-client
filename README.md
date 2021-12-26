# tokyo.northside.odapi.v2 - Kotlin client library for Oxford Dictionaries API v2

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://od-api.oxforddictionaries.com/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EntriesApi* | [**entriesSourceLangWordIdGet**](docs/EntriesApi.md#entriessourcelangwordidget) | **GET** /entries/{source_lang}/{word_id} | Retrieve dictionary information for a given word
*InflectionsApi* | [**inflectionsSourceLangWordIdGet**](docs/InflectionsApi.md#inflectionssourcelangwordidget) | **GET** /inflections/{source_lang}/{word_id} | Retrieves the inflected forms of a given word.
*LemmasApi* | [**lemmasSourceLangWordIdGet**](docs/LemmasApi.md#lemmassourcelangwordidget) | **GET** /lemmas/{source_lang}/{word_id} | Check a word exists in the dictionary and retrieve its root form
*SearchApi* | [**searchSourceLangGet**](docs/SearchApi.md#searchsourcelangget) | **GET** /search/{source_lang} | Retrieves possible dictionary matches to an input string
*SearchApi* | [**searchThesaurusSourceLangGet**](docs/SearchApi.md#searchthesaurussourcelangget) | **GET** /search/thesaurus/{source_lang} | Retrieves possible dictionary matches to an input string
*SearchApi* | [**searchTranslationsSourceLangSearchTargetLangSearchGet**](docs/SearchApi.md#searchtranslationssourcelangsearchtargetlangsearchget) | **GET** /search/translations/{source_lang_search}/{target_lang_search} | Retrieves possible headwords with translations
*SentencesApi* | [**sentencesSourceLangWordIdGet**](docs/SentencesApi.md#sentencessourcelangwordidget) | **GET** /sentences/{source_lang}/{word_id} | Retrieve real example sentences of a word in use
*ThesaurusApi* | [**thesaurusSourceLangWordIdGet**](docs/ThesaurusApi.md#thesaurussourcelangwordidget) | **GET** /thesaurus/{source_lang}/{word_id} | Retrieve words that are similar to a given word
*TranslationsApi* | [**translationsSourceLangTranslateTargetLangTranslateWordIdGet**](docs/TranslationsApi.md#translationssourcelangtranslatetargetlangtranslatewordidget) | **GET** /translations/{source_lang_translate}/{target_lang_translate}/{word_id} | Retrieve translations for a given word
*UtilityApi* | [**domainsSourceLangDomainsTargetLangDomainsGet**](docs/UtilityApi.md#domainssourcelangdomainstargetlangdomainsget) | **GET** /domains/{source_lang_domains}/{target_lang_domains} | Lists available domains in a bilingual dataset
*UtilityApi* | [**domainsSourceLangGet**](docs/UtilityApi.md#domainssourcelangget) | **GET** /domains/{source_lang} | Lists available domains in a monolingual dataset
*UtilityApi* | [**fieldsEndpointGet**](docs/UtilityApi.md#fieldsendpointget) | **GET** /fields/{endpoint} | Lists available fields for specific endpoint
*UtilityApi* | [**fieldsGet**](docs/UtilityApi.md#fieldsget) | **GET** /fields | Lists available fields
*UtilityApi* | [**filtersEndpointGet**](docs/UtilityApi.md#filtersendpointget) | **GET** /filters/{endpoint} | Lists available filters for specific endpoint
*UtilityApi* | [**filtersGet**](docs/UtilityApi.md#filtersget) | **GET** /filters | Lists available filters
*UtilityApi* | [**grammaticalFeaturesSourceLangGet**](docs/UtilityApi.md#grammaticalfeaturessourcelangget) | **GET** /grammaticalFeatures/{source_lang} | Lists available grammatical features in a monolingual dataset
*UtilityApi* | [**grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet**](docs/UtilityApi.md#grammaticalfeaturessourcelanggrammaticaltargetlanggrammaticalget) | **GET** /grammaticalFeatures/{source_lang_grammatical}/{target_lang_grammatical} | Lists available grammatical features in a bilingual dataset
*UtilityApi* | [**languagesGet**](docs/UtilityApi.md#languagesget) | **GET** /languages | Returns the names of Dictionaries in the API
*UtilityApi* | [**lexicalCategoriesSourceLangGet**](docs/UtilityApi.md#lexicalcategoriessourcelangget) | **GET** /lexicalCategories/{source_lang} | Lists available lexical categories in a monolingual dataset
*UtilityApi* | [**lexicalCategoriesSourceLangLexicalTargetLangLexicalGet**](docs/UtilityApi.md#lexicalcategoriessourcelanglexicaltargetlanglexicalget) | **GET** /lexicalCategories/{source_lang_lexical}/{target_lang_lexical} | Lists available lexical categories in a bilingual dataset
*UtilityApi* | [**registersSourceLangGet**](docs/UtilityApi.md#registerssourcelangget) | **GET** /registers/{source_lang} | Lists available registers in a  monolingual dataset
*UtilityApi* | [**registersSourceLangRegistersTargetLangRegistersGet**](docs/UtilityApi.md#registerssourcelangregisterstargetlangregistersget) | **GET** /registers/{source_lang_registers}/{target_lang_registers} | Lists available registers in a bilingual dataset
*WordsApi* | [**wordsSourceLangGet**](docs/WordsApi.md#wordssourcelangget) | **GET** /words/{source_lang} | Check if an inflected form exists in the dictionary and retrieve the entries data of its root form.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [tokyo.northside.odapi.v2.models.BilingualEntry](docs/BilingualEntry.md)
 - [tokyo.northside.odapi.v2.models.BilingualHeadwordEntry](docs/BilingualHeadwordEntry.md)
 - [tokyo.northside.odapi.v2.models.BilingualLexicalEntry](docs/BilingualLexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.BilingualSense](docs/BilingualSense.md)
 - [tokyo.northside.odapi.v2.models.BilingualSenseConstructions](docs/BilingualSenseConstructions.md)
 - [tokyo.northside.odapi.v2.models.DatasetCrossLink](docs/DatasetCrossLink.md)
 - [tokyo.northside.odapi.v2.models.DomainClassesList](docs/DomainClassesList.md)
 - [tokyo.northside.odapi.v2.models.DomainsList](docs/DomainsList.md)
 - [tokyo.northside.odapi.v2.models.Entry](docs/Entry.md)
 - [tokyo.northside.odapi.v2.models.ErrorSchema](docs/ErrorSchema.md)
 - [tokyo.northside.odapi.v2.models.Filters](docs/Filters.md)
 - [tokyo.northside.odapi.v2.models.FiltersResults](docs/FiltersResults.md)
 - [tokyo.northside.odapi.v2.models.HeadwordEntry](docs/HeadwordEntry.md)
 - [tokyo.northside.odapi.v2.models.HeadwordInflection](docs/HeadwordInflection.md)
 - [tokyo.northside.odapi.v2.models.HeadwordLemmatron](docs/HeadwordLemmatron.md)
 - [tokyo.northside.odapi.v2.models.HeadwordThesaurus](docs/HeadwordThesaurus.md)
 - [tokyo.northside.odapi.v2.models.InflectedForm](docs/InflectedForm.md)
 - [tokyo.northside.odapi.v2.models.InflectionLexicalEntry](docs/InflectionLexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.Inflections](docs/Inflections.md)
 - [tokyo.northside.odapi.v2.models.Languages](docs/Languages.md)
 - [tokyo.northside.odapi.v2.models.LanguagesResults](docs/LanguagesResults.md)
 - [tokyo.northside.odapi.v2.models.LanguagesSourceLanguage](docs/LanguagesSourceLanguage.md)
 - [tokyo.northside.odapi.v2.models.LanguagesTargetLanguage](docs/LanguagesTargetLanguage.md)
 - [tokyo.northside.odapi.v2.models.Lemmatron](docs/Lemmatron.md)
 - [tokyo.northside.odapi.v2.models.LemmatronLexicalEntry](docs/LemmatronLexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.LexicalCategory](docs/LexicalCategory.md)
 - [tokyo.northside.odapi.v2.models.LexicalEntry](docs/LexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.RegionsList](docs/RegionsList.md)
 - [tokyo.northside.odapi.v2.models.RegistersList](docs/RegistersList.md)
 - [tokyo.northside.odapi.v2.models.RetrieveEntry](docs/RetrieveEntry.md)
 - [tokyo.northside.odapi.v2.models.RetrieveTranslations](docs/RetrieveTranslations.md)
 - [tokyo.northside.odapi.v2.models.SemanticClassesList](docs/SemanticClassesList.md)
 - [tokyo.northside.odapi.v2.models.Sense](docs/Sense.md)
 - [tokyo.northside.odapi.v2.models.SenseConstructions](docs/SenseConstructions.md)
 - [tokyo.northside.odapi.v2.models.SenseLink](docs/SenseLink.md)
 - [tokyo.northside.odapi.v2.models.SentencesEntry](docs/SentencesEntry.md)
 - [tokyo.northside.odapi.v2.models.SentencesLexicalEntry](docs/SentencesLexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.SentencesResults](docs/SentencesResults.md)
 - [tokyo.northside.odapi.v2.models.Thesaurus](docs/Thesaurus.md)
 - [tokyo.northside.odapi.v2.models.ThesaurusEntry](docs/ThesaurusEntry.md)
 - [tokyo.northside.odapi.v2.models.ThesaurusLexicalEntry](docs/ThesaurusLexicalEntry.md)
 - [tokyo.northside.odapi.v2.models.ThesaurusLink](docs/ThesaurusLink.md)
 - [tokyo.northside.odapi.v2.models.ThesaurusSense](docs/ThesaurusSense.md)
 - [tokyo.northside.odapi.v2.models.ToneGroup](docs/ToneGroup.md)
 - [tokyo.northside.odapi.v2.models.ToneGroupTones](docs/ToneGroupTones.md)
 - [tokyo.northside.odapi.v2.models.UtilityLabels](docs/UtilityLabels.md)
 - [tokyo.northside.odapi.v2.models.UtilityLabelsResults](docs/UtilityLabelsResults.md)
 - [tokyo.northside.odapi.v2.models.Wordlist](docs/Wordlist.md)
 - [tokyo.northside.odapi.v2.models.WordlistMetadata](docs/WordlistMetadata.md)
 - [tokyo.northside.odapi.v2.models.WordlistResults](docs/WordlistResults.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
