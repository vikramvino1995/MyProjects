/* URL : https://www.amazon.in/

NOTE: Click start here. Enter iphone and search             */

package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day3)\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement xpath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		xpath.sendKeys("iphone");
		
		WebElement xpath2 =driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		xpath2.click();
		
	
	}
}
