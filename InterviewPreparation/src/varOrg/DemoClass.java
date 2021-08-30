package varOrg;

public class DemoClass {
	
	
	/*private void method(int a) {
	
		System.out.println("method 1"+ 10);

	}
	
	private void method(int a,int b) {
		
		System.out.println("method 2"+100 +200);
		
	}*/
	
	
	private void method(int...x) {
		
		for(int i : x) {
			
			System.out.println(i);
		}
		
		

	}

	
	public static void main(String[] args) {
		
		DemoClass dc = new DemoClass();
		
		dc.method(12,13);
		
		dc.method(14,18,19);
		
	}
}
