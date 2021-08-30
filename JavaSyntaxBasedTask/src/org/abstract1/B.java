package org.abstract1;

public class B extends A{
	
	@Override
	public void method1() {
		System.out.println("Method1");
	}
	
	
	public static void main(String [] args) {
		
		B obj = new B();
		
		obj.method1();
		obj.method2();
	}
	
	
}
