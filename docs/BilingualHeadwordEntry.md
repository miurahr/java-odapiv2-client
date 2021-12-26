

# BilingualHeadwordEntry

Group of lexicalEntries related to a specific result for a given word ID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of a word | 
**language** | **String** | IANA language code | 
**lexicalEntries** | [**List&lt;BilingualLexicalEntry&gt;**](BilingualLexicalEntry.md) | A grouping of various senses containing translations in a specific language, and a lexical category that relates to a word | 
**pronunciations** | [**List&lt;Object&gt;**](Object.md) | A list of possible pronunciations of a word |  [optional]
**type** | **String** | The json object type. Could be &#39;headword&#39;, &#39;inflection&#39; or &#39;phrase&#39; |  [optional]
**word** | **String** | (DEPRECATED) A given written or spoken realisation of an entry, lowercased. | 



