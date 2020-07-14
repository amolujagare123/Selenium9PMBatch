import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TheMethodGetText {

    public static void main(String[] args) throws InterruptedException {


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

//------------------------------------------------------------

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

         txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("hfjdhfjdh");

         txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("fkdjfkd");

         btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();

//------------------------------------------------------------

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://stock.scriptinglogic.net/");

        txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");

        btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.close();

        //------------------------------------------------------------

/*
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        WebElement lblProductsText = driver.findElement(By.xpath("//td[contains(text(),'Prod')]"));

        System.out.println(lblProductsText.getText());*/





    }
}
