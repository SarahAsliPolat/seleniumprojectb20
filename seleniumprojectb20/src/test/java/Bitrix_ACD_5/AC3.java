package Bitrix_ACD_5;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC3 {
    WebDriver driver;


    @BeforeMethod
    public void SetUpMethod() {

        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }
        @Test
                public void logIn() throws InterruptedException{

            driver.get("https://login2.nextbasecrm.com/stream/");


            WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            userName.sendKeys("helpdesk32@cybertekschool.com");

            WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            password.sendKeys("UserUser"+Keys.ENTER);

           // driver.findElement(By.xpath("login-btn")).sendKeys("Log In"+ Keys.ENTER);




        }

    }



