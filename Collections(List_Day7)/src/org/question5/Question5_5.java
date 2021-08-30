/* Get the each index value of 10 present in below list 
              Input:   List = 10,20,30,90,10,10,40,50,10   */

/*  Iterate the list
Get the value and store in a variable
And check the value==10
If so print i */

package org.question5;

import java.util.ArrayList;
import java.util.List;

public class Question5_5 {
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
		l1.add(10);
		
		System.out.println(l1);
		
		for(int i=0;i<l1.size();i++) {
			   Integer l = l1.get(i);			   
			   if(l==10)
			   {
				   System.out.println(i);
			   }
			   
			   
		}
		
	}
}
