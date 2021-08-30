/*URL : http://greenstech.in/selenium-course-content.html

NOTE: Click Junit in Framework Test Paper
      print 1st Question in practical
*/

package org.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question6 extends  BaseClass{
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		goToWebsite("http://greenstech.in/selenium-course-content.html");
		
		maximize();
		
		WebElement framework = driver.findElement(By.xpath("//h2[contains(text(),'Framework')]"));
		
		leftClick(framework);
		
		WebElement junit = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		
		leftClick(junit);
		
		String parentId = driver.getWindowHandle();
		
		Set<String> parentChildIds = driver.getWindowHandles();
		
		for(String x : parentChildIds) {
			
			if(!x.equals(parentId)) {
				driver.switchTo().window(x);
			}
		}
		
		
		
	}
}
