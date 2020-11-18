package tmp;

import org.testng.annotations.Test;

@Test(description = "This is test",
        groups = "test",
        invocationCount = 5,
        successPercentage = 1)
public class ParallelTestsFirst
{

    public void testA() throws InterruptedException
    {
        System.out.println("TestA");
        System.out.println("TestA thread id = " + Thread.currentThread().getId());
        System.out.println("TestA hash = " + this.hashCode());
    }

//    @Test(description = "This is test",
//            groups = "test",
//            invocationCount = 5,
//            successPercentage = 1)
    public void testB() throws InterruptedException
    {
        System.out.println("TestB");
        System.out.println("TestB thread id = " + Thread.currentThread().getId());
        System.out.println("TestB hash = " + this.hashCode());
    }
}
