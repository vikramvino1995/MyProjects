package org.screenshot;

import org.base.BaseClass;
import org.base.BaseData;
import org.failed.TestListener;
import org.pom.Facebook;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

@Listeners(TestListener.class)
public class DemoTestScreenshot extends BaseClass{

	
	@Test(dataProvider="datas",dataProviderClass=BaseData.class)
	public void test1(String s1,String s2) {
		
		launchBrowser();
		
		maximize();
		
		loadUrl("https://www.facebook.com/");
		
		Facebook fb =new Facebook();
		
		fb.getEmail().clear();
		
		fb.getPswd().clear();
		
		enterText(fb.getEmail(),s1);
		
		enterText(fb.getPswd(),s2);
		
		Assert.assertTrue(false);
		
	}
	
	
	@Test
	public void test2() {
		
		launchBrowser();
		
		maximize();
		
		loadUrl("https://www.facebook.com/");
		
		Facebook fb =new Facebook();
		
		fb.getEmail().clear();
		
		fb.getPswd().clear();
		
		enterText(fb.getEmail(),"viiiiiiiiiiiii");
		
		enterText(fb.getPswd(),"oooooooooooooo");
		
		Assert.assertTrue(false);
		
	}
	

}
