/*  URL : http://greenstech.in/selenium-course-content.html

NOTE: Right Click RPA [ below Top Selenium Trends In 2020] and click Inspect                   */

package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Question6 {
	
	public static void main(String[] args) throws AWTException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement rpa = driver.findElement(By.xpath("//a[text()='RPA']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rpa).perform();
		
		Robot rob =new Robot();
		
		for(int i=0;i<6;i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);	
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}
}
