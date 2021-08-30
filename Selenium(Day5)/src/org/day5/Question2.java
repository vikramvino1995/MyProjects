/* URL:  http://www.amazon.in

NOTE: Try Prime first MouseHover
      Click Free fast delivery on prime items                     */

package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day5)\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver  =new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		
		Actions act =new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//span[text()='Prime']"));
		act.moveToElement(hover).perform();
		
		
		WebElement click = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		act.click(click).perform();
}
}
