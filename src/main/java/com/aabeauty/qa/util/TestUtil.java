package com.aabeauty.qa.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aabeauty.qa.base.BasePage;

public class TestUtil extends BasePage{
	
	public static JavascriptExecutor js;
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 40;
	public static long EXPLICIT_WAIT = 30;
	
	public static Actions action;
	public static Select select;
	
	public static void performMouseHover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void takeScreenshot(File src,File destn) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, destn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void elementToBeClicked(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,EXPLICIT_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void elementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,EXPLICIT_WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void implicitWait(WebElement element) {
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	public static void selectDropdownByText(WebElement element,String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void selectDropdownByIndex(WebElement element,int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	
//	public static void dropDownSelection(List<WebElements> element,String text) {
//		
//	}
	
	public static void doClick(WebElement element) {
		element.click();
	}
	
	public static void doRefresh() {
		driver.navigate().refresh();
	}
	
	public static void doSendkeys(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static void doClear(WebElement element) {
		element.clear();
	}
	
	public static String doGetText(WebElement element) {
		 return element.getText();
	}
	
	public static void scrollIntoView(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void scrollDown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
	}

}
