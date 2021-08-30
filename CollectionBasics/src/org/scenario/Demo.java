package org.scenario;
import java.util.*;
public class Demo {
		public static void main(String[] args) {
			List<Integer> l1 = new ArrayList();
			l1.add(100);
			l1.add(200);
			l1.add(300);
			l1.add(400);
			l1.add(500);
			l1.add(100);
			l1.add(200);
			
			System.out.println("List: "+l1);

//Remove all duplicate elements from List.
			Set<Integer> s1 =new LinkedHashSet();
			s1.addAll(l1);
			System.out.println("\nRemoved Duplicate Elements: "+s1);

			
// Print Non-Duplicate elements one by one.
		     System.out.println("\nThese are the Non-Duplicate Elements: ");
			for(Integer n:s1) {
				System.out.println(n);
			}
			
//Find the Count of Duplicate Elements.
			
			int listSize = l1.size();
			int setSize = s1.size();
			
			int duplicateCount = listSize - setSize;
			System.out.println("\nDuplicate Count: "+duplicateCount);
			
		}
}
