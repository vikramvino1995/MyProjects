/*URL : https://www.facebook.com/

NOTE: Print all the options in year using getAttirubute() method*/

package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question3 extends Utility {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		
		goToWebsite("https://www.facebook.com/");
		
		maximize();
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		leftClick(button);
		
		wait(3000);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s = new Select(year);
		
		boolean multiple = s.isMultiple();
		System.out.println("Is it Multiple DropDown: "+multiple);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=1;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			String year1 = option.getAttribute("value");
			System.out.println(year1);
			
		}
		
		s.selectByIndex(3);
		//s.selectByValue("2017");
		//s.selectByVisibleText("2014");
		
		
		
		
	}
}
