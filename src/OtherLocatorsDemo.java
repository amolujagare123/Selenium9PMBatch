import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocatorsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       // driver.get("http://billing.scriptinglogic.net/index.php/sessions/login");

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

        Thread.sleep(5000);

        driver.findElement(By.className("abcd")).clear();

        Thread.sleep(5000);

        driver.findElement(By.className("abcd")).sendKeys("amol");

        //driver.findElement(By.linkText("I forgot my password")).click();


       // driver.findElement(By.partialLinkText("rgot m")).click();


      //  driver.findElement(By.tagName("a")).click();
    }

}
