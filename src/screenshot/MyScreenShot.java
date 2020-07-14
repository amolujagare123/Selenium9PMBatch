package screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyScreenShot {

    @Test
    public void myTest() throws IOException {
       WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

      driver.get("http://facebook.com/");

       TakesScreenshot ts = (TakesScreenshot) driver;

       File srcFile = ts.getScreenshotAs(OutputType.FILE);


        Date date = new Date();


        System.out.println(date);
        SimpleDateFormat sd = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss");
                String dateStr = sd.format(date);
                String fileName = "Image"+dateStr+".png";
        System.out.println(fileName);


        FileUtils.copyFile(srcFile,new File("d:\\screenshot\\"+fileName));


        // dd_MM_yyyy_hh_mm_ss

        // https://www.youtube.com/watch?v=4VxK3wI-i2I | date video

    }

}
