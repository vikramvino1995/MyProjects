/*  URL : https://www.shopclues.com/wholesale.html 

NOTE: Search any product and click 1st product               */



package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		WebElement search = driver.findElement(By.xpath("//input[@onfocus='autoComplete()']"));
		
		search.sendKeys("nokia mobile");
		
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='anchorHighlight'])[1]"));
		findElement.click();
		
		
	}
}
