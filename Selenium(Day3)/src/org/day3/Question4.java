/*  URL : http://toolsqa.com/automation-practice-form/

NOTE: Give details and register the form.
                                                      */

package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day3)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name.sendKeys("Vikram");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		

		
	}
}



