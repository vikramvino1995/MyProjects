package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(WebTable)\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
	
	driver.manage().window().maximize();
	
	WebElement table = driver.findElement(By.xpath("(//table[@class='table'])[1]"));
	
	List<WebElement> tRows = table.findElements(By.tagName("tr"));
	
	for(int i=0;i<tRows.size();i++)
	{
		WebElement tRow = tRows.get(i);
		List<WebElement> theaders = tRow.findElements(By.tagName("th"));
		
		for(int j=0;j<theaders.size();j++) {
		WebElement theader = theaders.get(j);
		String text = theader.getText();
		System.out.println(text);
		
		}
	}
	}
	
}
