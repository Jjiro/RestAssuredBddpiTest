package RestAssuredTests;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/*
* Given() - set cookies, add auth, add param, set headers info, etc...
* When() - get, post, put, delete,...
* Then() - validate status code, extract response, extract headers cookies and response body, ...
* */
public class Demo1GetRequest {

    @Test
    public void getNameDetails(){
        given()
                .when()
                    .get("https://api.nationalize.io?name=gregory")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .assertThat().body("name", equalTo("gregory"))
                .header("Content-Type", "application/json; charset=utf-8");

    }
}
