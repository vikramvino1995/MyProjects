/* Description : Add a value 50 in the 2nd index and display the list after adding.
              Input : List = 10,20,30,90,10,10,40,50        */



package org.question8;

import java.util.LinkedList;
import java.util.List;

public class Question8_1 {

	 public static void main(String[] args) {
		
		 List<Integer> l = new LinkedList();
		 
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(90);
		 l.add(10);
		 l.add(10);
		 l.add(40);
		 l.add(50);
		 
		 System.out.println(l);
		 l.add(2, 50);
		 System.out.println(l);
		 int indexOf1 = l.indexOf(30);
		 System.out.println(indexOf1);
		
		 
	}
}
