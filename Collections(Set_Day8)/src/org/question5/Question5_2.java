/*  Description : Create a new LinkedHashSet with values and perform removeAll() function
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 10,20,60,50,40,70,80,90
  */




package org.question5;
import java.util.*;

public class Question5_2 {
		
	public static void main(String[] args) {
		
Set<Integer> s1 =new LinkedHashSet();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(90);
		s1.add(10);
		s1.add(10);
		s1.add(40);
		s1.add(50);
		
		System.out.println(s1);
		
		Set<Integer> s2 =new LinkedHashSet();  
		s2.add(10);
		s2.add(20);
		s2.add(60);
		s2.add(50);
		s2.add(40);
		s2.add(70);
		s2.add(80);
		s2.add(90);
		
		System.out.println(s2);
		
		s1.removeAll(s2);
		System.out.println("\n"+s1);
		
		
	}
}
