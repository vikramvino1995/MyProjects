package org.pom;

import java.awt.AWTException;

import org.baseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BaseClass {

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img//parent::a")
	private WebElement zalandoLogo;
	
	@FindBy(xpath="//button[@id='uc-btn-accept-banner']")
	private WebElement popUp;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBar;

	@FindBy(xpath = "//span[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//span[text()='Men']")
	private WebElement men;

	@FindBy(xpath = "//span[text()='Kids']")
	private WebElement kids;

	@FindBy(xpath = "(//a//parent::div)[2]")
	private WebElement userIcon;

	@FindBy(xpath = "(//a//parent::div)[4]")
	private WebElement wishListIcon;

	@FindBy(xpath = "(//a//parent::div)[6]")
	private WebElement myBagIcon;

	@FindBy(xpath = "//a[contains(text(),'Help')]")
	private WebElement helpAndContact;

	@FindBy(xpath = "(//a//parent::span)[2]")
	private WebElement freeDeliveryAndItems;

	@FindBy(xpath = "//span[contains(text(),'Go')]")
	private WebElement GoToTop;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[7]")
	private WebElement getTheLookLink;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[8]")
	private WebElement NewLink;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[9]")
	private WebElement clothing;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[10]")
	private WebElement shoes;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[11]")
	private WebElement accessories;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[12]")
	private WebElement sports;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[13]")
	private WebElement designer;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[14]")
	private WebElement brands;

	@FindBy(xpath = "(//span[contains(@class,'navicat')])[15]")
	private WebElement sale;

	public WebElement getZalandoLogo() {
		return zalandoLogo;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getMen() {
		return men;
	}

	public WebElement getKids() {
		return kids;
	}

	public WebElement getUserIcon() {
		return userIcon;
	}

	public WebElement getWishListIcon() {
		return wishListIcon;
	}

	public WebElement getMyBagIcon() {
		return myBagIcon;
	}

	public WebElement getHelpAndContact() {
		return helpAndContact;
	}

	public WebElement getFreeDeliveryAndItems() {
		return freeDeliveryAndItems;
	}

	public WebElement getGoToTop() {
		return GoToTop;
	}

	public WebElement getGetTheLookLink() {
		return getTheLookLink;
	}

	public WebElement getNewLink() {
		return NewLink;
	}

	public WebElement getClothing() {
		return clothing;
	}

	public WebElement getShoes() {
		return shoes;
	}

	public WebElement getAccessories() {
		return accessories;
	}

	public WebElement getSports() {
		return sports;
	}

	public WebElement getDesigner() {
		return designer;
	}

	public WebElement getBrands() {
		return brands;
	}

	public WebElement getSale() {
		return sale;
	}
	
	public WebElement getPopUp() {
		return popUp;
	}

	
	public void selectWomen() {
		
		leftClick(getWomen());
		
	}
	
	public void verifyUrlForWomenProducts() {
		
		Assert.assertTrue(getUrl().contains("women"));
		
	}
	
	public void searchForWomenProduct(String womenProduct) throws AWTException {
		
		enterText(getSearchBar(),womenProduct);
		
		pressEnter();
		
	}
	
	public void verifySearchedWomenProduct(String womenProduct) {
		
		Assert.assertTrue(getUrl().contains(womenProduct));
		
	}
	
	public void selectMen() {
		
		leftClick(getMen());
		
	}
	
	
	public void verifyUrlForMenProducts() {
		
		Assert.assertTrue(getUrl().contains("men"));
		
	}
	
	public void searchForMenProduct(String menProduct) throws AWTException {
		
		enterText(getSearchBar(),menProduct);
		
		pressEnter();
		
	}
	
	public void verifySearchedMenProduct(String menProduct) {
		
		Assert.assertTrue(getUrl().contains(menProduct));
		
	}
	
	
	public void selectKids() {
		
		leftClick(getKids());
		
	}
	
	public void verifyUrlForKidsProducts() {
		
		Assert.assertTrue(getUrl().contains("kids"));
		
	}
	
	
	public void searchForKidsProduct(String kidsProduct) throws AWTException {
		
		enterText(getSearchBar(),kidsProduct);
		
		pressEnter();
		
	}
	
	public void verifySearchedKidsProduct(String kidsProduct) {
		
		Assert.assertTrue(getUrl().contains(kidsProduct));
		
	}
	
	public void handlePopUp() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(getPopUp())).click();
		
	}
	
	
	
	
	
	
	
	

}
