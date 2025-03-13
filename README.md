# API Testing with Rest Assured

This repository contains a series of tasks focused on API testing using **Rest Assured** in Java. The tasks demonstrate how to interact with various APIs, perform HTTP requests, validate responses, and handle the deserialization of JSON payloads using POJO classes.

## Table of Contents

1. [Task 1 - Simple GET Request](#task-1---simple-get-request)
2. [Task 2 - POST Request with JSON Payload](#task-2---post-request-with-json-payload)
3. [Task 3 - Petstore POST Request with Response Validation](#task-3---petstore-post-request-with-response-validation)

---

## Task 1 - Simple GET Request

### API: [Restful Booker - Authentication API](https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth)

**Objective**: Implement a basic GET request using Rest Assured to validate the response status code.
 
### Test Case:
- Send a GET request to the authentication endpoint.
- Validate that the response status code is 200 (OK).

# Task 2 - POST Request with JSON Payload
---------------------------------------

### API: [Restful Booker - Authentication API](https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth)

**Objective**: Implement a POST request to authenticate and receive a token in the response. The request body will contain user credentials.

### Test Case:

*   Send a POST request with JSON payload for login authentication.
*   Validate that the response contains a valid token.

## Task 3 - Petstore POST Request with Response Validation

### API: [Petstore API](https://petstore.swagger.io/)

**Objective**: Implement a POST request to create a pet in the pet store and validate the response using POJO classes. The test will verify that the pet was successfully created with the correct details.

### Test Case:

*   Send a POST request to create a new pet.
*   Validate the response body to ensure the pet was created with the correct information.

