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
import tokyo.northside.odapi.model.Thesaurus;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ThesaurusApi
 */
@Ignore
public class ThesaurusApiTest {

    private final ThesaurusApi api = new ThesaurusApi();

    /**
     * Retrieve words that are similar to a given word
     *
     * Use this to retrieve words that are similar/opposite in meaning to the input word ([synonym](documentation/glossary?term&#x3D;synonym)/[antonym](documentation/glossary?term&#x3D;antonym)).  Tip: Some Entries responses contain sense-level links to a Thesaurus entry by the property \&quot;thesaurusLink\&quot;. For instance:  &#x60;&#x60;&#x60;@javascript   {     \&quot;thesaurusLinks\&quot;: [                             {                                 \&quot;entry_id\&quot;: \&quot;abide_by\&quot;,                                 \&quot;sense_id\&quot;: \&quot;t_en_gb0000029.003\&quot;                             }                         ]   }  &#x60;&#x60;&#x60; &lt;div id&#x3D;\&quot;synonyms\&quot;&gt;&lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void thesaurusSourceLangWordIdGetTest() throws ApiException {
        String sourceLang = null;
        String wordId = null;
        String appId = null;
        String appKey = null;
        List<String> fields = null;
        Boolean strictMatch = null;
        Thesaurus response = api.thesaurusSourceLangWordIdGet(sourceLang, wordId, appId, appKey, fields, strictMatch);

        // TODO: test validations
    }
}
