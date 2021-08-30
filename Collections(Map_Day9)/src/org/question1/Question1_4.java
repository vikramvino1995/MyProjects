/*   Description : Create a HashTable with the below key and values
              Key    : vel,Ganesh,Dinesh,Vengat,subash
              Values : Selenium,framework,oracle,corejava,jira         */


package org.question1;
import java.util.*;

public class Question1_4 {
	public static void main(String[] args) {
		
		  Map<String,String> m =new Hashtable();
		  m.put("Vel", "Selenium");
		  m.put("Ganesh", "framework");
		  m.put("Dinesh","oracle");
		  m.put("Vengat", "Core Java");
		  m.put("subash","jira");
		  
		  System.out.println("Hashtable: "+m);
	}
}
