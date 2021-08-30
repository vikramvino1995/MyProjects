/*  Description : Create a Hashtable with the below key and values and get(print) the key only in the map.
              Key    : vel,Ganesh,Dinesh,Vengat,subash
              Values : Selenium,framework,oracle,corejava,jira        */

package org.question2;
import java.util.*;

public class Question2_4 {
	
	public static void main(String[] args) {
		
		 Map<String,String> m =new Hashtable();
		 
		 m.put("Vikram", "Selenium");
		 m.put("vino", "Framework");
		 m.put("Dinesh", "Oracle");
		 m.put("Vengat","CoreJava");
		 m.put("Subash","Jira");
		 
		 System.out.println("Hashtable: "+m);
		 
		 Set<String> onlyKeys = m.keySet();
		 System.out.println("\nKeys in Map: "+onlyKeys);
		 
	}
}
