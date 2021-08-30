package org.stepDefinition;

import java.awt.AWTException;

import org.baseClass.BaseClass;
import org.pom.Homepage;

import cucumber.api.java.en.*;

public class ProductSearch extends BaseClass{
	
	@Given("User should able to launch chrome and reach {string}")
	public void user_should_able_to_launch_chrome_and_reach(String url) {
	   
		launchBrowser();
		
		loadUrl(url);
		
	}

	@When("User should able to select the customer type as women")
	public void user_should_able_to_select_the_customer_type_as_women() {
	
		Homepage h = new Homepage();
		
		h.selectWomen();
		
	}

	@When("User should able to verify whether the page displays women products only")
	public void user_should_able_to_verify_whether_the_page_displays_women_products_only() {
		
		Homepage h = new Homepage();
		
		h.verifyUrlForWomenProducts();
		
	}

	@When("User should able to search a women product in search bar {string}")
	public void user_should_able_to_search_a_women_product_in_search_bar(String womenProduct) throws AWTException, InterruptedException {
	
		Homepage h = new Homepage();
		
		h.handlePopUp();
		
		h.searchForWomenProduct(womenProduct);
		
	}

	@Then("User should able to verify whether searched women products are displayed in search results page {string}")
	public void user_should_able_to_verify_whether_searched_women_products_are_displayed_in_search_results_page(String womenProduct) throws InterruptedException {
	  
		Homepage h = new Homepage();
		
		h.verifySearchedWomenProduct(womenProduct);
		
	}

	@When("User should able to select the customer type as men")
	public void user_should_able_to_select_the_customer_type_as_men() {
	    
		Homepage h = new Homepage();
		
		h.selectMen();
		
	}

	@When("User should able to verify whether the page displays men products only")
	public void user_should_able_to_verify_whether_the_page_displays_men_products_only() {
		
		Homepage h = new Homepage();
		
		h.verifyUrlForMenProducts();
	}

	@When("User should able to search a men product in search bar {string}")
	public void user_should_able_to_search_a_men_product_in_search_bar(String menProduct) throws AWTException, InterruptedException {
	 
		Homepage h = new Homepage();
		
		h.handlePopUp();
		
		h.searchForMenProduct(menProduct);
		
	}

	@Then("User should able to verify whether searched men products are displayed in search results page {string}")
	public void user_should_able_to_verify_whether_searched_men_products_are_displayed_in_search_results_page(String menProduct) throws InterruptedException {
	   
		Homepage h = new Homepage();
		
		h.verifySearchedMenProduct(menProduct);
		
	}


	@When("User should able to select the customer type as kids")
	public void user_should_able_to_select_the_customer_type_as_kids() {
	
		Homepage h = new Homepage();
		
		h.selectKids();
	}

	@When("User should able to verify whether the page displays kids products only")
	public void user_should_able_to_verify_whether_the_page_displays_kids_products_only() {
	
		Homepage h = new Homepage();
		
		h.verifyUrlForKidsProducts();
		
	}

	@When("User should able to search a kids product in search bar {string}")
	public void user_should_able_to_search_a_kids_product_in_search_bar(String kidsProduct) throws AWTException, InterruptedException {
	
		Homepage h = new Homepage();
		
		h.handlePopUp();
		
		h.searchForKidsProduct(kidsProduct);
		
	}

	@Then("User should able to verify whether searched kids products are displayed in search results page {string}")
	public void user_should_able_to_verify_whether_searched_kids_products_are_displayed_in_search_results_page(String kidsProduct) throws InterruptedException {
	    
		Homepage h = new Homepage();
		
		h.verifySearchedKidsProduct(kidsProduct);
		
	}

}
