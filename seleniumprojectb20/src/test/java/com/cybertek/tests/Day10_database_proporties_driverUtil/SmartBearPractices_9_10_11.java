package com.cybertek.tests.Day10_database_proporties_driverUtil;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.SmartBearUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SmartBearPractices_9_10_11 extends TestBase {
/*
    @BeforeMethod
    public void setUpMethod(){


        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}

 */

    @Test
    public void  p9_dlete_order_task() throws IOException {
        Properties properties = new Properties();
        FileInputStream file= new FileInputStream("configuration.properties");
        properties.load(file);
        String url = properties.getProperty("smartbearurl");
        driver.get(url);

        SmartBearUtilities.loginToSmartBear(driver);

        //locate the checkbox for "mark smith' and click to it
        WebElement markSmithCheckBox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        markSmithCheckBox.click();

        //locate "deleted selected" button and click to it
        WebElement deleteButton= driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();

        //Assert "mark smith is not in the table
       List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td"));
       // SmartBearUtilities.verifyOrder(driver,"Mark Smith");//this method works if the return type was boolean/

        for(WebElement each : allNames){
            Assert.assertFalse(each.getText().equals("Mark Smith"));
        }
    }

}
