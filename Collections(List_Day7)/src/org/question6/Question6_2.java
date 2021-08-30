/* Description : Get the value present at 4th index
              Input:   List = 100,200,300,400,500,600,700    */
                                                          

package org.question6;

import java.util.ArrayList;
import java.util.List;

public class Question6_2 {
		public static void main(String[] args) {
			List<Integer> l =new ArrayList();
			
			l.add(100);
			l.add(200);
			l.add(300);
			l.add(400);
			l.add(500);
			l.add(600);
			l.add(700);
			
			System.out.println(l);
			
			Integer index4 = l.get(4);
			System.out.println("Value at Index 4: "+index4);
			
		}
}
