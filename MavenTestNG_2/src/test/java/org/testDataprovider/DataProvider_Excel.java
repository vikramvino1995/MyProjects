package org.testDataprovider;
import org.base.BaseClass;
import org.pom.Facebook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider_Excel extends BaseClass{
	
	@Test(dataProvider="getData",dataProviderClass=BaseClass.class)
	public void test1(String user,String pswd) {
		
		launchBrowser();
		
		maximize();
		
		loadUrl("https://www.facebook.com/");
		
		String c = driver.getCurrentUrl();
		
		Assert.assertTrue(c.contains("facebook"));
		
		Facebook fb =new Facebook();
		
		fb.getEmail().clear();

		fb.getPswd().clear();
		
		enterText(fb.getEmail(),user);
		
		enterText(fb.getPswd(),pswd);
		
		
	}
	
	
}
