package com.aabeauty.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aabeauty.qa.basetest.BaseTest;

public class LoginPageTest extends BaseTest{
	
	
	public LoginPageTest() {
		super();
	}
	
	
	
	@Test
	public void loginTest() throws Exception {
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyLoginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "airasia beauty - Indonesia | Skincare, Makeup, Fragrances & more");
	}
	
	
	
}
