/*URL : https://www.w3schools.com/bootstrap/bootstrap_tables.asp

NOTE: Print Even rows  available in 4th webtable*/

package org.day11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("(//table[@class='table'])[2]"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		int rowsSize = tRows.size();
		
		System.out.println("Total Rows: "+rowsSize);
		for(int i=0;i<tRows.size();i++) {
			WebElement singleRow = tRows.get(i);
			
			if(i%2==0) {
				String onlyEven = singleRow.getText();
				System.out.println(onlyEven);
		}
		}
	}
}

