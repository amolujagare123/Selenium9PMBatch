package JUUNIDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeunitDemo3 {

    static WebDriver driver;
 // https://www.youtube.com/watch?v=YV9vFQKUBHw
    // in junit we need to have the methods with annotations @BeforeClass & @AfterClass
    //should be static

    @BeforeClass // executes before the first test method in the class
    public static void beforeExecution()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }


    @AfterClass // executes after the last test method in the class
    public static void afterExecution()
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
