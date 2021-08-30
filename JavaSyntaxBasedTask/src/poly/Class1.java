package poly;

public class Class1 {
	
	public void method1(String s) {
		System.out.println(s);
	}
	
	public void method1(int s) {
		System.out.println(s);
	}
	
	private void method1(float a,String b) {
		System.out.println(a+" "+b);
	}
	
	private void method1(String b,float a) {
		System.out.println(b+ " "+a);
	}
	
	
	public static void main(String[] args) {
		
		
		Class1 c =new Class1();
		
		c.method1("Vikram");
		c.method1(1136);
		c.method1(23.54f,"Vino");
		c.method1("Vikram",45.56f);
		
		
		
	}
}
