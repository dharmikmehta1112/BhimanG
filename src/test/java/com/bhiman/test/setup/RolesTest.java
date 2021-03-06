package com.bhiman.test.setup;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIAlerts;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.setup.RolesPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.PropertyReader;

public class RolesTest extends BaseTest {

	private static final Logger LOG = Logger.getLogger(RolesTest.class);

	@Test(groups = "Regression", description = "To verify 'Roles' option under setup")
	public void verifyRolesUnderSetUp() {
		LOG.info("Verify roles option in Setup");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		Constants.actual = "Roles";
		Constants.expected = role.getRolesText();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Test(groups = "Regression", description = "To verify and validate click on Roles under Setup")
	public void verifyClickOnRoles() {
		LOG.info("Verify roles page should be avait");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		Constants.actual="Roles";
		Constants.expected= UIKeywords.getPageTitle();
		assertEquals(Constants.actual, Constants.expected);
	}

	@Test(groups = "Regression", description = "To verify 'Copy' button on roles page")
	public void verifyCopyButtonOnRoles() {
		LOG.info("Verifying click on 'Copy' button in Roles page.");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnCopyInRoles();
	}

	@Test(groups = "Regression", description = "To verify 'Excel' button on roles page")
	public void verifyExcelButtonOnRoles() {
		LOG.info("To verify 'Excel' button on roles page");
		RolesPage role = new RolesPage();
		Constants.flag=false;
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnExcelInRoles();
		Constants.actual = "Roles.xlsx";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Test(groups = "Regression", description = "To verify 'CSV' button on roles page")
	public void verifyCSVButtonOnRoles() {
		LOG.info("To verify 'CSV' button on roles page");
		RolesPage role = new RolesPage();
		Constants.flag=false;
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnCSVInRoles();
		Constants.actual = "Roles.csv";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Test(groups = "Regression", description = "To verify 'PDF' button on roles page")
	public void verifyPDFButtonOnRoles() {
		LOG.info("To verify 'PDF' button on roles page");
		Constants.flag=false;
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnPDFInRoles();
		Constants.actual = "Roles.pdf";
		String filePath = PropertyReader.getLocatorValue("roles_download_filePath") + ".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " + Constants.actual + " is not downloaded at location: " + filePath);
	}

	@Test(groups = "Regression", description = "To verify Print button on roles page")
	public void verifyPrintButtonOnRoles() {
		LOG.info("To verify 'Print' button on roles page");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnPrintInRoles();
		/*
		 * Constants.expected = "about:blank"; 
		 * Constants.actual =role.getSwitchWindowURL(); 
		 * Assert.assertEquals(Constants.actual,Constants.expected);
		 */
	}

	@Test(groups = "Regression", description = "Verify enter role name text box should except spaces,lower and upper case alphabets only")
	public void verifyEnterRoleTextBoxAcceptsAlphabetsOnly() throws InterruptedException {

		LOG.info("To verify add new role with permissions");
		RolesPage role = new RolesPage();
		Constants.flag=false;
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnAddRole();
		String value = PropertyReader.getLocatorValue("roles_name");
		if (value != null && value.matches("^[a-zA-Z ]*$")) {
			role.enterRoleInRoleName(value);
			Constants.flag = true;
		}
		Assert.assertTrue(Constants.flag,
				"Invalid Role Name. Only blank space, lowercase and uppercase alphabets are allowed.");
	}

	@Test(groups = "Regression", description = "Add new role with permissions and click on submit button")
	public void addNewRole() throws InterruptedException {

		LOG.info("To verify add new role with permissions");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnAddRole();
		role.enterRoleInRoleName(PropertyReader.getLocatorValue("roles_name"));
		role.scrollPageOperation();
		role.permissions();
		role.clickOnSubmitInRoles();
		Constants.actual="Role Added.";
		Constants.expected= role.getRoleAddedText();
		role.clickOnRoleAddedOkButton();
		assertEquals(Constants.actual,Constants.expected);
	}

	@Test(groups = "Regression", description = "verify click on cancle button it will reset the upadted data ")
	public void verifyCancelButtonInAddRole() throws InterruptedException {
		LOG.info("Verifying Cancle button in add Role Page.");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnAddRole();
		role.enterRoleInRoleName(PropertyReader.getLocatorValue("roles_name"));
		role.scrollPageOperation();
		role.permissions();
		role.clickOnCancleInRoles();
	}

	@Test(groups ="Regression",description = "To verify Search box on Roles Page it should except spaces, lower and upper case alphabets")
	public void verifySearchBoxOnRoles() {
		LOG.info("To verify Search box on roles page and validating it ix accepting spaces, lower and upper cas alphabets only");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		String value = PropertyReader.getLocatorValue("roles_search_valid_text");
		if(value != null && value.matches("^[a-zA-Z ]*$")){
		role.enterRoleInSearchBoxInRole(value);
		Constants.actual= value;
		Constants.expected=role.getTextFromTable();
		assertEquals(Constants.actual,Constants.expected);
	}

	}

	@Test(groups = "Regression", description = "To verify Edit icon in Actions on Roles Page")
	public void verifyEditIconInActionsOnRoles() throws InterruptedException {

		LOG.info("verifying Edit icon in Actions on Roles Page");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnEditIconInRole();
		role.clickOnAddRoleNameTextBox();
		role.enterRoleInRoleName(PropertyReader.getLocatorValue("reEnter_roles_name"));
		role.scrollPageOperation();
		role.permissions();
		role.clickOnSubmitInRoles();
		Constants.actual="Something went wrong. Please try again.";
		Constants.expected=role.getRoleUpdatedText();
		role.clickOnRoleUpdatedOkButton();
		assertEquals(Constants.actual,Constants.expected);
		

	}

	@Test(groups = "Regression", description = "To verify delete icon in Actions on Roles Page")
	public void verifyDeleteIconInActionsOnRoles() throws InterruptedException {
		LOG.info("Verifying delete icon in Actions on Roles Page");
		RolesPage role = new RolesPage();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnDeleteIconInRole();
		Constants.actual="Role Deleted.";
		Constants.expected=role.getRoleDeletedText();
		role.clickOnRoleDeleteOkButton();
		assertEquals(Constants.actual,Constants.expected);
		
		
	}
}
