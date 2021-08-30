package org.helper;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sample1 extends UtilityClass {
	
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		//To launch Browser
		launchBrowser();
		
		//To get Website
		goToWebsite("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//To maximize the webpage
		maximize();
		
		//printing the Url
		System.out.println(getUrl());
		
		//Printing the title
		System.out.println(getTitle());

		
		// checking title for specific string value
		titleContains("Null");
		
		
		//printing text from webpage
		WebElement radioTitle = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		System.out.println(showText(radioTitle));
		
		WebElement suggestionTitle = driver.findElement(By.xpath("//legend[text()='Suggession Class Example']"));
		System.out.println(showText(suggestionTitle));
		
		WebElement dropdownTitle = driver.findElement(By.xpath("//legend[text()='Dropdown Example']"));
		System.out.println(showText(dropdownTitle));
		
		WebElement checkboxTitle = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
		System.out.println(showText(checkboxTitle));
		
		//leftclick on a radiobutton
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
		leftClick(radio2);
		
		// leftclick on a checkbox  
		WebElement checkbox3 = driver.findElement(By.id("checkBoxOption3"));
		leftClick(checkbox3);
	
		//getting user Input
		WebElement textbox = driver.findElement(By.xpath("//input[@id='name']"));
		enterText(textbox,"VIKRAM");
		
		//Printing user input
		System.out.println(userInput(textbox));
		
		
		//Handling simple Alert.	
		WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		leftClick(alert);
		simpleAlert();
		
		
		//Handling confirm Alert.
		WebElement alert2 = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		leftClick(alert2);
		confirmAlert();
		
		
		//pressing back option  after right click using robot class.(Down,Enter),wait using Thread.
		WebElement blink = driver.findElement(By.xpath("//a[@class='blinkingText']"));
		leftClick(blink);
		wait(2000);
		
		WebElement select = driver.findElement(By.xpath("//div[@class='container']"));
		rightClick(select);
		previousPage();
		wait(2000);
		
		//scrolling Down
		WebElement scrollDown = driver.findElement(By.xpath("//td[text()='Delhi']"));
		scrollDown(scrollDown);
		
		//taking screenShot after scrolling down
		captureScreenshot("G:\\scrollDown.png");
		
		//scrolling Up
		WebElement scrollUp = driver.findElement(By.xpath("//td[text()='Engineer']"));
		scrollUp(scrollUp);
		
		//taking screenshot after scrolling up
		captureScreenshot("G:\\scollUp.jpeg");
		
		
		//Mouse Hover and select Top
		WebElement hover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		mouseHover(hover);
		WebElement top = driver.findElement(By.xpath("//a[text()='Top']"));
		leftClick(top);
		
		//getRows from all the table
		getAllRows();
		
		
		//getRows from particular table.
		WebElement table = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
		getSingleTableRows(table);
		
		//get Headers from all the table
		getAllHeaders();
		
		
		//get Headers from single table.
		WebElement table1 = driver.findElement(By.xpath("(//table[@id='product'])[1]"));
		getSingleTableHeaders(table1);
		
		
		//get all table Datas
		allTableDatas();
		
		//get data from single table.
		singleTableDatas(table);
		
		//to close browser.
		close();
		
		
	}

	}
	

