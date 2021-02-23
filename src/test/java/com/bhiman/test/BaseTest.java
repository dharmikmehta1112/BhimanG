package com.bhiman.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.utility.PropertyReader;

/**
 * Contains setup {@BeforeMethod} and tearDown {@AfterMethod} annotated methods compulsorily required 
 * to run before & after every @Test annotated Test cases.
 */

public class BaseTest extends UIKeywords {
	
	@FindBy(name = "username")
	private static WebElement mobile_no;
	
	@FindBy(name = "password")
	private static WebElement password;

	@FindBy(css = "button[type='submit']")
	private static WebElement login_Btn;
	
	BaseTest test = PageFactory.initElements(Constants.driver, BaseTest.class);
	
	@BeforeMethod
	public void setUp() {
		UIKeywords.openBrowser(PropertyReader.getLocatorValue("browserName"));
		UIKeywords.openUrl(PropertyReader.getLocatorValue("url"));
		UIKeywords.enterText(mobile_no, PropertyReader.getLocatorValue("admin_mobile_no"));
		UIKeywords.enterText(password, PropertyReader.getLocatorValue("admin_password"));
		UIKeywords.clickOnElement(login_Btn);	
		}
	
	@AfterMethod
	public void tearDown() {
		UIKeywords.closeAllBrowser();
	}
}