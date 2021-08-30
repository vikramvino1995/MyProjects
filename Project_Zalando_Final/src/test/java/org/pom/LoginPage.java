package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='uc-btn-accept-banner']")
	private WebElement popUp;

	@FindBy(xpath = "(//input[@type='email'])[2]")
	private WebElement userEmail;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement userPswd;

	@FindBy(xpath = "//button[contains(@class,'_0pCLC0 ')]")
	private WebElement showEye;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement logIn;

	@FindBy(xpath = "//span[contains(@class,'fOwAqx ')]")
	private WebElement forgotPswd;

	@FindBy(xpath = "//span[contains(text(),'Register')]")
	private WebElement registration;

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getUserPswd() {
		return userPswd;
	}

	public WebElement getShowEye() {
		return showEye;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getForgotPswd() {
		return forgotPswd;
	}

	public WebElement getRegistration() {
		return registration;
	}

	public WebElement getPopUp() {
		return popUp;
	}

}
