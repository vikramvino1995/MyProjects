/*URL : http://demo.automationtesting.in/Alerts.html

NOTE: Click button to display an alert box and click ok button*/

package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day8)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		
		WebElement button = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		
		button.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		
		home.click();
		
		
		
		
		
	}
}
