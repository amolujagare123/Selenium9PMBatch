package TestNGDemos;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {


    @Test(priority = 1)
    public void mytestmethod()
    {

        System.out.println("mytestmethod()");

    }

    @Test (priority = 3)
    public void myAnotheMethod()
    {

        System.out.println("myAnotheMethod()");

    }


    @Test (priority = 2)
    public void justAMethod()
    {

        System.out.println("justAMethod()");

    }

}
