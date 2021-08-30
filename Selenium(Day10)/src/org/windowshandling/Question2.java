/*URL : https://www.snapdeal.com/ 

NOTE: Search iphones 7 and click 1st phone 
      add it to cart.
      print the you pay cost displayed.*/

package org.windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question2 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		
		goToWebsite("https://www.snapdeal.com/ ");
		
		maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		
		enterText(textBox,"iphone 7");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		leftClick(button);
		
		putWait();
		
		WebElement cover1 = driver.findElement(By.xpath("(//p[contains(text(),'Wow')])[1]"));
		leftClick(cover1);
		
		
		String parentId = driver.getWindowHandle();
		
		Set<String> parentChildId = driver.getWindowHandles();
		
		for(String x : parentChildId) {
			
			if(!x.equals(parentId)) {
				driver.switchTo().window(x);
			}
			
		}
		
		WebElement addToCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		leftClick(addToCart);
		
		putWait();

		WebElement amount = driver.findElement(By.xpath("//div[@class='you-pay']"));
		System.out.println(getText(amount));
		
		//div[@class='you-pay']
		
		
		driver.switchTo().window(parentId);
		
		putWait();
		
		WebElement cover2 = driver.findElement(By.xpath("//img[@title='Apple iPhone 7 Bumper Cases Shopizone - Green']"));
		leftClick(cover2);
		
		putWait();
		
		Set<String> parentchildId2 = driver.getWindowHandles();
		
		int temp = 0;
		for(String x : parentchildId2) {
			
			if(temp==2) {
				driver.switchTo().window(x);
			}
		temp++;	
		}
		
		WebElement logo = driver.findElement(By.xpath("(//img[@title='Snapdeal'])[1]"));
		leftClick(logo);
		
		
	}
	
}
