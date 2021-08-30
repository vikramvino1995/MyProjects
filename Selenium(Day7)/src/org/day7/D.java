package org.day7;

import java.awt.AWTException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select#");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement demo = driver.findElement(By.id("demo103-multiple-mobile"));
		
		Select s =new Select(demo);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		
		for(int i=0;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			String text = option.getText();
			
			System.out.println(text);
			
		}
		
		for(int i=0;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			s.selectByValue(option.getAttribute("value"));
			//s.selectByValue(option.getText());
			//s.selectByIndex(i);
		}
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		for(WebElement selectedOption : allSelectedOptions) {
			
			String text = selectedOption.getText();
		
			System.out.println("Selected: "+text);
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		System.out.println("FirstSelected: "+text2);
		
	/*	
		for(int i=0;i<options.size();i++) {
			
			s.deselectByIndex(i);
			
		}*/
		
		/*for(int i=0;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			s.deselectByVisibleText(option.getText());
			
		}*/
		
			for(int i=0;i<options.size();i++) {
			
			WebElement option = options.get(i);
			
			s.deselectByValue(option.getAttribute("value"));
		
			}
		
		
		
}
}
