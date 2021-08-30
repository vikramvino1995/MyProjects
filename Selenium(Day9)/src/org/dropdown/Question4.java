/*URL : https://www.facebook.com/

NOTE: Print all the options in month using getText() method
*/


package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question4 extends Utility{
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		
		goToWebsite("https://www.facebook.com/");
		
		maximize();
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		leftClick(button);
		
		wait(3000);
		
		WebElement months = driver.findElement(By.id("month"));
		
		Select s =new Select(months);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			String monthText = option.getText();
			
			System.out.println(monthText);
			
		}
		
		s.selectByIndex(6);
		
	}
}
