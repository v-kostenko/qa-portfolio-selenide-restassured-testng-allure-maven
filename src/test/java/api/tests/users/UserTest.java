package api.tests.users;

import api.pojo.Users;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class UserTest extends BaseApiTest {


    @Test()
    @Owner("Volodymyr Kostenko")
    public void getNotAuthUser() {
        given().spec(specification)
                .when().get("/user")
                .then().log().all().statusCode(401);
    }

    @Test
    @Epic("GitHub API")
    @Feature("Users")
    public void getAvailableUserByUserName() {
        Users users = given().log().all().spec(specification).
                when().get("/users/portfolio-AQA").
                then()
                .statusCode(200)
                .extract()
                .as(Users.class);

        Assert.assertEquals(users.getLogin(), "Portfolio-AQA");
        Assert.assertEquals(users.getType(), "User");
                // .body("login", equalTo("Portfolio-AQA"))
                // .body("type", equalTo("User"));
    }

}
