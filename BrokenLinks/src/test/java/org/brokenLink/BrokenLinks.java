package org.brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?_rdr");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
			
		int count =0;
		
		for(WebElement element : allLinks) {
			
		     String link = element.getAttribute("href");
		     
		     //System.out.println(link);
		     
		    if(!(link==null)) {
		    	
		    	URL url = new URL(link);
		    	
		    	URLConnection openConnection = url.openConnection();
		    	
		    	HttpURLConnection http = (HttpURLConnection)openConnection;
		    	
		    	int responseCode = http.getResponseCode();
		    	
		    	if(!(responseCode==200)) {
		    		
		    		count++;
		    		
		    		System.out.println("Broken Link: "+link);
		    		
		    	}
		    	
		    }
			
		}
		
		System.out.println("Total Broken Links: "+count);
		
		driver.close();
		
	}
	
}
