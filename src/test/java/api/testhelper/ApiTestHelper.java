package api.testhelper;

import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class ApiTestHelper {

    public static void verifyResponseCode(Response response, int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

}
