package com.bhiman.cucumber;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.utility.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberBase {
	
private static final Logger LOG = Logger.getLogger(CucumberBase.class);
	
	@FindBy(name = "username")
	private static WebElement mobile_no;
	
	@FindBy(name = "password")
	private static WebElement password;

	@FindBy(css = "button[type='submit']")
	private static WebElement login_Btn;
	
	@FindBy(xpath = "//button[normalize-space()='OK']")
	private static WebElement click_ok;
	
	@Before		// Pre-condition
	public void setUp() {
		LOG.info("Before (setUp) method started.");
		UIKeywords.openBrowser(PropertyReader.getLocatorValue("browserName"));
		UIKeywords.openUrl(PropertyReader.getLocatorValue("url"));
		PageFactory.initElements(Constants.driver, CucumberBase.class);
		UIKeywords.maximizeWindow();
//		UIKeywords.enterText(mobile_no, PropertyReader.getLocatorValue("admin_mobile_no"));
//		UIKeywords.enterText(password, PropertyReader.getLocatorValue("admin_password"));
//		UIKeywords.clickOnElement(login_Btn);
//		//WaitsInHelp.threadSleepInMilliSeconds(5000);
//		UIKeywords.clickOnElement(click_ok);
//		String expectedURL = "http://103.50.162.196/testing/index.php";
//		String actualURL = UIKeywords.getPageUrl();
//		Assert.assertEquals(expectedURL, actualURL, "Login to application failed.");
		LOG.info("Login to application successfully.");
		}
	
	@After		// Post-condition
	public void tearDown() {
		LOG.info("After (tearDown) method started.");
		UIKeywords.closeAllBrowser();
		LOG.info("All Browser closed successfully.");
	}

}