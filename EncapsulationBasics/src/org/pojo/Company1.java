// User Defined List

package org.pojo;

import java.util.*;

public class Company1 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<Employee>();

		// Assign the Value
		Employee e  = new Employee();
		e.setId(1136);
		e.setName("Vikram");
		e.setMobileNo(8148104697l);

		Employee e1 = new Employee();
		e1.setId(1135);
		e1.setName("Vino");
		e1.setMobileNo(9385620896l);
		
		//Insert the values into List.
		l.add(e);
		l.add(e1);
		
		System.out.println(l);
		
		//Retrieve the Value
		 Employee emp=l.get(0);                    
		int id = emp.getId();
		String name = emp.getName();
		long mobileNo = emp.getMobileNo();
		System.out.println(emp);
		System.out.println("Printing Index 0 Without For Loop.");
		e1.display();
		//Normal For Loop
		System.out.println("\nNormal For Loop: ");
		
		for(int i =0;i<l.size();i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getMobileNo());
		}
		//Enhanced for loop
		System.out.println("\nEnhanced For Loop");
		
		for(Employee i : l) {
			System.out.println(i.getId());
			System.out.println(i.getName());
			System.out.println(i.getMobileNo());
		}
		
		
	}
	

}
