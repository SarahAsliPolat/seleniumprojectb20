package com.cybertek.tests.Day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekLinkVerification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");

        driver.findElement(By.id("form_submit")).click();

        String expectedInUrl ="email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        String actualText= driver.findElement(By.name("confirmation_message")).getText();
        String expectedText ="Your email's been sent!";

        if(actualText.equals(expectedText)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");

        }







    }
}