package org.pageobjectmodel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	@CacheLookup
	@FindAll({@FindBy(xpath="//input[@id='twotabsearchtextbox']"),@FindBy(xpath="(//input[@type='text'])[1]")})
	private WebElement txtsearch;
	
	@CacheLookup
	@FindBys({@FindBy(xpath="(//input[@type='submit'])[1]"),@FindBy(xpath="//input[@value='Go']")})
	private WebElement button;

	public WebElement getTxtsearch() {
		return txtsearch;
	}

	public WebElement getButton() {
		return button;
	}
	
}


