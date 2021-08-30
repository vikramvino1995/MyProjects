/*URL : http://output.jsbin.com/osebed/2


NOTE: Select Even Option available in fruits
      Find out number of option not selected
*/

package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Question12 extends Utility {
	
	public static void main(String[] args) {
		
		launchBrowser();
		
		goToWebsite("http://output.jsbin.com/osebed/2");
		
		maximize();
		
		WebElement fruLoc = driver.findElement(By.id("fruits"));
		
		Select s =new Select(fruLoc);
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		int sizeSelected = allSelectedOptions.size();
		
		
		List<WebElement> options = s.getOptions();
		
		int sizeAll = options.size();
		
		int unselected= sizeAll-sizeSelected;
		
		System.out.println("Unselected Options: "+unselected);
		
		
	}
}
