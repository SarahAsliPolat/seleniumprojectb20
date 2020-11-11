package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrintNameAndCities {

    public static void printNameAndCity(WebDriver driver) {
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));

        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[7]"));
        for (int i = 0; i < allNames.size(); i++) {
            System.out.println("name: " + allNames.get(i).getText() + "citry: " + i + ":" + allCities.get(i).getText());
        }
    }
}

