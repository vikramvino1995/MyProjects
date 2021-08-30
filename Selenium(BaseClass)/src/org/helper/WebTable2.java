package org.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {
		
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(BaseClass)\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.covid19india.org/");
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//div[@class='table-container']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", table);
		
		List<String> a = new ArrayList<String>();
		List<WebElement> cities = table.findElements(By.xpath("//div[@class='cell']"));
		for (WebElement city : cities) {
			String getCity = city.getText();
			a.add(getCity);
		}
		
		System.out.println("Before sorting ---> " + a);
		Collections.sort(a);
		System.out.println("Ascending --->" + a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("Descending ---> " + a);
	}
	
}
