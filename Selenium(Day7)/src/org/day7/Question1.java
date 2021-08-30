/* URL : http://www.greenstechnologys.com/
NOTE: Take screenshot of HomePage. */
package org.day7;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	
	//typeCasting or downCasting

	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//temporary storage
	
	 File temp = ts.getScreenshotAs(OutputType.FILE);
	
	//permanent Storage
	 
	 File permanent =new File("G:\\Greens.png");
	 
	 FileUtils.copyFile(temp,permanent);
	 
	 driver.close();
	 
	 
	 
	 
	}
}
