/*   URL : http://greenstech.in/selenium-course-content.html

NOTE: Click Selenium Test Papers Right Click Day 6 Robot and select Inspect                  */

package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question7 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement selenium = driver.findElement(By.xpath("(//h2[@class='mb-0'])[5]"));
		act.click(selenium).perform();
		
		Thread.sleep(2000);
		
		WebElement day6 = driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[6]"));
		act.contextClick(day6).perform();
		
		Robot rob =new Robot();
		
		for(int i=0;i<6;i++) {
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
