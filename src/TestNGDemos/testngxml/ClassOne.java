package TestNGDemos.testngxml;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Test  // test method
    public void ClassOneTest1()
    {
        System.out.println("ClassOneTest1()");
        String actual ="amol";
        String expected = "Amol";

        Assert.assertEquals(actual,expected,"Amols test is failed");


    }

    @Test (groups = "email")//(enabled=false)
    public void ClassOneTest2() // email validation
    {
        System.out.println("ClassOneTest2()");



    }

    @Parameters({"url","password","username"})
    @Test
    public void ClassOneTest3(String ul,String pass, String user )
    {
        System.out.println("open a browser");

       // String urlForMethod = ul;

        System.out.println("open url:"+ul);
        System.out.println("username:"+user);
        System.out.println("passwor:"+pass);

        System.out.println("ClassOneTest3()");
    }

}
