package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Wait {
	
	public static void main(String[] args) {
				
		//Implicit wait//all locators
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);  //Poll Limit- 250 - 2000 ms (should not be specified)
		//its for particular condition/locator
		WebDriverWait w=new WebDriverWait(driver, 10);//only for seconds     //poll limit -500 ms(should not be specified)
 	
		
		
		// It will handle the exception in runtime
		FluentWait<WebDriver>f=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		
	
		
	}
}
