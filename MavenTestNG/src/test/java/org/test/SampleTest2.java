package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest2 {
	
	@Test
	private  void test6() {
		
		System.out.println("test6");
		Assert.assertTrue(true);
		System.out.println("Test 6 Done.");
		
	}
	
	@Test
	private  void test8() {
		
		System.out.println("test8");
		SoftAssert s = new SoftAssert();
		s.assertEquals(true,false);
		System.out.println("Test 8 Done.");
		
		
	}
	
	@Test
	private  void test7() {
		
		System.out.println("test7");
		SoftAssert s = new SoftAssert();
		s.assertEquals(true,false);
		System.out.println("Test7 Done.");
		s.assertAll();
}
	
	@Test
	private  void test5() {
		
		System.out.println("test5");		
		System.out.println("Test5 Done.");
		Assert.assertEquals(true,false);
		
}
	
	
	
}
