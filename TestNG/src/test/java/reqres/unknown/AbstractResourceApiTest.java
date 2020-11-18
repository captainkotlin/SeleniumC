package reqres.unknown;

import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import utils.AbstractTest;

import static io.restassured.RestAssured.given;

public class AbstractResourceApiTest extends AbstractTest
{
    protected RequestSpecification requestSpec;

    @Override
    @BeforeSuite
    public void doParentBeforeSuite()
    {
        super.doParentBeforeSuite();
        requestSpec = given()
                .baseUri("https://reqres.in")
                .basePath("/api/unknown");
    }
}
