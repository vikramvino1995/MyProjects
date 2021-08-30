/*  Description : Get the each value of list by using normal for loop
              Input:   List = 105,205,305,405,505,605,705,805       */


package org.question6;
import java.util.ArrayList;
import java.util.List;

public class Question6_4 {
		public static void main(String[] args) {
			List<Integer> l =new ArrayList();
			 
			l.add(105);
			l.add(205);
			l.add(305);
			l.add(405);
			l.add(505);
			l.add(605);
			l.add(705);
			l.add(805);
			 
			System.out.println(l);
			
			 for(int i=0;i<l.size();i++) {
				 System.out.println(l.get(i));
			 }
			
			
			
		}

	
		
}
