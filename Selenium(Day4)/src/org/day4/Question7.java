/* URL : http://www.google.com/

NOTE: Search greens velmurugan and click the 1st link.                 */

package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com/");
		
		WebElement google = driver.findElement(By.xpath("//input[@name='q']"));
		google.sendKeys("greens Velmurugan");
		String search = google.getAttribute("value");
		System.out.println(search);
		
		WebElement button = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		button.click();
		
		WebElement text = driver.findElement(By.xpath("(//span[contains(text(),\"Velmurugan\")])[1]"));
		String textInLink = text.getText();
		System.out.println(textInLink);
		
		text.click();
		
	}
}
