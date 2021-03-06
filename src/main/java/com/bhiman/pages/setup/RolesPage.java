package com.bhiman.pages.setup;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;


public class RolesPage extends UIKeywords {
	private static final Logger LOG = Logger.getLogger(RolesPage.class);

	public RolesPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	// Page Object Locators for Roles page in SetUp --> Intialize at runtime

	@FindBy(xpath = "//span[text()='SetUp']")
	private static WebElement setup;

	@FindBy(css = "a[href='role.php']")
	private static WebElement roles_under_setup;

	@FindBy(css = "#add_btn")
	private static WebElement add_roleBtn;

	@FindBy(xpath = "//*[text()='Copy']")
	private static WebElement role_copyBtn;

	@FindBy(xpath = "//*[text()='Excel']")
	private static WebElement role_excelBtn;

	@FindBy(xpath = "//*[text()='CSV']")
	private static WebElement role_csvBtn;

	@FindBy(xpath = "//*[text()='PDF']")
	private static WebElement role_pdfBtn;

	@FindBy(xpath = "//*[text()='Print']")
	private static WebElement role_printBtn;

	@FindBy(css = "input[type='search']")
	private static WebElement role_searchTxtBx;

	@FindBy(xpath = " //*[@id=\"datatable3\"]/tbody/tr[1]/td[3]/button[1]/i")
	private static WebElement role_action_edit_icon;

	@FindBy(xpath = "//*[@id=\"datatable3\"]/tbody/tr[1]/td[3]/button[2]/i")
	private static WebElement role_action_delete_icon;
	
	@FindBy(xpath = "//*[@id='datatable3']/tbody/tr/td[2]")
	private static WebElement role_search_box_get_text;
	
	@FindBy(css="div[class='swal2-content']")
	private static WebElement role_deleted_text;
	
	@FindBy(css="button[class='swal2-confirm styled']")
	private static WebElement role_deleted_OkBtn;

	// Page Object Locators after click on AddRole button in Roles page

	@FindBy(css = "a#view_btn")
	private static WebElement view_roles;

	@FindBy(css = "input#role_name")
	private static WebElement role_enter_rollName;

	@FindBy(xpath = "//label[@for='dashboard']")
	private static WebElement dashboard;

	@FindBy(xpath = "//label[@for='banks']")
	private static WebElement banks;

	@FindBy(xpath = "//label[@for='users']")
	private static WebElement users;

	@FindBy(xpath = "//label[@for='branches']")
	private static WebElement branches;

	@FindBy(xpath = "//label[@for='customers']")
	private static WebElement customers;

	@FindBy(xpath = "//label[@for='brokers']")
	private static WebElement brokers;

	@FindBy(xpath = "//label[@for='vendors']")
	private static WebElement vendors;

	@FindBy(xpath = "//label[@for='enquiry']")
	private static WebElement enquiry;

	@FindBy(xpath = "//label[@for='projects']")
	private static WebElement projects;

	@FindBy(xpath = "//label[@for='sales']")
	private static WebElement sales;

	@FindBy(xpath = "//label[@for='plot_registration']")
	private static WebElement plot_registration;

	@FindBy(xpath = "//label[@for='receipts']")
	private static WebElement receipts;

	@FindBy(xpath = "//label[@for='expenses']")
	private static WebElement expenses;

	@FindBy(xpath = "//label[@for='materials']")
	private static WebElement materials;

	@FindBy(xpath = "//label[@for='pending_transactions']")
	private static WebElement pending_transactions;

	@FindBy(xpath = "//label[@for='luckydraw']")
	private static WebElement luckydraw;

	@FindBy(xpath = "//label[@for='sms']")
	private static WebElement sms;

	@FindBy(xpath = "//label[@for='ledger_report']")
	private static WebElement ledger_report;

	@FindBy(xpath = "//label[@for='customer_birthday_report']")
	private static WebElement customer_birthday_report;

	@FindBy(xpath = "//label[@for='customer_anniversary_wishin_report']")
	private static WebElement customer_anniversary_wishin_report;

	@FindBy(xpath = "//label[@for='customer_payment_status_report']")
	private static WebElement customer_payment_status_report;

	@FindBy(xpath = "//label[@for='plot_status_report']")
	private static WebElement plot_status_report;

	@FindBy(xpath = "//label[@for='income_plot_transaction_report']")
	private static WebElement income_plot_transaction_report;

	@FindBy(xpath = "//label[@for='expense_report']")
	private static WebElement expense_report;

	@FindBy(xpath = "//label[@for='transaction_report']")
	private static WebElement transaction_report;

	@FindBy(xpath = "//label[@for='log_report']")
	private static WebElement log_report;

	@FindBy(xpath = "//label[@for='roles']")
	private static WebElement roles;

	@FindBy(xpath = "//input[@id='swal2-checkbox']")
	private static WebElement extra;

	@FindBy(css = "input[value='Submit']")
	public static WebElement role_submit_1;

	@FindBy(name = "role_add")
	private static WebElement role_cancel;
	
	@FindBy(css="div[class='swal2-content']")
	private static WebElement role_added_text;
	
