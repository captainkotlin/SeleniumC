module SeleniumC.TestNG.test {
    opens reqres.unknown to org.testng;
    opens reqres.users to org.testng;

    exports reqres.unknown;
    exports reqres.users;

    requires org.testng;
    requires io.github.sskorol.testdatasupplier;
    requires org.hamcrest;
    requires rest.assured;

    requires json.path;
    requires com.fasterxml.jackson.databind;
    requires java.validation;

    requires xml.path;
    requires java.xml.bind;
    requires json.schema.validator;

    requires org.apache.commons.lang3;
    requires lombok;
}