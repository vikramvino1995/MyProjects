/* Description : Create a new HashSet with values and return the common values
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 30,40,50,60,80  */


package org.question4;

import java.util.*;

public class Question4_1 {
		public static void main(String[] args) {
			Set<Integer> s1 =new HashSet();
			
			s1.add(10);
			s1.add(20);
			s1.add(30);
			s1.add(90);
			s1.add(10);
			s1.add(10);
			s1.add(40);
			s1.add(50);
			
			System.out.println(s1);
			
			Set<Integer> s2 =new HashSet();
			s2.add(30);
			s2.add(40);
			s2.add(50);
			s2.add(60);
			s2.add(80);
			
			System.out.println(s2);
			
			
			s1.retainAll(s2);
			System.out.println(s1);
		}
}
