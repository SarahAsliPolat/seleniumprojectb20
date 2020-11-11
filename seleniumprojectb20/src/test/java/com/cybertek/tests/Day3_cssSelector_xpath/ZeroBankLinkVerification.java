package com.cybertek.tests.Day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLinkVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement link = driver.findElement(By.className("brand"));

        String expectedLink ="Zero Bank";
        String actualLink = link.getText();

        if(actualLink.equals(expectedLink)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //verify href attribute value contains

        String expectedInHref = "index.html";
        String actualInHref= link.getAttribute("href");

        if(actualInHref.contains(expectedInHref)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }




    }
}
