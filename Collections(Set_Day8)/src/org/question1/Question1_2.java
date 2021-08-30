/* Description : Create a LinkedHashSet for the below values
              Input : List = 10,20,30,40,50,60,70,80,90,10,20    */


package org.question1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question1_2 {

	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(10);
		l.add(20);
		
		System.out.println("List: "+l);
		
	    Set<Integer> s =new LinkedHashSet();
	    s.addAll(l);
	    System.out.println("\nOrdered Set: "+s);
	    
	    
}
}
