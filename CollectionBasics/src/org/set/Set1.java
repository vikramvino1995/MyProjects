package org.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set1 {
	public static void main(String[] args) {
		//upcasting
		
		Set <Integer> s = new LinkedHashSet();
		s.add(0);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		
		System.out.println(s);
		//We cannot use normal forloop for set , Because it is value based.
		for(Integer a:s) {
			System.out.println(a);
		}
		
		
	}
}
