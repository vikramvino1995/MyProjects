/*URL : https://www.amazon.com/

NOTE: Search iphones X and right click 1st phone and give open in new window 
      print cost of product*/

package org.windowshandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day10)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions act = new Actions(driver);
		
		Robot rob =new Robot();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone cover");
		
		//(//img[@class='s-image'])[1] 
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		WebElement cover1 = driver.findElement(By.xpath("(//img[@class='s-image'])[1] "));
		
		
		act.contextClick(cover1).perform();
		
		for(int i=0;i<2;i++) {
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		String text = price.getText();
		System.out.println(text);
		
		String ParentId = driver.getWindowHandle();
		
		Set<String> ParentChildId = driver.getWindowHandles();
		
		
		for(String x : ParentChildId) {
			if(!x.equals(ParentId)) {
				driver.switchTo().window(x);
			}
		}
		
		/*WebElement price2 = driver.findElement(By.id("(//span[text()='$8.99'])[2]"));
		String coverPrice = price2.getText();
		System.out.println(coverPrice);
*/
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		button.click();
		
		
		
		
	}
}
