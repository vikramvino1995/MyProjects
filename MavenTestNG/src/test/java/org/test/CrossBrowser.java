package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void test1(String browser) {
		
		if(browser.equals("chrome")) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\geckodriver.exe");
			
			driver =new FirefoxDriver();
			
			
		}
		
		else if(browser.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
		}
	

		driver.manage().window().maximize(); 
		
		driver.get("https://en.wikipedia.org/wiki/Gmail");
		
		
	}
	
}
