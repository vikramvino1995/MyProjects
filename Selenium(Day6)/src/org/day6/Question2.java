/*  URL : https://www.google.co.in/webhp 

NOTE: Enter Vikram Vino and select Vikram Vino using double Click
      Cut Vikram Vino using Keyboard shortcut[Ctrl+x]
               */
package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp ");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		
		
		search.sendKeys("Vikram Vino");
		String attribute = search.getAttribute("value");
		System.out.println(attribute);
		
		Robot rob =new Robot();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_X);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_X);
		
	}
}
