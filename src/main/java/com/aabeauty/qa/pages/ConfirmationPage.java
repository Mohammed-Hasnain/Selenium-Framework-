package com.aabeauty.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aabeauty.qa.base.BasePage;
import com.aabeauty.qa.util.TestUtil;

public class ConfirmationPage extends BasePage{
	
	@FindBy(id="customPropsID")
	WebElement backToHomeBtn;
	
	@FindBy(xpath = "//div[@class='order-number']//p[text()='Order number']")
	WebElement orderNumberTxt;
	
	@FindBy(xpath="//div[@class='Status--order--wrap']//h2[@class='text-green']")
	WebElement orderInProgressHeader;
	
	@FindBy(xpath="//img[@class='img-confirmed']")
	WebElement image;
	
	@FindBy(xpath="//div[@class='Status--order--wrap']//h2[text()='Your order is confirmed']")
	WebElement orderSuccessHeader;
	
	//Page Actions:
	public boolean verifyPageImage() {
		return image.isDisplayed();
	}
	
	public void verifyOrderSuccessStatus() {
		TestUtil.doGetText(orderSuccessHeader);
	}
	
	public void verifyOrderInProgressStatus() {
		TestUtil.doGetText(orderInProgressHeader);
	}

}
