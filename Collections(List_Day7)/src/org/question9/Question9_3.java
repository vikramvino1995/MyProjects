/*  Description : Replace the 10 into 100 in List and get index of each 100.
        Input:   List = 10,20,30,90,10,10,40,50,30
        Output:  List = 100,20,30,90,100,100,40,50,30  
                                                        */

package org.question9;

import java.util.List;
import java.util.Vector;

public class Question9_3 {
			public static void main(String[] args) {
				List<Integer> l =new Vector();
				l.add(10);
				l.add(20);
				l.add(30);
				l.add(90);
				l.add(10);
				l.add(10);
				l.add(40);
				l.add(50);
				l.add(30);
				
				System.out.println(l);
				
				l.set(0,100);             //Replace
				l.set(4,100);
				l.set(5,100);
			
				System.out.println(l);      //getting the index of all 100.
				
				for(int i=0;i<l.size();i++) {
					 Integer hundred = l.get(i);
					 
					 if(hundred ==100) {
						 System.out.println(i);
					 }
				}
				
				
			}
}
