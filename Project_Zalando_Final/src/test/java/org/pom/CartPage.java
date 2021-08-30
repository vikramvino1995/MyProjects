package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {

	public CartPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img//parent::a")
	private WebElement zalandoLogo;

	@FindBy(xpath = "//button[@id='uc-btn-accept-banner']")
	private WebElement popUp;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchBar;

	@FindBy(xpath = "(//select[contains(@class,'z-2-dropdown')])[1]")
	private WebElement firstProductDropdown;

	@FindBy(xpath = "(//select[contains(@class,'z-2-dropdown')])[2]")
	private WebElement secondProductDropdown;

	@FindBy(xpath = "(//span[text()='Remove'])[1]")
	private WebElement removeFirstProduct;

	@FindBy(xpath = "(//span[text()='Remove'])[2]")
	private WebElement removeSecondProduct;

	@FindBy(xpath = "(//span[contains(text(),'Move')])[1]")
	private WebElement moveFirstProductToWishList;

	@FindBy(xpath = "(//span[contains(text(),'Move')])[2]")
	private WebElement moveSecondProductToWishList;

	@FindBy(xpath = "(//div[text()='Go to checkout'])[1]")
	private WebElement checkOut;

	@FindBy(xpath = "(//span[contains(@class,'z-2-text')])[34]")
	private WebElement totalAmount;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getZalandoLogo() {
		return zalandoLogo;
	}

	public WebElement getFirstProductDropdown() {
		return firstProductDropdown;
	}

	public WebElement getSecondProductDropdown() {
		return secondProductDropdown;
	}

	public WebElement getRemoveFirstProduct() {
		return removeFirstProduct;
	}

	public WebElement getRemoveSecondProduct() {
		return removeSecondProduct;
	}

	public WebElement getMoveFirstProductToWishList() {
		return moveFirstProductToWishList;
	}

	public WebElement getMoveSecondProductToWishList() {
		return moveSecondProductToWishList;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getTotalAmount() {
		return totalAmount;
	}

	public WebElement getPopUp() {
		return popUp;
	}

}
