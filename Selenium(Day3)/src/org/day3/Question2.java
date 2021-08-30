/* URL : https://www.facebook.com/

NOTE: Enter email and password and click login(by using xpath locator).           */

package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day3)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("Vikramvino1136@gmail.com");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
		pswd.sendKeys("123456789");
		
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
		
		}
}
