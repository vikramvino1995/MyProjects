
package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumBasics\\Drivers\\chromedriver.exe");
		
		//UpCasting
		WebDriver driver = new ChromeDriver();
		
		//to pass the URL.
		driver.get("http://www.mca.gov.in/MinistryV2/roc_chennai.html");
		driver.get("http://cancerinstitutewia.in/CI-WIA/");
		
		//to get the title.
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the URL.
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to close Current Window.
		driver.close();
		
		//to close the Entire Browser.
		
		//driver.quit(); 
		
	}
}


