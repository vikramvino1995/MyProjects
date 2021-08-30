package org.stepDefinition;

import java.io.IOException;

import org.base.Utility;
import org.junit.Assert;
import org.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Utility{

	@Given("User should able to reach the facebook website")
	public void user_should_able_to_reach_the_facebook_website() {
	
		Assert.assertTrue(getCurrentUrl().contains("facebook"));
		
		System.out.println("In required Website");
		
	}

	@When("User should able to enter the valid username")
	public void user_should_able_to_enter_the_valid_username() throws IOException {

		LoginPage log =new LoginPage();
		
		log.enterUserName();
		
	}

	@When("User should able to enter the valid password")
	public void user_should_able_to_enter_the_valid_password() throws IOException {
	
		LoginPage log =new LoginPage();
		
		log.enterPswd();
		
	}

	@Then("User should able to click and login")
	public void user_should_able_to_click_and_login() {

	}

	
	
	
	
	
}
