/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.5.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tokyo.northside.odapi.v2;

import tokyo.northside.odapi.ApiException;
import tokyo.northside.odapi.model.ErrorSchema;
import tokyo.northside.odapi.model.RetrieveEntry;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntriesApi
 */
@Ignore
public class EntriesApiTest {

    private final EntriesApi api = new EntriesApi();

    /**
     * Retrieve dictionary information for a given word
     *
     *  Use this to retrieve definitions, [pronunciations](documentation/glossary?term&#x3D;pronunciation), example sentences, [grammatical information](documentation/glossary?term&#x3D;grammaticalfeatures) and [word origins](documentation/glossary?term&#x3D;etymology).  TIP: Entries ONLY works for dictionary headwords. You may need to use the Lemmas endpoint first to link an inflected form back to its headword (e.g., pixels --&gt; pixel). Alternatively, you can use the Words endpoint, a feature that enables you to retrieve definitions, pronunciations, word origins, and grammatical data across headwords and inflected words with just one call to the API.  Use filters to limit the [entry](documentation/glossary?term&#x3D;entry) information that is returned. For example, you may only require definitions and not everything else, or just [pronunciations](documentation/glossary?term&#x3D;pronunciation). The full list of filters can be retrieved from the filters Utility endpoint. You can also specify values within the filter using &#39;&#x3D;&#39;. For example &#39;grammaticalFeatures&#x3D;singular&#39;. Filters can also be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;.  &lt;div id&#x3D;\&quot;dictionary_entries_filters\&quot;&gt;&lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void entriesSourceLangWordIdGetTest() throws ApiException {
        String sourceLang = null;
        String wordId = null;
        String appId = null;
        String appKey = null;
        List<String> fields = null;
        String grammaticalFeatures = null;
        String lexicalCategory = null;
        String domains = null;
        String registers = null;
        Boolean strictMatch = null;
        RetrieveEntry response = api.entriesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, grammaticalFeatures, lexicalCategory, domains, registers, strictMatch);

        // TODO: test validations
    }
}
