package com.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass {
	
	@Before(order=3)
	public void beforeScenario() {
		
		System.out.println("Before Scenario 1");

	}
	
	@After(order=3)
	public void afterScenario() {
		
		System.out.println("\n"+"--------------------------------------------------------------------------------------------");
	
		System.out.println("After Scenario 1");
		
		System.out.println("\n"+"--------------------------------------------------------------------------------------------");
		
	}
	
	
	@Before("@Regression")
	public void beforeScenario2() {
		
		System.out.println("Before Scenario 2");

	}
	
	@After("@Smoke")
	public void afterScenario2() {
		
		System.out.println("\n"+"--------------------------------------------------------------------------------------------");
	
		System.out.println("After Scenario 2");
		
		System.out.println("\n"+"--------------------------------------------------------------------------------------------");
		
	}
	
}
