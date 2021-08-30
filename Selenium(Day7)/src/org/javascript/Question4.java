/*URL : http://www.greenstechnologys.com/

NOTE: Scroll Down till "Greens technology Perumbakkam. address "and Take  screenshot 
*/

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

public class Question4 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		////a[@class='dmca-badge']
		
		WebElement scrollDown = driver.findElement(By.xpath("(//span[@class='red_text'])[6]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollDown);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		
		File temp = tk.getScreenshotAs(OutputType.FILE);
		
		File permanent =new File("G:\\perumbakkam.jpg");
		
		FileUtils.copyFile(temp,permanent);
		
		WebElement scrollUp = driver.findElement(By.xpath("//h1[contains(text(),'No 1 Software Training Institutes in Chennai with Placements')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",scrollUp);
		
	}
}
