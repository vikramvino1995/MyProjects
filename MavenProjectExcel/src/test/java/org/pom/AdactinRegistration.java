package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class AdactinRegistration extends UtilityClass{
	
	public AdactinRegistration() {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(id="username")
private WebElement uname;

@FindBy(id="password")
private WebElement pswd;

@FindBy(id="re_password")
private WebElement cfmpswd;

@FindBy(id="full_name")
private WebElement fname;

@FindBy(id="email_add")
private WebElement mail;

@FindBy(id="captcha-form")
private WebElement captcha;

@FindBy(xpath="//a[text()='Go back to Login page']")
private WebElement backToLogin;

@FindBy(id="tnc_box")
private WebElement checkBox;

@FindBy(xpath="//a[text()='Terms & Conditions']")
private WebElement terms;

@FindBy(id="Submit")
private WebElement register;

@FindBy(id="Reset")
private WebElement reset;

@FindBy(xpath="//p[contains(text(),'SOFTWARE')]")
private WebElement Webtext;



public WebElement getWebText() {
	return Webtext;
}

public WebElement getBackToLogin() {
	return backToLogin;
}

public WebElement getCaptcha() {
	return captcha;
}


public WebElement getUname() {
	return uname;
}

public WebElement getPswd() {
	return pswd;
}

public WebElement getCfmpswd() {
	return cfmpswd;
}

public WebElement getFname() {
	return fname;
}

public WebElement getMail() {
	return mail;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getTerms() {
	return terms;
}

public WebElement getRegister() {
	return register;
}

public WebElement getReset() {
	return reset;
}
	
	
	
}
