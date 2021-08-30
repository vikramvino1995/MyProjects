package org.pom;

import org.baseClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage extends UtilityClass {
	
	public PracticePage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
@FindBy(id="opentab")
private WebElement newTab;

@FindBy(xpath="//a[contains(text(),'Login')]")
private WebElement logIn;

@FindBy(id="user_email")
private WebElement mail;

@FindBy(xpath="//input[@id='user_password']")
private WebElement pswd;

public WebElement getNewTab() {
	return newTab;
}

public WebElement getLogIn() {
	return logIn;
}

public WebElement getMail() {
	return mail;
}

public WebElement getPswd() {
	return pswd;
}






	
}
