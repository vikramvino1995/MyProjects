/* Description : Remove the value present at 10th index 
              Input:   List = 10,20,30,90,10,10,40  */


package org.question7;

import java.util.List;
import java.util.Vector;

public class Question7_2 {
	public static void main(String[] args) {
		List<Integer> l = new  Vector();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		
		l.remove(5);
		System.out.println("Removed element at 5: "+l);
		
	}
			
	
}
