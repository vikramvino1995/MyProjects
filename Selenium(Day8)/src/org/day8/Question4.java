/*URL : https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997

NOTE: Click continue without enter the user id and handle popup.

*/

package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day8)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		
		driver.manage().window().maximize();
		
		WebElement continueButton = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		
		continueButton.click();
		
		WebElement continue2 = driver.findElement(By.xpath("(//img[@alt='continue'])[2]"));
		
		continue2.click();
		
		
		
	}
}
