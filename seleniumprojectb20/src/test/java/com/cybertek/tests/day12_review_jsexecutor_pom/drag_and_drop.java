package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class drag_and_drop {

    @Test
    public void p3_drag_and_drop(){

        //Go to	https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookiesButton.click();

        //Drag	and	drop	the	small	circle


       //locating circles
        WebElement bigCircle= Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(smallCircle,bigCircle).perform();

        String expected = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }
}
