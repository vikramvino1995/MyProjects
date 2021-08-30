/* URL : http://greenstech.in/selenium-course-content.html

NOTE: Click Model Resume and  rightClick resume model 4 the page and click save as.     */

package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement modelResume = driver.findElement(By.xpath("//h2[contains(text(),'Model Resumes')]"));
		
		modelResume.click();
		
		Actions act = new Actions(driver);
		WebElement resume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		
		act.contextClick(resume4).perform();
		
		Robot rob =new Robot();
		
		for(int i=0;i<4;i++) {
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
}
