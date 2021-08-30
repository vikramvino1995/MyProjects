/* Description : Remove the value present at 2nd index
              Input:   List = 10,20,30,40,50,60               */


package org.question7;

import java.util.LinkedList;
import java.util.List;

public class Question7_1 {
			public static void main(String[] args) {
				List<Integer> l =new LinkedList();
				
				l.add(10);
				l.add(20);
				l.add(30);
				l.add(40);
				l.add(50);
				l.add(60);
				
				System.out.println(l);
				
				l.remove(2);
				System.out.println("Removed value at Index 2: "+l);
				
				
				
			}
}
