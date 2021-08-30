package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	static WebDriver driver;
	
		public static void launchBrowser() {
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day10)\\Driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
		}
		
		public static void goToWebsite(String str) {
			
			driver.get(str);
		}
		
		public static void maximize() {
			
			driver.manage().window().maximize();
		}
		
		public static void leftClick(WebElement ref) {
			Actions act = new Actions(driver);
			
			act.click(ref).perform();
			
		}
		
		public static void rightClick(WebElement ref) {
			Actions act = new Actions(driver);
			
			act.contextClick(ref).perform();
		}
		
		public static void pressEnter() throws AWTException {
			
			Robot rob =new Robot();
			
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
		
		public static void scrollDown(WebElement ref) {
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(false)",ref);
			
		}
		
		public static void scrollUp(WebElement ref) {
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(true)",ref);
			
		}
		
		public static String getText(WebElement ref) {
			
			String text = ref.getText();
			return text;
		}
		
		public static void enterText(WebElement ref,String str) {
					ref.sendKeys(str);
		}
		
		public static void  putWait() throws InterruptedException {
			Thread.sleep(2500);
		}
		
		public static void mouseHover(WebElement mouse) {

			Actions act = new Actions(driver);

			act.moveToElement(mouse).perform();
		}
		
		
		
		
		
		
		
		
		
		
}
