package org.emp;

import org.client.Client;

//same package
public class Employee extends Company {
	private void empId() {
		System.out.println("This is Employee ID.");
	}

public static void main(String[] args) {
	Employee e = new Employee();
	e.empId();
	e.companyId();//private method cannot be extended. 
	e.clientId(); //private method cannot be extended.

	Company c = new Company();
	c.companyId(); //private method can't be accessed.
		
	Client cl = new Client();//Object cannot be Created.
	cl.clientId(); //private method can't be accessed.
		

	}
}

/*
Access Specifier- private
   -private method can be accessed only within the same class.
   -Cannot be accessed within Same Package as well as
     Different Package.
*/
