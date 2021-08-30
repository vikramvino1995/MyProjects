package org.test;

import org.baseClass.UtilityClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelExecutionDemo extends UtilityClass {
	
	@BeforeClass
	public void browser() {
		
		launchBrowser();
		
		maximize();
		
		loadUrl("https://www.facebook.com/?_rdr");
		
		System.out.println(Thread.currentThread().getId());
		
		
	}
	
	
	@Test
	public void test1() {
		
	System.out.println("test1 ID: "+Thread.currentThread().getId());

	}
	
	@Test(invocationCount=4)
	public void test2() {
		
		System.out.println("test2 ID: "+Thread.currentThread().getId());
		
		
	}
	
	@Test
	public void test3() {
		
		System.out.println("test3 ID: "+Thread.currentThread().getId());
		
	}
	
	
	
	
	
	
	
	
				
	
}
