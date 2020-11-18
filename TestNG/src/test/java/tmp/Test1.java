package tmp;

import lombok.SneakyThrows;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.AbstractTest;

public class Test1 extends AbstractTest
{
    @BeforeMethod
    public void beforeTest()
    {
        System.out.println("Before test");
    }

    @Test
    //@Parameters({ "hello", "baby" })
    @SneakyThrows
    public void test()
    {
//        var hello = "a";
//        var world = "b";
//        var properties = new HashMap<String, Object>();
//        properties.put(BROWSER_NAME, "chrome");
//        properties.put(ACCEPT_SSL_CERTS, true);
//        properties.put(ACCEPT_INSECURE_CERTS, true);
//        var capabilities = new DesiredCapabilities(properties);
//        var driverUrl = new URL("http://192.168.0.105:4444/wd/hub");
//        WebDriver driver = new RemoteWebDriver(driverUrl, capabilities);
//        driver.get("https://google.com");
//        driver.quit();
//        System.out.println("Gogogo");
    }

    @AfterMethod
    public void afterTest()
    {
        System.out.println("After test");
    }
}

