package org.day7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class B {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys("Shoes");
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		
		System.out.println(size);
		
		
		
		/*for(int i=0;i<links.size();i++) {
			
			WebElement oneLink = links.get(i);
			
			String text2 = oneLink.getText();
			
			if(text2.contains("Shoes")) {
				
				System.out.println(text2);
			}
			
		}*/
		
		
	/*	List<WebElement> links = driver.findElements(By.partialLinkText("Shoes"));
		
		for(int i=0;i<links.size();i++) {
			
			WebElement oneLink = links.get(i);
			
			String text2 = oneLink.getText();
		
			System.out.println(text2);
			
		}*/
	}
}

			

