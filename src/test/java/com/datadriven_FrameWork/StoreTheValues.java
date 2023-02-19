package com.datadriven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StoreTheValues {

	
  
	static String s = "vicky";
	
	static void storeValues() throws InvalidFormatException, IOException {
	  File f = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
	  FileInputStream fs = new FileInputStream(f);
	  Workbook book = new XSSFWorkbook(fs);
	  book.createSheet("Data").createRow(0).createCell(0).setCellValue(s);
	  FileOutputStream fss = new FileOutputStream(f);
	  book.write(fss);
	  System.out.println("done");
	  book.close();
	}
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		storeValues();

	}

}
