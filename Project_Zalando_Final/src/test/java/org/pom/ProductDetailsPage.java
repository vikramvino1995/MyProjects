package org.pom;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BaseClass {

	public ProductDetailsPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//img//parent::a")
	private WebElement zalandoLogo;

	@FindBy(xpath = "//button[@id='uc-btn-accept-banner']")
	private WebElement popUp;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchBar;

	@FindBy(xpath = "(//button[contains(@class,'kMvGAR ')])[1]")
	private WebElement productImageOne;

	@FindBy(xpath = "(//button[contains(@class,'kMvGAR ')])[2]")
	private WebElement productImageTwo;

	@FindBy(xpath = "(//button[contains(@class,'kMvGAR ')])[3]")
	private WebElement productImageThree;

	@FindBy(xpath = "(//button[contains(@class,'kMvGAR ')])[4]")
	private WebElement productImageFour;

	@FindBy(xpath = "(//button[contains(@class,'kMvGAR ')])[5]")
	private WebElement productImageFive;

	@FindBy(xpath = "//span[contains(text(),'Choose')]")
	private WebElement chooseYourSize;

	@FindBy(xpath = "//span[contains(text(),'UK')]")
	private WebElement UKSize;

	@FindBy(xpath = "//span[contains(text(),'sizes')]")
	private WebElement manufacturerSizes;

	@FindBy(xpath = "//span[contains(text(),'Add')]")
	private WebElement addToBag;

	@FindBy(xpath = "(//button[contains(@class,'_7HqEu_ ')])[2]")
	private WebElement addToWishList;

	@FindBy(xpath = "(//span[contains(@class,'6V88 ')])[17]")
	private WebElement checkDeliveryOption;

	@FindBy(xpath = "(//span[contains(@class,'_0xLoFW')])[3]")
	private WebElement materialAndCare;

	@FindBy(xpath = "(//span[contains(@class,'_0xLoFW')])[4]")
	private WebElement details;

	@FindBy(xpath = "(//span[contains(@class,'_0xLoFW')])[5]")
	private WebElement sizeAndFit;

	@FindBy(xpath = "(//button[contains(@class,'DJxzzA ')])[6]")
	private WebElement followButton;

	public WebElement getZalandoLogo() {
		return zalandoLogo;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getProductImageOne() {
		return productImageOne;
	}

	public WebElement getProductImageTwo() {
		return productImageTwo;
	}

	public WebElement getProductImageThree() {
		return productImageThree;
	}

	public WebElement getProductImageFour() {
		return productImageFour;
	}

	public WebElement getProductImageFive() {
		return productImageFive;
	}

	public WebElement getChooseYourSize() {
		return chooseYourSize;
	}

	public WebElement getUKSize() {
		return UKSize;
	}

	public WebElement getManufacturerSizes() {
		return manufacturerSizes;
	}

	public WebElement getAddToBag() {
		return addToBag;
	}

	public WebElement getAddToWishList() {
		return addToWishList;
	}

	public WebElement getCheckDeliveryOption() {
		return checkDeliveryOption;
	}

	public WebElement getMaterialAndCare() {
		return materialAndCare;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getSizeAndFit() {
		return sizeAndFit;
	}

	public WebElement getFollowButton() {
		return followButton;
	}

	public WebElement getPopUp() {
		return popUp;
	}
}
