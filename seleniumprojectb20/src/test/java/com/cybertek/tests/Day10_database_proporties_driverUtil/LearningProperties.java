package com.cybertek.tests.Day10_database_proporties_driverUtil;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_test(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

        //hey=value
        //os.name=windows
        //user.name=
        //key must be the same value when you pASS IT
        //otherwisw it wont work . if you're getting null make sure your key is correct
    }
}
