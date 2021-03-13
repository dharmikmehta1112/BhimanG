package com.bhiman.pages.adminlogin;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.utility.PropertyReader;

public class AdminLoginPage extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(AdminLoginPage.class);
	
	public AdminLoginPage(){
		PageFactory.initElements(Constants.driver, this);
	}
	
	@FindBy(name = "username")
	private static WebElement mobile_no;

	@FindBy(name = "password")
	private static WebElement pass_word;

	@FindBy(css = "button[type='submit']")
	private static WebElement login_Btn;
	
	
	
//	----------------------Methods------------------------
	
	public void login() {
		enterUsername();
		enterPassword();
		clickOnLoginButton();
	}
	
	public void enterUsername() {
		UIKeywords.enterText(mobile_no, PropertyReader.getLocatorValue("admin_mobile_no"));
	}
	
	public void enterUsername(String mobileNo) {
		UIKeywords.enterText(mobile_no, mobileNo);
	}
	
	public void enterPassword() {
		UIKeywords.enterText(pass_word, PropertyReader.getLocatorValue("admin_password"));
	}
	
	public void enterPassword(String password) {
		UIKeywords.enterText(pass_word, password);
	}
	
	public void clickOnLoginButton() {
		try {
			UIKeywords.captureScreenshot(login_Btn, "LoginButton");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UIKeywords.clickOnElement(login_Btn);
	}
		
	public void refreshLoginPage() {
		UIKeywords.refreshPage();
	}
	
}