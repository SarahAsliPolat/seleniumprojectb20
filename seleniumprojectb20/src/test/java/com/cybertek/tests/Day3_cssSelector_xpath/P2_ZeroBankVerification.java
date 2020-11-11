package com.cybertek.tests.Day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        String expectedInHref = "index.html";
        String actualInHrefValue = zeroBankLinkTopLeft.getAttribute("href");

        if (actualInHrefValue.contains(expectedInHref)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");

        }


    }
}
