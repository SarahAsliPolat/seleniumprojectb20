package com.cybertek.tests.Day14_excel_io;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;

    @FindBy(id="prependedInput2")
        private WebElement passwordElement;

    public DataProviderPractice(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Test(dataProvider = "usersTestData")
    public void ddtLoginTest1(String userName, String password){

        usernameElement.sendKeys(userName);
        passwordElement.sendKeys(password, Keys.ENTER);
        System.out.println(Driver.getDriver().getTitle());

    }
    @DataProvider
    public Object[][] usersTestData(){
        return new Object[][]{
                {"storemanager85", "Useruser123"},
                {"salesmanager110", "Useruser123"},
                {"user153", "Useruser123"},
                {"storemanager85", "Useruser123"},

        };

    }
}
