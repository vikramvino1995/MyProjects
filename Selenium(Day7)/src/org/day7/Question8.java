/*  URL : http://greenstech.in/selenium-course-content.html

NOTE: In  CoreJava TestPaper Take the Screenshot      */

package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question8 {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		WebElement java = driver.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]"));
		java.click();
		
		Actions act = new Actions(driver);
		WebElement string = driver.findElement(By.xpath("//a[text()=' Day6_String']"));
	
		act.contextClick(string).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File permanent =new File("G:\\CoreJava1.jpeg");
		
		FileUtils.copyFile(temp,permanent);
		
		driver.close();
		
	}
}
