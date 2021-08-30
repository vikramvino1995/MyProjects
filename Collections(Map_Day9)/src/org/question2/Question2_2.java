/*  Description : Create a LinkedHashMap with the below key and values and get(print) the key only in the map.
              key    : 10,20,30,40,50,60,10,50,40
              Values : 10,20,30,40,50,60,10,50,40
           */


package org.question2;
import java.util.*;

public class Question2_2 {
		
	public static void main(String[] args) {
		
		 Map<Integer,Integer> m =new LinkedHashMap();
		 
		 m.put(10,10);
		 m.put(20,20);
		 m.put(30,30);
		 m.put(40,40);
		 m.put(50,50);
		 m.put(60,60);
		 m.put(10,10);
		 m.put(50,50);
		 m.put(40,40);
		 
		 System.out.println("LinkedHashMap: "+m);
		 
		 Set<Integer> onlyKeys = m.keySet();
		 
		 System.out.println("\nKeys in Map: "+onlyKeys);
		 
	}
}
