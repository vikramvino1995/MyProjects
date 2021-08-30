//Parent

package org.constructor;

public class ParentConstructor {

	public ParentConstructor() {
		System.out.println("This is Parent Default Constructor.");
	}
	
	public ParentConstructor(String a, String b) {
		System.out.println("Name1: "+a);
		System.out.println("Name2: "+b);
	}
	
	public ParentConstructor(float a, long b) {
		
		System.out.println("Salary1: "+a);
		System.out.println("PhoneNo1: "+b);
		
	}
	
	
}
