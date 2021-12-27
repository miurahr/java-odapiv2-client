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
import tokyo.northside.odapi.model.SentencesResults;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SentencesApi
 */
@Ignore
public class SentencesApiTest {

    private final SentencesApi api = new SentencesApi();

    /**
     * Retrieve real example sentences of a word in use
     *
     *  Use this to retrieve sentences extracted from a corpus of real-world language, including news and blog content. This is available for English and Spanish. For English, the sentences are linked to the correct [sense](documentation/glossary?term&#x3D;sense) of the word in the dictionary. In Spanish, they are linked at the [headword](documentation/glossary?term&#x3D;headword) level.   &lt;div id&#x3D;\&quot;sentences\&quot;&gt;&lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sentencesSourceLangWordIdGetTest() throws ApiException {
        String sourceLang = null;
        String wordId = null;
        String appId = null;
        String appKey = null;
        Boolean strictMatch = null;
        SentencesResults response = api.sentencesSourceLangWordIdGet(sourceLang, wordId, appId, appKey, strictMatch);

        // TODO: test validations
    }
}
