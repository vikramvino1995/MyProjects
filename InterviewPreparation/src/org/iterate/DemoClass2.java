package org.iterate;

import java.util.*;

public class DemoClass2 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs =new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		Iterator<Integer> iterator = hs.iterator();
		
		/*while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}*/
 		
		
		
		System.out.println(hs);
		while(iterator.hasNext()) {
			
			if(iterator.next()==5) {
				iterator.remove();
				
		}
			
		}
		
		for(Integer x : hs) {
			
			System.out.println(x);
		}
		
		
	}
}
