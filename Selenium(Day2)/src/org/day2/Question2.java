/*  URL : https://www.redbus.in/ 

NOTE: Enter from and to textBox.          */

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		driver.getTitle();
		driver.getCurrentUrl();
		
		WebElement enterId= driver.findElement(By.id("src"));
		enterId.sendKeys("chennai");
		
		WebElement enterId2 = driver.findElement(By.id("dest"));
		enterId2.sendKeys("Madurai");
		
	}
}
