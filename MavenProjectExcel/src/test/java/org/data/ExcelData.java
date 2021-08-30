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

public class ExcelData {
	
	public static void main(String[] args) throws IOException{
		
		
		File loc =new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\Book1.xlsx");
		
		FileInputStream f =new FileInputStream(loc);
		
		Workbook w =new XSSFWorkbook(f);
		
		Sheet sheet = w.getSheet("Info");
		
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Rows Used: "+numberOfRows);
		
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
						
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							
							SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/yyyy");
							
							String date2 = sdf.format(dateCellValue);
							System.out.println(date2);
							
						}
						else {
							
							double numericCellValue = cell.getNumericCellValue();
							long l=(long)numericCellValue;
							String valueOf = String.valueOf(l);
							System.out.println(valueOf);
							
						}
						
						
					}
					
					
				}
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
