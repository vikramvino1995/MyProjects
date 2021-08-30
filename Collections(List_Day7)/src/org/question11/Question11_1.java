/*   Description : Create a new ArrayListlists with values and perform removeAll() function
              Input : List = 10,20,30,90,10,10,40,50
              Input : List = 30,40,50,60,80
 */



package org.question11;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Question11_1 {
	
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
		
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		l2.add(80);
		l2.add(10);
		
		System.out.println(l1);
		System.out.println(l2);
		l1.removeAll(l2);              //Removed Common Elements in L1 and L2.
		System.out.println(l1);   
		
	}

}
