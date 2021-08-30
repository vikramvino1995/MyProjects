/* URL : https://www.flipkart.com/ 

NOTE: Click login and enter User name password
      Print the details you are given.                  */


package org.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question11 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		 WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 findElement.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement findElement0 = driver.findElement(By.xpath("//a[text()='Login']"));
		 findElement0.click();
		    
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String string = findElement2.getAttribute("value");
		System.out.println(string);
		
		driver.close();
		
	}
}
