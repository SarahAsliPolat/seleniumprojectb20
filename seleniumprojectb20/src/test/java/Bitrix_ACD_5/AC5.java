package Bitrix_ACD_5;

import com.cybertek.utilities.WebdriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.

public class AC5 {
    WebDriver driver;


    @BeforeMethod
    public void SetUpMethod() {

        driver = WebdriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

    }

    @Test
    public void logIn() throws InterruptedException {

        driver.get("https://login2.nextbasecrm.com/stream/");


        WebElement userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk32@cybertekschool.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser" + Keys.ENTER);


        driver.findElement(By.xpath("//span[@class='menu-item-link-text']")).click();
        //Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']")).click();
       // Thread.sleep(2000);


        WebElement addMention=driver.findElement(By.xpath("//span[@id='bx-b-mention-task-form-lifefeed_task_form']"));
        addMention.click();

        WebElement employee = driver.findElement(By.xpath("//a[@class='bx-finder-box-tab bx-lm-tab-department']"));
        employee.click();

        WebElement selectEmail=driver.findElement(By.xpath("//div[@class='bx-finder-box-tab-content bx-lm-box-tab-content-department bx-finder-box-tab-content-selected']//a[4]"));
        selectEmail.click();
        WebElement send=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        send.click();





    }
}