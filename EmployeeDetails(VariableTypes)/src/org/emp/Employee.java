package org.emp;

public class Employee {
	public int i = 12; // Instance Variable

	public static int s = 14; // static Variable

//Instance Method
	
		public void empDetails(int l) { // Local Variable

		System.out.println("Local Variable: " + l);
		
		i= 20;  // Value Changed for Instance Variable
		
		System.out.println("Instance Varible:" + i);  
	}

//Static Method

	public static void main(String[] args) {
		Employee e = new Employee();
		
		// Calling Instance Variable.
		System.out.println("Instance variable: " + e.i);
		
		// Calling method by passing argument for  Local Variable.
		e.empDetails(100);  
		
		// Calling Static Variable.
		System.out.println("Static Variable: " + Employee.s);

	}

}


// Instance and Static Variable can have Access Specifier.

// Local Variable cannot have access specifier.




