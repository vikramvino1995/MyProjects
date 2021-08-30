package listmeth;

import java.util.ArrayList;
import java.util.List;

public class ListMethods2 {
		public static void main(String[] args) {
			
			//Create 2 List : l1 & l2.
			List<Integer> l1 = new ArrayList();  
			List<Integer> l2 = new ArrayList();
			
			//Adding elements in l1
			l1.add(1);
			l1.add(2);
			l1.add(3);
			l1.add(4);
			l1.add(5);
			l1.add(6);
			l1.add(7);
			System.out.println("List1: "+l1);
			
			//Adding elements in l2
			l2.add(1);
			l2.add(2);
			l2.add(3);
			l2.add(4);
			l2.add(5);
			l2.add(9);
			l2.add(10);
			System.out.println("\nList2: "+l2);
			
			l1.retainAll(l2);
			//retainAll method() - Compares 2 List and fetches common elements in two list.
			System.out.println("\n1.) Common Elements in l1 and l2: "+l1);
			
			List<Integer> l3 =new ArrayList();   //List l3
			l3.add(10);
			l3.add(20);
			l3.add(30);
			l3.add(40);
			l3.add(50);
			l3.add(200);
			l3.add(300);
			System.out.println("\nList3: "+l3);

			List<Integer> l4 =new ArrayList();   //List l4
			l4.add(60);
			l4.add(70);
			l4.add(80);
			l4.add(90);
			l4.add(100);
			l4.add(200);
			l4.add(300);
			System.out.println("\nList4: "+l4);
			
			
			l3.removeAll(l4);
			//removeAll() method - Compares 2 list and removes common elements in required list.
			System.out.println("\n2.) Removed Common Elements from L3: "+l3);  //200,300 removed
			l3.add(200);
			l3.add(300);
			l4.removeAll(l3);
			System.out.println("\n    Removed Common Elements from L4: "+l4); 
			
			
			l3.addAll(l4);
			//addAll method() - Adds all the elements of one list into another list.
			System.out.println("\n3.) List 4 Elements added in List 3: "+l3);
			
			l4.addAll(l3);
			System.out.println("\n   List 3 Elements in List 4: "+l4);
		}

		
}
