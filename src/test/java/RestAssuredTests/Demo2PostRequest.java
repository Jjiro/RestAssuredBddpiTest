package RestAssuredTests;


import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/*
* Given() - set cookies, add auth, add param, set headers info, etc...
* When() - get, post, put, delete,...
* Then() - validate status code, extract response, extract headers cookies and response body, ...
*
*/
public class Demo2PostRequest {

    public static HashMap map = new HashMap();

    @BeforeClass
    public void postData(){
        map.put("FirstName", RestUtils.getFirstName());
        map.put("FirstName", RestUtils.getLastName());
        map.put("FirstName", RestUtils.getUserName());
        map.put("FirstName", RestUtils.getPassword());
        map.put("FirstName", RestUtils.getEmail());

        RestAssured.baseURI = "https://reqres.in/api";
        RestAssured.basePath = "/register";
    }

    @Test
    public void testPostData(){
        given()
              .contentType("application/json")
              .body(map)

        .when()
              .post()

        .then()
              .statusCode(201)
              .and()
              .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
              .and()
              .body("Massage", equalTo("Operation completed successfully"));

    }
}
