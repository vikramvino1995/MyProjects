package org.pageObjects;

import java.io.IOException;
import org.base.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility{
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(id="email")
private WebElement uname;

@FindBy(id="pass")
private WebElement pswd;

public WebElement getUname() {
	return uname;
}

public WebElement getPswd() {
	return pswd;
}

//Methods 

public void enterUserName() throws IOException {
	
	enterText(uname,readExcelData("Sheet1",4,0));
	
}

public void enterPswd() throws IOException {
	
	enterText(pswd,readExcelData("Sheet1",4,1));
	
}

}
