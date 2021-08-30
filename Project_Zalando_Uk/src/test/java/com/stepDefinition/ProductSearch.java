package com.stepDefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.Homepage;

import cucumber.api.java.en.*;


public class ProductSearch extends BaseClass{
	
	@Given("Customer should able to Launch GC Browser and enter Zalando Url {string}")
	public void browser(String url) throws InterruptedException {
			
		launchBrowser();
		
		loadUrl(url);
		
		sleep();
	}

	@When("User should select the Customer Type as Women and search for womenProduct in search bar {string}")
	public void womenAsCustomer(String womenProduct) throws AWTException, InterruptedException {
	    
		Homepage h = new Homepage();
		
		h.searchWomensProduct(womenProduct);
		
		sleep();
		
	}

	@When("User should able to view the searched women product list")
	public void verify_WomenProductsList() {
	    	
		System.out.println(getUrl());
		
		Assert.assertTrue(getUrl().contains("women"));
		
	}


	@When("User should revert back to Homepage, select the Customer Type as Men and search for menProduct in search bar{string}")
	public void menAsCustomer(String menProduct) throws InterruptedException, AWTException {
		
		Homepage h = new Homepage();
		
		h.clickZalandoLogo();
	
		sleep();
		
		h.searchMensProduct(menProduct);
		
		sleep();
		
	}

	@When("User should able to view the searched men product list")
	public void verify_MenProductsList() {
	   
		System.out.println(getUrl());
		
		Assert.assertTrue(getUrl().contains("men"));
		
	}

	@When("User should revert back to Homepage ,select the Customer Type as Kids and search for kidsProduct {string}")
	public void kidsAsCustomer(String kidProduct) throws InterruptedException, AWTException {
	    
		Homepage h = new Homepage();
		
		h.clickZalandoLogo();
	
		sleep();
		
		h.searchKidsProduct(kidProduct);
		
		sleep();
		
	}

	@When("User should able to view the searched kids productlist")
	public void verify_kidsproductlist() {
		
		System.out.println(getUrl());
		
		Assert.assertTrue(getUrl().contains("kid"));
		
	}
	
	@Then("User should able to close the browser.")
	public void browserClose() {
	    
		closeBrowser();
	}


}
