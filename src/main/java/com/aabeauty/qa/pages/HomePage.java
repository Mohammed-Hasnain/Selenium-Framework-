package com.aabeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.util.TestUtil;

public class HomePage extends BasePage{
	
	@FindBy(id ="header-logo-container")
	WebElement airasiaLogo;
	
	@FindBy(xpath = "//div[@class='w-full product-list-title']//h2[text()='Carl & Claire']")
	WebElement pageHeader;
	
	@FindBy(xpath = "//span[@class='address-name']")
	WebElement addressBtn;
	
	@FindBy(xpath = "//p[text()='jakata']//span[@class='radio-btn']")
	WebElement myAddress;
	
	@FindBy(id = "customPropsID")
	WebElement startShoppingBtn;
	
	@FindBy(xpath = "//p[text()='Laneige Test Concealer']//parent::div[@class='CarouselCard__StyledCardItem-sc-179472w-8 jMDdiE']"
			+ "//following-sibling::div//div[@class='CarouselCard__BottomItem-sc-179472w-4 knKCKS']//a[text()='Add to cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[@id='cart-logo']")
	WebElement goToCart;


	//	Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	//Page Actions:
		
		public String validateHomepageHeader() {
			TestUtil.scrollDown();
			return TestUtil.doGetText(pageHeader);
		}
		
		public boolean validateLogo() {
			return airasiaLogo.isDisplayed();
		}
		
		public void addItemToCart() {
			TestUtil.scrollDown();
			TestUtil.doRefresh();
			TestUtil.scrollDown();
//			TestUtil.scrollIntoView(addToCartBtn);
//			TestUtil.elementVisibility(addToCartBtn);
			TestUtil.doClick(addToCartBtn);
		}
		
		public void selectAddress() {
			TestUtil.doClick(addressBtn);
			TestUtil.doClick(myAddress);
			TestUtil.scrollIntoView(startShoppingBtn);
			TestUtil.doClick(startShoppingBtn);
		}
		
		public AddToCartPage goToCartPage() {
			TestUtil.doClick(goToCart);
			
			return new AddToCartPage();
		}
	
		
}
