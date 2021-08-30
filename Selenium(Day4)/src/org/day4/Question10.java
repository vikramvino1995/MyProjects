/* URL : https://www.flipkart.com/ 

NOTE: Search any product and click 1st product                            */


package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("q"));
		name.sendKeys("Mobiles");
		
		WebElement click = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		click.click();
		
		
		
	}
}
