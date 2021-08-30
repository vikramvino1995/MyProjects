package org.string;

public class Str {
	
	public static void main(String[] args) {
		
		
		String s = new String("Vikram");
		
		String s1 = new String("Vikram");
		
		
		
		
		
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(s1));
	
		
		String a="bag";
		
		String b= "bag";
		

		
		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(b));
		
		
		String ss = a.concat(" "+"book");
		System.out.println(ss);
		
		
		StringBuffer sb =new StringBuffer("Vikram");
		
	
		
		sb.append("Vino");
		
		System.out.println(sb);
		
		
		StringBuilder sbuil =new StringBuilder("Tom");
		
		
		
		sbuil.append("Cat");
		
		System.out.println(sbuil);
		
		
		
	}
	
	
}



