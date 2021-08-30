/* Description : Create a new ArrayListlists with values and return the common values
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 100,200,600,500,400,700,800,900      */

package org.question10;

import java.util.*;

public class Question10_2 {
	
	public static void main(String[] args) {
		
		List<Integer> l1 =new Vector();
		List<Integer> l2 =new LinkedList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(10);
		l1.add(10);
		l1.add(40);
		l1.add(50);
		
		l2.add(100);
		l2.add(200);
		l2.add(600);
		l2.add(500);
		l2.add(400);
		l2.add(700);
		l2.add(800);
		l2.add(900);
		
		System.out.println("List L1: "+l1);
		System.out.println("List L2: "+l2);
		
		l1.retainAll(l2);
		System.out.println(l1);
		
		System.out.println(l1);
		
		
	
		
	}
}
