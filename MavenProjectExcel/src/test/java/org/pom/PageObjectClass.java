package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PageObjectClass extends UtilityClass{
	
	
	public PageObjectClass() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="email")
	private WebElement mail;
	
	
	@FindBy(id="pass")
	private WebElement pass;


	public WebElement getMail() {
		return mail;
	}


	public WebElement getPass() {
		return pass;
	}
	
	
	
}
