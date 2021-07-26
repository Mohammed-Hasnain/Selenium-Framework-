package com.aabeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.util.TestUtil;

public class AddToCartPage extends BasePage{
	
	@FindBy(xpath="//h2[text()='Your Shopping Cart']")
	WebElement cartHeader;
	
//	@FindBy(xpath="//div[@class='SelectAddress undefined']")
//	WebElement addressDropdown;
	
	@FindBy(xpath="//div[@class='submit-btn mt-3 xs:hidden lg:flex border-none disabled-btn']//a[@id='customPropsID']")
	WebElement continueToPayBtn;
	
	@FindBy(xpath="//span[@class='MuiButton-label' and text()='-']")
	WebElement decreaseCountBtn;
	
	@FindBy(xpath="//span[@class='MuiButton-label' and text()='+']")
	WebElement increaseCountBtn;
	

	//	Initializing the Page Objects:
		public AddToCartPage() {
			PageFactory.initElements(driver, this);
		}
		
	//Page Actions:
		public String validateCartHeader() {
			return TestUtil.doGetText(cartHeader);
			
		}
		
		public void incrsItemCount() {
			TestUtil.doClick(increaseCountBtn);
		}
		
		public void clickOnContinueToPay() {
			TestUtil.scrollDown();
			TestUtil.doClick(continueToPayBtn);
		}
		
//		public void selectValueFromDropdown(String text) {
//			TestUtil.selectDropdownByText(addressDropdown,text);
//		}
}
