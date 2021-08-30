package org.xpath;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

		
		
		WebElement user = driver.findElement(By.name("email"));
		
		user.sendKeys("Vikram");
		
		WebElement pswd = driver.findElement(By.xpath("(//input//parent :: div)[2]"));
		
		pswd.sendKeys("Vino");
		
		
		
		//Absolute Xpath
		
		//driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]")).sendKeys("Vikram");
		
		
		
		
}

}