package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook extends BaseClass {
	
	public Facebook() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
@FindBy(id="email")
private WebElement email;
	
@FindBy(id="pass")
private WebElement pswd;

public WebElement getEmail() {
	return email;
}

public WebElement getPswd() {
	return pswd;
}
	

	
	
}
