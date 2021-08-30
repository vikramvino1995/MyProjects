package org.Question1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Searching Iphone XS by selecting from suggestion box

public class Amazon {
	
public static void main(String[] args) throws AWTException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

	searchBox.sendKeys("iphone");
	
	Thread.sleep(3000);
	
	Robot r =new Robot();
	
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_SPACE);
	
	Thread.sleep(3000);
	
	for(int i=1;i<9;i++) {
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	List<WebElement> iphones = driver.findElements(By.xpath("//span[contains(@class,'a-size-medium')]"));
	
	
	WebElement firstPhone = iphones.get(1);
	
	firstPhone.click();
	
	String parentId = driver.getWindowHandle();
	
	Set<String> parentChildId = driver.getWindowHandles();
	
/*	for(String window1 : parentChildId) {
		
		if(!(window1==parentId)) {
			
			driver.switchTo().window(window1);
		}
		
	}*/
	
	List<String> l =new ArrayList<>();
	
	l.addAll(parentChildId);
	
	driver.switchTo().window(l.get(1));
	
	driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	
}
}
