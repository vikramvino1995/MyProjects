/*  URL : https://www.snapdeal.com/ 

NOTE: Search any product and click 1st product    */

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.snapdeal.com/ ");
		
		WebElement search = driver.findElement(By.id("inputValEnter"));
		search.sendKeys("Bluetooth Speakers");
		
		WebElement searchbt = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchbt.click();
		
		WebElement product = driver.findElement(By.xpath("//img[@title='VEROX A005 5hrs 5W Light Bluetooth Speaker']"));
		
		product.click();
	}
}
