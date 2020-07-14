package PrafulCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class AssertDemoThree {
    @Test
    public void CheckPageAssert()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriverABC =  new ChromeDriver();

        chromeDriverABC.manage().window().maximize();
        chromeDriverABC.get("http://stock.scriptinglogic.net/");

        WebElement enterUserName = chromeDriverABC.findElement(By.xpath("//p[2]//input[1]"));
        enterUserName.sendKeys("adminoiu");

        WebElement enterPassword = chromeDriverABC.findElement(By.xpath("//p[3]//input[1]"));
        enterPassword.sendKeys("adminasd");


        WebElement clickBtn = chromeDriverABC.findElement(By.xpath("//body/div/form/fieldset/input[1]"));
        clickBtn.click();

        //  WebElement labelWrongNamePass = chromeDriverABC.findElement(By.xpath("//div[contains(@class, \"error-box\")]"));
        String actualError = null;

        String expectedError = "Wrong Username or Password";

        chromeDriverABC.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        try
        {
            actualError =  chromeDriverABC.findElement(By.xpath("//div[contains(@class, 'error-box')]")).getText();
        }

        catch(Exception e)
        {

        }

        Assert.assertEquals(actualError, expectedError,"incorrect error message or error message is absent");
    }
}
