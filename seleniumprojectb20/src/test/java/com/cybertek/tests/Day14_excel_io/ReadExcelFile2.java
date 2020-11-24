package com.cybertek.tests.Day14_excel_io;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ReadExcelFile2 {
    public static void main(String[] args) throws IOException {

        String filePath = "vytrack_testusers.xlsx";
        File file = new File (filePath);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet("QA3-short");

        ///num of rows
        int rowNum= sheet.getPhysicalNumberOfRows();

        //number of columns
        int colNum= sheet.getRow(0).getLastCellNum();

        //outer loop to iterate rows
        for(int rowIndex = 0; rowIndex<rowNum; rowIndex++){
            //inner loop to iterate cells
            for(int columnIndex =0; columnIndex<colNum; columnIndex++){
                String value = sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
                System.out.printf("%10s ",value+" ");

            }
            System.out.println();
        }



    }
}
