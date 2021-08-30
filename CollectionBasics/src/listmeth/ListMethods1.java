package listmeth;

import java.util.List;
import java.util.Vector;

public class ListMethods1 {
	public static void main(String[] args) {

		// Upcasting

		List<Integer> l = new Vector();
		l.add(1); // add() method - adds value to List.
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(1);   //List Allows Duplicates. 
		System.out.println("1.) List= "+l);

		int size = l.size(); 
		// size() method - Size of List
		System.out.println("\n2.) Size of List: " + size);
		
		int indexOf = l.indexOf(1);
		//indexOf() method - Fetches First Occurence Index of particular element in List.   
		System.out.println("\n3.) First Occurence index of 1: "+indexOf);
		
		int lastIndexOf = l.lastIndexOf(1);
		//LastindexOf() method - Fetches last Occurence Index of particular element in List
		System.out.println("\n4.) Last Occurence index of 1: "+lastIndexOf);
		
		boolean empty = l.isEmpty(); 
		//isEmpty() method - Checks Whether List is empty.
		System.out.println("\n5.) Whether List is empty???: "+empty);
		
		boolean contains = l.contains(4); 
		//contains() method- checks whether particular element is present or not.
		System.out.println("\n6.) Whether List contains 4???: "+contains);
		
		Integer integer = l.get(5);
		//get() method - fetches element from particular index in List.
		System.out.println("\n7.) Element in Index 5 of list: "+integer);
		
		l.add(7,0); 
		//add(index,element) - to insert new element in particular index. 
		System.out.println("\n8.) New element 0 added in index 7: "+l);
		
		l.set(7,2);
		//set(index,element) - to replace a element in particular index.
		System.out.println("\n9.) Element 0 in list replaced as 2: "+l);
		
		l.remove(8);
		//remove(index) - to removed particular element in list.
		System.out.println("\n10.) Element 1 in index 8 is removed: "+l);
		
		l.clear();
		//clear() - to remove all the elements in the list.
		System.out.println("\n11.) List Cleared:"+l);
		
		
		
		
	}	
}
