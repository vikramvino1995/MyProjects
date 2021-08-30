package org.test;

import org.baseClass.UtilityClass;
import org.pom.FacebookLogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestQuestion1_1 extends UtilityClass{
		
	@BeforeClass
	public void browser() {
		launchBrowser();
		maximize();
		loadUrl("https://www.facebook.com/");
		
	}
	@Parameters({"username"})
	@Test(priority=-2)
	private void userName(String s1) {
		FacebookLogin fb =new FacebookLogin();
	
		enterText(fb.getMail(),s1);
		
		String enteredUsername = fb.getMail().getAttribute("value");
	
		Assert.assertTrue(enteredUsername.equals(s1) );
		
		
	}
	
	@Parameters({"password"})
	@Test
	private void pswd(String s1) {
		FacebookLogin fb =new FacebookLogin();
		
		enterText(fb.getPswd(),s1);
		
		String enteredPswd = fb.getPswd().getAttribute("value");
		
		Assert.assertTrue(enteredPswd.equals(s1));
	}

	
}
