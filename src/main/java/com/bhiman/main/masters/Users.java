package com.bhiman.main.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;

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

	@FindBy(xpath = "//select[@id='role_id']//option[text()='admin']")
	private static WebElement U_admin;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='Manager']")
	private static WebElement U_Manager;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='Sales Executive 1']")
	private static WebElement U_Sales_Executive_1;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='Supervioser']")
	private static WebElement U_Supervioser;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='Office boy q']")
	private static WebElement U_Office_boy_q;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='Cashier']")
	private static WebElement U_Cashier;

	@FindBy(xpath = "//select[@id='role_id']//option[text()='entry operator']")
	private static WebElement U_entry_operator;

	@FindBy(css = "#joining_date")
	private static WebElement U_joining_date;

	@FindBy(css = "#blood_group")
	private static WebElement U_blood_group;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='O negative']")
	private static WebElement U_blood_o_negative;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='O positive']")
	private static WebElement U_blood_O_positive;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='A negative']")
	private static WebElement U_blood_A_negative;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='A positive']")
	private static WebElement U_blood_A_positive;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='B negative']")
	private static WebElement U_blood_B_negative;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='B positive']")
	private static WebElement U_blood_B_positive;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='AB positive']")
	private static WebElement U_blood_AB_positive;

	@FindBy(xpath = "//select[@id='blood_group']//option[text()='AB negative']")
	private static WebElement U_blood_AB_negative;

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

	// ***********Page Object Methods for Users page in Masters******************
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
		UIKeywords.clickOnElement(add_users);
	}

	public static void clickOnViewUsers() {
		LOG.info("Click on View users button of Add Users page.");
		UIKeywords.clickOnElement(view_users);
	}

	public static void clickOnUserSubmit() {
		LOG.info("Click on Submit button of Add Users page.");
		UIKeywords.clickOnElement(U_submit);
	}

	public static void clickOnUserCancel() {
		LOG.info("Click on Cancel button of Add Users page.");
		UIKeywords.clickOnElement(U_cancel);
	}

	public static void filladdUserForm() {
		LOG.info("Adding values to Add User form");
		UIKeywords.enterText(U_name, "Mangesh");
		UIKeywords.enterText(U_mobile_no, "9970579149");
		UIKeywords.enterText(U_email, "mingalkar@gmail.com");
		UIKeywords.clickOnElement(U_role);
		UIKeywords.clickOnElement(U_admin);
		UIKeywords.enterText(U_joining_date, "04-10-2020");
		UIKeywords.clickOnElement(U_blood_group);
		UIKeywords.clickOnElement(U_blood_AB_negative);
		UIKeywords.enterText(U_bank_name, "Bank Of Maharashtra");
		UIKeywords.enterText(U_account_no, "30120522143");
		UIKeywords.enterText(U_ifsc_code, "MAHB00021");	
	
//		 below code for vertical down word scroll purpose
		 
		JavascriptExecutor jse = (JavascriptExecutor) Constants.driver;
		WebElement Element = Constants.driver.findElement(By.cssSelector("#resume"));
		jse.executeScript("arguments[0].scrollIntoView();", Element);
		
//		need to add code for file uploading
		WebElement addFile =Constants.driver.findElement(By.xpath("//input[@placeholder='Upload Resume']"));
		addFile.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_agreement.rtf");
	    WebElement addFile1 =Constants.driver.findElement(By.xpath("//input[@placeholder='Upload Agreement']"));
		addFile1.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_kyc.rtf");
		WebElement addFile2 =Constants.driver.findElement(By.xpath("//input[@placeholder='Upload KYC']"));
		addFile2.sendKeys("E:\\java_Program_1\\NewProject\\src\\main\\resources\\up load only\\3-update_resume.rtf");
		
		UIKeywords.enterText(U_father_name, "VITTHAL");
		UIKeywords.enterText(U_father_mobile_no, "7777777777");
		UIKeywords.enterText(U_father_occupation, "Work ****");
		UIKeywords.clickOnElement(U_status);
		UIKeywords.clickOnElement(U_status_active);
		UIKeywords.enterText(U_password, "123456");
		UIKeywords.enterText(U_confirm_password, "123456");
		UIKeywords.clickOnElement(U_submit);
		

	}
}
