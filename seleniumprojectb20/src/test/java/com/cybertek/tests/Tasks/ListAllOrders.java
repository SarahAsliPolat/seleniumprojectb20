package com.cybertek.tests.Tasks;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ListAllOrders {


    WebDriver driver;

    @BeforeMethod
    public void SetUpDriver(){

        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SmartBearUtilities.loginToSmartBear(driver);



    }

    @Test

    public void ListAll() throws InterruptedException{
        SmartBearUtilities.PrintNameAndCities(driver);


    }
}

