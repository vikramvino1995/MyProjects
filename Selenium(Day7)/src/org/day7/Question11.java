/* URL : https://www.flipkart.com/

NOTE: Mouse Over Womens and take the screenshot.    */

package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question11 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		act.click(close).perform();

		// TakesScreenshot ts =(TakesScreenshot)driver; //typeCasting

		WebElement fashion = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"));
		act.moveToElement(fashion).build().perform();

		// Thread.sleep(3000);

		List<WebElement> items = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a"));
		// ctrl + shift + / - comnmeting 1st and last
		// (alt + shift + r -- Changing the name everywhere)
		// tradional for loop
		/*
		 * for (int i = 0; i < items.size(); i++) { if
		 * (items.get(i).getText().contains("Women Footwear")) {
		 * System.out.println("expected outText" + items.get(i).getText());
		 * items.get(i).click(); break; } }
		 */

		// enhanced forloop
		for (WebElement item : items) {
			if (item.getText().contains("Women Footwear")) {
				item.click();
				break;
			}

		}
		
		//functional programming
		items.stream().filter(a->a.getText().contains("Women Footwear")).forEach(a->a.click());
		
		WebElement footwear = driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[6]"));
		footwear.click();

		//// *[@id="container"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[6]/font/font
	}
}
