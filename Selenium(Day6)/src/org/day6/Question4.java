/* URL : http://greenstech.in/selenium-course-content.html

NOTE: Right Click Framework Test Papers  and Select Inspect
    */

package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			driver.manage().window().maximize();
			
			WebElement framework = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
			
			Actions act =new Actions(driver);
			
			act.contextClick(framework).perform();
			
			Robot rob =new Robot();
			
			
			for(int i=0;i<8;i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			}
			
			rob.keyPress(KeyEvent.VK_ENTER);
			
			
			
			
			
			
			
			
	}
}
