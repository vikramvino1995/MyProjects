package org.test;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	@Parameters({"name","age"})
	@Test
	public void test1(String s1,String s2) {
		
		System.out.println("This is Test1");
	
		System.out.println("My Name: "+s1);
		
		System.out.println("My Age: "+s2);
			
		
	}
	

	
}
