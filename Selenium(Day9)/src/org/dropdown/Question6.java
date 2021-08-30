/*URL : http://demo.guru99.com/test/newtours/register.php

NOTE: print all the option of country using getText() methods*/

package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question6 extends Utility{
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		goToWebsite("http://demo.guru99.com/test/newtours/register.php");
		
		maximize();
		
		WebElement countryLoc = driver.findElement(By.name("country"));
		
		Select s =new Select(countryLoc);
		
		List<WebElement> countries = s.getOptions();
		
		for(int i=0;i<countries.size();i++) {
			
			WebElement country = countries.get(i);
			
			String countryNames = country.getText();
			
			System.out.println(countryNames);
		}
		
		
		
	}
}
