package org.client;

import org.emp.Employee;

public class Client {

// Without Extends.
	
	public static void main(String[] args) {
		Employee e1 =new Employee();
		System.out.println(e1.i);  //Before Method Call
		e1.empDetails(300);        //Method Call
		System.out.println(e1.i);  //After Method Call
		System.out.println(Employee.s);
		
		
	}
	
}
