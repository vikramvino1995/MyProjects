package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData2 {
	
	public static void main(String[] args) throws IOException {
		
		File loc =new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\Book2.xlsx");
		
		FileInputStream connect =new FileInputStream(loc);
		
		Workbook wb = new XSSFWorkbook(connect);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				if(cellType==1) {
					
					String stringCellValue = cell.getStringCellValue();
					System.out.println("\n"+stringCellValue);
					
				}
				else if(cellType==0) {
					
					if( DateUtil.isCellDateFormatted(cell)) {
						
						Date date = cell.getDateCellValue();
						
						SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
						
						String format = sdf.format(date);
						
						System.out.println(format);
						
						
					}
					else {
						
						double numericCellValue = cell.getNumericCellValue();
						
						long num = (long)numericCellValue;
						
						String phoneNo = String.valueOf(num);
						
						System.out.println(phoneNo);
						
					}
					
					
				}
				
				
				
			}
			
			
			
		}
		
	}
}
