package org.windowshandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day10)\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("Books");
		String entered = search.getAttribute("value");
		System.out.println("User searched for: "+entered);
		
		WebElement click = driver.findElement(By.className("searchTextSpan"));
		click.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement book1 = driver.findElement(By.xpath("(//img[@title='The Power of Your Subconscious Mind'])[1]"));
				// (//picture[@class='picture-elem'])[1]\"
		
		js.executeScript("arguments[0].scrollIntoView(false)",book1);
		book1.click();
		
		 Set<String> allWind = driver.getWindowHandles();
		 System.out.println("All Window Ids: "+allWind);
		 
		 String parWind = driver.getWindowHandle();
		 System.out.println("Parent Window Id: "+parWind);
		 
		 for(String x : allWind) {
			 if(!x.equals(parWind)) {
				 driver.switchTo().window(x);
			 }
		 }
		
		WebElement select = driver.findElement(By.xpath("//span[text()='add to cart']"));
		select.click();
		
		
		driver.switchTo().window(parWind);
		
		
		WebElement logo = driver.findElement(By.xpath("(//img[@title='Snapdeal'])[1]"));
		logo.click();
		
		WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
		search1.sendKeys("Books");
		driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]")).click();
		
		List<WebElement> allBooks = driver.findElements(By.xpath("//picture[@class='picture-elem']"));
		
		allBooks.get(2).click();
		
		allBooks.get(5).click();
		
		allBooks.get(8).click();
		
		
		Set<String> allWind2 = driver.getWindowHandles();
		
		System.out.println(allWind2);
		
		int temp = 0;
		
		for(String x : allWind2) {
			
			if(temp==2) {
				driver.switchTo().window(x);
			}
			temp++;
		}
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		
	}
}
