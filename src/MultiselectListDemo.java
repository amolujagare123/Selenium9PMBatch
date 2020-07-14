import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectListDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

        WebElement multiselectCity = driver.findElement(By.id("multiSel"));

        Select selMultiselectCity = new Select(multiselectCity);

        selMultiselectCity.selectByVisibleText("text 1");

        Thread.sleep(5000);

        selMultiselectCity.selectByVisibleText("text 2");

        Thread.sleep(5000);
        selMultiselectCity.selectByVisibleText("text 3");

        Thread.sleep(5000);

        selMultiselectCity.deselectByVisibleText("text 2");


        Thread.sleep(5000);

        selMultiselectCity.deselectAll();






    }
}
