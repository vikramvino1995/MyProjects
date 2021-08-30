package org.baseClass;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class UtilityClass {
	
	public static String parentId;

	protected static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void loadUrl(String site) {

		driver.get(site);

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

	public static String parentWindow() {

		 parentId = driver.getWindowHandle();
		return parentId;
		
	}
	
	public static void childWindow() {
		
		 parentId = driver.getWindowHandle();
		Set<String> parentChildId = driver.getWindowHandles();
		
		
		for (String x : parentChildId) {
			if (!x.equals(parentId)) {
				driver.switchTo().window(x);
			}
		}

	}

	public static void goToParentWindow(WebElement w) throws InterruptedException {

		String parentId;
		String childid;
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		parentId = it.next();
		while (it.hasNext()) {
			childid = it.next();
			Thread.sleep(4000);
			driver.switchTo().window(childid);
			System.out.println("Child" + w);
		}
		driver.switchTo().window(parentId);

	}

	public static void switchToFrame(WebElement e) {

		driver.switchTo().frame(e);

	}
	
	

	public static void javascriptClick(WebElement e) {

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].click()", e);

	}

	public static String getData(String sheet1, int i, int j) throws IOException {

		String value = null;

		File loc = new File("C:\\Users\\hp\\eclipse-workspace\\MavenProjectExcel\\Excel\\AdactinData.xlsx");
		FileInputStream fis = new FileInputStream(loc);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheet1);
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);

		int cellType = cell.getCellType();

		if (cellType == 1) {

			value = cell.getStringCellValue();
		} else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateCellValue = cell.getDateCellValue();

				SimpleDateFormat sdf = new SimpleDateFormat();

				value = sdf.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();

				long l = (long) numericCellValue;

				value = String.valueOf(l);
			}

		}

		return value;

	}

}
