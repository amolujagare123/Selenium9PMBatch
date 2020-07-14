package PrafulCode;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class AssertDemoTestOne {
    @Test
    public void myTestPassIni()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");

        // Thread.sleep(3000);

        WebElement enterUserName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        enterUserName.sendKeys("adminaws");

        WebElement enterUserPassword = driver.findElement(By.xpath("//input[@id=\"login-password\"]"));
        enterUserPassword.sendKeys("adminaqd");

        WebElement loginBtn = driver.findElement(By.name("submit"));
        loginBtn.click();

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String expected = "Wrong Username or Password";

        String actual =null;
        try
        {
            actual = driver.findElement(By.xpath("//div[contains(@class,'error-box')]")).getText();
            System.out.println(actual);
        }

        catch (Exception e)

        {
            actual="";
        }

        Assert.assertEquals(actual,expected,"incorrect error message or error message is absent");
    }
}
