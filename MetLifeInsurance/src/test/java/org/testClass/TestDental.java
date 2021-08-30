package org.testClass;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.base.UtilityClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pageobjects.DentalAndVisionPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestDental extends UtilityClass {

/*	@BeforeClass
	public void browserLaunch() {

		launchBrowser();

		loadUrl("https://www.metlife.com/");

		maximize();

		Assert.assertTrue(getUrl().contains("metlife"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/

	@BeforeMethod
	public void startTime() {

		Date date = new Date();

		System.out.println("Test Started @ :" + date);

	}
	
	@Parameters({"browserName"})
	@Test
	public void testVisionInsurance(String browser) {
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
		}
		
		loadUrl("https://www.metlife.com/");
		
		maximize();

		Assert.assertTrue(getUrl().contains("metlife"));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		DentalAndVisionPage dental = new DentalAndVisionPage();
		
		dental.selectVisionInsuranceCustomerService();
		
		System.out.println(getTitle());
		
	}

	@AfterMethod
	public void endTime() {

		Date date = new Date();

		System.out.println("Test Ended @ :" + date);

	}
	
	

}
