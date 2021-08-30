package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(WebTable)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		System.out.println("row size--->" + tRows.size());
		
		for(int i=0;i<tRows.size();i++) {
			
			WebElement row = tRows.get(i);
			System.out.println("----------------------------------------------------------------row-----------------------------------------------------------");
			
			List<WebElement> Datas = row.findElements(By.tagName("td"));
			System.out.println("data size--->" + Datas.size());

			for(int j=0;j<Datas.size();j++) {
				WebElement tData =Datas.get(j);
			System.out.println(tData.getText());
			}
		}
		
		
		
		
	}
}
