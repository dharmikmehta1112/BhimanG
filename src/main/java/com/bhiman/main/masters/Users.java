package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bhiman.main.UIKeywords;

public class Users extends UIKeywords {
	private static final Logger LOG = Logger.getLogger(Banks.class);
	
	// Page Object Locators for Users page in Masters --> ******************Initialize at runtime*****************
	
	@FindBy(xpath = "//i[@class='fa fa-database']")			 
	private static WebElement masters;	
	
	@FindBy(xpath = "//a[normalize-space(text())='Users']")			 
	private static WebElement users;	
	
	@FindBy(css = "#add_btn")			 
	private static WebElement add_users;
	
	@FindBy()
	private static WebElement action_view_icon;
	
	@FindBy()
	private static WebElement action_edit_icon;

	@FindBy()
	private static WebElement action_delete_icon;
	
	// Page Object Locators after click on AddUsers button in Users page
	@FindBy(css ="user_name")
	private static WebElement U_name;
	
	@FindBy(css ="#mobile_no")
	private static WebElement U_mobile_no;
	
	@FindBy(css ="#email")
	private static WebElement U_email;
	
	

}
