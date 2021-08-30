package org.day7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	
	public static void main(String[] args) throws InterruptedException, IOException,MalformedURLException{
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		List<WebElement> links = footer.findElements(By.tagName("a"));
		
		
		for(int i=0;i<links.size();i++) {
			
			WebElement link = links.get(i);
			
			Thread.sleep(3000);
			
			String url = link.getAttribute("href");
			
			 URL u =new URL(url);
			
			 HttpURLConnection  conn = (HttpURLConnection)u.openConnection();
			
			Thread.sleep(5000); 
			
			conn.connect();
			
			int responseCode = conn.getResponseCode();
			
			if(responseCode>=400) {
				
				System.out.println(url+ "- "+ "is Broken Link");
				
			}
			else {
				
				System.out.println(url+" - "+ "is valid Link ");
			}
				
		}
		
	}
	
}
