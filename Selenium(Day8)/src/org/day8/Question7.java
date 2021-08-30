package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day8)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("login_page");
		
		//WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		//driver.switchTo().frame(frame);
		
		driver.switchTo().frame(0);
		
		
		
		WebElement uId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		uId.sendKeys("Vikram.A");
		
		WebElement button = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		button.click();
		
		WebElement pswd = driver.findElement(By.name("fldPassword"));
		pswd.sendKeys("vinodhini");
		
}
}
