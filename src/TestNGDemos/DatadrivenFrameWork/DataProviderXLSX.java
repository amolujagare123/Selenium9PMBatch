package TestNGDemos.DatadrivenFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderXLSX {


    @Test(dataProvider = "getData")
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
    public Object[][] getData() throws IOException {

        // read the file

        FileInputStream fp = new FileInputStream("Data\\myData1.xlsx");

// convert the file to workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fp);

// find the sheet

        XSSFSheet sheet = workbook.getSheet("Sheet2");


// count the number of active rows

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2];

        for(int i=0;i<rowCount;i++)
        {

            XSSFRow row = sheet.getRow(i);


            XSSFCell username = row.getCell(0);
            data[i][0] =   username.toString().trim();

            XSSFCell password = row.getCell(1);
            data[i][1] = password.toString().trim();

        }



        return  data;

    }
}
