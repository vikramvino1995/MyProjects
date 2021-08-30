/* 
URL : http://www.greenstechnologys.com 
NOTE: Print Greens Technologys Software Training Centers in Chennai.
                                                                                  */
package org.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day4)\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(currentUrl);
		System.out.println(title);
		
		WebElement findElement = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		String strtext= findElement.getText();
		System.out.println(strtext);
		
		WebElement findElement2 = driver.findElement(By.xpath("//u[contains(text(),'Greens')]"));
		String strtext2 = findElement2.getText();
		System.out.println(strtext2);
		
		
		
	}
}
