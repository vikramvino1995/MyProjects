package org.stepDefinition;

import org.Pom.Homepage;
import org.base.BaseClass;
import org.junit.Assert;

import cucumber.api.java.en.*;

public class TestLeaf extends BaseClass{
	
	@Given("User should able to visit the website")
	public void userShouldAbleToVisitTheWebsite() {
	
		Assert.assertTrue(getUrl().contains("leaf"));
	}

	@When("User should able to enter valid email")
	public void userShouldAbleToEnterValidEmail() {
		
		Homepage h =new Homepage();
		
		h.enterMail();
		
		String userMail = h.getEmail().getAttribute("value");
		
		Assert.assertTrue(userMail.contains("@"));
		
	}

	@When("User should able to enter valid name")
	public void userShouldAbleToEnterValidName() {
		
		Homepage h =new Homepage();
		
		h.enterName();
		
		String userName = h.getName().getAttribute("value");
		
		Assert.assertTrue(userName.contains("i"));
		
	}

	@When("User should able to enter valid phone")
	public void userShouldAbleToEnterValidPhone() {
	  
		Homepage h =new Homepage();
		
		h.enterPhone();
		
		String phoneNo = h.getPhone().getAttribute("value");
		
		Assert.assertTrue(phoneNo.length()==10);
		
	}

	@When("User should able to enter valid course")
	public void userShouldAbleToEnterValidCourse() {

		Homepage h =new Homepage();
		
		h.selectCourse();
		
	}

	@When("User should able to enter valid mesg")
	public void userShouldAbleToEnterValidMesg() {

		Homepage h =new Homepage();
		
		h.enterMesg();
		
	}

	@Then("User able to click submit")
	public void userAbleToClickSubmit() {
	
		
	}
	
	@Given("User should be in test leaf website")
	public void userShouldBeInTestLeafWebsite() {
	    
		Assert.assertTrue(getUrl().contains("leaf"));
		
	}

	@When("User should able to click the about test leaf option")
	public void userShouldAbleToClickTheAboutTestLeafOption() {
		
		Homepage h =new Homepage();
		
		h.selectAboutTestLeaf();
		
	}

	@Then("User should be in about us page")
	public void userShouldBeInAboutUsPage() {
	    
		Assert.assertTrue(getUrl().contains("about"));
		
	}

	@When("User should able to click the courses option")
	public void userShouldAbleToClickTheCoursesOption() {
	   
		Homepage h =new Homepage();
		
		h.selectCourseOption();
		
	}

	@Then("User should be in all courses page")
	public void userShouldBeInAllCoursesPage() {
	   
		Assert.assertTrue(getUrl().contains("all-courses"));
		
	}

	@When("User should able to click the Blog option")
	public void userShouldAbleToClickTheBlogOption() {
	   
		Homepage h =new Homepage();
		
		h.selectBlogOption();
		
	}

	@Then("User should be in Blog  page")
	public void userShouldBeInBlogPage() {
	   
		Assert.assertTrue(getUrl().contains("blog"));
		
	}

	@When("User should able to click the Consulting option")
	public void userShouldAbleToClickTheConsultingOption() {
	    
		Homepage h =new Homepage();
		
		h.selectConsultingOption();
		
	}

	@Then("User should be in Consulting  page")
	public void userShouldBeInConsultingPage() {
	  
		Assert.assertTrue(getUrl().contains("Consulting"));
		
		
	}

	@When("User should able to click the Contact Us option")
	public void userShouldAbleToClickTheContactUsOption() {
	    
		Homepage h =new Homepage();
		
		h.selectContactUsOption();
		
	}

	@Then("User should be in Contact  page")
	public void userShouldBeInContactPage() {
	   
		Assert.assertTrue(getUrl().contains("contact"));
		
	}
	
	

}
