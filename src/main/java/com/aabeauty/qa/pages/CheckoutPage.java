package com.aabeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.util.TestUtil;

public class CheckoutPage extends BasePage{
	
	@FindBy(xpath = "//div[text()=' Secure Checkout ']")
	WebElement checkOutPageHeader;
	
	@FindBy(xpath ="//span[text()='Credit/Debit card ']")
	WebElement creditRdebitTab;
	
	@FindBy(xpath ="//div[@id='mat-tab-label-1-1']")
	WebElement onlineBankingTab;
	
	@FindBy(xpath ="//div[@id='mat-tab-label-1-2']")
	WebElement unionPayTab;
	
	@FindBy(xpath = "//div[text()=' Use another card']//preceding-sibling::div[@class='mat-radio-container']")
	WebElement  useAnotherCardBtn;
	
	@FindBy(xpath ="//div[@id='mat-tab-label-1-1']")
	WebElement virtualAccountTab;
	
	@FindBy(xpath ="//div[@id='mat-tab-label-1-2']")
	WebElement walletTab;
	
	@FindBy(xpath="//div[@class='mat-form-field-outline ng-tns-c54-7 ng-star-inserted']")
	WebElement cardNumberField;
	
	@FindBy(xpath="//div[@class='mat-form-field-outline ng-tns-c54-8 ng-star-inserted']")
	WebElement expiryDateField;
	

	@FindBy(xpath="//div[@class='mat-form-field-outline ng-tns-c54-9 ng-star-inserted']")
	WebElement cvvField;
	

	@FindBy(xpath="//div[@class='mat-form-field-outline ng-tns-c54-10 ng-star-inserted']")
	WebElement cardNameField;
	
	@FindBy(xpath="//span[@class='ng-star-inserted' and text()=' Purchase ']")
	WebElement purchaseBtn;
	
	//Page Actions:
	public String validatePageHeader() {
		return TestUtil.doGetText(checkOutPageHeader);
		
	}
	
	public void selectCreditCardTab() {
		TestUtil.doClick(creditRdebitTab);
	}
	
	public void selectDebitCardTab() {
		TestUtil.doClick(creditRdebitTab);
	}
	
	public void selectOnlineBankingTab() {
		TestUtil.doClick(onlineBankingTab);
	}
	
	public void selectUnionPayTab() {
		TestUtil.doClick(unionPayTab);
	}
	
	public void selectVirtualAccountTab() {
		TestUtil.doClick(virtualAccountTab);
	}
	
	public void selectWalletTab() {
		TestUtil.doClick(walletTab);
	}
	
	public void clickOnUseAnotherCard() {
		TestUtil.doClick(useAnotherCardBtn);
	}
	
	public void fillCardDetails(String num,String expDate,String cvv ,String name) {
		TestUtil.doClick(cardNumberField);
		TestUtil.doSendkeys(cardNameField, num);
		TestUtil.doClick(expiryDateField);
		TestUtil.doSendkeys(expiryDateField, expDate);
		TestUtil.doClick(cvvField);
		TestUtil.doSendkeys(cvvField, cvv);
		TestUtil.doClick(cardNameField);
		TestUtil.doSendkeys(cardNameField, name);
	}
	
	public ConfirmationPage clickOnPurchaseBtn() {
		TestUtil.doClick(purchaseBtn);
		TestUtil.elementVisibility(purchaseBtn);
		TestUtil.doClick(purchaseBtn);
		TestUtil.elementVisibility(purchaseBtn);
		TestUtil.doClick(purchaseBtn);
		TestUtil.elementVisibility(purchaseBtn);
		TestUtil.doClick(purchaseBtn);
		
		return new ConfirmationPage();
	}

}
