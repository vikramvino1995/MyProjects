/*  URL : http://adactinhotelapp.com/

NOTE: Print the UserName and Password that you are entered.               */

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("Vikramvino1136");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Newtonsapple@1136");
		
		String idvalue = id.getAttribute("value");
		String pswdValue = pswd.getAttribute("value");
		
		System.out.println(idvalue);
		System.out.println(pswdValue);
		
		WebElement username = driver.findElement(By.xpath("(//td[@align='right'])[1]"));
		String text = username.getText();
		System.out.println(text);
		
		WebElement text2 = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
		String s = text2.getText();
		System.out.println(s);
		
	}
}
