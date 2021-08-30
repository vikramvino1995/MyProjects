package org.pom;

import java.awt.AWTException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

	public Homepage() {
		PageFactory.initElements(driver,this);
	}

@FindBy(xpath="(//span[contains(text(),'Women')])[1]")
private WebElement women;

@FindBy(xpath="(//span[contains(text(),'Men')])[1]")
private WebElement men;

@FindBy(xpath="(//span[contains(text(),'Kids')])[1]")
private WebElement kids;

@FindBy(xpath="//input[@aria-label='Search']")
private WebElement searchField;

@FindBy(xpath="((//img[@class='_6uf91T u9hYHE z-oVg8 u-6V88 ka2E9k uMhVZi FxZV-M _2Pvyxl JT3_zV EKabf7 mo6ZnF _1RurXL'])[1]")
private WebElement heroImage;

@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/*[1]")
private WebElement logInIcon;

@FindBy(xpath="//body[1]/div[4]/div[1]/div[1]/x-wrapper-header[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/div[1]/svg[1]/title[1])")
private WebElement wishlistIcon;

@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]/div[1]/*[1]")
private WebElement addtoBagIcon;

@FindBy(xpath="//img[@class='z-navicat-header_svgLogo']")
private WebElement ZalandoLogo;

public WebElement getHeroImage() {
	return heroImage;
}

public WebElement getLogInIcon() {
	return logInIcon;
}

public WebElement getWishlistIcon() {
	return wishlistIcon;
}

public WebElement getAddtoBagIcon() {
	return addtoBagIcon;
}

public WebElement getWomen() {
	return women;
}

public WebElement getMen(){
	return men;
}

public WebElement getKids(){
	return kids;
}

public WebElement getSearchField() {
	return searchField;
}

public WebElement getZalandoLogo() {

	return ZalandoLogo;
}


public void searchMensProduct(String menProduct) throws AWTException {
	
	leftClick(getMen());
	
	enterText(getSearchField(),menProduct);
	
	pressEnter();
	
}

public void searchWomensProduct(String womenProduct) throws AWTException {
		
	leftClick(getWomen());

	enterText(getSearchField(),womenProduct);
	
	pressEnter();
	
}

public void searchKidsProduct(String kidProduct) throws AWTException {
	
	leftClick(getKids());
	
	
	enterText(getSearchField(),kidProduct);
	
	pressEnter();
	
}

public void selectHeroImage() {
	
	leftClick(getHeroImage());
}

public void clickZalandoLogo() {
	
	leftClick(getZalandoLogo());
}







}
