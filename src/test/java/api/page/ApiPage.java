package api.page;

import api.locate.ApiLocators;
import api.pojo.PetRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class ApiPage {

//    Task 1
    // Method to send a GET request
    public Response sendGetRequest(String endpoint) {
        return RestAssured.given()
                .baseUri(ApiLocators.BASE_URL_BOOKER)
                .get(endpoint);
    }
//    // Method to send a GET request to retrieve booking details by ID
//    public Response getBookingDetailsById(int bookingId) {
//        String endpoint = ApiLocators.GET_BOOKING_BY_ID.replace("{id}", String.valueOf(bookingId)); // Use locator and replace parameter
//        return RestAssured.given()
//                .baseUri(ApiLocators.BASE_URL)  // Using BASE_URL from ApiLocators
//                .get(endpoint);
//    }

//    Task2
// Method to send a POST request with JSON body
public Response sendPostRequest(String endpoint, String body) {
    return RestAssured.given()
            .contentType(ContentType.JSON)
            .body(body)
            .post(endpoint);
}

//  Task3

    // Method to send a POST request to create a pet
    public Response sendPostRequest(String endpoint, Object requestBody, boolean isPetstore) {
        String baseUri = isPetstore ? ApiLocators.BASE_URL_PETSTORE : ApiLocators.BASE_URL_BOOKER;

        return RestAssured.given()
                .baseUri(baseUri)
                .contentType("application/json")
                .body(requestBody)  //pojo to json
                .post(endpoint);
    }

//    // Method to send a GET request
//    public Response sendGetRequest(String endpoint, boolean isPetstore) {
//        String baseUri = isPetstore ? ApiLocators.BASE_URL_PETSTORE : ApiLocators.BASE_URL_BOOKER;
//        return RestAssured.given()
//                .baseUri(baseUri)
//                .get(endpoint);
//    }
//
//    // Method to send a POST request
//    public Response sendPostRequest(String endpoint, Object requestBody, boolean isPetstore) {
//        String baseUri = isPetstore ? ApiLocators.BASE_URL_PETSTORE : ApiLocators.BASE_URL_BOOKER;
//        return RestAssured.given()
//                .baseUri(baseUri)
//                .contentType("application/json")
//                .body(requestBody)
//                .post(endpoint);
//    }
//
//    // Method to send a DELETE request
//    public Response sendDeleteRequest(String endpoint, boolean isPetstore) {
//        String baseUri = isPetstore ? ApiLocators.BASE_URL_PETSTORE : ApiLocators.BASE_URL_BOOKER;
//        return RestAssured.given()
//                .baseUri(baseUri)
//                .delete(endpoint);
//    }
}