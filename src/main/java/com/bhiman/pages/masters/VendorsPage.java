package com.bhiman.pages.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIAlerts;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.pages.adminlogin.AdminLoginPage;

public class VendorsPage {
	
	// Constructor to instantiate an instance of class and set a lazy proxy for each of the WebElement

			public VendorsPage() {
				PageFactory.initElements(Constants.driver, this);
			}
	private static final Logger LOG = Logger.getLogger(VendorsPage.class);
	
	// Page Object Locators for Vendors page in Masters --> initialization at runtime
		
		@FindBy(xpath = "//span[text() = 'Masters']")
		private static WebElement masters;

		@FindBy(xpath = "//a[text()='Vendors']")
		private static WebElement mastersVendors;

		@FindBy(css = "#add_btn")
		private static WebElement vendorsAddVendorBtn;

		@FindBy(xpath = "//span[text()='Copy']")
		private static WebElement vendorsCopyBtn;
		
		@FindBy(xpath = "//h2[text()='Copy to clipboard']")
		private static WebElement vendorsCopyBtn_afterClickText;

		@FindBy(xpath = "//span[text()='Excel']")
		private static WebElement vendorsExcelBtn;

		@FindBy(xpath = "//span[text()='CSV']")
		private static WebElement vendorsCSVBtn;

		@FindBy(xpath = "//span[text()='PDF']")
		private static WebElement vendorsPDFBtn;

		@FindBy(xpath = "//span[text()='Print']")
		private static WebElement vendorsPrintBtn;

		@FindBy(xpath = "//input[@type='search']")
		private static WebElement vendorsSearchBox;
		
		@FindBy(xpath = "//div[@role='status']")
		private static WebElement vendorsShowEntries;

		@FindBy(xpath = "//td[text() = 'No matching records found']")
		private static WebElement vendorsTableNoRecords;

		@FindBy(xpath = "//div[@class='dataTables_scrollBody']")
		private static WebElement vendorsScrollVerticalTableBody;

		@FindBy(xpath = "//button[@class='btn btn-primary btn-border btn-rounded btn-xs editBtn' and @data-id = '1']")
		private static WebElement vendorsEdit_Icon;

		@FindBy(xpath = "//button[@class='btn btn-danger btn-border btn-rounded btn-xs deleteBtn' and @data-id = '1']")
		private static WebElement vendorsActionDelete_Icon;

		
	// Page Object Locators after click on Add Vendor button in Vendors page

		@FindBy(xpath = "//a[text()='View Vendor']")
		private static WebElement vendorsViewVendorsBtn;

		@FindBy(xpath = "//input[@id='name']")
		private static WebElement vendorsVendorName;

		@FindBy(xpath = "//input[@id='mobile_no']")
		private static WebElement vendorsMobile_no;

		@FindBy(name = "email")
		private static WebElement vendorsEmail_id;

		@FindBy(xpath = "//input[@value = 'Submit']")
		private static WebElement vendorsSubmitBtn;

		@FindBy(xpath = "//input[@value = 'Cancel']")
		private static WebElement vendorsCancelBtn;

	
     
	// Page Object Methods for Vendors page in Masters
		
		AdminLoginPage alp=new AdminLoginPage();

		public void mouseHoverToMasters() {
			alp.login();
			LOG.info("Master->Vendors: Mouse Hover to Masters");
			UIKeywords.mouseHover(masters);
		}
		
		public String getTextOfVendors() {
			LOG.info("Master->Vendors: Verify Vendors text after mouse hover to Masters.");
			return UIKeywords.getText(mastersVendors);
		}

