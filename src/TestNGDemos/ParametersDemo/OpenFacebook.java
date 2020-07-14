package TestNGDemos.ParametersDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenFacebook {

    // cross browser testing
    @Parameters("browser")
    @Test
    public void mytest(String myBrowser)  {

        WebDriver driver=null;


       /* int a =0 ;
        int b =10;
*/
       // if(a==b)

            String str1 ="amol";
          String str2 ="Amol";

          //if(str1==str2)

              /*str1.equals(str2);
              str1.equalsIgnoreCase(str2);*/


        if(myBrowser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if(myBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();

        driver.get("http://facebook.com");


        // learn strings in java https://www.youtube.com/watch?v=f-qufGqaRE4
        // https://www.youtube.com/watch?v=vGZ7VDT457o


    }
    }
