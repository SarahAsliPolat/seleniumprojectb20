package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebdriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBear2 {

  /*  1.Open browser
    2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
            3.Enter username: “Tester”
            4.Enter password: “test”
            5.Click on Login button
    6.Click on Order
    7.Select familyAlbum from product, set quantity to 2
            8.Click to “Calculate” button
    9.Fill address Info with JavaFaker•Generate: name, street, city, state, zip code
    10.Click on “visa” radio button
    11.Generate card number using JavaFaker
    12.Click on “Process”
            13.
    Verify success message “New order has been successfully added.”

   */

    WebDriver driver;//instance v.
  ;

    @BeforeMethod

    public void Setup(){
        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
       @Test
       public void SmartBear2() throws InterruptedException {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Thread.sleep(6000);
           WebElement UserName=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
           Thread.sleep(6000);
           UserName.sendKeys("Tester");

           WebElement Password =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
           Password.sendKeys("test");
           Thread.sleep(6000);

           WebElement login = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));
                   login.click();
            Thread.sleep(4000);

                   WebElement order =  driver.findElement(By.xpath("//a[.='Order']"));
                   order.click();

           Select myAlbum = new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
           Thread.sleep(7000);
            myAlbum.selectByVisibleText("FamilyAlbum");

            WebElement quantity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
            quantity.sendKeys(Keys.BACK_SPACE);
            quantity.sendKeys("2");

            driver.findElement(By.xpath("//input[@value='Calculate']")).click();

           Faker faker = new Faker();
           WebElement CostumerName = driver.findElement((By.xpath("//input[@name = 'ctl00$MainContent$fmwOrder$txtName']")));
          CostumerName.sendKeys(faker.name().fullName());

          WebElement address = driver.findElement(By.xpath("//input[@name = 'ctl00$MainContent$fmwOrder$TextBox2']"));
          address.sendKeys(faker.address().fullAddress());

          WebElement city = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
          city.sendKeys(faker.address().city());

          WebElement state= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
          state.sendKeys(faker.address().state());

          WebElement zipCode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
          zipCode.sendKeys((faker.address().zipCode().replaceAll("-","")));

          WebElement visaCard= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
          visaCard.click();

          WebElement cardNum= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
          cardNum.sendKeys(faker.finance().creditCard().replaceAll("-","").replaceAll("/",""));

          WebElement expDate= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
          expDate.sendKeys("01/21");

          WebElement process= driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
          process.click();










       }


    }

