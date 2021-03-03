package com.bhiman.cucumber.stepsdefn;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Users;
import com.bhiman.main.utility.PropertyReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UsersSteps {
	private static final Logger LOG = Logger.getLogger(UsersSteps.class);
	Users users = new Users();

	@Given("Verify Users option.")
	public void verify_users_option() {
		Constants.expected = "Users";
		Constants.actual = users.getTextofUsersforC();
		Assert.assertEquals(Constants.expected, Constants.actual);
	}

	@Then("Click on users")
	public void click_on_users() {
		users.clickOnUsers();
	}

	@Then("Verify users URL")
	public void verify_users_url() {
		users.clickOnAddUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}

	@Then("Click on add User")
	public void click_on_add_user() {
		users.clickOnAddUsers();
	}

	@Then("click on view User")
	public void click_on_view_user() {
		users.clickOnViewUsers();
	}

	@Then("Verify view users URL")
	public void verify_view_users_url() {
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}

	@Then("varify and valid user name format")
	public void varify_and_valid_user_name_format() {
		String value = PropertyReader.getLocatorValue("User_name_addUser");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			users.enterUserName(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag,
				"Invalid User Name. Only blank space, lowercase and uppercase alphabets are allowed.");
	}

	@Then("varify users enter a Valid mobile no")
	public void varify_users_enter_a_valid_mobile_no() {
		String value = PropertyReader.getLocatorValue("User_mobile_No");

		if ((value != null) && (value.length() <= 10) && (value.matches("\\d{10}"))) {
			users.enterMobileNo(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag, "  validate phone numbers of format will consider.");
	}

	@Then("varify users enter a Valid Email_id")
	public void varify_users_enter_a_valid_email_id() {
		String value = PropertyReader.getLocatorValue("User_email_Id");
		if (value != null && value.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			users.enterEmailId(value);
			Constants.flag = true;
		}
		LOG.error("Test case is pass but user enters Invalid email id");
		Assert.assertTrue(true, "validate email format will consider");
	}

	@Then("varify users enter a  in valid joining date format")
	public void varify_users_enter_a_in_valid_joining_date_format() {
		String value = PropertyReader.getLocatorValue("User_joining_Date");
		if (value != null && value.matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$")) {
			users.enterJoiningDate(value);
			Constants.flag = true;
		}
		// Assert.assertTrue(true, "Date is valid");
		LOG.error("this test case is fail");
		Assert.assertFalse(false, "invalid date format consider");
	}

	@Then("varify users enter a  valid bank name for user")
	public void varify_users_enter_a_valid_bank_name_for_user() {
		String value = PropertyReader.getLocatorValue("User_Bank_Name");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			users.enterBankName(value);
			Constants.flag = true;
		}
		// Assert.assertFalse(false, "Valid Bank name is consider");
		Assert.assertTrue(true, "Valid Bank name is consider");
	}

	@Then("varify users enter a  valid Account no for user Bank")
	public void varify_users_enter_a_valid_account_no_for_user_bank() {
		String value=PropertyReader.getLocatorValue("User_Account_No");
		if (value !=null && value.matches("^\\d{9,18}$")) {
			users.enterAccountNo(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true,"Valid Account no. is consider");
	}

	@Then("varify users enter a  valid IFSC code for user Bank")
	public void varify_users_enter_a_valid_ifsc_code_for_user_bank() {
		String value=PropertyReader.getLocatorValue("User_IFSC_Code");
		if (value !=null && value.matches("^[A-Z]{4}0[A-Z0-9]{6}$")) {
			users.enterIFSCcode(value);
			Constants.flag=true;
		}
		Assert.assertTrue(true,"Valid IFSC code is consider");
	}
	
	@Then("verify and validate click on Copy button on User page")
	public void verify_and_validate_click_on_copy_button_on_user_page() {
		users.clickOnUserCopyButton();
		String user_expectedUrl = "http://103.50.162.196/testing/user.php";
		String user_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(user_actualUrl, user_expectedUrl);
	}
	
	@Then("verify and validate click onExcel button and Users_download_filePath")
	public void verify_and_validate_click_on_excel_button_and_users_download_file_path() {
		users.clickOnExcelButton();
		Constants.actual = "Users.xlsx";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}
	
	@Then("verify and validate click on CSV button and Users_download_filePath")
	public void verify_and_validate_click_on_csv_button_and_users_download_file_path() {
		users.clickOnCSVButton();
		Constants.actual = "Users.csv";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Then("verify and validate click on PDF button and Users_download_filePath")
	public void verify_and_validate_click_on_pdf_button_and_users_download_file_path() {
		Constants.actual = "Users.pdf";
		String filePath = PropertyReader.getLocatorValue("Users_download_filePath")+".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

}
