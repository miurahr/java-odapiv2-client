

# BilingualSense

A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**antonyms** | [**List&lt;Object&gt;**](Object.md) |  |  [optional]
**constructions** | [**List&lt;BilingualSenseConstructions&gt;**](BilingualSenseConstructions.md) | A construction provides information about typical syntax used of this sense. Each construction may optionally have one or more examples. Constructions may be translated if there is an equivalent in the target language. |  [optional]
**crossReferenceMarkers** | **List&lt;String&gt;** |  |  [optional]
**crossReferences** | [**List&lt;Object&gt;**](Object.md) | A reference to another word that is closely related, might provide additional information about the subject, has a variant spelling or is an abbreviated form of it. |  [optional]
**datasetCrossLinks** | [**List&lt;DatasetCrossLink&gt;**](DatasetCrossLink.md) | List of links to entries in other datasets |  [optional]
**definitions** | **List&lt;String&gt;** |  |  [optional]
**domainClasses** | [**DomainClassesList**](DomainClassesList.md) |  |  [optional]
**domains** | [**DomainsList**](DomainsList.md) |  |  [optional]
**etymologies** | **List&lt;String&gt;** |  |  [optional]
**examples** | [**List&lt;Object&gt;**](Object.md) | A list of written or spoken rendering of examples of use of a word or text |  [optional]
**id** | **String** | The id of the sense that is required for the delete procedure |  [optional]
**inflections** | [**List&lt;InflectedForm&gt;**](InflectedForm.md) | A list of inflected forms for a sense. |  [optional]
**notes** | [**List&lt;Object&gt;**](Object.md) | various types of notes that appear |  [optional]
**pronunciations** | [**List&lt;Object&gt;**](Object.md) | A list of possible pronunciations of a word |  [optional]
**regions** | [**RegionsList**](RegionsList.md) |  |  [optional]
**registers** | [**RegistersList**](RegistersList.md) |  |  [optional]
**semanticClasses** | [**SemanticClassesList**](SemanticClassesList.md) |  |  [optional]
**shortDefinitions** | **List&lt;String&gt;** |  |  [optional]
**subsenses** | [**List&lt;BilingualSense&gt;**](BilingualSense.md) | Ordered list of subsenses of a sense |  [optional]
**synonyms** | [**List&lt;Object&gt;**](Object.md) |  |  [optional]
**thesaurusLinks** | [**List&lt;ThesaurusLink&gt;**](ThesaurusLink.md) | Ordered list of links to the Thesaurus Dictionary |  [optional]
**translations** | [**List&lt;Object&gt;**](Object.md) | A list of written or spoken rendering of the meaning of a word or text in another language(s) |  [optional]
**variantForms** | [**List&lt;Object&gt;**](Object.md) | Various words that are used interchangeably depending on the context, e.g &#39;aluminium&#39; and &#39;aluminum&#39; |  [optional]



