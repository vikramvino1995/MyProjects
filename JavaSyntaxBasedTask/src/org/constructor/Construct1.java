package org.constructor;

public class Construct1 {
	
	public Construct1() {
		
		System.out.println("Hello");
		
	}
	
	public Construct1(String s) {
		
		System.out.println(s);
	}
	
	public Construct1(String s1,int i) {
		System.out.println(s1);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		Construct1 c =new Construct1();
		
		Construct1 c1 = new Construct1("Vikram");
		
		Construct1 c2 = new Construct1("Vino",1000);
		
		
	}
	
}
