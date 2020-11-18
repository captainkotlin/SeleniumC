package tmp;

import org.testng.annotations.Test;

@Test(description = "This is test",
        groups = "test",
        invocationCount = 5,
        successPercentage = 1)
public class ParallelTestsSecond
{

    public void testC() throws InterruptedException
    {
        System.out.println("TestC");
        System.out.println("TestC thread id = " + Thread.currentThread().getId());
    }

//    @Test(description = "This is test",
//            groups = "test",
//            invocationCount = 5,
//            successPercentage = 1)
    public void testB() throws InterruptedException
    {
        System.out.println("TestD");
        System.out.println("TestD thread id = " + Thread.currentThread().getId());
    }
}
