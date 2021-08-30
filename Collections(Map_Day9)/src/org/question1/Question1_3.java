/* Description : Create a TreeMap with the below key and values
              key    : !,@,#,$,%,^,&,*,(,
              Values : 10,20,30,40,50,60,10,50,40
                                                              */

package org.question1;
import java.util.*;

public class Question1_3 {
				
	public static void main(String[] args) {
		
		Map<Character,Integer> m =new TreeMap();
		
		m.put('!', 10);
		m.put('@', 20);
		m.put('#', 30);
		m.put('$', 40);
		m.put('%', 50);
		m.put('^', 60);
		m.put('&', 10);
		m.put('*', 50);
		m.put('(', 40);
		
		//Ascending Order of Characters based on ASCII Value.
		System.out.println("Tree Map: "+m);
		
		
	}
}
