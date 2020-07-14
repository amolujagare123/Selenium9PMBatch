package AssertionsDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class addCustomerExcel {

    @Test (dataProvider="getData")
    public void addCustomerTest1(String cname,String add,String contact1,String contact2
    ,String expected , String xpathactual)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
        //Enter username & Password and click to login into system
        WebElement txtuser= driver.findElement(By.id("login-username"));
        txtuser.sendKeys("admin");

        WebElement txtpass= driver.findElement(By.id("login-password"));
        txtpass.sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        // Click on Add Customer Link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Add Customer")).click();

        // Insert Record into Fields Provided in Add Customer

        WebElement custnm=driver.findElement(By.xpath("//input[@id='name']"));

        String customername = "amolujagare1";

        custnm.sendKeys(customername);
        WebElement custadd= driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        custadd.sendKeys("pune");
        WebElement custcont1=driver.findElement(By.xpath("//input[@id='buyingrate']"));
        custcont1.sendKeys("998989");
        WebElement custcont2= driver.findElement(By.xpath("//input[@id='sellingrate']"));
        custcont2.sendKeys("7584");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        String actual;
        try {
            actual = driver.findElement(By.xpath(xpathactual)).getText();
        }
        catch (Exception e)
        {
            actual="";
        }

         boolean result = actual.contains(expected);

               Assert.assertTrue(result,"Test is failed");



       /* String expected = "[ "+customername+" ] Customer Details Added !";

        String actual = driver.findElement(By.xpath("//div[contains(@class,'confirmation-box')]")).getText();

        Assert.assertEquals(actual,expected,"the customer is not added");*/
    }


    @DataProvider
    public Object[][] getData() throws IOException {
        // read the file

        FileInputStream fp = new FileInputStream("Data\\myData1.xlsx");

// convert the file to workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fp);

// find the sheet

        XSSFSheet sheet = workbook.getSheet("custmor");


// count the number of active rows

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount-1][6];

        for(int i=0;i<rowCount-1;i++)
        {

            XSSFRow row = sheet.getRow(i+1);


            XSSFCell customename = row.getCell(0);
            data[i][0] =   customename.toString().trim();

            XSSFCell address = row.getCell(1);
            data[i][1] = address.toString().trim();

            XSSFCell contact1 = row.getCell(2);
           // contact1.setCellType(CellType.STRING);
            data[i][2] = contact1.toString().trim();

            XSSFCell contact2 = row.getCell(3);
           // contact2.setCellType(CellType.STRING);
            data[i][3] = contact2.toString().trim();


            XSSFCell expected = row.getCell(4);
            // contact2.setCellType(CellType.STRING);
            data[i][4] = expected.toString().trim();


            XSSFCell xpathactual = row.getCell(5);
            // contact2.setCellType(CellType.STRING);
            data[i][5] = xpathactual.toString().trim();

        }



        return  data;
    }
}
