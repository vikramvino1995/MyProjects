package com.stepDefinition;

import cucumber.api.java.en.*;

public class SeatSelection {
	
	@Given("User should have selected travel dates in Nordica Airlines")
	public void userShouldHaveSelectedTravelDatesInNordicaAirlines() {
		System.out.println("\n"+"----------------------------------------------------------------------------------------------");
		System.out.println("User selected travel dates");
	}

	@When("User should select the Economy Class after selecting the travel date")
	public void userShouldSelectTheEconomyClassAfterSelectingTheTravelDate() {
		
		System.out.println("User selected the Economy Class");
	}

	@When("User Should able to select the Economy Type as flex")
	public void userShouldAbleToSelectTheEconomyTypeAsFlex() {
		
		System.out.println("User selected Economy Type as Flex");
	}

	@When("User should able to verify the amount in cart")
	public void userShouldAbleToVerifyTheAmountInCart() {
		
		System.out.println("User verified the amount in cart.");
	}

	@Then("User should able to select the continue button")
	public void userShouldAbleToSelectTheContinueButton() {
	   System.out.println("User clicked Continue Button");
	}

	@When("User should select the Premium Class after selecting the travel date")
	public void userShouldSelectThePremiumClassAfterSelectingTheTravelDate() {
		System.out.println("User selected the Premium Class");
	}

	@When("User Should able to select the Premium Type as Premium Standard")
	public void userShouldAbleToSelectThePremiumTypeAsPremiumStandard() {
		System.out.println("User selected Premium Type as Premium Standard");
	}

	@When("User should select the Buisness Class after selecting the travel date")
	public void userShouldSelectTheBuisnessClassAfterSelectingTheTravelDate() {
		System.out.println("User selected the Buisness Class");
	}

	@When("User Should able to select the Buisness Type as semi flex")
	public void userShouldAbleToSelectTheBuisnessTypeAsSemiFlex() {
		
		System.out.println("User selected Buisness Type as Semi Flex");
	}


}
