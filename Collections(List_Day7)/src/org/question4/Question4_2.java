/* Description : Create a new LinkedListlist with values and find the length of it
              Input : List = 100,200,300,400,500,600,700   */





package org.question4;

import java.util.LinkedList;
import java.util.List;

public class Question4_2 {
				
		public static void main(String[] args) {
			
			List <Integer> l1 =new LinkedList();
			l1.add(100);
			l1.add(200);
			l1.add(300);
			l1.add(400);
			l1.add(500);
			l1.add(600);
			l1.add(700);
			
			System.out.println(l1);
			
			int length = l1.size();
			System.out.println("Length of List: "+length);
			
		}
}
