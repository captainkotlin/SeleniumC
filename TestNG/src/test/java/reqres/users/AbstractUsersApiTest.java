package reqres.users;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import utils.AbstractTest;
import web.utils.AbstractApiTest;

import java.io.File;

import static io.restassured.RestAssured.given;

public class AbstractUsersApiTest extends AbstractApiTest
{
    protected RequestSpecification requestSpecification;

    @Override
    @BeforeSuite
    public void doParentBeforeSuite()
    {
        super.doParentBeforeSuite();
        requestSpecification = given().baseUri("https://reqres.in")
                .basePath("/api/users");
    }

    public String getPackageResourcePath(String filePath)
    {
        return "reqres" + File.separator + filePath;
    }
}
