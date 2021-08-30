package org.test;

import org.baseClass.UtilityClass;
import org.pom.GmailLogin;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestQuestion14 extends UtilityClass{
	
	@BeforeClass
	public void browser() {
		
		launchBrowser();
		maximize();
		loadUrl("https://www.google.com/intl/en-GB/gmail/about/");
		
	}
	
	
	@Test(priority=-1)
	public void signIn() throws InterruptedException {
		
		GmailLogin g =new GmailLogin();
		
		String text = g.getSignIn().getText();
		
		System.out.println(text);
		
		Assert.assertTrue(text.equals("Sign in"));
		
		leftClick(g.getSignIn());
		
		childWindow();
		
		sleep();
		
	}
	
	@Parameters({"username"})
	@Test
	public void mailId(String s) throws InterruptedException {
		
		GmailLogin g =new GmailLogin();
		
		enterText(g.getMailId(),s);
		
		String userText = g.getMailId().getAttribute("value");
		
		Assert.assertEquals(userText,s);
		
		javascriptClick(g.getNextButton());
		
		sleep();
		
	}
	
	@AfterClass
	public void close() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
}
