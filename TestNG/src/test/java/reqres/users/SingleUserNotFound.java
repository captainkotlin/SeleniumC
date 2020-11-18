package reqres.users;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_NOT_FOUND;
import static org.hamcrest.Matchers.is;
import static web.utils.json.JsonUtils.toJsonObject;

public class SingleUserNotFound extends AbstractUsersApiTest
{
    @Test
    public void singleUserNotFound()
    {
        given()
                .pathParam("id", 23)
                .log().all()
                .expect()
                .statusCode(HTTP_NOT_FOUND)
                .body("", is(toJsonObject("{}")))
                .when()
                .get("{id}");
    }
}
