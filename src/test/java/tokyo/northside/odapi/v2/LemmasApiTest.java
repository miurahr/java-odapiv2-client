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
import tokyo.northside.odapi.model.Lemmatron;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LemmasApi
 */
@Ignore
public class LemmasApiTest {

    private final LemmasApi api = new LemmasApi();

    /**
     * Check a word exists in the dictionary and retrieve its root form
     *
     *  Use this to check if a word exists in the dictionary, or what &#39;root&#39; form it links to (e.g., swimming &gt; swim). The response tells you the possible [lemmas](documentation/glossary?term&#x3D;lemma) for a given [inflected](documentation/glossary?term&#x3D;inflection) word. This can then be combined with other endpoints to retrieve more information.  The results can be filtered by lexicalCategories and/or grammaticalFeatures. Filters can be combined.  Combining different filters will build a query using &#39;AND&#39; operators, while if a filter contains more than one value it will build a query using &#39;OR&#39; operators. For example, a combination of filters like &#39;?grammaticalFeatures&#x3D;singular&amp;lexicalCategory&#x3D;noun,verb&#39; will return entries which match the query (&#39;noun&#39; OR &#39;verb&#39;) AND &#39;singular&#39;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lemmasSourceLangWordIdGetTest() throws ApiException {
        String sourceLang = null;
        String wordId = null;
        String appId = null;
        String appKey = null;
        String grammaticalFeatures = null;
        String lexicalCategory = null;
        Lemmatron response = api.lemmasSourceLangWordIdGet(sourceLang, wordId, appId, appKey, grammaticalFeatures, lexicalCategory);

        // TODO: test validations
    }
}
