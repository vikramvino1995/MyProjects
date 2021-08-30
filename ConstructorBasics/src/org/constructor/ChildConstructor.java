// Example Program for Constructor Chaining - super()



//Child

package org.constructor;

public class ChildConstructor extends ParentConstructor {
	
	private ChildConstructor() {
		this(2,3);
		System.out.println("This is Child Default Constructor.");
	}
	
	private ChildConstructor(int a,int b) {
		super("Vikram","Vino");
		System.out.println("id1: "+a);
		System.out.println("id2: "+b);
		}
	
	private ChildConstructor(float c,long d) {
		super(50000.00f,9385620896l);
		System.out.println("Salary2: "+c);
		System.out.println("Phone No2: "+d);
		}
	
	public static void main(String[] args) {
		ChildConstructor c =new ChildConstructor();   
		
		//ChildConstructor c1 =new ChildConstructor(1136,1148);
		
		ChildConstructor c2 =new ChildConstructor(20000.00f,8148104697l);
		
			    
	}
	
	
}
