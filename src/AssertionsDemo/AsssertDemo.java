package AssertionsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.Assert.*;

public class AsssertDemo {

    @Test
    public void mytest()
    {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername =  driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected ="Wrong Username or Password";
        String actual = null;
        try {
           actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {
            actual="";
        }

        Assert.assertEquals(actual,expected,"incorrect error message or error msg is absent");


    }


    @Test
    public void mytest2()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername =  driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // 1. page title

   /*     String expected ="POSNIC - Dashboard1";

        String actual = driver.getTitle();

        Assert.assertEquals(actual,expected,"we did not landed on home page");
*/
        // 2. using url

        String expected = "http://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();


        Assert.assertEquals(actual,expected,"we did not landed on home page");
        // Junit asserrts -
       //  Assert.assertEquals("message",expected,actual);
        driver.close();
    }

}
