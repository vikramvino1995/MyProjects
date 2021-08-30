/* Description : Create a TreeSet for the below values
              Input : List = 20, 30, 10, 50, 40, 80, 60, 70, 90, 10, 20
 */



package org.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Question1_3 {
		

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(50);
		l.add(40);
		l.add(80);
		l.add(60);
		l.add(70);
		l.add(90);
		l.add(10);
		l.add(20);
		
		System.out.println("List: "+l);
		
		Set<Integer> s =new TreeSet();
		
		s.addAll(l);
		System.out.println("Ascending Order: "+s);
}
}