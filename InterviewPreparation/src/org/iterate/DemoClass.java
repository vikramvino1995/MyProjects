package org.iterate;

import java.util.*;

//Enumeration - Only for legacy classes - Vector , Hashtable etc;

public class DemoClass {
	
public static void main(String[] args) {
	
	
	Vector<Integer> v = new Vector();
	
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add(5);
	
	Enumeration<Integer> elements = v.elements();
	
	while(elements.hasMoreElements()) {
		
		System.out.println(elements.nextElement());
		
	}
	
	
}	
	
}
