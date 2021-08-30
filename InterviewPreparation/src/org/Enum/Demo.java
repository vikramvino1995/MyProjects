package org.Enum;

public class Demo {
	
	public enum Week{
		MON,TUE,WED,THUR,FRI,SAT,SUN
	}
	
	public static void main(String[] args) {
		Week[] values = Week.values();
		
		for(Week w : values) {
			
			System.out.println(w);
		}
	}
}
