package com.datadriven_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetMyValue {

	
	static void getOneValue() throws InvalidFormatException, IOException {
		
		File f = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		
		Workbook wb= new XSSFWorkbook(f);
		Sheet sa = wb.getSheetAt(0);
		Row row = sa.getRow(1);
		Cell cell = row.getCell(3);
		String value = cell.getStringCellValue();
		System.out.println(value);
		wb.close();
		
	}
	
	static  void getAllValue() throws InvalidFormatException, IOException {
		
	File fs = new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
	Workbook w = new XSSFWorkbook(fs);
	Sheet sheet = w.getSheetAt(0);
	for (int i = 0; i < sheet.getLastRowNum(); i++) {
		Row r = sheet.getRow(i);
		for (int j = 0; j < r.getLastCellNum(); j++) {
			Cell c = r.getCell(j);
			DataFormatter data = new DataFormatter();
			String formatCellValue = data.formatCellValue(c);
			System.out.println(formatCellValue);
			w.close();
		} 
	}
	
	}
	
	
	static void inputSomeValues() throws IOException {
		
		
		File fss= new File("D:\\NewOne\\MyDocument\\Book1.xlsx");
		FileInputStream f= new FileInputStream(fss);
		Workbook wb = new XSSFWorkbook(f);
		wb.createSheet("vicky").createRow(0).createCell(0).setCellValue("vignesh");
		FileOutputStream fos = new FileOutputStream(fss);
		wb.write(fos);
		System.out.println("DONE");
		wb.close();
		
	}
	
	
	static void findMyAllValues() throws IOException {
		Workbook workbook = new XSSFWorkbook("D:\\NewOne\\MyDocument\\Book1.xlsx");
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 1; i <=sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j <=row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				DataFormatter data = new DataFormatter();
				String value = data.formatCellValue(cell);
				System.out.print(value+" ");
				workbook.close();
			}System.out.println();
		}
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		//getOneValue();
		//getAllValue();
		System.out.println("((((((((((((((((((((((((*)))))))))))))))))))))))");
		findMyAllValues();
	}

}
