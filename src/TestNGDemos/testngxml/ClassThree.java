package TestNGDemos.testngxml;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {



   @BeforeTest
    public void myMethod1()
    {
        System.out.println("@BeforeTest");
    }
    @AfterTest
    public void myMethod2()
    {
        System.out.println("@AfterTest");
    }

    @Parameters({"url","password","username"})
    @Test
    public void ClassThreeTest1(String ul2,String user, String pass)
    {
        //String urlForMethod = "abc.com";

        System.out.println("open url:"+ul2);
        System.out.println("username:"+user);
        System.out.println("passwor:"+pass);
        System.out.println("ClassThreeTest1()");
    }

    @Test   (groups = "email")//(enabled=false)
    public void ClassThreeTest2() // email validation
    {
        System.out.println("ClassThreeTest2()");
    }


    @Test
    public void ClassThreeTest3()
    {
        System.out.println("ClassThreeTest3()");
    }

}
