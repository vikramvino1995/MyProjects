package org.failed;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseClass implements  ITestListener{

public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		String s ="C:\\Users\\hp\\eclipse-workspace\\MavenTestNG_2\\screenshot\\";
		
		File permanent =new File(s + result.getName()+".png");
		
		try {
			
			FileUtils.copyFile(temp,permanent);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
				
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
				
	}

	public void onFinish(ITestContext context) {
				
	}
	


}
