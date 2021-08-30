/*URL : http://demo.automationtesting.in/Alerts.html

NOTE: Click Alert with ok & cancel button and Click button to display an confirm box Perform confirm alert.

*/
package org.day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day8)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement confirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		confirmAlert.click();
		
		WebElement displayConfirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		displayConfirm.click();
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		
	}
}
