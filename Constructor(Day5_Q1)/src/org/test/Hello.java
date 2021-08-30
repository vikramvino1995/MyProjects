package org.test;

public class Hello extends Demo{
	
	@Override
	public void Demo() {
		System.out.println("This is edited method");
	
	}
	
	public static void main(String[] args) {
		
		Hello h = new Hello();
		
		h.Demo();
	
	}
	
	
}
