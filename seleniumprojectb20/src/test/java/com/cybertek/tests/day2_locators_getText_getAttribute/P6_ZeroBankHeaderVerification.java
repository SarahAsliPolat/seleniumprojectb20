package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_ZeroBankHeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();

        //locate the header and get the text of the header
       String actualText=  driver.findElement(By.tagName("h3")).getText();//it will return a string when adding .getText
       String expectedText= "Log in to ZeroBank";

       if(actualText.equals(expectedText)) {
           System.out.println("passed");

       }else{
           System.out.println("failed");
       }

    }
}
