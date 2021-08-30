/*  URL : http://www.flipkart.com

NOTE: Home & Furniture is first MouseHover 
      Click Bath Towels and print any product name. 
                                                           */

package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("http://www.flipkart.com");
			driver.manage().window().maximize();
			
			WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
			
			Actions act =new Actions(driver);
			WebElement furniture = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
			act.moveToElement(furniture).perform();
			
			Thread.sleep(3000);
			WebElement hover = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
			hover.click();
			


			//<a title="Bath Towels" class="_3QN6WI" href="/home-furnishing/bath-linen/bath-towels/pr?sid=jra,jk3,wtg&amp;marketplace=FLIPKART&amp;otracker=nmenu_sub_Home%20%26%20Furniture_0_Bath%20Towels">Bath Towels</a>
			
			
			
			
			
			
		}
}
