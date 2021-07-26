package com.aabeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aabeauty.qa.basetest.BaseTest;

public class AddToCartPageTest extends BaseTest{
	
	public AddToCartPageTest() {
		super();
	}
	
	@Test
	public void verifyCartHeaderTest() {
		try {
			homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.selectAddress();
		homePage.addItemToCart();
		addToCartPage = homePage.goToCartPage();
		String header = addToCartPage.validateCartHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Your Shopping Cart");
	}

}
