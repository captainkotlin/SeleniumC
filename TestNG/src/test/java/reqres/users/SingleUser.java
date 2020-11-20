package reqres.users;

import org.testng.annotations.Test;
import web.utils.json.JsonValidatorUtils;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.hamcrest.Matchers.is;
import static web.utils.json.JsonUtils.toJsonObject;

public class SingleUser extends AbstractUsersApiTest
{
    @Test
    public void singleUser()
    {
        var body = given()
                .log().all()
                .pathParam("id", 2)
                .expect()
                .statusCode(HTTP_OK)
                .body("size()", is(2))
                .body("data", is(toJsonObject("{ \"id\": 2, \"email\": \"janet.weaver@reqres.in\", \"first_name\": \"Janet\", \"last_name\": \"Weaver\", \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\" }")))
                .when()
                .get("{id}")
                .then()
                .extract()
                .body().asString();
        var schemaPath = getPackageResourcePath("singleUser.json");
        JsonValidatorUtils.of(schemaPath).validateWithException(body);
    }
}
