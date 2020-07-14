import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://billing.scriptinglogic.net/");

        WebElement txtUsername =  driver.findElement(By.xpath("//input[@placeholder='Email']"));

         txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin123");


        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));


        btnLogin.click();

    }
}
