package tmp;

import org.testng.annotations.*;
import utils.AbstractTest;

import static org.testng.Assert.fail;

public class TestWithAllAnnotations extends AbstractTest
{
    @BeforeSuite
    public void doBeforeSuite()
    {
        System.out.println("doBeforeSuite");
    }

    @AfterSuite
    public void doAfterSuite()
    {
        System.out.println("doAfterSuite");
    }

    @BeforeTest
    public void doBeforeTest()
    {
        System.out.println("doBeforeTest");
    }

    @AfterTest
    public void doAfterTest()
    {
        System.out.println("doAfterTest");
    }

    @BeforeGroups
    public void doBeforeGroups()
    {
        System.out.println("doBeforeGroups");
    }

    @AfterGroups
    public void doAfterGroups()
    {
        System.out.println("doAfterGroups");
    }

    @BeforeClass
    public void doBeforeClass()
    {
        System.out.println("doBeforeClass");
    }

    @AfterClass
    public void doAfterClass()
    {
        System.out.println("doAfterClass");
    }

    @BeforeMethod
    public void doBeforeMethod()
    {
        System.out.println("doBeforeMethod");
    }

    @AfterMethod
    public void doAfterMethod()
    {
        System.out.println("doAfterMethod");
    }

//    @Test(dataProvider = "getData2",
//            dataProviderClass = DataProvider1.class,
//            groups = "test3")
//    public void test3(String a, String b, String c)
//    {
//        System.out.println("Test3 Value = " + a + " " + b + " " + c);
//        System.out.println("Test3 thread id = " + Thread.currentThread().getId());
//    }
//
//    @Test(dataProvider = "getData2",
//            dataProviderClass = DataProvider1.class,
//            expectedExceptions = CustomException.class,
//            groups = "test2",
//            dependsOnGroups = "test3")
//    public void test2(String a, String b, String c)
//    {
//        System.out.println("Test2 Value = " + a + " " + b + " " + c);
//        System.out.println("Test2 thread id = " + Thread.currentThread().getId());
//        throw new CustomException();
//    }
//
//    @Test(description = "This is test",
//            dataProvider = "getData2",
//            dataProviderClass = DataProvider1.class,
//            groups = "test",
//            dependsOnGroups = "test2",
//            successPercentage = 1)
//    public void test(String a, String b, String c) throws Exception
//    {
//        System.out.println("Test Value = " + a + " " + b + " " + c);
//        System.out.println("Test thread id = " + Thread.currentThread().getId());
//        throw new Exception();
//    }
//
//    @Test(description = "This is test",
//            groups = "test",
//            dependsOnGroups = "test2",
//            invocationCount = 5,
//            successPercentage = 1,
//            threadPoolSize = 1,
//            dependsOnMethods = "test",
//    timeOut = 2)
//    public void testCounter() throws InterruptedException
//    {
//        System.out.println("TestCounter");
//        System.out.println("TestCounter thread id = " + Thread.currentThread().getId());
//        Thread.sleep(3000);
//    }
}
