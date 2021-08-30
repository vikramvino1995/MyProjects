package org.set;

import java.util.Set;
import java.util.LinkedHashSet;

public class Set1 {
		
	public static void main(String[] args) {
		
		Set<String> s =new LinkedHashSet<String>();
		
		s.add("vikram");
		s.add("vino");
		s.add("1136");
		s.add(null);
		s.add(null); //only one null ., No Duplication.
		
		System.out.println(s);
		
	}
	
}
