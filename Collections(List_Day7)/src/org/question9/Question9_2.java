/* Description : Replace the value present in 7th index as 90 
              Input:   List = 10,20,30,90,10,10,40,50,10  */



package org.question9;


import java.util.ArrayList;
import java.util.List;

public class Question9_2 {
		
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
		l.add(10);
		
		System.out.println(l);
		
		l.set(7, 90);
		System.out.println(l);
		
		
	}
}
