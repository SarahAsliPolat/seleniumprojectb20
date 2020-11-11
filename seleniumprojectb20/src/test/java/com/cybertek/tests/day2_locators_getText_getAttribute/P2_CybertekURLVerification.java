package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {

        //TC 2 Cybertek verifications
        //open chrome browser
        //set up my browser driver
        WebDriverManager.chromedriver().setup();

        //to create instance of chrome browser from webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        //verify URL contains, Expeected": cybertekschool

        String expectedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL verification passed");

             }else{
            System.out.println("failed");

        }
        //verify title, expected :practice
        if(driver.getTitle().equals("Practice")) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }



    }
}
