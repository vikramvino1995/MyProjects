package org.Question1;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MayBeLine {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.maybelline.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//span[text()='SHOP ALL'])[1]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> alltitles = driver.findElements(By.className("shop-all__title"));
		
		List<WebElement> allShades = driver.findElements(By.className("shop-all__shade"));
		
		String title = null, noOfShades =null;
		
		Map<String,String> m1= new HashMap<>();
		
		for(int i=0;i<alltitles.size();i++) {
			
			WebElement onetitle = alltitles.get(i);
			
			WebElement shade = allShades.get(i);
			
			 title = onetitle.getText();
			 
			 noOfShades = shade.getText();
			 
			 m1.put(title, noOfShades);

		}
		
	
		 System.out.println(m1);
		
		 Set<String> onlyTitles = m1.keySet();
		 
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		 System.out.println("\n"+"Only Titles :"+onlyTitles);
		 
		 Collection<String> onlyShades = m1.values();
		 
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		 System.out.println("\n"+"Only Shades :"+onlyShades);
		 
		 Set<Entry<String,String>> entrySet = m1.entrySet();
		 
		 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		 
		 for(Entry<String,String> x : entrySet ) {
			 
			 
			 System.out.println("\n"+"Iterating Key and Value: "+x);
		 
			 
		 }
		 
		 
		 
		 
		
		
		
		
	
		
		
	    
		
		
			
	}
}
