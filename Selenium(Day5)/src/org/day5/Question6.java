/* URL : http://greenstech.in/selenium-course-content.html

NOTE: Course is first mouseover
      Software testing training is second mouseover  
      Click selenium training                  */ 

package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question6 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(course).perform();
		
		WebElement sT = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		act.moveToElement(sT).perform();
		
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		selenium.click();
		
		
	}
}
