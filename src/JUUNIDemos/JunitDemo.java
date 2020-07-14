package JUUNIDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {


    @Test   //annotation
    public void cmytest1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();
    }

    @Test   //annotation
    public void mytest2()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("dsd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();
    }

    @Test   //annotation
    public void amytest3()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();
    }
}
