package org.pageobjectmodel;

public class SampleTestClass extends BaseClass{
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		goToWebsite("https://www.amazon.com/ref=nav_logo");
		
		maximize();
		
		HomePage h =new HomePage();
		
		enterText(h.getTxtsearch(),"Vikram");
		
		leftClick(h.getButton());
		
	}
}







