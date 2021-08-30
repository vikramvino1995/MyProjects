/*URL : https://www.shopclues.com/wholesale.html 
 
NOTE: Sports&more  is first MouseHover
      Click weight gainers                */
      
package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(" https://www.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		WebElement sports = driver.findElement(By.xpath("//a[contains(text(),'Sports & More')]"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(sports).perform();
		
		Thread.sleep(2000);
		
		WebElement weight = driver.findElement(By.xpath("//a[contains(text(),'Weight Gainers')]"));
		weight.click();
		
		
	
	}
}
