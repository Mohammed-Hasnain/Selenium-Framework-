package com.aabeauty.qa.testcases;

import org.testng.annotations.Test;

import com.aabeauty.qa.basetest.BaseTest;

public class ConfirmationPageTest extends BaseTest{

	public ConfirmationPageTest() {
		super();
	}
	
	@Test(priority = 9 , enabled = true)
	public void validateOrderSuccessStatus() {
		try {
			homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.selectAddress();
		homePage.addItemToCart();
		addToCartPage = homePage.goToCartPage();
		addToCartPage.clickOnContinueToPay();
		checkoutPage.selectCreditCardTab();
		checkoutPage.clickOnUseAnotherCard();
		checkoutPage.fillCardDetails("4444333322221111", "0730", "123", "test");
		checkoutPage.clickOnPurchaseBtn();
		confirmationPage.verifyPageImage();
		confirmationPage.verifyOrderSuccessStatus();
	}
}
