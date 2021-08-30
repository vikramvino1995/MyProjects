package org.test;

import org.baseClass.UtilityClass;
import org.pom.FacebookLogin;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestQuestion1_2 extends UtilityClass{
	
/*	@BeforeClass
	public void browser() {
		launchBrowser();
		maximize();
		loadUrl("https://www.facebook.com/");
	}*/
	@Parameters({"text"})
	@Test(priority=1)
	public void logIn(String s1) {
		FacebookLogin fb =new FacebookLogin();
		
		String text = fb.getLogInButton().getText();
		
		System.out.println(text);
		
		Assert.assertTrue(text.equals(s1));
		
	}
	
	
}
