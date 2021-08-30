/*  URL : http://demo.automationtesting.in/Register.html

NOTE: Just enter the values for the textbox only.   */

package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day2)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement enterXpath = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		enterXpath.sendKeys("Vikram");
		
		WebElement enterXpath2 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		enterXpath2.sendKeys("Vino");
		
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("Vikramvino1136@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("8148104697");
		
		WebElement pswd =driver.findElement(By.id("firstpassword"));
		pswd.sendKeys("Tamil");
		
		WebElement spswd = driver.findElement(By.id("secondpassword"));
		spswd.sendKeys("tamil");
		
		//WebElement enterClass = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']"));
		//enterClass.sendKeys("363/G1,netaji Nagar, Vengikkal, Tiruvannmalai.");
	}

}
