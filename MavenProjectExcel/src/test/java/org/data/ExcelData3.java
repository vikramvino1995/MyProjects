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

public class ExcelData3 {
	
	public static void main(String[] args) throws IOException {
		
		File loc =new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\Book3.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		Workbook wb =new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Datas");
		
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
						
						SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
						
						String dateFinal = sdf.format(dateCellValue);
						
						System.out.println(dateFinal);
						
						}
					
					else {
						
						double numericCellValue = cell.getNumericCellValue();
						
						long l = (long)numericCellValue;
						
						String mobileNo = String.valueOf(l);
						
						System.out.println(mobileNo);
						
						
						
					}
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
}
