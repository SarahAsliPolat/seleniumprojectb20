package com.cybertek.tests.Day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        WebElement emailInput = driver.findElement(By.name("email"));
                emailInput.sendKeys("anyemail@domain.com");

       //click on retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        //driver.findElement(By.id("form_submit")).click();

        //verify URL contains
        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)) {
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        //verify the text
        WebElement confirmationMessage =driver.findElement(By.name("confirmation_message"));

        String actualText= confirmationMessage.getText();
        String expectedText = "Your e-mail's been sent!";


        System.out.println("expected"+expectedText);//if  your test is failed print them see the difference
        System.out.println("actual"+ actualText);
        if(actualText.equals(expectedText)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");

        }
        //verify if the web element is displayed or not
        if(confirmationMessage.isDisplayed()) {
            System.out.println("passed");
        }else{
            System.out.println("passed");
        }









    }
}
