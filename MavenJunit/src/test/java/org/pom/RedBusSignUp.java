package org.pom;

import org.baseClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBusSignUp extends UtilityClass{
	
	public RedBusSignUp() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
@FindBy(xpath="//div[@id='signin-block']")	
private WebElement signupLogo;

@FindBy(xpath="//li[text()='Sign In/Sign Up']")
private WebElement signupOption;

@FindBy(xpath="//input[@id='mobileNoInp']")
private WebElement enterNumber;

@FindBy(xpath="//iframe[@class='modalIframe']")
private WebElement frame;

public WebElement getSignupLogo() {
	return signupLogo;
}

public WebElement getSignupOption() {
	return signupOption;
}

public WebElement getEnterNumber() {
	return enterNumber;
}

public WebElement getFrame() {
	return frame;
}
	


}
