package com.aabeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.util.TestUtil;

public class LoginPage extends BasePage{
	
	
	//PageFactory - OR(Object Repository):
	@FindBy(xpath = "//div[@id='login']")
	WebElement loginIcon;
	
	@FindBy(id="text-input--login")
	WebElement email;
	
	@FindBy(id="password-input--login")
	WebElement pwd;
	
	@FindBy(id="loginbutton")
	WebElement loginBtn;
	
	@FindBy(xpath = "//a[@id='forgotPasswordLink']")
	WebElement forgotPwd;
	
	@FindBy(xpath = "//div[@id='aaw-signup']")
	WebElement signupBtn;
	
	@FindBy(xpath = "//a[@id='facebookLoginButton']")
	WebElement fbLoginBtn;
	
	@FindBy(xpath = "//a[@id='googleLoginButton']")
	WebElement googleLoginBtn;
	
	@FindBy(xpath = "//a[@id='wechatLoginButton']")
	WebElement wechatLoginBtn;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Page Actions:
	public HomePage login(String username ,String password) throws Exception{
		TestUtil.doClick(loginIcon);
		TestUtil.doClear(email);
		TestUtil.doSendkeys(email, username);
		TestUtil.doClear(pwd);
		TestUtil.doSendkeys(pwd, password);;
		TestUtil.doClick(loginBtn);
		
		return new HomePage();
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	

}
