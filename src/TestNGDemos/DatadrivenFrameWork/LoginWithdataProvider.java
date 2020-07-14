package TestNGDemos.DatadrivenFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithdataProvider {

    @Test (dataProvider = "getData")
    public void mytest(String par1,String par2) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://ip2.scriptinglogic.net/index.php/sessions/login");

        WebElement txtUsername = driver.findElement(By.id("email"));


        txtUsername.sendKeys(par1);

        WebElement txtPassword = driver.findElement(By.id("password"));

        txtPassword.sendKeys(par2);

       /* WebElement btnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
        btnLogin.click();*/

        Thread.sleep(2000);

        driver.close();
    }


    @DataProvider
    public Object[][] getData()
    {

        // row x col -> no of records x inputs (user,pass)
        Object[][] data = new Object[5][2];

        data[0][0] = "user1";
        data[0][1] = "pass1";

        data[1][0] ="user2";
        data[1][1] = "pass2";

        data[2][0] ="user3";
        data[2][1] = "pass3";

        data[3][0] ="user4";
        data[3][1] = "pass4";

        data[4][0] ="user5";
        data[4][1] = "pass5";


        return  data;

    }

}
