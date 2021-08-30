/*  URL : https://www.instagram.com/accounts/login/?hl=en) login page 

NOTE: Enter UserName and password. 
                                                         */

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
	    
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)");
		Thread.sleep(3000);
		WebElement enterUserName = driver.findElement(By.name("username"));
		enterUserName.clear();
		enterUserName.sendKeys("_kakarot_95");
		
		WebElement enterPswd = driver.findElement(By.name("password"));
		enterPswd.sendKeys("1235456");
		
	    
		
	}
}
