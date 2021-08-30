package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath2 {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zalando.co.uk/women-home/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@role='button']"))).click();
		
		WebElement element = driver.findElement(By.xpath("(//span//following-sibling :: span)[1]"));
		
		String text = element.getText();
		
		System.out.println(text);
		
		
	}
}
