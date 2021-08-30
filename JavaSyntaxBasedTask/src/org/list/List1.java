package org.list;

import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
	
	List<Integer> li = new LinkedList<Integer>();
	
	li.add(1);
	li.add(2);
	li.add(3);
	
	System.out.println(li);
	
	for(int i=0;i<li.size();i++) {
		
		System.out.println(li.get(i));
		
		
	}
	
	
}

}