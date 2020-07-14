package TestNGDemos;

import org.testng.annotations.*;

public class BeforeAfterClassDemo {



    @BeforeClass
    public void someMethod1()
    {
        System.out.println("i am in @BeforeClass");
    }

    @AfterClass
    public void someMethod2()
    {
        System.out.println("i am in @AfterClass");
    }


    @Test
    public void mytestmethod()
    {

        System.out.println("mytestmethod()");

    }

    @Test
    public void myAnotheMethod()
    {

        System.out.println("myAnotheMethod()");

    }


    @Test
    public void justAMethod()
    {

        System.out.println("justAMethod()");

    }

}
