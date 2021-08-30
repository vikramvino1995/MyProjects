/* Description : Get the value present at 2nd index
              Input:   List = 10,20,30,40,50,60  */

package org.question6;

import java.util.ArrayList;
import java.util.List;

public class Question6_1 {
		public static void main(String[] args) {
			
			List<Integer> l =new ArrayList();
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(40);
			l.add(50);
			l.add(60);
			
			System.out.println(l);
			
			Integer index2 = l.get(2);
			System.out.println("Value at second Index: "+index2);
			
		}
}
