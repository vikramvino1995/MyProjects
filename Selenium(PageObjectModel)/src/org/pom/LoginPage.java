package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement loginUser;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement loginPass;
	
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgotPass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'New ')]")
	private WebElement newUserRegister;

	public WebElement getLoginUser() {
		return loginUser;
	}

	public WebElement getLoginPass() {
		return loginPass;
	}

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getNewUserRegister() {
		return newUserRegister;
	}
	
	
	
	

}
