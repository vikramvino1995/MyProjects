/*URL : http://demo.guru99.com/test/write-xpath-table.html

NOTE: Print all the content in the dynamic WebTable.*/

package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		
		
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		System.out.println(tRows);
		
		for(int i=0;i<tRows.size();i++) {
			
			  WebElement singleRow = tRows.get(i);
			 List<WebElement> tDatas = singleRow.findElements(By.tagName("td"));
			  
			  for(int j=0;j<tDatas.size();j++) {
				  WebElement singleData = tDatas.get(j);
				  String dataText = singleData.getText();
				  System.out.println(dataText);
			  
		}
		}
	}
}
