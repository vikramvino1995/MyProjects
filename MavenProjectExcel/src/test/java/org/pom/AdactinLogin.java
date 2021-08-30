package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class AdactinLogin extends UtilityClass {
	
	public AdactinLogin() {
		
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="username")
private WebElement uname;

@FindBy(id="password")
private WebElement pswd;

@FindBy(xpath="//a[text()='Forgot Password?']")
private WebElement forgotPswd;

@FindBy(id="login")
private WebElement clickLogin;

@FindBy(id="//a[text()='New User Register Here']")
private WebElement newUserRegister;

public WebElement getUname() {
	return uname;
}

public WebElement getPswd() {
	return pswd;
}

public WebElement getForgotPswd() {
	return forgotPswd;
}

public WebElement getClickLogin() {
	return clickLogin;
}

public WebElement getNewUserRegister() {
	return newUserRegister;
}




	
	
}
