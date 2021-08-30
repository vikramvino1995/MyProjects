package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zalando {

	public static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

	    driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://www.zalando.co.uk/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@title='Login']")).click();

		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	/*	WebElement popUp = driver.findElement(By.xpath("//button[@id='uc-btn-accept-banner']"));
		
		boolean flag = driver.findElements(By.xpath("//button[@id='uc-btn-accept-banner']")).size() > 0;
		if (flag == true) {
			
			wait.until(ExpectedConditions.elementToBeClickable(popUp)).click();
		}
*/
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='uc-btn-accept-banner']"))).click();

		driver.findElement(By.xpath("//input[@name='login.email']")).sendKeys("Vikramvino1136@gmail.com");

		driver.findElement(By.xpath("//input[@name='login.password']")).sendKeys("newtonsapple");

		driver.findElement(By.xpath("//button[@data-testid='login_button']")).click();
		
		Thread.sleep(3000);
		
    	//wait.until(ExpectedConditions.elementToBeClickable(popUp)).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Continue shopping']")).click();
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Women')])[1]"))).click();
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='search']"));

		searchBar.sendKeys("Jean Jacket");

		Robot rob = new Robot();

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		
		List<WebElement> dress = driver.findElements(By.xpath("//div[@class='hPWzFB']"));
		
		dress.get(1).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[class='DJxzzA _78xIQ- mo6ZnF']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='_0xLoFW FCIprz'])[6]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Your bag']")).click();
		
		WebElement dropDown = driver.findElement(By.cssSelector("[class='z-2-dropdown__control']"));
		
		dropDown.click();
		
		Select s = new Select(dropDown);
		
		s.selectByVisibleText("2");
		
		WebElement loGo = driver.findElement(By.xpath("//img[@alt='Zalando']"));
		
		js.executeScript("arguments[0].setAttribute('style','background:red')",loGo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	List<WebElement> searchOptions = driver.findElements(By.cssSelector("[class='cat_head-3QSpK']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(searchOptions.get(1))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@role='checkbox'])[2]")).click();
		
		List<WebElement> sizeOptions = driver.findElements(By.cssSelector("[class='content cat_list-1KY6Z']"));
		
		sizeOptions.get(1).click();
		
		
	  	WebElement size = driver.findElement(By.xpath("//span[contains(text(),'Size')]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(size)).click();
		
		
		
		Thread.sleep(3000);
		
		WebElement num6 = driver.findElement(By.xpath("//span[contains(text(),'6')])[1]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(num6)).click();
		
		Thread.sleep(3000);
		
		WebElement saveOption = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		
		saveOption.click();
		
		boolean enabledCheck = saveOption.isEnabled();
		
		if(enabledCheck==false) {
			
			System.out.println("Save Option is Disabled.");
		}*/
		
		

	}
		
		 
}
