/*URL : http://greenstech.in/selenium-course-content.html

NOTE: ScrollDown till "job opening" and Take the screenshot and  scroll up Online Classroom*/
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

public class Question5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Selenium(Day7)\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("(//h2[@class='mb-0'])[1]"));
		WebElement scrollUp = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		TakesScreenshot tk = (TakesScreenshot) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scrollDown);
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File permanent = new File("G:\\Training.jpeg");
		FileUtils.copyFile(temp, permanent);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", scrollUp);

	}
}
