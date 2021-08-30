/* URL : https://infinity.icicibank.com/corp/Login.jsp

NOTE: Enter username and password. */ 


package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement enterName = driver.findElement(By.xpath("//input[@title='User Id']"));
		enterName.sendKeys("Vikram1136");
		
		//WebElement enterClass = driver.findElement(By.className("login-input-password"));
		//enterClass.sendKeys("newtonsapple");
		
		
	}
}
