package com.cybertekpractice.tests.Day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        //set up the driver
        WebDriverManager.chromedriver().setup();

        //create instance of the driver
        WebDriver driver = new ChromeDriver();//this line opens the browser

        //use the driver instance to test selenium
        driver.get("https://www.gmail.com");
        driver.get("https://google.com");

        System.out.println("the title of the page is: " + driver.getTitle());//get the title of the page and print it
        //or you can do
        String actualTitle = driver.getTitle();
        System.out.println("the title is: " + actualTitle);

        //to print current Url
        String actualUrl = driver.getCurrentUrl();
        //System.out.println(actualUrl);
        System.out.println("actualUrl = " + actualUrl);//shortcut; type actualUrl.soutv for getting the whole line automatically


        //basic navigations is as if user is clicking to the buttons on top left(back,forward, refresh,to)

        Thread.sleep(2000);//it will wait for 2 seconds

        driver.navigate().back();// samething as clicking back. takes you to the previous url

        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.navigate().to("https://www.cybertek.com");
        driver.navigate().to("https://kohls.com");

        String actualUrl2 = driver.getCurrentUrl();
        System.out.println("actualUrl2 = " + actualUrl2);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        driver.manage().window().maximize();//makes browser maximized as if you clicked maximize button

        driver.close();//closes ONLY the last open window

        driver.quit();//closes ALL the open windows
    }


}