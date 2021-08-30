/* URL : http://greenstech.in/selenium-course-content.html


NOTE: Click interview question and Right click cts interview question and Select open link in new window
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

public class Question3 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	    driver.get(" http://greenstech.in/selenium-course-content.html");
	    
	    driver.manage().window().maximize();
	    
	    Actions act =new Actions(driver);
	    
	    WebElement question = driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));	
	    act.click(question).perform();
	    
	    WebElement cts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	    act.contextClick(cts).perform();
	    
	    Robot rob =new Robot();
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	}
}
