/*  Description : Get the each value of set by using enhanced  for loop
              Input:   List = 105,205,305,405,505,605,705,805      */


package org.question3;

import java.util.Set;
import java.util.*;

public class Question3_1 {
		
	public static void main(String[] args) {
		
		Set<Integer> s =new TreeSet();
		s.add(505);
		s.add(605);
		s.add(705);
		s.add(805);
		s.add(105);
		s.add(205);
		s.add(305);
		s.add(405);
	
		
		System.out.println(s);          
		
		for(Integer i : s) {
			System.out.println(i);
		}
		
	}
}