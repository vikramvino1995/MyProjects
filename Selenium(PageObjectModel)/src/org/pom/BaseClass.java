package org.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver;

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium(BaseClass)\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void goToWebsite(String link) {

		driver.get(link);
	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static String getUrl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getTitle() {

		String title = driver.getTitle();
		return title;
	}

	public static void titleContains(String str) {

		String title = driver.getTitle();
		if (title.contains(str)) {
			System.out.println("String present.");
		} else {
			System.out.println("String not present.");
		}

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {

		driver.quit();
	}

	public static String showText(WebElement text) {

		String textValue = text.getText();
		return textValue;

	}

	public static void leftClick(WebElement clickParameter) {

		Actions act = new Actions(driver);
		act.click(clickParameter).perform();

	}

	public static void rightClick(WebElement clickParameter) {

		Actions act = new Actions(driver);
		act.contextClick(clickParameter).perform();

	}

	public static void enterText(WebElement text, String str) {

		text.sendKeys(str);

	}

	public static String userInput(WebElement input) {
		String value = input.getAttribute("value");
		return value;
	}

	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void promptAlert(String str) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(str);
		a.accept();
	}

	public static void previousPage() throws AWTException {

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void openInNewWindow() throws AWTException {

		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);


		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void scrollDown(WebElement down) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(false)", down);

	}

	public static void wait(int no) throws InterruptedException {
		Thread.sleep(no);
	}

	public static void scrollUp(WebElement up) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", up);

	}

	public static void captureScreenshot(String str) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File temp = ts.getScreenshotAs(OutputType.FILE);

		File permanent = new File(str);

		FileUtils.copyFile(temp, permanent);

	}

	public static void mouseHover(WebElement mouse) {

		Actions act = new Actions(driver);

		act.moveToElement(mouse).perform();
	}
	
	public static String getUserInput() {
		
		System.out.println("Enter CAPTCHA:");
		
		Scanner s = new Scanner(System.in);
		
		String captcha = s.next();
		
		return captcha;
		
	}
	
	public static void windowHandle() {
		
		String parentId = driver.getWindowHandle();
		
		Set<String> parentChildIds = driver.getWindowHandles();
		
		for(String x: parentChildIds) {
			if(!x.equals(parentId)) {
				driver.switchTo().window(x);
			}
		}
	}
		
	public static void goToParentWindow() {
		
		String parentId2 = driver.getWindowHandle();
		driver.switchTo().defaultContent();
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
