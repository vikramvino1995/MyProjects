package practice;

public class Demo2 extends Demo{
	
	
	private void sleep() {
		System.out.println("slept");

	}
	
	
	@Override
	public void eat() {
		
		System.out.println("ok done");
		this.sleep();
		super.eat();
		
	}
	
	public static void main(String[] args) {
		
		
		Demo2 d =new Demo2();
		
		d.eat();
		
	}
}
