/*URL : http://toolsqa.com/

NOTE: ScrollDown till "Selenium Training Benefit" and print the word "Selenium Training Benefit"*/

package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement scrollDown = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollDown);
		
		String text1 = scrollDown.getText();
		
		System.out.println(text1);
		
		
		
		
		
		
		
}
}
