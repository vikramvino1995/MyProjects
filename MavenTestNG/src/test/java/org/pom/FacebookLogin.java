package org.pom;

import org.baseClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends UtilityClass {
	
	public FacebookLogin() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
@FindBy(id="email")
private WebElement mail;

@FindBy(id="pass")
private WebElement pswd;

@FindBy(xpath="//button[@type='submit']")
private WebElement logInButton;

public WebElement getMail() {
	return mail;
}

public WebElement getPswd() {
	return pswd;
}

public WebElement getLogInButton() {
	return logInButton;
}
}