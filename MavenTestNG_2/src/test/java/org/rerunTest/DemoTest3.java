package org.rerunTest;

import org.testng.Assert;
import org.testng.annotations.Test;

// When  we don't know what test is failing.
// go to Tansformer class  in org.failed package.

public class DemoTest3 {
	

	@Test
	 public void test1() {
		
		System.out.println("Test1");
		Assert.assertTrue(false);
		System.out.println("test1 Completed.");
			
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test2");
		
		Assert.assertTrue(true);
		
		System.out.println("test2 completed.");
		
	}
	
	
	@Test
	public void test3() {
		
		System.out.println("Test3");
		
		Assert.assertTrue(false);
		
		System.out.println("test3 completed.");
		
		
		
	}
	
	@Test
	public void test4() {
		
		System.out.println("Test4");
		
		Assert.assertTrue(true);
		
		System.out.println("test4 completed.");
		
		
		
	}
	
	@Test
	public void test5() {
		
		System.out.println("Test5");
		
		Assert.assertTrue(true);
		
		System.out.println("test5 completed.");
		
		
		
	}
	
	
	
}
