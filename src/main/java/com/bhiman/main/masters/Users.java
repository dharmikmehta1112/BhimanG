package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.WaitsInHelp;

public class Users extends UIKeywords {
	private static final Logger LOG = Logger.getLogger(Banks.class);

	// Page Object Locators for Users page in Masters ******************Initialize
	// at runtime*****************

	@FindBy(xpath = "//i[@class='fa fa-database']")
	private static WebElement mastersforuser;

	@FindBy(xpath = "//a[normalize-space(text())='Users']")
	private static WebElement users;

	@FindBy(css = "#add_btn")
	private static WebElement add_users;

	@FindBy(css = "#view_btn")
	private static WebElement view_users;
	@FindBy(xpath="//span[text()='Copy']")
	private static WebElement U_copyBtn;
	
	@FindBy(xpath="//span[text()='Excel']")
	private static WebElement U_excelBtn;
	
	@FindBy(xpath="//span[text()='CSV']")
	private static WebElement U_csvBtn;
	
	@FindBy(xpath="//span[text()='PDF'")
	private static WebElement U_pdfBtn;
	
	@FindBy(xpath="//span[text()='Print']")
	private static WebElement U_printBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private static WebElement U_searchBox;

	@FindBy()
	private static WebElement action_view_icon;

	@FindBy()
	private static WebElement action_edit_icon;

	@FindBy()
	private static WebElement action_delete_icon;

	// ******************Page Object Locators after click on AddUsers button in
	// Users page******************
	@FindBy(css = "user_name")
	private static WebElement U_name;

	@FindBy(css = "#mobile_no")
	private static WebElement U_mobile_no;

	@FindBy(css = "#email")
	private static WebElement U_email;

	@FindBy(css = "#role_id")
	private static WebElement U_role;

//	@FindBy(xpath = "//select[@id='role_id']//option[text()='admin']")
//	private static WebElement U_admin;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='Manager']")
//	private static WebElement U_Manager;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='Sales Executive 1']")
//	private static WebElement U_Sales_Executive_1;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='Supervioser']")
//	private static WebElement U_Supervioser;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='Office boy q']")
//	private static WebElement U_Office_boy_q;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='Cashier']")
//	private static WebElement U_Cashier;
//
//	@FindBy(xpath = "//select[@id='role_id']//option[text()='entry operator']")
//	private static WebElement U_entry_operator;

	@FindBy(css = "#joining_date")
	private static WebElement U_joining_date;

	@FindBy(css = "#blood_group")
	private static WebElement U_blood_group;

//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='O negative']")
//	private static WebElement U_blood_o_negative;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='O positive']")
//	private static WebElement U_blood_O_positive;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='A negative']")
//	private static WebElement U_blood_A_negative;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='A positive']")
//	private static WebElement U_blood_A_positive;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='B negative']")
//	private static WebElement U_blood_B_negative;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='B positive']")
//	private static WebElement U_blood_B_positive;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='AB positive']")
//	private static WebElement U_blood_AB_positive;
//
//	@FindBy(xpath = "//select[@id='blood_group']//option[text()='AB negative']")
//	private static WebElement U_blood_AB_negative;

	@FindBy(css = "#bank_name")
	private static WebElement U_bank_name;

	@FindBy(css = "#account_no")
	private static WebElement U_account_no;

	@FindBy(css = "#ifsc_code")
	private static WebElement U_ifsc_code;

	@FindBy(xpath = "//input[@placeholder='Upload Resume']")
	private static WebElement U_resume;

	@FindBy(xpath = "//input[@placeholder='Upload Agreement']")
	private static WebElement U_agreement;

	@FindBy(xpath = "//input[@placeholder='Upload KYC']")
	private static WebElement U_kyc;

	@FindBy(css = "#father_name")
	private static WebElement U_father_name;

	@FindBy(css = "#father_mobile_no")
	private static WebElement U_father_mobile_no;

	@FindBy(css = "#father_occupation")
	private static WebElement U_father_occupation;

	@FindBy(css = "#status")
	private static WebElement U_status;

