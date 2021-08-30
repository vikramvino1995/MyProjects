package org.constructor;

public class Construct3_2 extends Construct3_1{
	
	public Construct3_2() {
		this(8148104697l);
		System.out.println("child default");
		
	}
	
	public Construct3_2(long l){
		this(20.05f);
		System.out.println(l);
	}
	
	public Construct3_2(float f) {
		super("Vikram");
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		
		Construct3_2 c =new Construct3_2();
		
		
	}
	
}
