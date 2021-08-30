/* URL : https://www.facebook.com/ 

   NOTE: Print the email and password which was entered by user     */

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
	email.clear();
	String attribute3 = email.getAttribute("placeholder");
	System.out.println(attribute3);
	
	String attribute2 = email.getAttribute("data-testid");
	System.out.println(attribute2);
	email.sendKeys("Vikramvino1136@gmail.com");
	
	String emailID = email.getAttribute("value");
	System.out.println(emailID);
	
	WebElement pswd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pswd.clear();
	String attribute = pswd.getAttribute("placeholder");
	System.out.println(attribute);
	pswd.sendKeys("NewtonsApple");
	String pswd2 = pswd.getAttribute("value");
	System.out.println(pswd2);
	
	}
}
