package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {


        //back and forth navigation

        //open a chrome browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver =new ChromeDriver();

        //go to "http://google.com
        driver.get("https://google.com");

        //click to gmail from top right
        //we are locating the gmail link web element using findElement method and linkText locator
        driver.findElement(By.linkText("Gmail")).click(); //copy paste from the source/inpect <a is the link and the black one should be here

        //verify title contains
        //expectd gmail

        String expectedTitle = "Gmail";
        String  actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("passed");

        }else{
            System.out.println("failed");
        }

        //go back to google by using the .back();
        driver.navigate().back();

        // verify title equals
        String expectedGoogleTitle = "Google";
        String actualGoogleTiitle=driver.getTitle();

        if(actualGoogleTiitle.equals(expectedGoogleTitle)) {
            System.out.println("passed");

        }else {
            System.out.println("failed");
        }

        //expected google
    }
}
