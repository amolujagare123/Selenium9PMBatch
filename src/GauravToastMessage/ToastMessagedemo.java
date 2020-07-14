package GauravToastMessage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ToastMessagedemo {

    @Test
    public void mytest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement txtUsername =  driver.findElement(By.id("txtUsername"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.name("txtPassword"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.name("Submit"));
        btnLogin.click();


        WebElement lnkAdmin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));

        Actions actions = new Actions(driver);

        actions. moveToElement(lnkAdmin). perform();

        WebElement lnkUsermanagement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));

        actions. moveToElement(lnkUsermanagement). perform();

        WebElement lnkUser = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

        lnkUser.click();


        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();


      List<WebElement> checkBoxes =   driver.findElements(By.xpath("//td[1]//input"));

      /*  checkBoxes.get(0).click();
        checkBoxes.get(1).click();
        checkBoxes.get(2).click();
        checkBoxes.get(3).click();
        checkBoxes.get(4).click();
        */
        for(int i=0;i<checkBoxes.size();i++)
            checkBoxes.get(i).click();
/*
        WebElement btnDelete = driver.findElement(By.xpath("//input[@value='Delete']"));

        btnDelete.click();

        WebElement btnOk = driver.findElement(By.xpath("//div[@id='deleteConfModal']//input[@value='Ok']"));

         btnOk.click();


         String toastMessage = driver.findElement(By.xpath("//div[contains(@class,'fadable')]")).getText();

        System.out.println(toastMessage);*/
    }



}
