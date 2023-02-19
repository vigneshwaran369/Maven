package com.datadriven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputSomeValues {

	
static void inputSomeValues() throws IOException {
		
		
		File fss= new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		FileInputStream f= new FileInputStream(fss);
		Workbook wb = new XSSFWorkbook(f);
		wb.createSheet("vicky1").createRow(0).createCell(0).setCellValue("vignesh");
		FileOutputStream fos = new FileOutputStream(fss);
		wb.write(fos);
		System.out.println("DONE");
		wb.close();
}


static void addAnotherValue() throws IOException {
	File f = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
	FileInputStream ff = new FileInputStream(f);
	Workbook ww = new XSSFWorkbook(ff);
	ww.getSheet("vicky1").createRow(1).createCell(0).setCellValue("vicky");
	FileOutputStream fff = new FileOutputStream(f);
	ww.write(fff);
	System.out.println("DONE AGAIN");
	ww.close();

}
	
	public static void main(String[] args)  throws IOException {
		
		inputSomeValues();
		addAnotherValue();
	}

}
