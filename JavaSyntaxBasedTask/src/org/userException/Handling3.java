package org.userException;

public class Handling3 {
	
	public static void main(String[] args) {
		
		String a ="1qwe2";
		
		if(a.startsWith("1a")) {
			
			System.out.println("good");
		}
		else {
			
			try {
				throw new UserException();
				
			}
			catch(UserException u) {
				
				System.out.println(u.getMesssage());
				
			}
			
		}
		
		System.out.println("ok");
		
	}
}
