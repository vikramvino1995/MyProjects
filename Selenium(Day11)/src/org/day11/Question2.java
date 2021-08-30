/*URL : http://demo.guru99.com/test/write-xpath-table.html

NOTE: Print all value in first row
*/

package org.day11;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		WebElement Row1 = tRows.get(0);
		String text = Row1.getText();
		System.out.println(text);
		
		List<WebElement> row1Data = Row1.findElements(By.tagName("td"));
		
		for(WebElement x : row1Data) {
			String dataText = x.getText();
			System.out.println(dataText);
		}	
	}
}
