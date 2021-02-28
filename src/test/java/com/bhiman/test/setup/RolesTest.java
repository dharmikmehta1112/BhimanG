package com.bhiman.test.setup;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.bhiman.main.setup.Roles;
import com.bhiman.test.BaseTest;


public class RolesTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(RolesTest.class);
	
	
	@Test(groups ="Regression",description = "To verify 'Roles' option under setup")
	public void verifyRolesUnderSetUp() {
		LOG.info("Verify roles option in Setup");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
	}
	
	@Test(groups ="Regression",description = "To verify and validate click on Roles under Setup")
	public void verifyClickOnRoles() {
		LOG.info("Verify roles page should be avait");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
	}
	
	@Test(groups = "Regression",description ="To verify 'Copy' button on roles page")
	public void verifyCopyButtonOnRoles() {
		LOG.info("Verifying click on 'Copy' button in Roles page.");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnCopyInRoles();
	}
	
	@Test(groups = "Regression",description = "To verify 'Excel' button on roles page")
	public void verifyExcelButtonOnRoles() {
		LOG.info("To verify 'Excel' button on roles page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnExcelInRoles();
	}
	
	@Test(groups = "Regression",description ="To verify 'CSV' button on roles page")
	public void verifyCSVButtonOnRoles() {
		LOG.info("To verify 'CSV' button on roles page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnCSVInRoles();
	}
	
	
	@Test(groups = "Regression",description = "To verify 'PDF' button on roles page")
	public void verifyPDFButtonOnRoles() {
		LOG.info("To verify 'PDF' button on roles page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnPDFInRoles();
	}
	
	
	@Test(groups = "Regression",description = "To verify Print button on roles page")
	public void verifyPrintButtonOnRoles() {
		LOG.info("To verify 'Print' button on roles page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnPrintInRoles();
	}
	
	
	
	@Test(groups = "Regression",description = "Add new role with permissions and click on submit button")
	public void addNewRole() throws InterruptedException {
		
		LOG.info("To verify add new role with permissions");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnAddRole();
		role.enterTextInRoleName();
		role.scrollPageOperation();
		role.permissions();
		role.clickOnSubmitInRoles();
	}
	
	
	@Test(groups = "Regression",description = "verify click on cancle button it will reset the upadted data ")
	public void verifyCancelButtonInAddRole() throws InterruptedException {
		LOG.info("Verifying Cancle button in add Role Page.");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnAddRole();
		role.enterTextInRoleName();
		role.scrollPageOperation();
		role.permissions();
		role.clickOnCancleInRoles();
	}
	
	@Test(groups ="Regression",description = "To verify Search box on Roles Page")
	public void verifySearchBoxOnRoles() {
		LOG.info("To verify Search box on roles page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.enterTextInSearchBoxInRole();
		
	}
	
	@Test(groups ="Regression",description = "To verify Edit icon in Actions on Roles Page")
	public void verifyEditIconInActionsOnRoles() throws InterruptedException {
		
		LOG.info("verifying Edit icon in Actions on Roles Page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnEditIconInRole();
		role.clickOnAddRoleNameTextBox();
		role.enterTextInRoleName();
		role.scrollPageOperation();
		role.permissions();
		role.clickOnSubmitInRoles();
		
	}
	
	@Test(groups = "Regression",description = "To verify delete icon in Actions on Roles Page")
	public void verifyDeleteIconInActionsOnRoles() throws InterruptedException {
		LOG.info("Verifying delete icon in Actions on Roles Page");
		Roles role = new Roles();
		role.mouseHoverToSetUp();
		role.clickOnRolesUnderSetup();
		role.clickOnDeleteIconInRole();
	}
}

	

