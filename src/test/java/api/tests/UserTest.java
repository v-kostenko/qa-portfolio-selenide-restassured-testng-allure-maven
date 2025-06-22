package api.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserTest {

    @Test
    public void getNotAuthUser(){
        given()
                .header("Accept", "application/vnd.github+json")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .header("Authorization", "Bearer " + "cscsc")
                .log().all()
        .when().get("https://api.github.com/user")
        .then().log().all().statusCode(401);
    }
}
