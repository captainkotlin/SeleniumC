package utils

import io.restassured.RestAssured
import io.restassured.config.JsonConfig
import io.restassured.path.json.config.JsonPathConfig
import spock.lang.Specification

class AbstractApiTest extends Specification
{
    def setup()
    {
        println("setup")
        RestAssured.config().jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE))
    }
}
