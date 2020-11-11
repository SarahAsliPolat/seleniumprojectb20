package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearTests {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebdriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");



    }
    @Test
    public void task1_login_page_links_print_test(){


        //6. Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("Count of all the links on the page = " + allLinks.size());

        //7. Print out each link text on this page

        for(WebElement eachLink : allLinks){
            System.out.println("eachLink = " + eachLink.getText());
        }

    }
    @Test
    public class Tasks {


        public void task2_login_page_link_verification(){

        }

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            //open a new browser
            driver = WebdriverFactory.getDriver("chrome");
            //maximize the page
            driver.manage().window().maximize();
            //implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //get the page
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
            driver.findElement((By.xpath("//input[@id='ctl00_MainContent_username']"))).sendKeys("Tester");
            driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
            driver.findElement((By.xpath("name=\"ctl00$MainContent$login_button\""))).click();

            List<WebElement> allList = driver.findElements(By.xpath("//body//a"));

            for (WebElement eachlink : allList) {
                eachlink.getText();
                System.out.println(eachlink.getText());

            }
        }
        @AfterMethod
        public void close(){
            driver.close();
        }
    }

}





