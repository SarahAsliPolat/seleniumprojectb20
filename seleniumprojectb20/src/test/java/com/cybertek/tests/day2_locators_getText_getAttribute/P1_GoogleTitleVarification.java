package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVarification {

    public static void main(String[] args) {

        //TC 1:google title verification
        //1.Open chrome browser
            //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //open a chrome browser
        WebDriver driver =new ChromeDriver();

        //2. go to https://www.google.com
        driver.get("https://www.google.com");

        //3. verify title , expected Google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("title verification Passed");
        }else{
            System.out.println("failed");
        }


    }
}
