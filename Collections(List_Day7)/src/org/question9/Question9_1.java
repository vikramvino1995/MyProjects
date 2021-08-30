/* Description : Replace the value 300 into 350 in the list
              Input : List = 100,200,300,400,500,600,700.       */


package org.question9;

import java.util.LinkedList;
import java.util.List;

public class Question9_1 {
		
	public static void main(String[] args) {
		
			List<Integer> l =new LinkedList();
			
			l.add(100);
			l.add(200);
			l.add(300);
			l.add(400);
			l.add(500);
			l.add(600);
			l.add(700);
			
			System.out.println(l);
			
			l.set(2,350);   //Replace index no.2
			System.out.println(l);
			
			
			
			
	}
}
