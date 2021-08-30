package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(WebTable)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div/div[1]/table"));
		
		List<WebElement> trows =table .findElements(By.tagName("tr"));
		
		for(int i=0;i<trows.size();i++) {
			WebElement row = trows.get(i);
			List<WebElement> header = row.findElements(By.tagName("th"));
			for(int j=0;j<header.size();j++) {
				WebElement thead = header.get(j);
				String text = thead.getText();
				System.out.println(text);
			}
			
		}
		
	}
}
