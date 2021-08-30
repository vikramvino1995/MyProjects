// Example program for Constructor chaining - this().

package org.constructor;

public class ConstructorChain1 {
	  
	public ConstructorChain1() {
			
		this("Vikram");
		System.out.println("Default Constructor.");
	}
	
	public ConstructorChain1(String name) {
		
		this(1136,20000.00f);
		System.out.println("Name :"+name);
		
	}
	
	public ConstructorChain1(int a,float b) {
		System.out.println("id: "+a);
		System.out.println("Salary: "+b);
	}
	public static void main(String[] args) {
		
		ConstructorChain1 c =new ConstructorChain1();
		
		
	}
}
