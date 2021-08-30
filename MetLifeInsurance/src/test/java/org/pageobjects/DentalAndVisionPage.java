package org.pageobjects;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DentalAndVisionPage extends UtilityClass{

	public DentalAndVisionPage() {
	
		PageFactory.initElements(driver,this);
			
	}

@FindBy(xpath="//h2[contains(text(),'dental ')]")
private WebElement dentalPageLink;

@FindBy(xpath="//span[text()='Me & My Family']")
private WebElement meAndMyFamily;

@FindBy(xpath="//span[text()='Dental Insurance']")
private WebElement dentalInsurance;

@FindBy(xpath="//span[text()='Vision Insurance']")
private WebElement visionInsurance;

@FindBy(xpath="//span[text()='Accident & Health Insurance']")
private WebElement accidentAndHealthInsurance;

@FindBy(xpath="(//span[text()='Disability'])[1]")
private WebElement disability;

@FindBy(xpath="//span[text()='Find a Vision Provider']")
private WebElement findVisionProvider;

@FindBy(xpath="//span[text()='Vision Insurance Plans']")
private WebElement visionInsurancePlans;

@FindBy(xpath="//span[text()='Vision Insurance Forms']")
private WebElement visionInsuranceForms;

@FindBy(xpath="(//span[text()='Contact MetLife'])[2]")
private WebElement contactMetlife;

@FindBy(xpath="//a[contains(text(),'3931')]")
private WebElement visionInsuranceContactNumber;

public WebElement getDentalPageLink() {
	return dentalPageLink;
}

public WebElement getMeAndMyFamily() {
	return meAndMyFamily;
}

public WebElement getDentalInsurance() {
	return dentalInsurance;
}

public WebElement getVisionInsurance() {
	return visionInsurance;
}

public WebElement getAccidentAndHealthInsurance() {
	return accidentAndHealthInsurance;
}

public WebElement getDisability() {
	return disability;
}

public WebElement getFindVisionProvider() {
	return findVisionProvider;
}

public WebElement getVisionInsurancePlans() {
	return visionInsurancePlans;
}

public WebElement getVisionInsuranceForms() {
	return visionInsuranceForms;
}

public WebElement getContactMetlife() {
	return contactMetlife;
	
}

public WebElement getVisionInsuranceContactNumber() {
	return visionInsuranceContactNumber;
}


//methods

public void selectVisionInsuranceCustomerService() {

	leftClick(getDentalPageLink());
	
	leftClick(getMeAndMyFamily());
	
	leftClick(getVisionInsurance());
	
	javaScriptClick(getContactMetlife());

	
}


	
}
