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

public class Hooks extends BaseClass{
	
	@Before
	public void openBrowser() {
		
		launchBrowser();
		
		loadUrl("https://testleaf.com/");
		
		maximize();
		
	}
	
	//screenshot after every scenario
	
	/*@After(order=3)
	public void takeSnap(Scenario scenario) throws IOException{
	
		String step = scenario.getName();
		
		TakesScreenshot  tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File permanent = new File("C:\\Users\\hp\\eclipse-workspace\\CucumberScreenshot\\src\\test\\resources\\Screenshot\\"+ step +".jpeg");
		
		FileUtils.copyFile(temp,permanent);
		
	}*/

	
	@After(order=4)
	public void takeSnap2(Scenario scenario){
		
		if(scenario.isFailed()){
			
			TakesScreenshot  tk = (TakesScreenshot)driver;
			
			byte[] failed = tk.getScreenshotAs(OutputType.BYTES);
			
			scenario.embed(failed,scenario.getName()+"/png");
			
		}
		
	}
	
	@After(order=2)
	public void close() {
		
		closeBrowser();
		
	}
	
}
