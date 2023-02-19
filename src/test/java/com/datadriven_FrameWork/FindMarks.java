package com.datadriven_FrameWork;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FindMarks {

	public static void getMyPerticularData() throws InvalidFormatException, IOException {

		File f = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		Workbook w =  new XSSFWorkbook(f);
		Sheet sa = w.getSheetAt(0);
			Row r = sa.getRow(1);
			Cell c = r.getCell(0);
			//System.out.println(c);
		String value = c.getStringCellValue();
			
//			//Cell c = r.getCell(2);
//	//double value = c.getNumericCellValue();
		System.out.println(value);
	}
	
	static void getAllData() throws InvalidFormatException, IOException {
		
		File fs = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sa = wb.getSheetAt(0);
		
		
		for (int i = 1; i < sa.getLastRowNum(); i++) {
			Row rr = sa.getRow(i);		
			for (int j = 0; j < rr.getLastCellNum(); j++) {
				Cell cc = rr.getCell(j);
//				String stringCellValue = cc.getStringCellValue();
//				System.out.print("          "+stringCellValue);

				DataFormatter d = new DataFormatter();
				String formatCellValue = d.formatCellValue(cc);
				System.out.print(formatCellValue);
				
			} System.out.println();
		
		}
		
	}
	
	
	
	static void findMyvalue() throws InvalidFormatException, IOException {
		
		File ff = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		Workbook workbook = new XSSFWorkbook(ff);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row =sheet.getRow(2);
		Cell cell =row.getCell(3);
		String s =cell.getStringCellValue();
		System.out.println(s);
		workbook.close();
		
	}
	static void findMyValueOne() throws IOException {
		
		Workbook workbook = new XSSFWorkbook("D:\\NewOne\\MyDocument\\Book1.xlsx");
		String stringCellValue = workbook.getSheetAt(0).getRow(3).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
		workbook.close();
	}
	
	
		
		
	
	
	
	
	public static void main(String[] args) throws InvalidFormatException, IOException {

	//	getMyPerticularData();
		//System.out.println("===================");
	//	getAllData();
		System.out.println("+++++++++++++++++++++");
		findMyvalue();
		System.out.println("*************************");
		findMyValueOne();
		
		
		
	}

}
