package TestNGDemos.testngxml;

import org.testng.annotations.*;

public class ClassTwo {


    @BeforeSuite
    public void myMethod1()
    {
        System.out.println("@BeforeSuite");
    }
    @AfterSuite
    public void myMethod2()
    {
        System.out.println("@AfterSuite");
    }

    @Parameters({"url","password","username"})
    @Test
    public void ClassTwoTest1(String ul1,String pass, String user )
    {

       // String urlForMethod = "abc.com";

        System.out.println("open url:"+ul1);
        System.out.println("username:"+user);
        System.out.println("passwor:"+pass);

        System.out.println("ClassTwoTest1()");
    }

    @Test  (groups = "email") //(enabled=false)
    public void ClassTwoTest2() // email validation
    {
        System.out.println("ClassTwoTest2()");
    }

    @Test
    public void ClassTwoTest3()
    {
        System.out.println("ClassTwoTest3()");
    }

}
