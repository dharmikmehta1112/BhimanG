package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIAlerts;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.WaitsInHelp;

public class Branches {
	
	private static final Logger LOG = Logger.getLogger(Branches.class);
	
// Page Object Locators for Banks page in Masters --> Intialize at runtime
	
	@FindBy(xpath = "//span[text() = 'Masters']")
	private static WebElement masters;

	@FindBy(xpath = "//a[text()='Branches ']")
	private static WebElement masters_branches;

	@FindBy(css = "#add_btn")
	private static WebElement branches_addBranchBtn;

	@FindBy(xpath = "//span[text()='Copy']")
	private static WebElement branches_copyBtn;
	
	@FindBy(xpath = "//h2[text()='Copy to clipboard']")
	private static WebElement branches_copyBtn_clickText;

	@FindBy(xpath = "//span[text()='Excel']")
	private static WebElement branches_excelBtn;

	@FindBy(xpath = "//span[text()='CSV']")
	private static WebElement branches_csvBtn;

	@FindBy(xpath = "//span[text()='PDF']")
	private static WebElement branches_pdfBtn;

	@FindBy(xpath = "//span[text()='Print']")
	private static WebElement branches_printBtn;

	@FindBy(xpath = "//input[@type='search']")
	private static WebElement branches_searchBox;

	@FindBy(xpath = "//td[text() = 'No matching records found']")
	private static WebElement branches_table_noRecords;

	@FindBy(xpath = "//div[@class='dataTables_scrollBody']")
	private static WebElement branches_scrollVerticalTableBody;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-border btn-rounded btn-xs editBtn' and @data-id = '68']")
	private static WebElement branches_action_editIcon;

	@FindBy(xpath = "//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn' and @data-id = '68']")
	private static WebElement branches_action_deleteIcon;

	@FindBy(xpath = "//div[@role='status']")
	private static WebElement branches_showEntries;

// Page Object Locators after click on AddBranch button in Branches page

	@FindBy(xpath = "//a[text()='View Branches']")
	private static WebElement branches_viewBranchesBtn;

	@FindBy(name = "branch_name")
	private static WebElement branches_addBranch_branchName;

	@FindBy(name = " ")
	private static WebElement branches_addBranch_address;

	@FindBy(name = " ")
	private static WebElement branches_addBranch_city;

	@FindBy(name = " ")
	private static WebElement branches_addBranch_contactNumber;

	@FindBy(name = " ")
	private static WebElement branches_addBranch_altContactNumber;

	@FindBy(name = " ")
	private static WebElement branches_addBranch_emailId;

	@FindBy(xpath = "//input[@value = 'Submit']")
	private static WebElement branches_addBranch_submitBtn;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	private static WebElement branches_addBranch_cancelBtn;

// Constructor to instantiate an instance of class and set a lazy proxy for each of the WebElement

	public Branches() {
		PageFactory.initElements(Constants.driver, this);
	}

// Page Object Methods for Banks page in Masters

	public void mouseHoverToMasters() {
		LOG.info("At Index page mouse hover to Masters");
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		UIKeywords.mouseHover(masters);
	}
	
	public String getTextOfBranches() {
		LOG.info("Reading Branches text after mouse hover to Masters.");
		return UIKeywords.getText(masters_branches);
	}

	public void clickOnBranches() {
		LOG.info("Clicking on Branches option in Masters");
		UIKeywords.clickOnElement(masters_branches);
	}

	public void clickOnAddBranchButton() {
		LOG.info("Click on Add Bank button of Branches page");
		UIKeywords.clickOnElement(branches_addBranchBtn);
	}

	public void clickOnCopyButton() {
		LOG.info("Click on Copy button of Branches page");
		UIKeywords.clickOnElement(branches_copyBtn);
	}
	
	public String getTextAfterClick() {
		LOG.info("Reading text after click on Copy button of Branches page");		
		return UIKeywords.getText(branches_copyBtn_clickText);
	}

	public void clickOnExcelButton() {
		LOG.info("Click on Excel button of Branches page");
		UIKeywords.clickOnElement(branches_excelBtn);
		WaitsInHelp.threadSleepInMilliSeconds(2000);
	}