		public void clickOnVendors() {
			LOG.info("Master->Vendors: Clicking on Vendors option in Masters");
			UIKeywords.clickOnElement(mastersVendors);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnAddVendorButton() {
			LOG.info("Master->Vendors: Click on Add Vendor button of Vendors page");
			UIKeywords.clickOnElement(vendorsAddVendorBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnCopyButtonOnVendorsPage() {
			LOG.info("Master->Vendors: Click on Copy button of Vendors page");
			UIKeywords.clickOnElement(vendorsCopyBtn);
			//WaitsInHelp.threadSleepInMilliSeconds(2000);
		}
		
		public String getTextAfterClick() {
			LOG.info("Master->Vendors: Reading text after click on Copy button of Vendors page");
			//WaitsInHelp.threadSleepInMilliSeconds(2000);
			return UIKeywords.getText(vendorsCopyBtn_afterClickText);
			
		}

		public void clickOnExcelButtonOnVendorsPage() {
			LOG.info("Master->Vendors: Click on Excel button of Vendors page");
			UIKeywords.clickOnElement(vendorsExcelBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnCSVButtonOnVendorsPage() {
			LOG.info("Master->Vendors: Click on CSV button of Vendors page");
			UIKeywords.clickOnElement(vendorsCSVBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnPDFButtonOnVendorsPage() {
			LOG.info("Master->Vendors: Click on PDF button of Vendors page");
			UIKeywords.clickOnElement(vendorsPDFBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnPrintButtonOnVendorsPage() {
			LOG.info("Master->Vendors: Click on Print button of Vendors page");
			UIKeywords.clickOnElement(vendorsPrintBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public String getSwitchWindowURL() {
			LOG.info("Master->Vendors: Click to handle print window.");
			UIKeywords.switchToChildWindow();
			WaitsInHelp.threadSleepInMilliSeconds(1000);
			return UIKeywords.getPageUrl();
		}

		public void enterTextOnSearchBox(String enterText) {
			LOG.info("Master->Vendors: Entering text on search box of Vendors page");
			UIKeywords.enterText(vendorsSearchBox, enterText);
		}

		public String getTextOFVendorsDataTableForInvalidSearch() {
			LOG.info("Master->Vendors: Reading text from Vendor data table for invalid search of Vendors page");
			return UIKeywords.getText(vendorsTableNoRecords);
		}

		public void clickOnVendorsEditIcon() {
			LOG.info("Master->Vendors: Scroll vertically down and click on edit icon in Action column of Vendor Data Table of Vendors page.");
			if(UIKeywords.isElementDisplayed(vendorsEdit_Icon))
				UIKeywords.clickOnElement(vendorsEdit_Icon);
			else {
				UIKeywords.scrollVerticalDown(vendorsScrollVerticalTableBody);
				UIKeywords.scrollPageVerticalDown(1500);
				UIKeywords.clickOnElement(vendorsEdit_Icon);			
			}
		}

		public void clickOnVendorsDeleteIcon() {
			LOG.info("Master->Vendors: Scroll vertically down and click on delete icon in Action column of Vendor Data Table of Vendors page.");
			if(UIKeywords.isElementDisplayed(vendorsActionDelete_Icon))
				UIKeywords.clickOnElement(vendorsActionDelete_Icon);
			else {
				UIKeywords.scrollVerticalDown(vendorsScrollVerticalTableBody);
				UIKeywords.scrollPageVerticalDown(1500);
				UIKeywords.clickOnElement(vendorsActionDelete_Icon);			
			}
		}

		public String getAlertText() {
			return UIAlerts.getTextFromAlert();
		}
		
		public void clickOnOKInAlert() {
			UIAlerts.acceptAlert();
//			UIKeywords.clickOnElement("click_ok");
		}

		public void clickOnCancelInAlert() {
			UIAlerts.acceptAlert();
		}

		public String getTextOFVendorsStatusEntries() {
			LOG.info("Master->Vendors: Reading text at bottom (showing number of entries) of Vendors page");
			return UIKeywords.getText(vendorsShowEntries);
		}

		public void clickOnViewVendorsButton() {
			LOG.info("Master->Vendors: Click on View Vendors button of Add Vendor page.");
			UIKeywords.clickOnElement(vendorsViewVendorsBtn);
			WaitsInHelp.threadSleepInMilliSeconds(1000);
		}

		public void enterVendorName(String vendorName) {
			LOG.info("Master->Vendors: Entering Vendor Name text to Add Vendor form");
			UIKeywords.enterText(vendorsVendorName, vendorName);
		}

		
		public void fillAddVendorFormWithData() {
			UIKeywords.enterText(vendorsVendorName, "NK");
			UIKeywords.enterText(vendorsMobile_no, "7654321098");
			UIKeywords.enterText(vendorsEmail_id, "abc@xyz.com");
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}		

		public void clickOnSubmitBtn() {
			LOG.info("Master->Vendors: Click on Submit button of Add Vendor page.");
			UIKeywords.clickOnElement(vendorsSubmitBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

		public void clickOnCancelButton() {
			LOG.info("Master->Vendors: Click on Cancel button of Add Vendor page.");
			UIKeywords.clickOnElement(vendorsCancelBtn);
			WaitsInHelp.threadSleepInMilliSeconds(2000);
		}

}
