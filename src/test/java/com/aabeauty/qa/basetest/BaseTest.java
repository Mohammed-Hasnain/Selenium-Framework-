package com.aabeauty.qa.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.pages.AddToCartPage;
import com.aabeauty.qa.pages.CheckoutPage;
import com.aabeauty.qa.pages.ConfirmationPage;
import com.aabeauty.qa.pages.HomePage;
import com.aabeauty.qa.pages.LoginPage;

public class BaseTest extends BasePage{
	
	public LoginPage loginPage;
	public HomePage homePage;
	public AddToCartPage addToCartPage;
	public CheckoutPage checkoutPage;
	public ConfirmationPage confirmationPage;
	
	public BaseTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		addToCartPage= new AddToCartPage();
		checkoutPage = new CheckoutPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
