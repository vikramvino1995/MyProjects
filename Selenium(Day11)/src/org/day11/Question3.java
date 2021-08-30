/*URL : http://demo.guru99.com/test/write-xpath-table.html

NOTE: Find out Number of rows available in webPage*/

package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	
	public static void main(String[] args) {
		
 	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");
 	
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://demo.guru99.com/test/write-xpath-table.html");
    driver.manage().window().maximize();
    
    WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
    
    List<WebElement> tRows = table.findElements(By.tagName("tr"));
    
    System.out.println(tRows);
    int rowCount = tRows.size();
    System.out.println(rowCount);
    
	}
}
