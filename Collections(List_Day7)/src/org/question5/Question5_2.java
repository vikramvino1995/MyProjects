/* Description : Get the last index value of 10 
Input:   List = 10,20,30,90,10,10,40,50   */


package org.question5;

import java.util.ArrayList;
import java.util.List;

public class Question5_2 {
	public static void main(String[] args) {
		 
		   List l1 =new ArrayList();
		   l1.add(10);
		   l1.add(20);
		   l1.add(30);
		   l1.add(90);
		   l1.add(10);
		   l1.add(10);
		   l1.add(40);
		   l1.add(50);
		   
		    System.out.println(l1);
		    
		    int lastIndexOf = l1.lastIndexOf(10);
		    System.out.println("Last Occurence Index of 10: "+lastIndexOf);
		   
		   
	}
}
