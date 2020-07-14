package AssertionsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddCustomerDemo {


    @Test
    public void addCustomerTest()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        //Enter username & Password and click to login into system
        WebElement txtuser= driver.findElement(By.id("login-username"));
        txtuser.sendKeys("admin");

        WebElement txtpass= driver.findElement(By.id("login-password"));
        txtpass.sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        // Click on Add Customer Link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Add Customer")).click();

        // Insert Record into Fields Provided in Add Customer

        WebElement custnm=driver.findElement(By.xpath("//input[@id='name']"));
        custnm.sendKeys("amol");
        WebElement custadd= driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        custadd.sendKeys("pune");
        WebElement custcont1=driver.findElement(By.xpath("//input[@id='buyingrate']"));
        custcont1.sendKeys("998989");
        WebElement custcont2= driver.findElement(By.xpath("//input[@id='sellingrate']"));
        custcont2.sendKeys("7584");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();


        String expected = "Dublicat Entry. Please Verify";
        String actual="";

         try {
              actual = driver.findElement(By.xpath("//div[contains(@class,'error-box')]")).getText();
         }
         catch (Exception  e)
         {

         }
        Assert.assertEquals(actual,expected,"incorrect error message or error is absent");

    }


    @Test
    public void addCustomerTest1()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        //Enter username & Password and click to login into system
        WebElement txtuser= driver.findElement(By.id("login-username"));
        txtuser.sendKeys("admin");

        WebElement txtpass= driver.findElement(By.id("login-password"));
        txtpass.sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        // Click on Add Customer Link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Add Customer")).click();

        // Insert Record into Fields Provided in Add Customer

        WebElement custnm=driver.findElement(By.xpath("//input[@id='name']"));

        String customername = "amolujagare1";

        custnm.sendKeys(customername);
        WebElement custadd= driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        custadd.sendKeys("pune");
        WebElement custcont1=driver.findElement(By.xpath("//input[@id='buyingrate']"));
        custcont1.sendKeys("998989");
        WebElement custcont2= driver.findElement(By.xpath("//input[@id='sellingrate']"));
        custcont2.sendKeys("7584");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();


        String expected = "[ "+customername+" ] Customer Details Added !";

        String actual = driver.findElement(By.xpath("//div[contains(@class,'confirmation-box')]")).getText();

        Assert.assertEquals(actual,expected,"the customer is not added");
    }
}
