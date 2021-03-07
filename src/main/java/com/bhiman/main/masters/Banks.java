package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIAlerts;
import com.bhiman.main.UIKeywords;

public class Banks extends UIKeywords {

	private static final Logger LOG = Logger.getLogger(Banks.class);

// Page Object Locators for Banks page in Masters --> Intialize at runtime

	@FindBy(xpath = "//span[text() = 'Masters']")
	private static WebElement masters;

	@FindBy(xpath = "//a[text()='Banks ']")
	private static WebElement masters_banks;

	@FindBy(css = "#add_btn")
	private static WebElement banks_addBankBtn;

	@FindBy(xpath = "//span[text()='Copy']")
	private static WebElement banks_copyBtn;
	
	@FindBy(xpath = "//h2[text()='Copy to clipboard']")
	private static WebElement banks_copyBtn_clickText;

	@FindBy(xpath = "//span[text()='Excel']")
	private static WebElement banks_excelBtn;

	@FindBy(xpath = "//span[text()='CSV']")
	private static WebElement banks_csvBtn;

	@FindBy(xpath = "//span[text()='PDF']")
	private static WebElement banks_pdfBtn;

	@FindBy(xpath = "//span[text()='Print']")
	private static WebElement banks_printBtn;

	@FindBy(xpath = "//input[@type='search']")
	private static WebElement banks_searchBox;

	@FindBy(xpath = "//td[text() = 'No matching records found']")
	private static WebElement banks_table_noRecords;

//	@FindBy(xpath = "//div[@class='dataTables_scrollBody']")
//	private static WebElement banks_scrollVerticalTableBody;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-border btn-rounded btn-xs editBtn' and @data-id = '28']")
	private static WebElement banks_action_editIcon;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-border btn-rounded btn-xs editBtn' and @data-id = '29']")
	private static WebElement banks_action_editIcon_next;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn' and @data-id = '28']")
	private static WebElement banks_action_deleteIcon;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn' and @data-id = '29']")
	private static WebElement banks_action_deleteIcon_next;

	@FindBy(xpath = "//div[@role='status']")
	private static WebElement banks_showEntries;

// Page Object Locators after click on AddBank button in Banks page

	@FindBy(xpath = "//a[text()='View Banks']")
	private static WebElement banks_viewBanksBtn;

	@FindBy(name = "bank_name")
	private static WebElement banks_addBank_bankName;

	@FindBy(id = "bank_name-error")
	private static WebElement banks_addBank_bankName_errorMsg;

	@FindBy(name = "account_name")
	private static WebElement banks_addBank_accountName;
	
	@FindBy(id = "account_name-error")
	private static WebElement banks_addBank_accountName_errorMsg;

	@FindBy(name = "account_no")
	private static WebElement banks_addBank_accountNo;

	@FindBy(name = "account_no-error")
	private static WebElement banks_addBank_accountNo_errorMsg;

	@FindBy(name = "bank_account_type")
	private static WebElement banks_addBank_bankAccountType;
	
	@FindBy(name = "bank_account_type-error")
	private static WebElement banks_addBank_bankAccountType_errorMsg;
	
	@FindBy(name = "ifsc_code")
	private static WebElement banks_addBank_ifscCode;
	
	@FindBy(id = "ifsc_code-error")
	private static WebElement banks_addBank_ifscCode_errorMsg;

	@FindBy(name = "micr_code")
	private static WebElement banks_addBank_micrCode;

	@FindBy(id = "micr_code-error")
	private static WebElement banks_addBank_micrCode_errorMsg;

	@FindBy(xpath = "//input[@value = 'Submit']")
	private static WebElement banks_addBank_submitBtn;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	private static WebElement banks_addBank_cancelBtn;

// Constructor to instantiate an instance of class and set a lazy proxy for each of the WebElement

	public Banks() {
		PageFactory.initElements(Constants.driver, this);
	}

// Page Object Methods for Banks page in Masters

	public void mouseHoverToMasters() {
		LOG.info("At Index page mouse hover to Masters");
		UIKeywords.mouseHover(masters);
	}
	
