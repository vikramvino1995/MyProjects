package org.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SampleTest {
	
	@BeforeClass
	public  void beforeClass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	private  void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test(priority=-5)
	private  void test5() {
		
		System.out.println("test5");
		
	}
	
	@Test(priority=-10)
	private void test2() {
		
		System.out.println("test2");
		
	}
	
	@Test
	private void test1() {
		
		System.out.println("test1");
		
	}
	@Parameters({"age","Name"})
	@Test(priority=3)
	private  void test3(String s1,String s2) {
		System.out.println("My Age: "+s1);
		System.out.println("My Name: "+s2);
		System.out.println("test3");
	}
	
	
	@Test(priority=4)
	private  void test4(){
		System.out.println("test4");

	}
	
	@AfterMethod
	private  void afterMethod(){
		System.out.println("After Method.");
		
	}
	
	@AfterClass
	public void afterClass(){
		
		System.out.println("After Class.");
		
	}
	
	//-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8
	
	
}
