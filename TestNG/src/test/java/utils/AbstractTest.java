package utils;

import org.testng.annotations.*;

public class AbstractTest
{
    @BeforeSuite
    public void doParentBeforeSuite()
    {
        System.out.println("Parent doBeforeSuite");
    }

    @AfterSuite
    public void doParentAfterSuite()
    {
        System.out.println("Parent doAfterSuite");
    }

    @BeforeTest
    public void doParentBeforeTest()
    {
        System.out.println("Parent doBeforeTest");
    }

    @AfterTest
    public void doParentAfterTest()
    {
        System.out.println("Parent doAfterTest");
    }

    @BeforeGroups
    public void doParentBeforeGroups()
    {
        System.out.println("Parent doBeforeGroups");
    }

    @AfterGroups
    public void doParentAfterGroups()
    {
        System.out.println("Parent doAfterGroups");
    }

    @BeforeClass
    public void doParentBeforeClass()
    {
        System.out.println("Parent doBeforeClass");
    }

    @AfterClass
    public void doParentAfterClass()
    {
        System.out.println("Parent doAfterClass");
    }

    @BeforeMethod
    public void doParentBeforeMethod()
    {
        System.out.println("Parent doBeforeMethod");
    }

    @AfterMethod
    public void doParentAfterMethod()
    {
        System.out.println("Parent doAfterMethod");
    }

//    @Test(dataProvider = "getData2", dataProviderClass = DataProvider1.class)
//    public void test(String a, String b, String c) throws Exception
//    {
//        System.out.println("Value = " + a + " " + b + " " + c);
//    }
}
