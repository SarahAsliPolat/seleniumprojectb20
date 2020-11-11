package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.tests.Day11_DriverUtilsPractice_simple_google_search_test.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Upload_Practices {

    @Test
    public void uploading_file_test(){

        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        Driver.getDriver().manage().window().maximize();

        String path = "C:\\Desktop\\car.jiff";


        WebElement uploadInput =Driver.getDriver().findElement(By.xpath("file"));


       BrowserUtils.wait(6);
        uploadInput.sendKeys(path);

        //locate the UPLOAD button
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        //click to upload button
        BrowserUtils.wait(6);
        uploadButton.click();;
    }
}
