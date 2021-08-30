package org.emp;

public class Company extends Employee{

// Using Extends.
	
	public static void main(String[] args) {
		Company c =new Company();
		System.out.println(c.i);
		c.empDetails(200);
		System.out.println(c.i);
		System.out.println(Employee.s);
		
		Company c2 =new Company();
		System.out.println(c2.i);
	}
}
