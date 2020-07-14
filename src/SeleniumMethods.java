import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize window
       driver.manage().window().maximize();
        //driver.manage().window().fullscreen();  // for full screen

       // driver.get("http://www.facebook.com");

        driver.get("https://scriptinglogic.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.close();

        driver.quit();

        /*driver.navigate().to("http://gmail.com");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();*/


    }
}
