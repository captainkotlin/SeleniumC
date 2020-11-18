package gorest

import io.restassured.http.ContentType
import spock.lang.Unroll
import utils.AbstractApiTest

import static io.restassured.RestAssured.*
import static org.hamcrest.Matchers.notNullValue
import static utils.StatusCodeValidator.in200Range

class Users extends AbstractApiTest
{
    private static final def USER_URL = "https://gorest.co.in/public-api/users";

    @Unroll("check users status code and content type")
    def checkUsersStatusAndDefaultContentType()
    {
        expect:
        expect()
                .statusCode(in200Range())
                .contentType(ContentType.JSON)
        when()
                .get(USER_URL)
    }

    @Unroll("when urlSuffix = #urlSuffix then contentType = #expectedContentType")
    def checkUsersContentType()
    {
        expect:
        expect()
                .contentType(expectedContentType)
        when()
                .get(USER_URL + urlSuffix)
        where:
        urlSuffix | expectedContentType
        ".json"   | ContentType.JSON
        ".xml"    | ContentType.XML
    }

    @Unroll("response is not empty")
    def notEmpty()
    {
        given:
        String a = get(USER_URL).asString()
        expect:
        notNullValue().matches(a)
    }
}
