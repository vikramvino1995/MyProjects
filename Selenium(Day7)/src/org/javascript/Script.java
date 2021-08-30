package org.javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");           
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		
		Actions act = new Actions(driver);
		
		WebElement scrollDown = driver.findElement(By.xpath("(//a[@class='nav_a'])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);
		
		Thread.sleep(5000);
		
		WebElement scrollUp = driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]"));
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollUp);
		
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	
		act.click(signin).perform();
		
		WebElement userEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));

		
		js.executeScript("arguments[0].setAttribute('value','Vikramvino1136@gmail.com')",userEmail);
		
		Object emailEntered = js.executeScript("return arguments[0].getAttribute('value')",userEmail);
		
		System.out.println(emailEntered);
		
		String str = (String)emailEntered;
		System.out.println(str);
		
		WebElement button = driver.findElement(By.xpath("//input[@id='continue']"));
		 
		js.executeScript("arguments[0].click()",button);
		
		WebElement pswd = driver.findElement(By.id("ap_password"));

		js.executeScript("arguments[0].setAttribute('value','NewtonsApple1136')",pswd);
		
		Object pswdEntered = js.executeScript("return arguments[0].getAttribute('value')",pswd);
		
		System.out.println(pswdEntered);
		
		WebElement checkBox = driver.findElement(By.name("rememberMe"));

		act.click(checkBox).perform();
		
		WebElement hover = driver.findElement(By.xpath("//a[@id='remember_me_learn_more_link']"));
		act.moveToElement(hover).perform();
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File f =new File("G:\\Amazonlog.png");
		
		FileUtils.copyFile(temp,f);
		
		
		
		
	}
	
	
}
