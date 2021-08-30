package org.stepDefinition;

import org.base.Utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utility{
	
@Before
public void Browser() {
	
	launchBrowser();
	
	maximize();
	
	loadUrl("https://www.facebook.com/");
	
	driver.manage().deleteAllCookies();
	
}

/*@After
public void closeBrowser() {
	
	driver.quit();
	
}*/
	
	
}
