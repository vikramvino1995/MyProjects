/*URL : http://www.greenstechnologys.com/python-training.html


NOTE: Click Selenium Test Papers and click Selenium Day10Task 
      Click Windows Handling and print 1 question 
*/

package org.windowshandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question4 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		launchBrowser();
		
		goToWebsite("http://www.greenstechnologys.com/python-training.html");
		
		maximize();
		
		putWait();
		
		WebElement selenium = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		
		scrollDown(selenium);
		leftClick(selenium);
		
		
		
		
	}
}
