/* URL : http://greenstech.in/selenium-course-content.html

NOTE: Click interviews question take the screenshot.                            */

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

public class Question7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		WebElement interview = driver.findElement(By.xpath("//div[@id='heading20']"));
		
		interview.click();
		
		WebElement tcs = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[4]"));
		tcs.click();
		
		TakesScreenshot ts =(TakesScreenshot)driver;	
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File permanent =new File("E:\\TCS.jpeg");
		
		FileUtils.copyFile(temp,permanent);               //throws Exception 
		
		driver.close();
		
		
	}
}
