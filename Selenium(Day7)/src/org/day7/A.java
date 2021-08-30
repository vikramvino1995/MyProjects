package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		
		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.xpath("(//select[@name='skills'])[1]"));
		
		Select s =new Select(e);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);

		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++){
			
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
	}
}
