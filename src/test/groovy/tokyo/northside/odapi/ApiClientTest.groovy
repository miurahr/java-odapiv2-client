package tokyo.northside.odapi

import org.junit.Test
import tokyo.northside.odapi.v2.EntriesApi

import static org.junit.Assert.*

class ApiClientTest {
    def ENDPOINT_URL = "https://od-api.oxforddictionaries.com/api/v2/"
    def appId = System.properties.getProperty("oxfordId")
    def appKey = System.properties.getProperty("oxfordKey")

    @Test
    void queryResultTest() {
        def client = Configuration.getDefaultApiClient()
        client.setBasePath(ENDPOINT_URL)
        def apiInstance = new EntriesApi(client)
        def resultEntry = apiInstance.entriesSourceLangWordIdGet("en-gb", "ace",
                appId, appKey,
                Arrays.asList("definitions"),
                null, null, null, null,
                true)
        def result = resultEntry.getResults()
        assertEquals(2, result.size())
        for (def i; i < result.size(); i++) {
            def lexicalEntries = result.get(i).getLexicalEntries()
            for (def j; j < lexicalEntries.size(); j++) {
                def entry = lexicalEntries.get(j).getEntries().get(0)
                def sense = entry.getSenses().get(0)
                assertNotNull(sense.getDefinitions().get(0))
            }
        }
    }

}
