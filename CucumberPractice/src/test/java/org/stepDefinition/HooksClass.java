package org.stepDefinition;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before(order=1)
	public void browserOpen() {
		
		System.out.println("==============================================");
		
		System.out.println("Browser Launched");
		
	}
	
	@Before(order=2)
	public void cookiesSet() {
		
		System.out.println("Cookies set up");	
	}
	
	@Before(order=3)
	public void dbOpen() {
		
		System.out.println("DB Opened");
		
	}
	
	@After(order=3)
	public void browserClose() {
		
		System.out.println("==============================================");
		
		System.out.println("Browser Closed");
		
	}
	
	@After(order=2)
	public void cookiesClear() {
		
		System.out.println("Cookies Cleared");
		
	}
	
	
	@After(order=1)
	public void dbClosed() {
		
		System.out.println("DB Closed");
		
	}
	
	@After
	public void takeSnap(Scenario scenario) throws IOException {
	
		String step = scenario.getName();
		
		TakesScreenshot  tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File permanent = new File("C:\\Users\\hp\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\FailedSnap\\"+ step +".jpeg");
		
		FileUtils.copyFile(temp,permanent);
	
	}
	
	
	
	/*@After
	public void takeSnap(Scenario scenario) {
		
		if(scenario.isFailed()) {
			
			TakesScreenshot  tk = (TakesScreenshot)driver;
			
			byte[] temp = tk.getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(temp,"C:\\Users\\hp\\eclipse-workspace\\CucumberPractice\\src\\test\\resources\\FailedSnap\\failed.jpeg");
			
			
			
		}*/
		
	
	
}

