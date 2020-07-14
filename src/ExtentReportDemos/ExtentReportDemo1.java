package ExtentReportDemos;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static ExtentReportDemos.util.Myscreenshots.getScreenshot;

public class ExtentReportDemo1 {


    ExtentReports extent;
    ExtentSparkReporter reporter;

    @BeforeClass
    public void init()
    {
      // String path ="/report/report.html" ;
        String path = System.getProperty("user.dir")+"\\Reports\\report.html";
        reporter = new ExtentSparkReporter(path);

        reporter.config().setDocumentTitle("Stock management system");
        reporter.config().setReportName("Regression Testing report");

        extent= new ExtentReports();
        extent.attachReporter(reporter);

        extent.setSystemInfo("Testers name","amol Ujagare");
        extent.setSystemInfo("Company Name","Infosys");
        extent.setSystemInfo("Developer name","sandeep jare");


    }




    @Test   //annotation
    public void mytest1()
    {

        ExtentTest test = extent.createTest("Login test 1");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opned");

        driver.manage().window().maximize();

        test.info("Browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opned");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");

        test.info("user set");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("dsd");


        test.info("password set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is click");

        driver.close();

        extent.flush();
    }

    @Test   //annotation
    public void mytest2() throws IOException {

        ExtentTest test = extent.createTest("Login test 2");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opned");

        driver.manage().window().maximize();

        test.info("Browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opned");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("user set");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("admin");


        test.info("password set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        test.info("Login button is click");


        String  expected = "http://stock.scriptinglogic.net/dashboard.php";

        String actual   = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "we are not landed on home page");
            test.pass("we are on home page");
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }
        catch (AssertionError e)
        {
            //System.out.println(e);

            test.fail(e.getMessage());

            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

        driver.close();

        extent.flush();
    }

    @Test   //annotation
    public void mytest3()
    {

        ExtentTest test = extent.createTest("Login test 3");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        test.info("Browser is opned");

        driver.manage().window().maximize();

        test.info("Browser is maximized");

        driver.get("http://stock.scriptinglogic.net/");

        test.info("url is opned");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("user set");

        WebElement txtPassword = driver.findElement(By.name("password"));
        txtPassword.sendKeys("");


        test.info("password set");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is click");

        driver.close();

        extent.flush();
    }

}
