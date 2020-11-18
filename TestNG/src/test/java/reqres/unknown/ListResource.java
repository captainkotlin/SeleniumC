package reqres.unknown;

import io.github.sskorol.core.DataSupplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.Test;
import org.testng.collections.Lists;
import web.utils.json.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class ListResource extends AbstractResourceApiTest
{
    @Test(dataProvider = "data")
    public void listResource(Object... users)
    {
        given()
                .baseUri("https://reqres.in")
                .basePath("/api/unknown")
                .log().all()
                .expect()
                .body("data[0]", is(users[0]))
                .when()
                .get();
    }

    @DataSupplier(transpose = true)
    public List<Object> data()
    {
        return Lists.newArrayList(new User(1, "cerulean", 2000, "#98B2D1", "15-4020")).stream()
                .map(User::toObject)
                .collect(Collectors.toList());
    }

    @Data
    @AllArgsConstructor
    private static class User
    {
        private Integer id;
        private String name;
        private Integer year;
        private String color;
        private String pantone_value;

        public Object toObject()
        {
            return JsonUtils.toJsonObject(this);
        }
    }
}
