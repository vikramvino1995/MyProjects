/*https://www.w3schools.com/bootstrap/bootstrap_tables.asp

	NOTE: Print all details available in 4th webTable
*/
package org.day11;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tables.asp");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("(//table[@class='table'])[2]"));

		List<WebElement> tRows = table.findElements(By.tagName("tr"));

		for (WebElement singleRow : tRows) {

			List<WebElement> tDatas = singleRow.findElements(By.tagName("td"));

			for (WebElement singleData : tDatas) {

				String dataText = singleData.getText();
				System.out.println(dataText);

			}
		}

	}
}
