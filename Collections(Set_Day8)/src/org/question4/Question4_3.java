/*  Description : Create a new TreeSet with values and return the common values
              Input : List = 10,20,30,40,50,60,70,80
              Input : List = 100,200,300,400,500,600,700,8000
 */

package org.question4;

import java.util.*;

public class Question4_3 {
	
	public static void main(String[] args) {
		 
Set<Integer> s1 =new TreeSet();
		
		s1.add(80);
		s1.add(70);
		s1.add(60);
		s1.add(50);
		s1.add(40);
		s1.add(30);
		s1.add(20);
		s1.add(10);
		
		System.out.println(s1);
		
		Set<Integer> s2 =new TreeSet();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		s2.add(400);
		s2.add(500);
		s2.add(600);
		s2.add(700);
		s2.add(8000);
		
		System.out.println(s2);
		
		s1.retainAll(s2);
		System.out.println(s1);
	}

}
