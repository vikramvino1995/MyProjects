/*URL : http://demoqa.com/automation-practice-form/

NOTE: print all the even option in State and City

*/
package org.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question1 extends Utility{
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		goToWebsite("http://demoqa.com/automation-practice-form/");
		
		maximize();
		
		WebElement sc = driver.findElement(By.xpath("//div[text()='Select State']"));
		
		Select s = new Select(sc);
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
		
		
	}
}
