/*  URL : https://netbanking.hdfcbank.com/ 


NOTE: Enter customer id .             */


package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com"); 
		
		WebElement enterName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		enterName.sendKeys("y45756");
		
	}
}
