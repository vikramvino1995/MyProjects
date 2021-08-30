package org.day7;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		
		Demo d =new Demo();
		
		//upcasting
		WebDriver driver  =new  ChromeDriver();
		
		//downcasting 
		
		
		float b =3.5f;
		
		int a =(int) b;
		
		TakesScreenshot tk =(TakesScreenshot)driver;
		
		
		
	}
}
