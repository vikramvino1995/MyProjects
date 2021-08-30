/* URL :http://www.greenstechnologys.com

NOTE: Print paragaraph starts with Greens Technology              */

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com");
		
		WebElement findElement = driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		String text1 = findElement.getText();
		System.out.println(text1);
		
		//WebElement findElement = driver.findElement(By.xpath("//p[@class='course-desc']"));
		//String text = findElement.getText();
		//System.out.println(text);
		
	}
}
