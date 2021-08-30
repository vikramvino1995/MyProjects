/* URL :http://demo.guru99.com/test/drag_drop.html 

NOTE: Drag and drop  bank  in Account ,5000 in amount  at debited side 
      Drag and drop  sales in Account ,5000 in amount  at credited side              */

package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/drag_drop.html ");
		 
		 Thread.sleep(3000);
		 
		 driver.manage().window().maximize();
		 
		 Actions act = new Actions(driver);		 
		 
		 //Actions for Debit Side.
		 WebElement banksrc = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		 
		 WebElement bankdest = driver.findElement(By.id("bank"));
		 
		 act.dragAndDrop(banksrc, bankdest).perform();
		 
		 WebElement debitSrc = driver.findElement(By.xpath("(//a[contains(text(),5000)])[2]"));
		 
		 WebElement debitDest = driver.findElement(By.id("amt7"));
		 
		 act.dragAndDrop(debitSrc,debitDest).perform();
		 
		 //Actions For Credit Side.
		 WebElement creditSrc = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 
		 WebElement creditDest = driver.findElement(By.id("amt8"));
		 
		 act.dragAndDrop(creditSrc,creditDest).perform();
		 
		 WebElement salesSrc = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		 
		 WebElement salesDest = driver.findElement(By.id("loan"));
		 
		 act.dragAndDrop(salesSrc,salesDest).perform();
		 
		 
		
	}
}
