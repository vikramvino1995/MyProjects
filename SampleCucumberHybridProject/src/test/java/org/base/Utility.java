package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	public static WebDriver driver;

	public WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		return driver = new ChromeDriver();

	}

	public void maximize() {

		driver.manage().window().maximize();

	}

	public void loadUrl(String url) {

		driver.get(url);

	}

	public String getCurrentUrl() {

		return driver.getCurrentUrl();

	}

	public String getTitle() {

		return driver.getTitle();

	}
	
	public void enterText(WebElement element,String text) {
		
		element.sendKeys(text);
		
	}

	public void leftClick(WebElement element) {

		Actions act = new Actions(driver);

		act.click(element).perform();

	}

	public void rightClick(WebElement element) {

		Actions act = new Actions(driver);

		act.contextClick(element).perform();

	}

	public void doubleClick(WebElement element) {

		Actions act = new Actions(driver);

		act.doubleClick(element).perform();

	}

	public void dragAndDrop(WebElement src, WebElement target) {

		Actions act = new Actions(driver);

		act.dragAndDrop(src, target).perform();

	}

	public void pressEnterKey() throws AWTException {

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}

	public void pressDownArrowKey() throws AWTException {

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

	}

	public void takeScreenshot(String loc) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;

		File temporaryLoc = tk.getScreenshotAs(OutputType.FILE);

		File permanentLoc = new File(loc);

		FileUtils.copyFile(temporaryLoc, permanentLoc);

	}

	public void scrollDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollUp(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public String readExcelData(String sheetName, int rowNo, int cellNo) throws IOException {

		String value = null;

		File file = new File("C:\\Users\\hp\\eclipse-workspace\\SampleCucumberHybridProject\\testData\\myData.xlsx");

		FileInputStream read = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(read);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		int cellType = cell.getCellType();

		if (cellType == 1) {

			value = cell.getStringCellValue();

		}

		else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(cell)) {

				Date d = cell.getDateCellValue();

				SimpleDateFormat sf = new SimpleDateFormat();

				value = sf.format(d);

			}

			else {

				double numericCellValue = cell.getNumericCellValue();

				long l = (long) numericCellValue;

				value = String.valueOf(l);

			}

		}

		return value;

	}

	
	
	
}
