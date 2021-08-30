package org.array;

public class DefangIP {
	
	public static void main(String[] args) {
		
		String s = "1.1.1.1";
		
		String replaceAll = s.replaceAll("\\.","\\[\\.\\]");
		
		System.out.println(replaceAll);
}

}