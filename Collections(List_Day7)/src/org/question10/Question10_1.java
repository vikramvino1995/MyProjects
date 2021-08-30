/*Description : Create a new ArrayListlists with values and return the common values.
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 30,40,50,60,80
 */




package org.question10;

import java.util.*;

public class Question10_1 {
			public static void main(String[] args) {
				
				List<Integer> l1 =new ArrayList();
				l1.add(10);
				l1.add(20);
				l1.add(30);
				l1.add(90);
				l1.add(10);
				l1.add(10);
				l1.add(40);
				l1.add(50);		
				System.out.println("List L1: "+l1);
				
				List<Integer> l2 =new ArrayList();
				l2.add(30);
				l2.add(40);
				l2.add(50);
				l2.add(60);
				l2.add(80);
				System.out.println("List L2: "+l2);
				
				l1.retainAll(l2);
				System.out.println("Common Values: "+l1);
							
				
			}
}
