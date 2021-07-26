package com.aabeauty.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aabeauty.qa.basetest.BaseTest;
import com.aabeauty.qa.util.TestUtil;

public class HomePageTest extends BaseTest{
	
	public HomePageTest() {
		super();
	}
	
	@Test(priority=0 , enabled = false)
	public void validateHomePageHeaderTest() {
		String header = homePage.validateHomepageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Carl & Claire");
	}
	
	@Test(priority=1, enabled = false)
	public void verifyLogoTest() {
		boolean logo = homePage.validateLogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority=2,enabled = true)
	public void addItemToCartTest() throws Exception {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		try {
			homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.selectAddress();
		homePage.addItemToCart();
		addToCartPage = homePage.goToCartPage();
		
	}
}