	@FindBy(css="div[class='swal2-content']")
	private static WebElement role_updated_text;
	
	@FindBy(css="button[class='swal2-confirm styled']")
	private static WebElement role_updated_OkBtn;

	// Page Object Methods for Roles page in Setup

	public void mouseHoverToSetUp() {
		UIKeywords.clickOnElement(setup);
		//WaitsInHelp.threadSleepInMilliSeconds(1000);
		LOG.info("Mouse Hover to SetUp");
	}

	public void clickOnRolesUnderSetup() {
		LOG.info("Click on Roles under SetUp");
		UIKeywords.clickOnElement(roles_under_setup);
	}
	
	public String getRolesText() {
		return UIKeywords.getText(roles_under_setup);
	}

	public void clickOnAddRole() {
		LOG.info("Click on Add Role on Roles Page");
		UIKeywords.clickOnElement(add_roleBtn);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}

	public void clickOnViewRole() {
		LOG.info("Click on View Role on Add Roles Page");
		UIKeywords.clickOnElement(view_roles);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}

	public void enterRoleInRoleName(String roleName) {
		LOG.info("Enter the new Role in Role Name");
		UIKeywords.clearText(role_enter_rollName);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
		UIKeywords.enterText(role_enter_rollName, roleName);
	}
	
	public void scrollPageOperation() throws InterruptedException {

		String javaScript = "window.scrollBy(0,1600);";
		JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
		js.executeScript(javaScript);

		// JavascriptExecutor jse = (JavascriptExecutor)Constants.driver;
		// jse.executeScript("agruments[0].scrollIntoView();", role_submit_1);

	}

	public void permissions() throws InterruptedException {
		LOG.info("Set all permissions for Admin");

		List<WebElement> els = Constants.driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement el : els) {
			if (el.equals(extra)) {
				break;
			} else {
				if (!el.isSelected()) {
					el.click();
				}
			}
		}
	}

	public void clickOnSubmitInRoles() {
		LOG.info("Click on Submit on Add Roles Page");
		clickOnElement(role_submit_1);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}

	public void clickOnCancleInRoles() {
		LOG.info("Click on Cancle on Add Roles Page");
		UIKeywords.clickOnElement(role_cancel);
	}

	public void clickOnCopyInRoles() {
		LOG.info("Click on copy button on Roles page");
		UIKeywords.clickOnElement(role_copyBtn);
	}

	public void clickOnExcelInRoles() {
		LOG.info("Click on Excel button on Roles page");
		UIKeywords.clickOnElement(role_excelBtn);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}

	public void clickOnCSVInRoles() {
		LOG.info("Click on CSV button on Roles page");
		UIKeywords.clickOnElement(role_csvBtn);
	}

	public void clickOnPDFInRoles() {
		LOG.info("Click on PDF button on Roles page");
		UIKeywords.clickOnElement(role_pdfBtn);
	}

	public void clickOnPrintInRoles() {
		LOG.info("Click on Print button on Roles page");
		UIKeywords.clickOnElement(role_printBtn);
	}
	
	public String getSwitchWindowURL() {
		LOG.info("Click to handle print window.");
		UIKeywords.switchToChildWindow();
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		return UIKeywords.getPageUrl();
	}

	public void enterRoleInSearchBoxInRole(String searchRoleName) {
		LOG.info("Enter the input in search box on Role page");
		UIKeywords.enterText(role_searchTxtBx, searchRoleName);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	}

	public void clickOnEditIconInRole() {
		LOG.info("Editing the existing role");
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		UIKeywords.clickOnElement(role_action_edit_icon);
	}

	public void clickOnDeleteIconInRole() {
		LOG.info("Deleting the existing role");
		UIKeywords.clickOnElement(role_action_delete_icon);
	}
	
	public void clickOnAddRoleNameTextBox() {
		LOG.info("Editing role");
		UIKeywords.clickOnElement(role_enter_rollName);
		WaitsInHelp.threadSleepInMilliSeconds(1000);
	} 
		
	public String getTextFromTable() {
		LOG.info("Getting related text as per input provided in search box");
		return UIKeywords.getText(role_search_box_get_text);
	}
	
	public String getRoleAddedText() {
		LOG.info("Geting Text after adding Role");
		return UIKeywords.getText(role_added_text);
	}
	
	public void clickOnRoleAddedOkButton() {
		LOG.info("Clicking on OK Button");
		UIKeywords.clickOnElement(role_updated_OkBtn);
	}
	
	public String getRoleUpdatedText() {
		LOG.info("Geting Text after editing Role");
		return UIKeywords.getText(role_updated_text);
	}
	
	public void clickOnRoleUpdatedOkButton() {
		LOG.info("Clicking on OK Button");
		UIKeywords.clickOnElement(role_updated_OkBtn);
	}
	
	public String getRoleDeletedText() {
		LOG.info("Geting Text after Deleting Role");
		return UIKeywords.getText(role_deleted_text);
	}
	
	public void clickOnRoleDeleteOkButton() {
		LOG.info("Clicking on OK Button");
		UIKeywords.clickOnElement(role_deleted_OkBtn);

	}
}
