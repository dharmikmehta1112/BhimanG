package com.bhiman.main.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;

public class Admin {
	
	public Admin(){
		PageFactory.initElements(Constants.driver, this);
	}
	
	@FindBy(name = "username")
	private static WebElement mobile_no;

	@FindBy(name = "password")
	private static WebElement pass_word;

	@FindBy(css = "button[type='submit']")
	private static WebElement login_Btn;

	@FindBy(xpath = "//button[text()='OK']")
	public static WebElement loginSignInBtn;
	
	@FindBy(xpath = "//button[text()='OK']")
	private static WebElement loginErrorInBtn;

	
	@FindBy(xpath="//div[contains(text(),'Login Successfull.')]")
	private static WebElement getSignInMessage;
	
	@FindBy(xpath="//div[contains(text(),'start with 6,7,8,9')]")
	private static WebElement getErrorInMessage;

//	----------------------Methods------------------------
	
	public void enterUsername(String mobileNo) {
		UIKeywords.clearText(mobile_no);
		UIKeywords.enterText(mobile_no, mobileNo);
	}
	
	public void enterPassword(String password) {
		UIKeywords.clearText(pass_word);
		UIKeywords.enterText(pass_word, password);
	}
	public void clickOnLoginButton() {
		UIKeywords.clickOnElement(login_Btn);
	}
	
	public void clickOnSignInOkButton() {
		UIKeywords.clickOnElement(loginSignInBtn);
	}
	
	public void clickOnErrorInOkButton() {
		UIKeywords.clickOnElement(loginErrorInBtn);
	}
	
	public String getSignInMessage() {
		 return getSignInMessage.getText();
	}

	public void RefershPage() {
		UIKeywords.refreshPage();
	}
	
	public String getErrorInMessage() {
		 return getErrorInMessage.getText();
	}

}
