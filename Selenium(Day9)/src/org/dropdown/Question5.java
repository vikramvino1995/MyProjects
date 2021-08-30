/*URL : https://www.facebook.com/

NOTE: print the even dates
*/
package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question5 extends Utility {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser();
		
		goToWebsite("https://www.facebook.com/");
		
		maximize();
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		leftClick(button);
		
		wait(3000);
		
		WebElement dayLoc = driver.findElement(By.id("day"));
		
		Select s =new Select(dayLoc);
		
		List<WebElement> days = s.getOptions();
		
		for(int i=1;i<days.size();i++) {
			
			WebElement day = days.get(i);
			
			if(i%2==0) {
				System.out.println(day.getText());
			}
			
		}
		
		
	}
}
