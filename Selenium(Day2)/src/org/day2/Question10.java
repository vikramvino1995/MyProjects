/* URL : http://adactinhotelapp.com/

NOTE: Enter Email or Phone and Password.    */

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	WebElement id = driver.findElement(By.id("username"));
	id.sendKeys("8148104697");
	
	WebElement pswd =driver.findElement(By.name("password"));
	Point location = pswd.getLocation();
	location.getX();
	location.getY();
	pswd.sendKeys("vikramvino");
	}
}
