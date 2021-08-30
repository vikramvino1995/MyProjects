package org.emp;
//With Final


public final class Company extends Employee{ 
	@Override
	public void empId(){  //Method Overrided.
	System.out.println("Before: "+a);
	final int a = 120;   
	a=300; 
	
	System.out.println("After: "+a);
}
	
}