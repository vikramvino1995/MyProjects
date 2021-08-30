package org.training;

public  class Practice 
{
	
	public Practice() {
		System.out.println("Default Parent Constructor");
	}
	
	public Practice(int a,float b) {
		this(100.00f,234);
		System.out.println(a);
		System.out.println(b);
	}
		
	public Practice(float a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
	}
		
	
	