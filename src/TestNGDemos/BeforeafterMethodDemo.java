package TestNGDemos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeafterMethodDemo {


    @BeforeMethod
    public void someMethod1()
    {
        System.out.println("i am in @BeforeMethod");
    }

    @AfterMethod
    public void someMethod2()
    {
        System.out.println("i am in @AfterMethod");
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
