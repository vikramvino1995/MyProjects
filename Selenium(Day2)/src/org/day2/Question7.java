/* URL :https://www.snapdeal.com/login

NOTE: Enter mobile number/email.  */


package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		
	    driver.getCurrentUrl();
	    driver.getTitle();
	    
	    WebElement enterXpath = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
	    enterXpath.sendKeys("8148104697");
	}
}
