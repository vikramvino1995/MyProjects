package org.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utility {


	public static WebDriver driver;
	
	public static WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		 return driver = new ChromeDriver();
		
	}
	
	public static void loadURL(String url) {
		
		driver.get(url);
	}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
	}
	
	public static String showTitle() {
		
		 return driver.getTitle();
	}
	
	public static void enterText(WebElement e, String text) {
		
		e.sendKeys(text);
		
	}
	
	public static void leftClick(WebElement e) {
		
		Actions act = new Actions(driver);
		act.click(e).perform();
	}
	
	public static void RightClick(WebElement e) {
		
		Actions act = new Actions(driver);
		act.contextClick(e).perform();
		
	}
	
	
	public static void pressEnter() throws AWTException {
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	}
		
	public static void pressDown() throws AWTException {
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	
	}
	
	
	public static void selectDate(String date) throws InterruptedException {
		
		
		String flag = "False";

		while (flag == "False") {

			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+ date +"')]"))
					.size() > 0) {

				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'"+ date +"')]"))
						.click();
				flag = "True";
				Thread.sleep(500);
			}

			else {
				Thread.sleep(500);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}

	}
	
}
	
}
