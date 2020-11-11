package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_Ebay {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.ebay.com");

        String expected ="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualResult =driver.getTitle();

        if(actualResult.equals(expected)) {
            System.out.println("Verify web page PASSED");
        }else {
            System.out.println("Verify web page FAILED");
        }
        //driver.findElement(By.linkText("Sign in")).click();
       // driver.findElement(By.name())
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");



    }
}
