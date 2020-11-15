package com.cybertek.tests.Day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "shopping_list.txt";
        File file = new File(path);
        System.out.println(file.exists());//check if the file is exists
        //we can read lines of file with scanner class
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());

        }



    }
}
