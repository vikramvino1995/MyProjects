package org.training;

import java.util.*;

public class Practice_Array5 {
	
	public static void main(String[] args) {
		
		String str[]= new String[] {"Apple","Mango","Apple","Banana","Banana"};
		
		Set<String> s = new HashSet<>();
		
		for(String x : str) {
			
			if(s.add(x)) {
				
				System.out.println(x);
			}
			
		}
		
		
		Set<String> s1 = new TreeSet<>();
		
		s1.addAll(s);
		
		System.out.println(s1);
		
		
		
	}
}
