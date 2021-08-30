package org.pom;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	
	public SearchPage() {
		
		PageFactory.initElements(driver,this);
	}

//jean jacket	
	
@FindBy(xpath="//h3[contains(text(),'ONLNEW')]")
private WebElement westaCroppedJacket;

@FindBy(xpath="//h3[contains(text(),'SNAKE')]")
private WebElement snakePrintedJacket;

//Shirt

@FindBy(xpath="//h3[contains(text(),'NINA')]")
private WebElement ninaShirtDress;

//t-shirt

@FindBy(xpath="(//span[contains(text(),'Even&Odd')])[12]")
private WebElement printTshirt;


@FindBy(xpath="//button[@id='uc-btn-accept-banner']")
private WebElement PopUp;


public WebElement getNinaShirtDress() {
	return ninaShirtDress;
}

public WebElement getPopUp() {
	return PopUp;
}

public WebElement getPrintTshirt() {
	return printTshirt;
}

public WebElement getWestaCroppedJacket() {
	return westaCroppedJacket;
}

public WebElement getSnakePrintedJacket() {
	return snakePrintedJacket;
}


public void selectWomen() {
	
	Homepage h =new Homepage();
	
	leftClick(h.getWomen());
	
	
}





	
	
}
