package org.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.PageObjectClass;
import org.utility.UtilityClass;

public class ExcelData4 extends UtilityClass{
	
	public static void main(String[] args) throws IOException {
		
		
		launchBrowser();
		
		loadUrl("https://www.facebook.com/");
		
		maximize();
		
		/*WebElement mail = driver.findElement(By.id("email"));
		
		enterText(mail,getData("Sheet1",3,0));
		
		WebElement pswd = driver.findElement(By.id("pass"));
		
		enterText(pswd,getData("Sheet1",3,1));
		*/
		
		PageObjectClass poc = new PageObjectClass();
		
		enterText(poc.getMail(),getData("Sheet1",2,0));
		
		
		enterText(poc.getPass(),getData("Sheet1",3,0));
		
	}
}