	public void clickOnCSVButton() {
		LOG.info("Click on CSV button of Branches page");
		UIKeywords.clickOnElement(branches_csvBtn);
		WaitsInHelp.threadSleepInMilliSeconds(2000);
	}

	public void clickOnPDFButton() {
		LOG.info("Click on PDF button of Branches page");
		UIKeywords.clickOnElement(branches_pdfBtn);
		WaitsInHelp.threadSleepInMilliSeconds(2000);
	}

	public void clickOnPrintButton() {
		LOG.info("Click on Print button of Branches page");
		UIKeywords.clickOnElement(branches_printBtn);
	}

	public String getSwitchWindowURL() {
		LOG.info("Click to handle print window.");
		UIKeywords.switchToChildWindow();
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		return UIKeywords.getPageUrl();
	}

	public void enterTextOnSearchBox(String textToEnter) {
		LOG.info("Entering text on search box of Branches page");
		UIKeywords.enterText(branches_searchBox, textToEnter);
	}

	public String getTextOFBranchesDataTableForInvalidSearch() {
		LOG.info("Reading text from bank data table for invalid search of Branches page");
		return UIKeywords.getText(branches_table_noRecords);
	}

	public void clickOnEditIcon() {
		LOG.info("Scroll vertically down and click on edit icon in Action column of Branch Data Table of Branches page.");
		UIKeywords.scrollVerticalDown(branches_scrollVerticalTableBody);
		UIKeywords.clickOnElement(branches_action_editIcon);
	}

	public void clickOnDeleteIcon() {
		LOG.info("Scroll vertically down and click on delete icon in Action column of Branch Data Table of Branches page.");
		UIKeywords.scrollVerticalDown(branches_scrollVerticalTableBody);
		UIKeywords.clickOnElement(branches_action_deleteIcon);
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

	public String getTextOFBranchesStatusEntries() {
		LOG.info("Reading text at bottom (showing number of entries) of Branches page");
		return UIKeywords.getText(branches_showEntries);
	}

	public void clickOnViewBranchesButton() {
		LOG.info("Click on View Branches button of Add Branch page.");
		UIKeywords.clickOnElement(branches_viewBranchesBtn);
	}

	public void enterBranchName(String branchName) {
		LOG.info("Entering Branch Name text to Add Branch form");
		UIKeywords.enterText(branches_addBranch_branchName, branchName);
	}

	public void enterBankAccountName(String address) {
		LOG.info("Entering Branch Address text to Add Branch form");
		UIKeywords.enterText(branches_addBranch_address, address);
	}

	public void enterBankAccountNumber(String city) {
		LOG.info("Entering Branch City text to Add Branch form");
		UIKeywords.enterText(branches_addBranch_city, city);
	}

	public void selectBankAccountType(String contactNumber) {
		LOG.info("Entering Contact No. text to Add Branch form");
		UIKeywords.selectByTextFromDropdown(branches_addBranch_contactNumber, contactNumber);
	}

	public void enterBankIFSCCode(String alternateContactNumber) {
		LOG.info("Entering Alternate Contact No. to Add Branch form");
		UIKeywords.enterText(branches_addBranch_altContactNumber, alternateContactNumber);
	}

	public void enterBankMICRCode(String emailId) {
		LOG.info("Entering Email Id to Add Branch form");
		UIKeywords.enterText(branches_addBranch_emailId, emailId);
	}

	/*
	 * public void fillAddBranchForm() {
	 * LOG.info("Adding values to Add Branch form");
	 * 
	 * 
	 * 
	 * LOG.info("Values added to Add Branch form"); }
	 */

	public void clickOnSubmitButton() {
		LOG.info("Click on Submit button of Add Branch page.");
		UIKeywords.clickOnElement(branches_addBranch_submitBtn);
	}

	public void clickOnCancelButton() {
		LOG.info("Click on Cancel button of Add Branch page.");
		UIKeywords.clickOnElement(branches_addBranch_cancelBtn);
	}
	
}