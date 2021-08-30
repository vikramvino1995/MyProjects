package org.collectionsTable;

import java.util.*;

public class TwoDimensionWithoutHeader {
	
	public static void main(String[] args) {
				
	List<ArrayList<String>> l1 = new LinkedList<ArrayList<String>>();
	
	
	//Adding values in Inner List
	
	ArrayList<String> e1 = new ArrayList<>();
	
	e1.add("vikram");
	
	e1.add("1136");
	
	e1.add("Tiruvannamalai");
	
	
	ArrayList<String> e2 = new ArrayList<>();
	
	e2.add("Vinodhini");
	
	e2.add("1148");
	
	e2.add("Chennai");
	
	ArrayList<String> e3 = new ArrayList<>();
	
	e3.add("Tom");
	
	e3.add("1150");
	
	e3.add("Madurai");
	
	ArrayList<String> e4 = new ArrayList<>();
	
	e4.add("Jerry");
	
	e4.add("1160");
	
	e4.add("Coimbatore");
	
	
	// Adding values in  Outer List
	
	l1.add(e1);
	
	l1.add(e2);
	
	l1.add(e3);
	
	l1.add(e4);
	
	
	ArrayList<String> arrayList = l1.get(3);
	
	String string = arrayList.get(1);
	
	System.out.println(string);
	
	
	ArrayList<String> arrayList2 = l1.get(1);
	
	String string2 = arrayList2.get(0);
	
	System.out.println(string2);
	
	
	
	}
	
}
