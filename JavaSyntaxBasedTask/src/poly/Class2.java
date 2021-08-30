package poly;

public class Class2 extends Class1{
	
	public void method1(String s) {
		System.out.println(s);
	}
	
	
	
	public static void main(String[] args) {
		
		
		Class2 o = new Class2();
		
		o.method1("hello");
		
		o.method1(23);
	}
}
