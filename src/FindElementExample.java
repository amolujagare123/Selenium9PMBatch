import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElementExample {

    public static void main(String[] args) throws InterruptedException {


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

       // Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement lnkAddCutomer = driver.findElement(By.linkText("Add Customer"));
        lnkAddCutomer.click();

        WebElement txtclientName = driver.findElement(By.name("name"));
        txtclientName.sendKeys("praful");

        WebElement txtAreaAddress = driver.findElement(By.name("address"));
        txtAreaAddress.sendKeys("Gulmohor road, savedi. Ahmednagar");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("787878787");


        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("98788787");


        WebElement btnSubmit =  driver.findElement(By.name("Submit"));
        btnSubmit.click();



    }
}
