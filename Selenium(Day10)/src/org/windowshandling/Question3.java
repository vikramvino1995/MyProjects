/*URL : https://www.homedepot.com/

NOTE: Search ceiling fan 
      click 1st fan and click the remote control included

*/

package org.windowshandling;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question3 extends BaseClass{
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		launchBrowser();
		
		goToWebsite("https://www.homedepot.com/");
		
		maximize();
		
		putWait();
	
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='headerSearch']"));
		
		enterText(searchBox,"Ceiling Fan");
		
		putWait();
		
		pressEnter();
		
		putWait();
		
		WebElement indoorCeiling = driver.findElement(By.xpath("//img[@alt='Indoor Ceiling Fans with Lights']"));
		
		leftClick(indoorCeiling);
		
		putWait();
		
		WebElement fan1 = driver.findElement(By.xpath("(//span[contains(text(),'Ashby ')])[1]"));
		leftClick(fan1);
		
		putWait();
		
		String parentId = driver.getWindowHandle();
		
		Set<String> parentChildIds = driver.getWindowHandles();
		
		for(String x: parentChildIds) {
			if(!x.equals(parentId)) {
				driver.switchTo().window(x);
			}
		}
		
		WebElement remoteControl = driver.findElement(By.xpath("(//div[text()='Control Type Included'])[1]"));
		leftClick(remoteControl);
		
		
		
		
		
	}
}
