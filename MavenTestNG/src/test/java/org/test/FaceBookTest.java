package org.test;

import org.baseClass.UtilityClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.FacebookLogin;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBookTest extends UtilityClass{
	
	
	
	@Parameters({"browser"})
	@Test
	public void browser(String s) {
		

		if(s.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(s.equals("firefox")){
				
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\geckodriver.exe");
			
			driver =new FirefoxDriver();
	
	
	}
		
		maximize();
		
		loadUrl("https://www.facebook.com/?_rdr");
		
	}
	
	
	@Parameters("username")
	@Test(priority=1)
	public void username(String username) {
		
		FacebookLogin fb =new FacebookLogin();
		
		enterText(fb.getMail(),username);
		
	}
	
	
	@Parameters("password")
	@Test(priority=2)
	public void password(String password) {
		
		FacebookLogin fb =new FacebookLogin();
		
		enterText(fb.getPswd(),password);
				
		
	}
	
	
	
		
		
	
}
