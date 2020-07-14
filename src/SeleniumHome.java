import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumHome {

    public static void main(String[] args) {

    // System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
   //   WebDriver driver = new ChromeDriver();

//          System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
//          WebDriver driver =new FirefoxDriver();

       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();


      //  WebDriverManager.firefoxdriver().setup();
      //  WebDriver driver = new FirefoxDriver();


        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();







    }


}
