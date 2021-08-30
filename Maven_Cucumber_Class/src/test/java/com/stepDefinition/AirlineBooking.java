package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AirlineBooking {
		
	@Given("User should launch chrome and search Nordica Airlines, select the URL.")
	public void user_should_launch_chrome_and_search_for_Nordica_Airlines_select_the_URL() {
		
		System.out.println("\n"+"-----------------------------------------------------------------------------------------------");
		
		System.out.println("Chrome Launched.");
	}

	@When("User should select the valid source")
	public void userShouldSelectTheValidSource() {
		
		System.out.println("User selected valid source.");
	}


	@When("User should select the valid destination")
	public void user_should_select_the_valid_destination() {
				
		System.out.println("User selected valid destination.");
						
	}
	@When("User should click the round trip radio")
	public void user_should_click_the_round_trip_radio_button() {
	    
			System.out.println("User selected round trip radio button.");
	}

	@When("User should select the start date and return date of travel")
	public void user_should_select_the_start_date_and_return_date_of_travel() {
		
		System.out.println("User selected start date and return date.");
	}

	@When("User should select the find flights button")
	public void user_should_select_the_find_flights_button() {
	    	
		System.out.println("User selected find flights option.");
	}

	@Then("List of available flights should be displayed")
	public void list_of_available_flights_should_be_displayed() {
	   
		System.out.println("List of available flights displayed.");
	}
	@When("User should click the one-way trip radio")
	public void userShouldClickTheOneWayTripRadio() {
		
		
		System.out.println("One-way radio button selected.");
	}

	@When("User should select the start date  of travel")
	public void userShouldSelectTheStartDateOfTravel() {
	 
		System.out.println("User selected the Start date of travel.");
		
	}

	@When("User should select the Invalid source")
	public void userShouldSelectTheInvalidSource() {
		
		System.out.println("User selected the invalid source.");
	}

	@When("User should select the In-valid destination")
	public void userShouldSelectTheInValidDestination() {
		Assert.assertTrue(false);
	  
		System.out.println("User selected  invalid destination.");
		
	}

	
}
