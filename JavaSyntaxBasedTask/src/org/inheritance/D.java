package org.inheritance;

public class D extends C{
	
	public void name3() {
		
		System.out.println("Vikram3");
	}
	
	public static void main(String[] args) {
		
		D obj =new D();
		
		obj.name();
		
		obj.name2();
		
		obj.name3();
		
	}
}
