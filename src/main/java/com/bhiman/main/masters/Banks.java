package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.WaitsInHelp;

public class Banks extends UIKeywords {
	
	private static final Logger LOG = Logger.getLogger(Banks.class);
	
// Page Object Locators for Banks page in Masters --> Intialize at runtime
	
	@FindBy(xpath = "//span[@class='toggle-none' and text() = 'Masters']")			 
	private static WebElement masters;		
	
	@FindBy(xpath = "a[text()='Banks ']")
	private static WebElement masters_banks;
	
	@FindBy(css="#add_btn")
	private static WebElement banks_addBankBtn;

	@FindBy(xpath="//span[text()='Copy']")
	private static WebElement banks_copyBtn;
	
	@FindBy(xpath="//span[text()='Excel']")
	private static WebElement banks_excelBtn;
	
	@FindBy(xpath="//span[text()='CSV']")
	private static WebElement banks_csvBtn;
	
	@FindBy(xpath="//span[text()='PDF'")
	private static WebElement banks_pdfBtn;
	
	@FindBy(xpath="//span[text()='Print']")
	private static WebElement banks_printBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private static WebElement banks_searchBox;

	@FindBy()
	private static WebElement banks_action_editIcon;

	@FindBy()
	private static WebElement banks_action_deleteIcon;
	
	@FindBy(xpath = "//div[@role='status']")
	private static WebElement banks_showEntries; 

// Page Object Locators after click on AddBank button in Banks page
	
	@FindBy(xpath="//a[text()='View Banks']")
	private static WebElement banks_viewBanksBtn;
	
	@FindBy(name="bank_name")
	private static WebElement banks_addBank_bankName;

	@FindBy(name="account_name")
	private static WebElement banks_addBank_accountName;
	
	@FindBy(name="account_no")
	private static WebElement banks_addBank_accountNo;

	@FindBy(name="bank_account_type")
	private static WebElement banks_addBank_bankAccountType;

	@FindBy(name="ifsc_code")
	private static WebElement banks_addBank_ifscCode;
	
	@FindBy(name="micr_code")
	private static WebElement banks_addBank_micrCode;

	@FindBy(xpath="//input[@value = 'Submit']")
	private static WebElement banks_addBank_submitBtn;
	
	@FindBy(xpath="//input[@value = 'Cancel']")
	private static WebElement banks_addBank_cancelBtn;
	
// Page Object Methods for Banks page in Masters
	
	public void mouseHoverToMasters() {
		LOG.info("At Index page mouse hover to Masters");
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		UIKeywords.mouseHover(masters);
	}
	
	public void clickOnBanks() {
		LOG.info("Clicking on Banks option in Masters");
		UIKeywords.clickOnElement(masters_banks);
	}
	
	public void clickOnAddBankButton() {
		LOG.info("Click on Add Bank button of Banks page");
		UIKeywords.clickOnElement(banks_addBankBtn);
	}
	
	public void clickOnCopyButton() {
		LOG.info("Click on Copy button of Banks page");
		UIKeywords.clickOnElement(banks_copyBtn);
	}
	
	public void clickOnExcelButton() {
		LOG.info("Click on Excel button of Banks page");
		UIKeywords.clickOnElement(banks_excelBtn);
	}

	public void clickOnCSVButton() {
		LOG.info("Click on CSV button of Banks page");
		UIKeywords.clickOnElement(banks_csvBtn);
	}

	public void clickOnPDFButton() {
		LOG.info("Click on PDF button of Banks page");
		UIKeywords.clickOnElement(banks_pdfBtn);
	}

	public void clickOnPrintButton() {
		LOG.info("Click on Print button of Banks page");
		UIKeywords.clickOnElement(banks_printBtn);
	}
	
	public void getTextOFBanksStatusEntries() {
		LOG.info("Reading text at bottom (showing number of entries) of Banks page");
		UIKeywords.getText(banks_showEntries);
	}

	public void clickOnViewBankButton() {
		LOG.info("Click on View Bank button of Add Bank page.");
		UIKeywords.clickOnElement(banks_viewBanksBtn);
	}
	
	public void enterBankName() {
		LOG.info("Entering Bank Name text to Add Bank form");
		UIKeywords.enterText(banks_addBank_bankName, "Axis");
	}
	
	public void enterBankAccountName() {
		LOG.info("Entering Bank Account Name text to Add Bank form");
		UIKeywords.enterText(banks_addBank_accountName, "DM");
	}
	
	public void enterBankAccountNumber() {
		LOG.info("Entering Bank Account No. text to Add Bank form");
		UIKeywords.enterText(banks_addBank_accountNo, "257825708953");
	}
	
	public void selectBankAccountTypeAsSavings() {
		LOG.info("Selecting Bank Account Type as Savings to Add Bank form");
		UIKeywords.selectByTextFromDropdown(banks_addBank_bankAccountType, "Savings");
	}

	public void selectBankAccountTypeAsCurrent() {
		LOG.info("Selecting Bank Account Type as Current to Add Bank form");
		UIKeywords.selectByTextFromDropdown(banks_addBank_bankAccountType, "Current");
	}

	public void enterBankIFSCCode() {
		LOG.info("Entering Bank IFSC Code to Add Bank form");
		UIKeywords.enterText(banks_addBank_ifscCode, "257825708953");
	}

	public void enterBankMICRCode() {
		LOG.info("Entering Bank MICR Code to Add Bank form");
		UIKeywords.enterText(banks_addBank_micrCode, "257825708953");
	}

/*
	public static void fillAddBankForm() {
		LOG.info("Adding values to Add Bank form");
		UIKeywords.enterText(banks_addBank_bankName, "Axis");
		UIKeywords.enterText(banks_addBank_accountName, "DM");
		UIKeywords.enterText(banks_addBank_accountNo, "257825708953");
		UIKeywords.enterText(banks_addBank_bankAccountType, "Saving");
		UIKeywords.enterText(banks_addBank_ifscCode, "257825708953");
		UIKeywords.enterText(banks_addBank_micrCode, "257825708953");
		LOG.info("Values added to Add Bank form");
	}
*/
	
	public void clickOnSubmitButton() {
		LOG.info("Click on Submit button of Add Bank page.");
		UIKeywords.clickOnElement(banks_addBank_submitBtn);
	}
	
	public void clickOnCancelButton() {
		LOG.info("Click on Cancel button of Add Bank page.");
		UIKeywords.clickOnElement(banks_addBank_cancelBtn);
	}
}