/*URL :  http://www.greenstechnologys.com/

NOTE: Mouse Over Course And click python 
      Right Click Explore Curriculum and click open in new window*/

package org.windowshandling;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question5 extends BaseClass{
	
	public static void main(String[] args) throws AWTException {
		
		launchBrowser();
		
		goToWebsite("http://www.greenstechnologys.com/");
		
		maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		mouseHover(course);
		
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		leftClick(python);
		
		WebElement button = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		rightClick(button);
		
		openInNewWindow();
		
		
		
	}
}
