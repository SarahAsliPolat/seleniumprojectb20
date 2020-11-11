package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
        //google serach

        //open a chrome browser
        //set up the browser driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        //go to https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();

        //write apple to search box. //click search button
        //to b able type write anything in the search box,i need to locate the search box and use sendKeys()method to send apple
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);


        //verify title

        //expected title should start with apple
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");

        }

    }
}
