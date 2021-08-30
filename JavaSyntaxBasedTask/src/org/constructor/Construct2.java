package org.constructor;

public class Construct2 {
	
	public Construct2() {
		this("Vikram");
		System.out.println("default Constructor.");
	}
	
	public Construct2(String s) {
		this("Vino",1000);
		System.out.println(s);
	}
	
	public Construct2(String s1,int i) {
		
		System.out.println(s1);
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		
		Construct2 c =new Construct2();
		
	}
	
}
