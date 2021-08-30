/*  Description : Create a new vector with values and find the length of it
              Input : List = 105,205,305,405,505,605,705,805    */

package org.question4;

import java.util.List;
import java.util.Vector;

public class Question4_3 {
		public static void main(String[] args) {
			
			List<Integer> l1 = new Vector();
			
			l1.add(105);
			l1.add(205);
			l1.add(305);
			l1.add(405);
			l1.add(505);
			l1.add(605);
			l1.add(705);
			l1.add(805);
			
			System.out.println(l1);
			
			int length = l1.size();
			System.out.println("Length is: "+length);
			
			
		}
}
