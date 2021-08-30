package org.constructor;

public class Construct3_1 {
	
	public Construct3_1() {
		
		System.out.println("parent Default");
		
	}
	
	public Construct3_1(String s) {
		this(34);
		System.out.println(s);
		
	}
	
	public Construct3_1(int i) {
			this();
			System.out.println(i);
		
		}
	
}
