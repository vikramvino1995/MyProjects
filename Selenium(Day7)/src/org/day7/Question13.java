/* URL : https://www.snapdeal.com/

NOTE: search HP laptop and take the screenshot .            */

package org.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question13 {
	
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("HP LapTop");
		
		Robot rob =new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File permanent =new File("C:\\Users\\hp\\Pictures\\Screenshots\\Laptop.jpg");
		
		FileUtils.copyFile(temp,permanent);
		
		driver.close();
		
	}
}
