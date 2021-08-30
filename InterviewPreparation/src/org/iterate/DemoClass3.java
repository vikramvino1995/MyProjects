package org.iterate;

import java.util.*;
public class DemoClass3 {
	
	public static void main(String[] args) {
		
		
		// only Lists
		LinkedList<Integer> l =new LinkedList();
		
		l.add(1);
		
		l.add(2);
		
		l.add(3);
		
		l.add(4);
		
		l.add(5);
		
		System.out.println(l);
		
		ListIterator<Integer> li = l.listIterator();
		
		while(li.hasNext()) {  //entry check
			System.out.println(li.next());
		}
		
		while(li.hasPrevious()) { //entry check
			
			if(li.previous()==3) {
				li.remove();
			}
		}
		
		System.out.println("Backwards Run + Removal : ");
		
		for(Integer x: l) {
			System.out.println(x);
		}
		
		
		
	}
}
