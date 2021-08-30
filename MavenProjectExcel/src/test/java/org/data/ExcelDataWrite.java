package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWrite {
	
	public static void main(String[] args) throws IOException {
		
		File loc =new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\Book5.xlsx");
		
		FileOutputStream out = new FileOutputStream(loc);
		
		Workbook w =new XSSFWorkbook();
		
		Sheet sheet = w.createSheet("createdSheet1");
		
		Row row = sheet.createRow(1);
		
		Cell cell0 = row.createCell(0);
		cell0.setCellValue("Java");
		
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Selenium");

		w.write(out);
		
	}
}
