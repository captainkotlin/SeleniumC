package utils

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked
import org.apache.http.HttpStatus
import org.hamcrest.Matcher
import org.hamcrest.Matchers

import static org.hamcrest.Matchers.*

import static org.apache.http.HttpStatus.SC_ACCEPTED
import static org.apache.http.HttpStatus.SC_MULTIPLE_CHOICES
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*
import static org.apache.http.HttpStatus.*

class StatusCodeValidator
{
    static Matcher<Integer> in200Range()
    {
        greaterThanOrEqualTo(SC_OK)
    }
}