	public String getTextOfBanks() {
		LOG.info("Reading Banks text after mouse hover to Masters.");
		return UIKeywords.getText(masters_banks);
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

	public String getTextAfterClick() {
		LOG.info("Reading text after click on Copy button of Banks page");		
		return UIKeywords.getText(banks_copyBtn_clickText);
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

	public String getSwitchWindowURL() {
		LOG.info("Click to handle print window.");
		UIKeywords.switchToChildWindow();
		return UIKeywords.getPageUrl();
	}

	public void enterTextOnSearchBox(String textToEnter) {
		LOG.info("Entering text on search box of Banks page");
		UIKeywords.enterText(banks_searchBox, textToEnter);
	}

	public String getTextOFBanksDataTableForInvalidSearch() {
		LOG.info("Reading text from bank data table for invalid search of Banks page");
		return UIKeywords.getText(banks_table_noRecords);
	}

	public void clickOnEditIcon() {
		LOG.info("Click on edit icon in Action column of Banks Data Table (if not found then scroll page vertically down and perform click action) of Bank page.");
		if(UIKeywords.isElementDisplayed(banks_action_editIcon_next))
			UIKeywords.clickOnElement(banks_action_editIcon);
		else {
			UIKeywords.scrollPageVerticalDown(2000);
			UIKeywords.scrollVerticalDown(banks_action_editIcon_next);
			UIKeywords.clickOnElement(banks_action_editIcon);			
		}
	}

	public void clickOnDeleteIcon() {
		LOG.info("Click on delete icon in Action column of Banks Data Table (if not found then scroll page vertically down and perform click action) of Bank page.");
		if(UIKeywords.isElementDisplayed(banks_action_deleteIcon_next))
			UIKeywords.clickOnElement(banks_action_deleteIcon);
		else {
			UIKeywords.scrollPageVerticalDown(2000);
			UIKeywords.scrollVerticalDown(banks_action_deleteIcon_next);
			UIKeywords.clickOnElement(banks_action_deleteIcon);			
		}
	}

	public String getAlertText() {
		return UIAlerts.getTextFromAlert();
	}
	
	public void clickOnOKInAlert() {
		UIAlerts.acceptAlert();
//		UIKeywords.clickOnElement("click_ok");
	}

	public void clickOnCancelInAlert() {
		UIAlerts.acceptAlert();
	}

	public String getTextOFBanksStatusEntries() {
		LOG.info("Reading text at bottom (showing number of entries) of Banks page");
		return UIKeywords.getText(banks_showEntries);
	}

	public void clickOnViewBankButton() {
		LOG.info("Click on View Bank button of Add Bank page.");
		UIKeywords.clickOnElement(banks_viewBanksBtn);
	}

	public void enterBankName(String bankName) {
		LOG.info("Entering Bank Name text to Add Bank form");
		UIKeywords.enterText(banks_addBank_bankName, bankName);
	}
	
	public String getBankNameErrorMsg() {
		LOG.info("Reading Bank Name error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_accountName_errorMsg);
	}	

	public void enterBankAccountName(String accountName) {
		LOG.info("Entering Bank Account Name text to Add Bank form");
		UIKeywords.enterText(banks_addBank_accountName, accountName);
	}
	
	public String getBankAccountNameErrorMsg() {
		LOG.info("Reading Bank Account Name error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_accountName_errorMsg);
	}

	public void enterBankAccountNumber(String bankAccountNumber) {
		LOG.info("Entering Bank Account No. text to Add Bank form");
		UIKeywords.enterText(banks_addBank_accountNo, bankAccountNumber);
	}
	
	public String getBankAccountNumberErrorMsg() {
		LOG.info("Reading Bank Account Number error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_accountNo_errorMsg);
	}

	public void selectBankAccountType(String bankAccountType) {
		LOG.info("Selecting Bank Account Type as Savings to Add Bank form");
		UIKeywords.selectByTextFromDropdown(banks_addBank_bankAccountType, bankAccountType);
	}
	
	public String getBankAccountTypeErrorMsg() {
		LOG.info("Reading Bank AccountType error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_bankAccountType_errorMsg);
	}

	public void enterBankIFSCCode(String bankIFSCCode) {
		LOG.info("Entering Bank IFSC Code to Add Bank form");
		UIKeywords.enterText(banks_addBank_ifscCode, bankIFSCCode);
	}
	
	public String getBankIFSCCodeErrorMsg() {
		LOG.info("Reading Bank IFSC Code error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_ifscCode_errorMsg);
	}

	public void enterBankMICRCode(String bankMICRCode) {
		LOG.info("Entering Bank MICR Code to Add Bank form");
		UIKeywords.enterText(banks_addBank_micrCode, bankMICRCode);
	}
	
	public String getBankMICRCodeErrorMsg() {
		LOG.info("Reading Bank MICR Code error text msg on Add Bank form");
		return UIKeywords.getText(banks_addBank_micrCode_errorMsg);
	}

	/*
	 * public void fillAddBankForm() {
	 * LOG.info("Adding values to Add Bank form");
	 * UIKeywords.enterText(banks_addBank_bankName, "Axis");
	 * UIKeywords.enterText(banks_addBank_accountName, "DM");
	 * UIKeywords.enterText(banks_addBank_accountNo, "257825708953");
	 * UIKeywords.enterText(banks_addBank_bankAccountType, "Saving");
	 * UIKeywords.enterText(banks_addBank_ifscCode, "257825708953");
	 * UIKeywords.enterText(banks_addBank_micrCode, "257825708953");
	 * LOG.info("Values added to Add Bank form"); }
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