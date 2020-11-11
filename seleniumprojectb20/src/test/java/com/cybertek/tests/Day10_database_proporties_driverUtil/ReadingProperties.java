package com.cybertek.tests.Day10_database_proporties_driverUtil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file()throws IOException {



        //properties: use properties class object
        //we create properties object to be able to read configuration.properties file
        //import from java.util
        Properties properties = new Properties();
        //FileInputStream: opens the file
        String path = "configuration.properties";

        //we need to pass the path of the file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

        //we will load the file
        properties.load(file);

        //we read from the file
        System.out.println("properties.getProperty(\"browser \") = " + properties.getProperty("browser "));
        System.out.println("properties.getProperty(\"username \") = " + properties.getProperty("username "));



        //close the file

    }
    @Test
    public void using_properties_utility_method(){
        //This will read the given "key's" value and return it
        // as a String
        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"smartbearUrl\") = " + ConfigurationReader.getProperty("smartbearUrl"));

    }
}
