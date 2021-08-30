package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass {
	
	public static WebDriver driver;

	public WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");

		return driver = new ChromeDriver();
	}

	public void loadUrl(String url) {

		driver.get(url);

		maximize();

	}

	public String getUrl() {

		return driver.getCurrentUrl();

	}

	public String getTitle() {

		return driver.getTitle();

	}

	public void maximize() {

		driver.manage().window().maximize();
	}

	public void enterText(WebElement element, String text) {

		element.sendKeys(text);

	}

	public String userInput(WebElement element) {

		return element.getAttribute("value");

	}

	public String attributeValue(WebElement element, String attributeName) {

		return element.getAttribute(attributeName);

	}

	public String getWebText(WebElement element) {

		return element.getText();

	}

	public void leftClick(WebElement element) {

		new Actions(driver).click(element).perform();

	}

	public void rightClick(WebElement element) {

		new Actions(driver).contextClick(element).perform();
		;

	}

	public void doubleClick(WebElement element) {

		new Actions(driver).doubleClick(element).perform();

	}

	public void mouseOver(WebElement element) {

		new Actions(driver).moveToElement(element).perform();

	}

	public void dragAndDrop(WebElement source, WebElement destination) {

		new Actions(driver).dragAndDrop(source, destination);

	}

	public void javaScriptEnterText(WebElement element, String text) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value'," + text + ")", element);

	}

	public Object javaScriptGetUserInput(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		return js.executeScript("return arguments[0].getAttribute('value')", element);

	}

	public void javaScriptClick(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", element);

	}

	public void scrollDown(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollUp(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public void dropDownByValue(WebElement element, String value) {

		new Select(element).selectByValue(value);

	}

	public void dropDownBytext(WebElement element, String visibleText) {

		new Select(element).selectByVisibleText(visibleText);

	}

	public void dropDownByIndex(WebElement element, int index) {

		new Select(element).selectByIndex(index);

	}

	public void dropDownDeselectByValue(WebElement element, String value) {

		new Select(element).deselectByValue(value);

	}

	public void dropDownDeselectBytext(WebElement element, String visibleText) {

		new Select(element).deselectByVisibleText(visibleText);

	}

	public static void dropDownDeselectByIndex(WebElement element, int index) {

		new Select(element).deselectByIndex(index);

	}

	public void selectAllOptionsByIndex(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement option = options.get(i);

			s.selectByIndex(i);
		}

	}

	public void selectAllOptionsByValue(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement option = options.get(i);

			s.selectByValue(option.getAttribute("value"));
		}

	}

	public void selectAllOptionsByVisibleText(WebElement element) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement option = options.get(i);

			s.selectByVisibleText(option.getText());
		}

	}

	public String selectedOptions(WebElement element) {

		String text = null;

		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (int i = 0; i < allSelectedOptions.size(); i++) {

			WebElement selectedOption = allSelectedOptions.get(i);

			text = selectedOption.getText();

		}
		return text;

	}

	public void deselectAllOptions(WebElement element) {

		Select s = new Select(element);

		s.deselectAll();
	}

	public void switchToFrameByWebElement(WebElement element) {

		driver.switchTo().frame(element);
	}

	public void switchToFrameByIdOrName(String s) {

		driver.switchTo().frame(s);
	}

	public void switchToFrameByIndex(int index) {

		driver.switchTo().frame(index);
	}

	public int frameCount() {

		return driver.findElements(By.tagName("iframe")).size();

	}

	public String webTableDatas() {

		String tableData = null;

		List<WebElement> tRows = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < tRows.size(); i++) {

			WebElement singleRow = tRows.get(i);

			List<WebElement> tDatas = singleRow.findElements(By.tagName("td"));

			for (int j = 0; j < tDatas.size(); j++) {

				WebElement singleData = tDatas.get(j);

				tableData = singleData.getText();

			}
		}

		return tableData;
	}

	public String webTableHeader() {

		String tableHeader = null;

		List<WebElement> tRows = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < tRows.size(); i++) {

			WebElement singleRow = tRows.get(i);

			List<WebElement> tHeaders = singleRow.findElements(By.tagName("th"));

			for (int j = 0; j < tHeaders.size(); j++) {

				WebElement singleHeader = tHeaders.get(j);

				tableHeader = singleHeader.getText();

			}
		}
		return tableHeader;

	}

	public String excelReadAll(String fileLocation, String sheetName) throws IOException {

		File loc = new File(fileLocation);

		FileInputStream inputStream = new FileInputStream(loc);

		Workbook workbook = new XSSFWorkbook(inputStream);

		Sheet sheet = workbook.getSheet(sheetName);

		String value = null;

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				int cellType = cell.getCellType();

				if (cellType == 1) {

					value = cell.getStringCellValue();
				} else if (cellType == 0) {

					if (DateUtil.isCellDateFormatted(cell)) {

						Date dateCellValue = cell.getDateCellValue();

						SimpleDateFormat date = new SimpleDateFormat();

						value = date.format(dateCellValue);

					}

					else {

						double numericCellValue = cell.getNumericCellValue();

						long numericValue = (long) numericCellValue;

						value = String.valueOf(numericValue);
					}
				}

			}
		}
		return value;
	}

	public void pressEnter() throws AWTException {

		new Robot().keyPress(KeyEvent.VK_ENTER);

		new Robot().keyRelease(KeyEvent.VK_ENTER);

	}

	public void OpenLinkInNewTab(WebElement element) throws AWTException {

		new Actions(driver).contextClick(element).perform();

		new Robot().keyPress(KeyEvent.VK_DOWN);

		new Robot().keyRelease(KeyEvent.VK_DOWN);

		new Robot().keyPress(KeyEvent.VK_ENTER);

		new Robot().keyRelease(KeyEvent.VK_ENTER);

	}

	public void goBack(WebElement element) throws AWTException {

		new Actions(driver).contextClick(element).perform();

		new Robot().keyPress(KeyEvent.VK_DOWN);

		new Robot().keyRelease(KeyEvent.VK_DOWN);

		new Robot().keyPress(KeyEvent.VK_ENTER);

		new Robot().keyRelease(KeyEvent.VK_ENTER);

	}

	public void takeScreenshot(String screenshotName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File tempLocation = ts.getScreenshotAs(OutputType.FILE);

		File permanentLocation = new File(System.getProperty("user.dir") + "\\screenshots\\" + screenshotName);

		FileUtils.copyFile(tempLocation, permanentLocation);

	}

	public void handleSimpleAlert() {

		driver.switchTo().alert().accept();

	}

	public void handleConfirmAlert() {

		driver.switchTo().alert().dismiss();

	}

	public void handlePromptAlert(String text) {

		driver.switchTo().alert().sendKeys(text);

		driver.switchTo().alert().accept();

	}

	public void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

	public void closeBrowser() {
		driver.close();
	}

}
