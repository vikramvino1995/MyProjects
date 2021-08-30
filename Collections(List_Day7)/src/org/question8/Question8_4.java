/* Description : Add a value 100 at the last index of 10 in the list
              Input : List = 10,20,30,90,10,10,40,50    */



package org.question8;

import java.util.*;

public class Question8_4 {

	public static void main(String[] args) {
		   
		List<Integer> l =new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		l.add(5,100);
		System.out.println(l);
		
		
	}
}
