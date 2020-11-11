package com.cybertek.tests.Day11_DriverUtilsPractice_simple_google_search_test;

import org.testng.annotations.Test;

public class SingletonPractice {

    public class SingletonPractices {

        @Test
        public void singleton_test1(){

            String str1 = Singleton.getWord();
            System.out.println("str1 = " + str1); //

            String str2 = Singleton.getWord();
            System.out.println("str2 = " + str2);

            String str3 = Singleton.getWord();
            System.out.println("str3 = " + str3);

        }

        @Test
        public void singleton_test2(){

            String str4 = Singleton.getWord();
            System.out.println("str4 = " + str4);

        }

    }
}
