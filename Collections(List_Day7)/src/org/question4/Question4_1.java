/*Description : Create a new ArrayListlist with values and find the length of it.
              Input : List = 10,20,30,90,10,10,40,50  */

package org.question4;

import java.util.ArrayList;
import java.util.List;

public class Question4_1 {
	  public static void main(String[] args) {
		
		  List l1 = new ArrayList();
		  
		  l1.add(10);
		  l1.add(20);
		  l1.add(30);
		  l1.add(90);
		  l1.add(10);
		  l1.add(10);
		  l1.add(40);
		  l1.add(50);
		  
		  System.out.println(l1);
		  
		  int length = l1.size();
		  System.out.println("Length: "+length);
	}
}
