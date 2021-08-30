package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class BaseClass {
	
	protected static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}
	

	public static void loadUrl(String site) {

		driver.get(site);

	}
	
	public static void sleep() throws InterruptedException {
		
		Thread.sleep(3000);
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void enterText(WebElement w, String s) {

		w.clear();
		w.sendKeys(s);

	}

	public static void leftClick(WebElement cl) {

		// Actions a = new Actions(driver);

		// a.click(cl).perform();
		cl.click();

	}

	public static void RightClick(WebElement cl) {

		Actions a = new Actions(driver);

		a.click(cl).perform();

	}

	public static String printText(WebElement w) {

		String text = w.getText();
		return text;

	}

	public static String getUserInput() {

		System.out.println("Enter Captcha: ");

		Scanner s = new Scanner(System.in);

		String input = s.next();

		return input;

	}
	


	public static void switchToFrame(WebElement e) {

		driver.switchTo().frame(e);

	}
	
	

	public static void javascriptClick(WebElement e) {

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", e);

	}

	@DataProvider
	public static Object[][] getData() throws IOException {

		String value = null;

		File loc = new File("C:\\Users\\hp\\eclipse-workspace\\MavenTestNG_2\\Excel\\Facebook.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("credentials");
		
		Row row = s.getRow(0);
		
		int rowSize = s.getPhysicalNumberOfRows();

		int cellSize = row.getPhysicalNumberOfCells();
		
		System.out.println(rowSize);
		
		System.out.println(cellSize);
		
		Object o[][] = new Object[rowSize][cellSize];
		
		for(int i=1;i<s.getPhysicalNumberOfRows();i++) {
				
			Row r = s.getRow(i);
		
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				
				
				Cell cell = r.getCell(j);
				
				int cellType = cell.getCellType();
				
				if(cellType==1) {
					
					value = cell.getStringCellValue();
					
				}
				
				else if(cellType==0) {
					
					if(DateUtil.isCellDateFormatted(cell)) {
						
						Date d = cell.getDateCellValue();
						
						SimpleDateFormat sdf = new SimpleDateFormat();
						
						 value = sdf.format(d);
					}
					
					else {
						
						double n = cell.getNumericCellValue();
						
						long l = (long)n;
						
						value = String.valueOf(l);				
					}
							
				}
				//array initialization.
				o[i][j] = value;
				System.out.println(o[1][0]);
				System.out.println(o[1][1]);
				
				System.out.println(o[2][0]);
				System.out.println(o[2][1]);
				
			}
			
		}
		
		return o;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
}
