/* Description : Add a value 70 at the end of the list
              Input : List = 10,20,30,90,10,10,40,5   */

package org.question8;

import java.util.*;

public class Question8_2 {
		public static void main(String[] args) {
			List <Integer> l =new Vector();
			
			l.add(10);
			l.add(20);
			l.add(30);
			l.add(90);
			l.add(10);
			l.add(10);
			l.add(40);
			l.add(5);
			
			System.out.println(l);

			l.add(70);
			
			System.out.println("Element 70 added at the end of List: "+l);
		}
}
