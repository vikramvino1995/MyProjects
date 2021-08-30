/*  Description : Create a HashTable with the below key and values and get(print) the key only in the map.
              Key    : vel,Ganesh,Dinesh,Vengat,subash
              Values : Selenium,framework,oracle,corejava,jira           */


package org.question3;
import java.util.*;

public class Question3_4 {
	public static void main(String[] args) {

		Map<String,String> m =new Hashtable();
		 m.put("Vikram", "Selenium");
		 m.put("vino", "Framework");
		 m.put("Dinesh", "Oracle");
		 m.put("Vengat","CoreJava");
		 m.put("Subash","Jira");
		 
		 System.out.println("Hashtable: "+m);
		 
		 Collection<String> onlyValues = m.values();
		 System.out.println("\nValues in  Map: "+onlyValues);
		 
	}
}
