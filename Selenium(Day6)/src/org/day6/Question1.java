/*URL : https://www.facebook.com/

NOTE: Type email in email textBox and cut  the email using Robot class 
      Paste that email in password text  using Robot class   */

package org.day6;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	
	public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day6)\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.clear();
		
		email.sendKeys("Email_Id");
		
		Actions act =new Actions(driver);
		
		act.doubleClick(email).perform();
		
		act.contextClick(email).perform();
		
		Robot rob =new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
	
		rob.keyPress(KeyEvent.VK_DOWN);
		
		rob.keyRelease(KeyEvent.VK_DOWN);
		

		rob.keyPress(KeyEvent.VK_ENTER);
		
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement pswd = driver.findElement(By.id("pass"));
		
		pswd.click();
		
		pswd.clear();
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyRelease(KeyEvent.VK_V);
		
		String attribute = pswd.getAttribute("value");
		System.out.println(attribute);
		
		
	}


}
