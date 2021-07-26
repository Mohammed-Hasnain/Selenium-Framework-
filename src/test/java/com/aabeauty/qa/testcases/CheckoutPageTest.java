package com.aabeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aabeauty.qa.basetest.BaseTest;

public class CheckoutPageTest extends BaseTest{
	
	public CheckoutPageTest() {
		super();
	}
	
	@Test(priority = 6 , enabled = true)
	public void verifyCheckoutPageHeaderTest() {
		try {
			homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.selectAddress();
		homePage.addItemToCart();
		homePage.goToCartPage();
		addToCartPage.clickOnContinueToPay();
		String header = checkoutPage.validatePageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Secure Checkout");
	}
	
	@Test(priority = 7 , enabled = false)
	public void purchaseAnItemTest() throws Exception {
		try {
			homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.addItemToCart();
		homePage.goToCartPage();
		addToCartPage.clickOnContinueToPay();
		checkoutPage.selectCreditCardTab();
		checkoutPage.clickOnUseAnotherCard();
		checkoutPage.fillCardDetails("4444333322221111", "0830", "123", "test");
		checkoutPage.clickOnPurchaseBtn();
		Thread.sleep(4000);
	}

}
