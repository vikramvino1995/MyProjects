package org.training;

public class Practice2 extends Practice{
	
	public Practice2() {
		super(22,32.88f);
		System.out.println("Default Child Constructor");
	}
	
	public Practice2(long a,long b) {
		this(123455,456323,7453432);
		System.out.println(a);
		System.out.println(b);
	}
	
	public Practice2(long b,long a,long c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Practice2  p =new Practice2();                       
		Practice2  p1 = new Practice2(2345567,7827232);                        
		
	}
}
