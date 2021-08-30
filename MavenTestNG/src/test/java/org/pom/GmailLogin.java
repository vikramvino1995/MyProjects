package org.pom;

import org.baseClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin extends UtilityClass{
	
	public GmailLogin() {
		
		PageFactory.initElements(driver,this);
		
	}

	
@FindBy(xpath="(//a[contains(text(),' Sign in')])[2]")
private WebElement signIn;

@FindBy(xpath="//div[text()='Use another account']")
private WebElement useAnotherAcc;

@FindBy(id="identifierId")
private WebElement mailId;


@FindBy(xpath="//span[text()='Next']")
private WebElement nextButton;

@FindBy(name="password")
private WebElement pswd;

@FindBy(className="enBDyd")
private WebElement checkBox;

public WebElement getSignIn() {
	return signIn;
}

public WebElement getUseAnotherAcc() {
	return useAnotherAcc;
}

public WebElement getMailId() {
	return mailId;
}

public WebElement getNextButton() {
	return nextButton;
}

public WebElement getPswd() {
	return pswd;
}

public WebElement getCheckBox() {
	return checkBox;
}

	
}
