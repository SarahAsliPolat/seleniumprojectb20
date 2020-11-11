package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsyTitleVerification {
    public static void main(String[] args) {

        //opem chrome
        WebDriverManager.chromedriver().setup();

        //go to https://etsy.com
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://etsy.com");


        //search for wooden spoon//find search box
       driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);


        //verify title //expected title should start with apple
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("passed");

        }else{
            System.out.println("failed");
        }
    }
}
