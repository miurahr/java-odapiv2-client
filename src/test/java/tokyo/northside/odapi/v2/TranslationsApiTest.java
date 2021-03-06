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
import tokyo.northside.odapi.model.RetrieveTranslations;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TranslationsApi
 */
@Ignore
public class TranslationsApiTest {

    private final TranslationsApi api = new TranslationsApi();

    /**
     * Retrieve translations for a given word
     *
     *  Use this to return translations for a given word. In the event that a word in the dataset does not have a direct translation, the response will be a [definition](documentation/glossary?term&#x3D;entry) in the target language.    &lt;div id&#x3D;\&quot;translation\&quot;&gt;&lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void translationsSourceLangTranslateTargetLangTranslateWordIdGetTest() throws ApiException {
        String sourceLangTranslate = null;
        String targetLangTranslate = null;
        String wordId = null;
        String appId = null;
        String appKey = null;
        Boolean strictMatch = null;
        List<String> fields = null;
        String grammaticalFeatures = null;
        String lexicalCategory = null;
        String domains = null;
        String registers = null;
        RetrieveTranslations response = api.translationsSourceLangTranslateTargetLangTranslateWordIdGet(sourceLangTranslate, targetLangTranslate, wordId, appId, appKey, strictMatch, fields, grammaticalFeatures, lexicalCategory, domains, registers);

        // TODO: test validations
    }
}
