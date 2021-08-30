/*URL : http://demo.guru99.com/test/write-xpath-table.html
NOTE: Print all details available in 4th cell of second Row*/

package org.day11;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day11)\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		WebElement Row2 = tRows.get(1);
		List<WebElement> Datas2 = Row2.findElements(By.tagName("td"));
		/*WebElement webElement = Datas2.get(1);
		String text = webElement.getText();
		System.out.println(text);*/
	
		for(int i=0;i<Datas2.size();i++) {
			WebElement webElement = Datas2.get(i);
			if(i==1) {
				String text = webElement.getText();
				System.out.println(text);
			}
		}
		
		
		
	}
}
