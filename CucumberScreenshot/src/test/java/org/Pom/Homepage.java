package org.Pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass {

	public Homepage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='your-name']")
	private WebElement name;

	@FindBy(xpath = "//input[@name='your-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//select[@name='your-course']")
	private WebElement courseDropdown;

	@FindBy(xpath = "//textarea[@name='your-message']")
	private WebElement mesg;

	@FindBy(xpath = "(//a[contains(text(),'ABOUT TESTLEAF')])[1]")
	private WebElement aboutTestLeafOption;

	@FindBy(xpath = "(//a[contains(text(),'COURSES')])[1]")
	private WebElement coursesOption;

	@FindBy(xpath = "(//a[contains(text(),'BLOG')])[1]")
	private WebElement blogOption;

	@FindBy(xpath = "(//a[contains(text(),'CONSULTING')])[1]")
	private WebElement consultingOption;

	@FindBy(xpath = "(//a[contains(text(),'CONTACT US')])[1]")
	private WebElement contactUsoption;

	public WebElement getAboutTestLeafOption() {
		return aboutTestLeafOption;
	}

	public WebElement getCoursesOption() {
		return coursesOption;
	}

	public WebElement getBlogOption() {
		return blogOption;
	}

	public WebElement getConsultingOption() {
		return consultingOption;
	}

	public WebElement getContactUsoption() {
		return contactUsoption;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCourseDropdown() {
		return courseDropdown;
	}

	public WebElement getMesg() {
		return mesg;
	}

	public void enterName() {

		enterText(name, "Vikram");

	}

	public void enterMail() {

		enterText(email, "Vikram@gmail.com");
	}

	public void enterPhone() {

		enterText(phone, "8148104697");
	}

	public void selectCourse() {

		dropDownBytext(courseDropdown, "JMeter");

	}

	public void enterMesg() {

		enterText(mesg, "Hello");

	}

	public void selectAboutTestLeaf() {

		getAboutTestLeafOption().click();

	}

	public void selectCourseOption() {

		getCoursesOption().click();

	}

	public void selectBlogOption() {

		getBlogOption().click();
	}

	public void selectContactUsOption() {

		getContactUsoption().click();

	}

	public void selectConsultingOption() {

		getConsultingOption().click();
	}

}
