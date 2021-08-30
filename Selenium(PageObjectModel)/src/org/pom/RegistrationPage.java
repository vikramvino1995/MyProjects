package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass{
	
	public RegistrationPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement enterUsername;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement enterPassword;
	
	
	@FindBy(xpath="//input[@id='re_password']")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement enterFullName;
	
	
	@FindBy(xpath="//input[@id='email_add']")
	private WebElement enterEmail;
	
	
	@FindBy(xpath="//input[@id='captcha-form']")
	private WebElement enterCaptcha;
	
	@FindBy(xpath="//input[@id='tnc_box']")
	private WebElement acceptTerms;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement readTerms;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement registerForm;
	
	@FindBy(xpath="//input[@id='Reset']")
	private WebElement resetForm;
	
	@FindBy(xpath="//a[contains(text(),'Go')]")
	private WebElement goBackToLogIn;
	
	@FindBy(xpath="//p[contains(text(),'SOFTWARE ')]")
	private WebElement printTerms;

	public WebElement getPrintTerms() {
		return printTerms;
	}

	public WebElement getEnterUsername() {
		return enterUsername;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getEnterFullName() {
		return enterFullName;
	}

	public WebElement getEnterEmail() {
		return enterEmail;
	}

	public WebElement getEnterCaptcha() {
		return enterCaptcha;
	}

	public WebElement getAcceptTerms() {
		return acceptTerms;
	}

	public WebElement getReadTerms() {
		return readTerms;
	}

	public WebElement getRegisterForm() {
		return registerForm;
	}

	public WebElement getResetForm() {
		return resetForm;
	}

	public WebElement getGoBackToLogIn() {
		return goBackToLogIn;
	}
	
	
	
}