	@FindBy(xpath = "//select[@id='status']//option[text()='Active']")
	private static WebElement U_status_active;

	@FindBy(xpath = "//select[@id='status']//option[text()='In-Active']")
	private static WebElement U_status_in_active;

	@FindBy(css = "#password")
	private static WebElement U_password;

	@FindBy(css = "#confirm_password")
	private static WebElement U_confirm_password;

	@FindBy(xpath = "//input[@value='Submit']")
	private static WebElement U_submit;

	@FindBy(xpath = "//input[@value='Cancel']")
	private static WebElement U_cancel;

	// constructor

	public Users() {
		PageFactory.initElements(Constants.driver, this);
	}
	// ***********Page Object Methods for Users page in Masters******************
	public static void clickOnUserCopyButton() {
		LOG.info("Click on Copy button of User page");
		WaitsInHelp.implicitWaitInSeconds(10);
		UIKeywords.clickOnElement(U_copyBtn);
	}
	
	public static void clickOnExcelButton() {
		LOG.info("Click on Excel button of User page");
		UIKeywords.clickOnElement(U_excelBtn);
	}

	public static void clickOnCSVButton() {
		LOG.info("Click on CSV button of User page");
		UIKeywords.clickOnElement(U_csvBtn);
	}

	public static void clickOnPDFButton() {
		LOG.info("Click on PDF button of User page");
		UIKeywords.clickOnElement(U_pdfBtn);
	}

	public static void clickOnPrintButton() {
		LOG.info("Click on Print button of User page");
		UIKeywords.clickOnElement(U_printBtn);
	}
	
	public void sarchonUsersSearchBox() {
		LOG.info("Search an user Entery on user page");
		UIKeywords.getText(U_searchBox);
	}
	public static void clickonMaster() {
		UIKeywords.clickOnElement(mastersforuser);

	}

	public static void mouseHoverToMastersforuser() {
		LOG.info("Mouse Hover to mastersforuser");
		UIKeywords.mouseHover(mastersforuser);
	}

	public static void clickOnUsers() {
		LOG.info("Click on users option under Masters");
		UIKeywords.clickOnElement(users);
	}

	public static void clickOnAddUsers() {
		LOG.info("Click on Add users button of Users page");
		WaitsInHelp.implicitWaitInSeconds(10);
		UIKeywords.clickOnElement(add_users);
	}

	public static void clickOnViewUsers() {
		LOG.info("Click on View users button of Add Users page.");
		UIKeywords.clickOnElement(view_users);
	}

	public static void enterUserName() {
		LOG.info("Enter User name.");
		UIKeywords.enterText(U_name, "Mangesh");
	}

	public static void enterMobileNo() {
		LOG.info("Enter User Mobile no.");
		UIKeywords.enterText(U_mobile_no, "9970579149");
	}

	public static void enterEmailId() {
		LOG.info("Enter user mail-id");
		UIKeywords.enterText(U_email, "mingalkar@gmail.com");
	}

	public static void selectRoleforUser() {
		LOG.info("Click on Role and select");
		UIKeywords.selectByTextFromDropdown(U_role, "admin");
	}

	public static void enterJoiningDate() {
		LOG.info("Enter joining Date");
		UIKeywords.enterText(U_joining_date, "10-02-2012");
	}

	public static void selectBloodGroup() {
		LOG.info("Click on Bloodgroup and select ");
		UIKeywords.selectByTextFromDropdown(U_blood_group, "O negative");
	}

	public static void enterBankName() {
		LOG.info("Enter Bank Name");
		UIKeywords.enterText(U_bank_name, "State Bank Of India");
	}

	public static void enterAccountNo() {
		LOG.info("Enter Bank Account Name");
		UIKeywords.enterText(U_account_no, "3012055143");
	}

	public static void enterIFSCcode() {
		LOG.info("Enter Bank IFSC coad");
		UIKeywords.enterText(U_ifsc_code, "SBIN0003866 ");
	}

