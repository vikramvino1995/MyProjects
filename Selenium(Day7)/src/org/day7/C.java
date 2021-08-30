package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		int imageCount = images.size();
		
		System.out.println("Total Images: "+imageCount);
		
		
		for(int i=0;i<images.size();i++) {
			
			WebElement image = images.get(i);
			
			String imagName = image.getAttribute("alt");
			
			System.out.println(imagName);
			
		}
		                                                                               
		
		
	}
}
