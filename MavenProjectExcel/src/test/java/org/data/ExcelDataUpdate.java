package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataUpdate {
	
	public static void main(String[] args) throws IOException {
		
		File loc = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\Book5.xlsx");
		
		FileInputStream f =new FileInputStream(loc);
		
		Workbook w = new XSSFWorkbook(f);
		
		Sheet sheet = w.getSheet("createdSheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		
		String value = cell.getStringCellValue();
		
		if(value.equals("Java")) {
			
			cell.setCellValue("python");
			
		}
		
		FileOutputStream fo =new FileOutputStream(loc);
		
		w.write(fo);
		
		
	}
}
