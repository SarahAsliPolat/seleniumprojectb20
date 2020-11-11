package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class context_click_test {

    /*
    1.Go	to	https://the-internet.herokuapp.com/context_menu
    2.Right	click	to	the	box.
    3.Alert	will	open.
    4.Accept	alertNo	assertion	needed	for	this	pra
     */

    @Test
    public void context_click_test(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        Driver.getDriver().manage().window().maximize();


        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

        Actions actions =new Actions(Driver.getDriver());
        //using "contextClick" method to right click
        actions.contextClick(box).perform();

        Alert alert= Driver.getDriver().switchTo().alert();
        alert.accept();
    }


}
