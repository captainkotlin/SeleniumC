package reqres.users;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import io.restassured.specification.ResponseSpecification.*;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.*;

public class CreateUser extends AbstractUsersApiTest
{
    @Test
    public void createUser()
    {
        given(requestSpecification)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .expect()
                .statusCode(HTTP_OK)
                .when()
                .post();
    }
}
