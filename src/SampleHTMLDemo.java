import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleHTMLDemo {
    public static void main(String[] args) {

        // operation on checkbox and raido button

        // open the given html page
        // select first  and last checkbox
        // select the middle raido button

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///C:/Users/PC/Desktop/Mywebsite/amol.html");

       /* WebElement checkJava = driver.findElement(By.name("mycheck0"));
        checkJava.click();

        WebElement checkCucumber = driver.findElement(By.name("mycheck2"));
        checkCucumber.click();

        WebElement radioSelenium = driver.findElement(By.id("rad1"));
        radioSelenium.click();*/


       // 3 steps to select from dropdown

       // 1. find the webelement of select tag
        WebElement drpText = driver.findElement(By.id("seltext"));

      //  2. Create an object of select class
        Select selText = new Select(drpText);




      // 3. select the element
             //   selText.selectByVisibleText("text 2");

        //selText.selectByIndex(3);

        selText.selectByValue("v13");

       // selText.selectByIndex(3); // text4
        //selText.selectByValue("v12") // text4


    }
}
