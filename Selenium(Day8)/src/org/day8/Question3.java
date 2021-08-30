/*URL : http://demo.automationtesting.in/Alerts.html

NOTE: Click Alert with textBox button and Click button to demonstrate an prompt box Perform prompt alert.
*/


package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day8)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement promptAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		promptAlert.click();
		
		WebElement displayAlert = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		
		displayAlert.click();
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Hello");
		
		a.accept();
		
		
		
		
		
		
		
	}
}
