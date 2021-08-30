package org.test;

import org.baseClass.UtilityClass;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelExecutionDemo2 extends UtilityClass{
	
	
	@BeforeClass
	public void browser() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\eclipse-workspace\\MavenTestNG\\Driver\\geckodriver.exe");
		
		driver =new FirefoxDriver();
		
		maximize();
		
		loadUrl("https://www.youtube.com/?gl=IN");
		
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	
	@Test
	public void test4() {
		
	System.out.println("test4 ID: "+Thread.currentThread().getId());
	Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="test4",alwaysRun=true)
	public void test5() {
		
		System.out.println("test5 ID: "+Thread.currentThread().getId());
		
		
	}
	
	@Test(enabled=false)
	public void test6() {
		
		System.out.println("test6 ID: "+Thread.currentThread().getId());
		
	}
	
}
