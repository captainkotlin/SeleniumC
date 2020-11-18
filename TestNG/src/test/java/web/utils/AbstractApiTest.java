package web.utils;

import io.restassured.RestAssured;
import io.restassured.config.JsonConfig;
import io.restassured.path.json.config.JsonPathConfig;
import utils.AbstractTest;

public class AbstractApiTest extends AbstractTest
{
    @Override
    public void doParentBeforeSuite()
    {
        super.doParentBeforeSuite();
        RestAssured.config().jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE));
    }
}
