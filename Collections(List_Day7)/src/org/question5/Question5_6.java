/* Description : Get the each index value of 70 present in below list 
              Input:   List = 70,20,30,90,70,70,40,50,70        */

package org.question5;

import java.util.ArrayList;
import java.util.List;

public class Question5_6 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList();

		l1.add(70);
		l1.add(20);
		l1.add(30);
		l1.add(90);
		l1.add(70);
		l1.add(70);
		l1.add(40);
		l1.add(50);
		l1.add(70);

		System.out.println(l1);
		
		for(int i=0;i<l1.size();i++) {
			Integer l = l1.get(i);
			
			if(l==70) {
				System.out.println(i);
			}
		}
	}
}
