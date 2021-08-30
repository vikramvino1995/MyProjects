package org.pageObjects;

import org.baseClass.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBooking extends Utility {

	public FlightBooking() {
		
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(xpath="//li[@data-cy='oneWayTrip']")
private WebElement oneWayTrip;

@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement fromClick;

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement fromTextbox;

@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement toClick;

@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement toTextbox;

@FindBy(xpath="//span[contains(text(),'DEPARTURE')]")
private WebElement departureDate;

@FindBy(xpath="//span[contains(text(),'RETURN')]")
private WebElement returnDate;

@FindBy(xpath="//span[contains(text(),'Travellers & CLASS')]")
private WebElement travellerClass;


public WebElement getOneWayTrip() {
	return oneWayTrip;
}


public WebElement getFromClick() {
	return fromClick;
}

public WebElement getFromTextbox() {
	return fromTextbox;
}

public WebElement getToClick() {
	return toClick;
}

public WebElement getToTextbox() {
	return toTextbox;
}


public WebElement getDepartureDate() {
	return departureDate;
}

public WebElement getReturnDate() {
	return returnDate;
}

public WebElement getTravellerClass() {
	return travellerClass;
}


	
	
}
