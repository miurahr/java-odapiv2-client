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
import tokyo.northside.odapi.model.Filters;
import tokyo.northside.odapi.model.Languages;
import tokyo.northside.odapi.model.UtilityLabels;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilityApi
 */
@Ignore
public class UtilityApiTest {

    private final UtilityApi api = new UtilityApi();

    /**
     * Lists available domains in a bilingual dataset
     *
     * Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given bilingual language dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainsSourceLangDomainsTargetLangDomainsGetTest() throws ApiException {
        String sourceLangDomains = null;
        String targetLangDomains = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.domainsSourceLangDomainsTargetLangDomainsGet(sourceLangDomains, targetLangDomains, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available domains in a monolingual dataset
     *
     * Returns a list of the available [domains](documentation/glossary?term&#x3D;domain) for a given monolingual language dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void domainsSourceLangGetTest() throws ApiException {
        String sourceLang = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.domainsSourceLangGet(sourceLang, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available fields for specific endpoint
     *
     * Returns the lists of fields available to construct API requests for a given endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fieldsEndpointGetTest() throws ApiException {
        String endpoint = null;
        String appId = null;
        String appKey = null;
        Filters response = api.fieldsEndpointGet(endpoint, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available fields
     *
     * Returns a list of the available fields to construct API requests. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fieldsGetTest() throws ApiException {
        String appId = null;
        String appKey = null;
        Filters response = api.fieldsGet(appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available filters for specific endpoint
     *
     * Returns a list of all the valid filters by endpoint to construct API requests. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filtersEndpointGetTest() throws ApiException {
        String endpoint = null;
        String appId = null;
        String appKey = null;
        Filters response = api.filtersEndpointGet(endpoint, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available filters
     *
     * Returns a list of all the valid filters to construct API requests. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filtersGetTest() throws ApiException {
        String appId = null;
        String appKey = null;
        Filters response = api.filtersGet(appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available grammatical features in a monolingual dataset
     *
     * Returns a list of the available [grammatical features](documentation/glossary?term&#x3D;grammaticalfeatures) for a given monolingual dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void grammaticalFeaturesSourceLangGetTest() throws ApiException {
        String sourceLang = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.grammaticalFeaturesSourceLangGet(sourceLang, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available grammatical features in a bilingual dataset
     *
     * Returns a list of the available [grammatical features](documentation/glossary?term&#x3D;grammaticalfeatures) for a given bilingual dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGetTest() throws ApiException {
        String sourceLangGrammatical = null;
        String targetLangGrammatical = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.grammaticalFeaturesSourceLangGrammaticalTargetLangGrammaticalGet(sourceLangGrammatical, targetLangGrammatical, appId, appKey);

        // TODO: test validations
    }
    /**
     * Returns the names of Dictionaries in the API
     *
     * Returns the names of monolingual and bilingual language datasets available in the API 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languagesGetTest() throws ApiException {
        String appId = null;
        String appKey = null;
        String sourceLanguage = null;
        String targetLanguage = null;
        Languages response = api.languagesGet(appId, appKey, sourceLanguage, targetLanguage);

        // TODO: test validations
    }
    /**
     * Lists available lexical categories in a monolingual dataset
     *
     * Returns a list of available [lexical categories](documentation/glossary?term&#x3D;lexicalcategory) for a given language dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lexicalCategoriesSourceLangGetTest() throws ApiException {
        String sourceLang = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.lexicalCategoriesSourceLangGet(sourceLang, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available lexical categories in a bilingual dataset
     *
     * Returns a list of available [lexical categories](documentation/glossary?term&#x3D;lexicalcategory) for a given bilingual dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lexicalCategoriesSourceLangLexicalTargetLangLexicalGetTest() throws ApiException {
        String sourceLangLexical = null;
        String targetLangLexical = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.lexicalCategoriesSourceLangLexicalTargetLangLexicalGet(sourceLangLexical, targetLangLexical, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available registers in a  monolingual dataset
     *
     * Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given monolingual language dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registersSourceLangGetTest() throws ApiException {
        String sourceLang = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.registersSourceLangGet(sourceLang, appId, appKey);

        // TODO: test validations
    }
    /**
     * Lists available registers in a bilingual dataset
     *
     * Returns a list of the available [registers](documentation/glossary?term&#x3D;registers) for a given bilingual language dataset. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registersSourceLangRegistersTargetLangRegistersGetTest() throws ApiException {
        String sourceLangRegisters = null;
        String targetLangRegisters = null;
        String appId = null;
        String appKey = null;
        UtilityLabels response = api.registersSourceLangRegistersTargetLangRegistersGet(sourceLangRegisters, targetLangRegisters, appId, appKey);

        // TODO: test validations
    }
}
