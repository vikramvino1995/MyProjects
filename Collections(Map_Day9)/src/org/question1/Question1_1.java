/* Description : Create a HashMap with the below key and values
              key    : 10,20,30,40,50,60,10,50,40
              values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.   */




package org.question1;

import java.util.*;

public class Question1_1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> m =new HashMap();
		
		m.put(10,"java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40,"sql");
		m.put(50, "oracle");
		m.put(60,"DB");
		m.put(10, "Selenium");
		m.put(50,"psql");
		m.put(40,"Hadoop");
		
		System.out.println("Hashed Map: "+m);
		
	}

}
