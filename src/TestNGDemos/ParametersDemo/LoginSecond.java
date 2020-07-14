package TestNGDemos.ParametersDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginSecond {
    @Parameters("url")
    @Test
    public void mytest(String myUrl) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(myUrl);

        WebElement txtUsername = driver.findElement(By.id("email"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();
        Thread.sleep(2000);
        driver.close();
    }
}
