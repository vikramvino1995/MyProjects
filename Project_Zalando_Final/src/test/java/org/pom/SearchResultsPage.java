package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BaseClass {

	public SearchResultsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img//parent::a")
	private WebElement zalandoLogo;
	
	@FindBy(xpath="//button[@id='uc-btn-accept-banner']")
	private WebElement popUp;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[1]")
	private WebElement searchBar;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[2]")
	private WebElement sortBy;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[3]")
	private WebElement size;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[4]")
	private WebElement brand;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[5]")
	private WebElement colour;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[6]")
	private WebElement price;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[7]")
	private WebElement material;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[8]")
	private WebElement sustainability;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[9]")
	private WebElement length;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[10]")
	private WebElement sleeveLength;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[11]")
	private WebElement specialitySizes;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[12]")
	private WebElement collection;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[13]")
	private WebElement collar;

	@FindBy(xpath = "(//span[contains(@class,'icon ')])[14]")
	private WebElement delivery;

	@FindBy(xpath = "//button[contains(text(),'Show')]")
	private WebElement showAllFilters;

	@FindBy(xpath = "//a[@title='next page']")
	private WebElement nextPageButton;

	@FindBy(xpath = "//a[@title='previous page']")
	private WebElement previousPageButton;
	
	public WebElement getZalandoLogo() {
		return zalandoLogo;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getMaterial() {
		return material;
	}

	public WebElement getSustainability() {
		return sustainability;
	}

	public WebElement getLength() {
		return length;
	}

	public WebElement getSleeveLength() {
		return sleeveLength;
	}

	public WebElement getSpecialitySizes() {
		return specialitySizes;
	}

	public WebElement getCollection() {
		return collection;
	}

	public WebElement getCollar() {
		return collar;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getShowAllFilters() {
		return showAllFilters;
	}

	public WebElement getNextPageButton() {
		return nextPageButton;
	}

	public WebElement getPreviousPageButton() {
		return previousPageButton;
	}
	
	public WebElement getPopUp() {
		return popUp;
	}

}