	public static void uploadUserResumeDoc() {
		LOG.info("Upload user Resume");
		UIKeywords.enterText(U_resume, "C:\\Users\\ingalkar\\Desktop\\up load only\\3-update_resume.rtf");
	}

	public static void uploadUserAgreementDoc() {
		LOG.info("Upload user Agreement");
		UIKeywords.enterText(U_agreement, "C:\\Users\\ingalkar\\Desktop\\up load only\\3-update_agreement.rtf");
	}

	public static void uploaduserKYCDoc() {
		LOG.info("Upload user KYC");
		UIKeywords.enterText(U_kyc, "C:\\Users\\ingalkar\\Desktop\\up load only\\3-update_kyc.rtf");
	}

	public static void enterFatherName() {
		LOG.info("Enter father name");
		UIKeywords.enterText(U_father_name, "VITTHAL");
	}
	public static void enterFatherMobileNo() {
		LOG.info("Enter Father mobile No");
		UIKeywords.enterText(U_father_mobile_no, "9096745274");
	}
	public static void enterFatherOccupation() {
		LOG.info("Enter Father occupation");
		UIKeywords.enterText(U_father_occupation, "Worker");
	}
	public static void selectUserStatus() {
		LOG.info("select user status");
		UIKeywords.selectByTextFromDropdown(U_status, "Active");
	}
	public static void enterPassword() {
		LOG.info("enter password");
		UIKeywords.enterText(U_password, "123456");
	}
	public static void enterConfirmPassword() {
		UIKeywords.enterText(U_confirm_password, "123456");
	}

	public static void clickOnUserSubmit() {
		LOG.info("Click on Submit button of Add Users page.");
		UIKeywords.clickOnElement(U_submit);
	}

//	public static void filladdUserForm() {
//		LOG.info("Adding values to Add User form");
//		UIKeywords.enterText(U_name, "Mangesh");
//		UIKeywords.enterText(U_mobile_no, "9970579149");
//		UIKeywords.enterText(U_email, "mingalkar@gmail.com");
//		UIKeywords.clickOnElement(U_role);
//		UIKeywords.clickOnElement(U_admin);
//		UIKeywords.enterText(U_joining_date, "04-10-2020");
//		UIKeywords.clickOnElement(U_blood_group);
//		UIKeywords.clickOnElement(U_blood_AB_negative);
//		UIKeywords.enterText(U_bank_name, "Bank Of Maharashtra");
//		UIKeywords.enterText(U_account_no, "30120522143");
//		UIKeywords.enterText(U_ifsc_code, "MAHB00021");
//
////		 below code for vertical down word scroll purpose
//
//		JavascriptExecutor jse = (JavascriptExecutor) Constants.driver;
//		WebElement Element = Constants.driver.findElement(By.cssSelector("#resume"));
//		jse.executeScript("arguments[0].scrollIntoView();", Element);
//
////		need to add code for file uploading
//		WebElement addFile = Constants.driver.findElement(By.xpath("//input[@placeholder='Upload Resume']"));
//		addFile.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_agreement.rtf");
//		WebElement addFile1 = Constants.driver.findElement(By.xpath("//input[@placeholder='Upload Agreement']"));
//		addFile1.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_kyc.rtf");
//		WebElement addFile2 = Constants.driver.findElement(By.xpath("//input[@placeholder='Upload KYC']"));
//		addFile2.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_resume.rtf");
//
//		UIKeywords.enterText(U_father_name, "VITTHAL");
//		UIKeywords.enterText(U_father_mobile_no, "7777777777");
//		UIKeywords.enterText(U_father_occupation, "Work ****");
//		UIKeywords.clickOnElement(U_status);
//		UIKeywords.clickOnElement(U_status_active);
//		UIKeywords.enterText(U_password, "123456");
//		UIKeywords.enterText(U_confirm_password, "123456");
//		UIKeywords.clickOnElement(U_submit);
//
//	}

	public static void clickOnUserCancel() {
		LOG.info("Click on Cancel button of Add Users page.");
		UIKeywords.clickOnElement(U_cancel);
	}

}
