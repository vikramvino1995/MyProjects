package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f =new File("C:\\Users\\hp\\eclipse-workspace\\JavaSyntaxBasedTask\\notepad\\note.txt");
		
		Scanner s= new Scanner(f);
		
		while(s.hasNextLine()) {
			
			System.out.println(s.nextLine());
			
		}
		
		
	}
	
	
}
