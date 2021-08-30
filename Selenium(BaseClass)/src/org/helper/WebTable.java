package org.helper;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.covid19india.org/");
		
		Thread.sleep(3000);
		
		
		WebElement table = driver.findElement(By.className("table-container"));
	
		
		List<WebElement> rows = table.findElements(By.className("row"));
		
		Map<String,String> m ;
		
		Map<String,Object> m1 =new TreeMap<String,Object>();
		
		for(int i=1;i<rows.size();i++) {
			
			 m =new TreeMap<String,String>();
			
			WebElement row = rows.get(i);
			
			WebElement header = rows.get(0);
			
			List<WebElement> cells = row.findElements(By.className("cell"));
			
			for(int j=0;j<cells.size();j++) {
				
				WebElement cell = cells.get(j);
				
				String text = cell.getText();
				
				m.put(header.findElements(By.className("cell")).get(j).getText(),text);
				
		}
			m1.put(rows.get(i).findElements(By.className("cell")).get(0).getText(),m);
				
		}
			System.out.println(m1);
			System.out.println("--------------------------------------------");
				
		}
}

