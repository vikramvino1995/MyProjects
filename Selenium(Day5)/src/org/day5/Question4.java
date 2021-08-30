/* URL : https://www.shopclues.com/wholesale.html
	 
	NOTE: Mobile and electronics is first MouseHover 
	      Click Micromax.       */


package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.shopclues.com/wholesale.html");
		 
		 driver.manage().window().maximize();
		 
		 WebElement hover = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[21]"));
		 
		 Actions act =new Actions(driver);
		 
		 act.moveToElement(hover).perform();
		 
		 Thread.sleep(2000);
		 
		 WebElement phone = driver.findElement(By.xpath("//a[text()='Micromax']"));
		 phone.click();
	}
}
