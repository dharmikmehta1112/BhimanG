package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bhiman.main.UIKeywords;

public class Banks extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(Banks.class);
	
// Page Object Locators for Banks page in Masters --> Intialize at runtime
	
	@FindBy(xpath = "//span[text()='Dashboard")			 
	private static WebElement masters;		
	
	@FindBy(xpath = "a[text()='Banks ']")
	private static WebElement banks;
	
	@FindBy(css="#add_btn")
	private static WebElement add_bank;

	@FindBy(xpath="//span[text()='Copy']")
	private static WebElement copy;
	
	@FindBy(xpath="//span[text()='Excel']")
	private static WebElement excel;
	
	@FindBy(xpath="//span[text()='CSV']")
	private static WebElement csv;
	
	@FindBy(xpath="//span[text()='PDF'")
	private static WebElement pdf;
	
	@FindBy(xpath="//span[text()='Print']")
	private static WebElement print;
	
	@FindBy(xpath="//input[@type='search']")
	private static WebElement searchbox;

	@FindBy()
	private static WebElement action_edit_icon;

	@FindBy()
	private static WebElement action_delete_icon;

// Page Object Locators after click on AddBank button in Banks page
	
	@FindBy(xpath="//a[text()='View Banks']")
	private static WebElement view_banks;
	
	@FindBy(name="bank_name")
	private static WebElement bank_name;

	@FindBy(name="account_name")
	private static WebElement account_name;
	
	@FindBy(name="account_no")
	private static WebElement account_no;

	@FindBy(name="bank_account_type")
	private static WebElement bank_account_type;

	@FindBy(name="ifsc_code")
	private static WebElement ifsc_code;
	
	@FindBy(name="micr_code")
	private static WebElement micr_code;

	@FindBy(xpath="//input[@value = 'Submit']")
	private static WebElement submit;
	
	@FindBy(xpath="//input[@value = 'Cancel']")
	private static WebElement cancel;

// Page Object Methods for Banks page in Masters
	
	public static void mouseHoverToMasters() {
		LOG.info("Mouse Hover to Masters");
		UIKeywords.mouseHover(masters);
	}
	
	public static void clickOnBanks() {
		LOG.info("Click on Banks option under Masters");
		UIKeywords.clickOnElement(banks);
	}
	
	public static void clickOnAddBank() {
		LOG.info("Click on Add Bank button of Banks page");
		UIKeywords.clickOnElement(add_bank);
	}
	
	public static void clickOnViewBank() {
		LOG.info("Click on View Bank button of Add Bank page.");
		UIKeywords.clickOnElement(view_banks);
	}
	
	public static void clickOnSubmit() {
		LOG.info("Click on Submit button of Add Bank page.");
		UIKeywords.clickOnElement(submit);
	}
	
	public static void fillBankForm() {
		LOG.info("Adding values to Add Bank form");
		UIKeywords.enterText(bank_name, "Axis");
		UIKeywords.enterText(account_name, "DM");
		UIKeywords.enterText(account_no, "257825708953");
		UIKeywords.enterText(bank_account_type, "257825708953");
		UIKeywords.enterText(ifsc_code, "257825708953");
		UIKeywords.enterText(micr_code, "257825708953");
		LOG.info("Values added to Add Bank form");
	}
	
	public static void clickOnCancel() {
		LOG.info("Click on Cancel button of Add Bank page.");
		UIKeywords.clickOnElement(cancel);
	}
}