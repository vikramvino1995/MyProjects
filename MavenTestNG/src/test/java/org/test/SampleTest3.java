package org.test;

import org.baseClass.UtilityClass;
import org.pom.FacebookLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SampleTest3 extends UtilityClass{
	
	@BeforeClass
	public void browser() {
		
		launchBrowser();
		
		maximize();
		
		loadUrl("https://www.facebook.com/?_rdr");
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertTrue(currentUrl.contains("facebook"));
		
		System.out.println("Test Starts.");
		
		
	}
	
	@Test
	public void  details() {
		
		FacebookLogin fb =new FacebookLogin();
		
		enterText(fb.getMail(),"Vikram12345");
		
		enterText(fb.getPswd(),"4478798234");
		
		String uId = fb.getMail().getAttribute("value");
		
		Assert.assertEquals(uId, "Vikram12345");
		
		String pswd = fb.getPswd().getAttribute("value");
		
		Assert.assertEquals(pswd,"4478798234");
		
		
	}
	
	
	
	
	
	
}
