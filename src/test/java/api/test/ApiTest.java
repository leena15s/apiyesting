package api.test;

import api.locate.ApiLocators;
import api.page.ApiPage;
import api.pojo.PetRequest;
import api.pojo.PetResponse;
import io.restassured.response.Response;
import org.junit.Test;

import static api.testhelper.ApiTestHelper.verifyResponseCode;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ApiTest {

    private ApiPage apiPage = new ApiPage();

    @Test
    public void testGetBooking() {
        Response response = apiPage.sendGetRequest("/booking");
        verifyResponseCode(response, 200);
        response.prettyPrint();
    }

//    @Test
//    public void testGetBookingById() {
//        int bookingId = 1;
//        Response response = apiPage.getBookingDetailsById(bookingId);
//        response.prettyPrint();
//          verifyResponseCode(response, 200);
//        assertTrue(response.getBody().asString().contains("bookingid"));
//    }


    @Test
    public void testPostAuthentication() {
        String jsonBody = "{ \"username\": \"admin\", \"password\": \"password123\" }";
        Response response = apiPage.sendPostRequest("https://restful-booker.herokuapp.com/auth", jsonBody);
        response.prettyPrint();
        verifyResponseCode(response, 200);

    }

    @Test
    public void testPostCreatePet() {
        PetRequest petRequest = new PetRequest("doggie", "available");
        Response response = apiPage.sendPostRequest(ApiLocators.CREATE_PET, petRequest, true);
        response.prettyPrint();
        verifyResponseCode(response, 200);
        PetResponse petResponse = response.getBody().as(PetResponse.class);
        assertNotNull(petResponse.getId());
        assertEquals("doggie", petResponse.getName());
        assertEquals("available", petResponse.getStatus());
    }



}