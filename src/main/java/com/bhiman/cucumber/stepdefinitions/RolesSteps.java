package com.bhiman.cucumber.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.setup.RolesPage;
import com.bhiman.utility.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RolesSteps {
	
	RolesPage role = new RolesPage();
	
	@Given("Mouse Hover to Setup")
	public void mouse_hover_to_setup() {
		role.mouseHoverToSetUp();
	}

	@Given("Verify Roles option under setup")
	public void verify_roles_option_under_setup() {
		Constants.actual = "Roles";
		Constants.expected = role.getRolesText();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Roles option")
	public void click_on_roles_option() {
		role.clickOnRolesUnderSetup();
		Constants.actual="Roles";
		Constants.expected= UIKeywords.getPageTitle();
		assertEquals(Constants.actual, Constants.expected);

	}

	@Then("Click on Copy button on Roles Page")
	public void click_on_copy_button_on_roles_page() {
		role.clickOnCopyInRoles();
	}

	@Then("Click on Excel button on Roles Page")
	public void click_on_excel_button_on_roles_page() {
		role.clickOnExcelInRoles();
	}

	@And("Verify downloaded Excel file path")
	public void verify_downloaded_excel_file_path() {
		Constants.actual = "Roles.xlsx";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);

	}

	@Then("Click on CSV button on Roles Page")
	public void click_on_csv_button_on_roles_page() {
		role.clickOnCSVInRoles();
	}

	@And("Verify downloaded CSV file path")
	public void verify_downloaded_csv_file_path() {
		Constants.actual = "Roles.csv";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);

	}

	@Then("Click on PDF button on Roles Page")
	public void click_on_pdf_button_on_roles_page() {
		role.clickOnPDFInRoles();
	}

	@And("Verify downloaded PDF file path")
	public void verify_downloaded_pdf_file_path() {
		Constants.actual = "Roles.pdf";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Then("Click on Print button on Roles Page")
	public void click_on_print_button_on_roles_page() {
		role.clickOnPrintInRoles();
	}

	@And("Verify downloaded Print file path")
	public void verify_downloaded_print_file_path() {
		Constants.expected = "about:blank"; 
		Constants.actual =role.getSwitchWindowURL(); 
		Assert.assertEquals(Constants.actual,Constants.expected);
	}

	@Then("Click on Add Role Button")
	public void click_on_add_role_button() {
		role.clickOnAddRole();
	}

	@Then("Enter role name and Verify Add Role Name Text box should except spaces,lower and upper case alphabets only")
	public void verify_add_role_name_text_box_should_except_spaces_lower_and_upper_case_alphabets_only() {
		String value = PropertyReader.getLocatorValue("roles_name");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			role.enterRoleInRoleName(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag,
				"Invalid Role Name. Only blank space, lowercase and uppercase alphabets are allowed.");
	}

	@When("Admin Enter input in Add Role Name Text Box")
	public void admin_enter_input_in_add_role_name_text_box() {
	    role.enterRoleInRoleName(PropertyReader.getLocatorValue("roles_name"));
	}

	@Then("Scroll down the Add role Page")
	public void scroll_down_the_add_role_page() throws InterruptedException {
	 role.scrollPageOperation(); 
	}

	@Then("Set all permissions to Admin Role")
	public void set_all_permissions_to_admin_role() throws InterruptedException {
	    role.permissions();
	}

	@Then("Click on Submit Button on Add Role Page")
	public void click_on_submit_button_on_add_role_page() {
	    role.clickOnSubmitInRoles();
	}

	@Then("Verify the Role Added text and click ok button")
	public void verify_the_role_added_text_and_click_ok_button() {
		Constants.actual="Role Added.";
		Constants.expected= role.getRoleAddedText();
		role.clickOnRoleAddedOkButton();
		assertEquals(Constants.actual,Constants.expected);
	}

	@Then("Click on Cancle Button on Add Role Page")
	public void click_on_cancle_button_on_add_role_page() {
	 role.clickOnCancleInRoles();
	}

	@Then("Enter Role name in Search box on Roles page")
	public void enter_role_name_in_search_box_on_roles_page() {
	  role.enterRoleInSearchBoxInRole(PropertyReader.getLocatorValue("roles_search_valid_text"));   
	}

	@Then("Verify Search Role Name box should except spaces,lower and upper case alphabets only")
	public void verify_search_role_name_box_should_except_spaces_lower_and_upper_case_alphabets_only() {
		String value = PropertyReader.getLocatorValue("roles_search_valid_text");
		if(value != null && value.matches("^[a-zA-Z ]*$")){
		role.enterRoleInSearchBoxInRole(value);
		}
	}

	@Then("Verify role name in data table as per search box input")
	public void verify_role_name_in_data_table_as_per_search_box_input() {
		String value = PropertyReader.getLocatorValue("roles_search_valid_text");
		if(value != null && value.matches("^[a-zA-Z ]*$")){
		role.enterRoleInSearchBoxInRole(value);
		Constants.actual= value;
		Constants.expected=role.getTextFromTable();
		assertEquals(Constants.actual,Constants.expected);
		}
	}
		
	@Then("Click on {string} icon in Actions on Roles Page")
	public void click_on_icon_in_actions_on_roles_page(String string) {
		if(string.contains("Edit")) {
	 role.clickOnEditIconInRole();
		}
		else {
			role.clickOnDeleteIconInRole();
		}
	}

	@Then("Re-enter Role name")
	public void re_enter_role_name() {
	 role.enterRoleInRoleName(PropertyReader.getLocatorValue("reEnter_roles_name"));
	}

	@Then("Set all permissions for new Role")
	public void set_all_permissions_for_new_role() throws InterruptedException {
		role.permissions();
	}


	@Then("Verify the Role Updated text and click ok button")
	public void verify_the_role_updated_text_and_click_ok_button() {
		Constants.actual=role.getRoleUpdatedText();
		Constants.expected="Something went wrong. Please try again.";
		role.clickOnRoleUpdatedOkButton();
		assertEquals(Constants.actual,Constants.expected);
	}

	@Then("Verify the Role Deleted text and click ok button")
	public void verify_the_role_deleted_text_and_click_ok_button() {
		Constants.actual="Role Deleted.";
		Constants.expected=role.getRoleDeletedText();
		role.clickOnRoleDeleteOkButton();
		assertEquals(Constants.actual,Constants.expected);
	}
	
	@Then("Enter input in Add Role Name Text Box")
	public void enter_input_in_add_role_name_text_box() {
	    role.enterRoleInRoleName(PropertyReader.getLocatorValue("roles_name"));
	}

}
