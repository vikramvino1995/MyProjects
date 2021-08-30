package org.stepDefinition;

import org.base.BaseClass;
import org.junit.Assert;

import cucumber.api.java.en.*;



public class Wishlist extends BaseClass{
	
	
	@Given("User should be in zalando website")
	public void userShouldBeInZalandoWebsite() {
	
		launchBrowser();
		
		loadUrl("https://www.zalando.co.uk/");
		
		maximize();
		
	}

/*	@When("User should search for a product")
	public void userShouldSearchForAProduct() {
		
	   
		
		Assert.assertTrue(true);

	}

	@When("User should able to view the search results page")
	public void userShouldAbleToViewTheSearchResultsPage() {
		
		System.out.println("User can see the search results");
	    Assert.assertTrue(true);
		
	}

	@When("User should able to select a particular product")
	public void userShouldAbleToSelectAParticularProduct() {
		
		System.out.println("User selected the size");
		
		Assert.assertTrue(true);
		   
	}

	@When("User should able to select the size of the product")
	public void userShouldAbleToSelectTheSizeOfTheProduct(){
	    
		System.out.println("User selected the size");
		
		   Assert.assertTrue(true);
		
		
	}

	@When("User should able to add that particular product to wishlist")
	public void userShouldAbleToAddThatParticularProductToWishlist() {
	 
		System.out.println("User added the product to wishlist");
		
		  Assert.assertTrue(true);
		
	}


	@When("User should able to select the my cart button")
	public void userShouldAbleToSelectTheMyCartButton() {
	   
		System.out.println("User selected the cart button");
		Assert.assertTrue(true);
		
	}

	@When("User should now able to add product to wishlist from mycart page")
	public void userShouldNowAbleToAddProductToWishlistFromMycartPage() {
		
		System.out.println("User added product to wishlist from cart page");
	}
*/
}
