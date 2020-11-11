package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {

    /*
TC #16: Double Click Test
1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2. Switch to iframe.
3. Double click on the text "Double-click me to change my text color."
4. Assert: Text's "style" attribute value contains "red".
     */

    @Test
    public void p2_double_click_test(){

        // Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        // Switch to iframe.

        Driver.getDriver().switchTo().frame("iframeResult");

        //Double click on the text "Double-click me to change my text color.
        WebElement textDoubleClick =Driver.getDriver().findElement(By.id("demo"));

        //creating actions instance to be able to use method that come with it
        Actions actions= new Actions(Driver.getDriver());

        //using actions instance and doubleClick method to double click
        actions.doubleClick(textDoubleClick).perform();

       /// Assert: Text's "style" attribute value contains "red
        String expected ="red";
        String actual = textDoubleClick.getAttribute("style");//we are checking the style attribute value that is style=color:red

        Assert.assertTrue(actual.contains(expected));
    }
}
