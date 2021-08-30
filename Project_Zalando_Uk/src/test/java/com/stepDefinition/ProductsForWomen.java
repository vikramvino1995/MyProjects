package com.stepDefinition;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.Homepage;
import org.pom.SearchPage;

import cucumber.api.java.en.*;


public class ProductsForWomen extends BaseClass{
	
	

	@Given("Customer should able to Launch GC Browser and enter Zalando Url")
	public void customer_should_able_to_Launch_GC_Browser_and_enter_Zalando_Url() {
	    
		launchBrowser();
		
		loadUrl("https://www.zalando.co.uk/");
		
	}

	@When("User should select the Customer Type as Women and search for womenProduct")
	public void user_should_select_the_Customer_Type_as_Women_and_search_for_womenProduct(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, AWTException {
	 
		  SearchPage s =new SearchPage();
		  Homepage h =new Homepage();
		  
		  s.selectWomen();
		  
		  List<String> l = dataTable.asList();
		  
		  enterText(h.getSearchField(),l.get(1));
		  
		  pressEnter();
		  
		  sleep();
		  
		  leftClick(s.getPopUp());
		
	}

	@When("Women User should able to select a product")
	public void women_User_should_able_to_select_a_product() throws InterruptedException {
	   
		SearchPage s =new SearchPage();
		
		sleep();
		
		leftClick(s.getNinaShirtDress());
		
		sleep();
		

	}
	@When("Women User should able to view the product details page")
	public void women_User_should_able_to_view_the_product_details_page() {
	  
		Assert.assertTrue(getUrl().contains("dress"));
		
	}
	
	
	@Then("Women User should able to close the browser")
	public void women_User_should_able_to_close_the_browser() {
	  
		closeBrowser();
		
	}
	@When("User should select the Customer Type as Women and search for more than one womenProduct")
	public void user_should_select_the_Customer_Type_as_Women_and_search_for_more_than_one_womenProduct(io.cucumber.datatable.DataTable dataTable) throws InterruptedException, AWTException {
		List<String> l = dataTable.asList();
		
		SearchPage s =new SearchPage();
		
		Homepage h =new Homepage();
		
		leftClick(h.getWomen());
		
		enterText(h.getSearchField(),l.get(1));
		
		pressEnter();
		
		sleep();
		
	}

	
	@When("Women User should able to select and view multiple products in different tabs")
	public void women_User_should_able_to_select_and_view_multiple_products_in_different_tabs() throws InterruptedException, AWTException {
		
		SearchPage s =new SearchPage();
		
		sleep();
		
		leftClick(s.getPopUp());
		
		List<WebElement> l = driver.findElements(By.cssSelector("div[class='JT3_zV ZkIJC- _9QaS6n pckW89 csmaMi']"));
		
		OpenLinkInNewTab(l.get(3));
		
		OpenLinkInNewTab(l.get(6));
		
		String pId = driver.getWindowHandle();
		
		Set<String> pcIds = driver.getWindowHandles();
		
		int temp=0;
		
		for(String x : pcIds) {
			
			if(temp==2) {
				driver.switchTo().window(x);
			}
			
			temp++;
		}
		
		
	}

	@When("Women User should able to finalize from selected multiple product")
	public void women_User_should_able_to_finalize_from_selected_multiple_product() {

		Assert.assertTrue(getUrl().contains("tommy"));
	
		
	}
	
}
