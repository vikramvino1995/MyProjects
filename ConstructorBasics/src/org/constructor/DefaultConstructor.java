
// Example Program for Non-Argument Based or Default Constructor


package org.constructor;

public class DefaultConstructor {

	private DefaultConstructor() {
		System.out.println("This is Constructor.");
	
	}
	
	private void greetings() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		DefaultConstructor c =new DefaultConstructor();
		c.greetings();
		
	}
}
