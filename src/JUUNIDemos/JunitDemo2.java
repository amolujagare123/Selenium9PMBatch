package JUUNIDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {

    WebDriver driver;

    @Before // executes before every test method in the class
    public void beforeExecution()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @After // executes after every test method in the class
    public void afterExecution()
    {
        driver.close();
    }






    @Test
    public  void openLoginpage()
    {

        driver.get("http://stock.scriptinglogic.net/");
    }

    @Test
    public  void openFacebook()
    {



        driver.get("http://facebook.com");
    }

    @Test
    public  void openGmail()
    {



        driver.get("http://gmail.com");
    }
}
