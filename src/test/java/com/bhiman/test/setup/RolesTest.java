package com.bhiman.test.setup;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.setup.Roles;
import com.bhiman.test.BaseTest;


public class RolesTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(RolesTest.class);
	
	Roles role = PageFactory.initElements(Constants.driver, Roles.class);
	/**
	 * In tc_01 testcase admin will add new role and observe, role will get added 
	 * in roles table after click on submit button 
	 */
	@Test
	public void tc_01() {
		
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Click on Add Role Button on Roles Page");
		role.clickOnAddRole();
		String addRole_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String addRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addRole_actualUrl, addRole_expectedUrl);
		LOG.info("Enter new Role in Role Name");
		role.enterTextInRoleName();
		String addRoleName_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String addRoleName_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addRoleName_actualUrl, addRoleName_expectedUrl);
		LOG.info("Set all permission to Role");
		role.permissions();
		LOG.info("Click on submit button After setting permissions to Role");
		role.clickOnSubmitInRoles();
		String submitRole_expectedUrl = "http://103.50.162.196/testing/role.php";
		String submitRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(submitRole_actualUrl, submitRole_expectedUrl);
		
	}
	
	/**
	 * In tc_02 testcase admin will add new role and click on cancle button and will observe
	 * set data got reset or not
	 * Then after click on Add_Role button will observe whatever data got reseted will not refelect on role table 
	 * 
	 */
	
	public void tc_02() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Click on Add Role Button on Roles Page");
		role.clickOnAddRole();
		String addRole_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String addRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addRole_actualUrl, addRole_expectedUrl);
		LOG.info("Enter new Role in Role Name");
		role.enterTextInRoleName();
		String addRoleName_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String addRoleName_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addRoleName_actualUrl, addRoleName_expectedUrl);
		LOG.info("Set all permission to Role");
		role.permissions();
		LOG.info("Click on Cancle button After setting permissions to Role");
		role.clickOnCancleInRoles();
		String submitRole_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String submitRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(submitRole_actualUrl, submitRole_expectedUrl);
		LOG.info("Click on View Role Button on view Role page");
		role.clickOnViewRole();
		String viewRole_expectedUrl = "http://103.50.162.196/testing/role.php";
		String viewRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(viewRole_actualUrl, viewRole_expectedUrl);
		
	}
	
	/**
	 * In tc_03 testcase admin will click on copy button 
	 * and observe all data will get copy or not
	 */
	public void tc_03() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Performed click operation on copy button on Role page" );
		role.clickOnCopyInRoles();
	}
	
	/**
	 * In tc_04 testcase admin will click on Excel button 
	 * and observe all data will get copy on excel sheet or not with extension .xlsx
	 */
	public void tc_04() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Performed click operation on copy button on Role page" );
		role.clickOnExcelInRoles();
	}
	
	/**
	 * In tc_05 testcase admin will click on CSV button 
	 * and observe all data will get copy on excel sheet or not with extension .csv
	 */
	public void tc_05() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Performed click operation on copy button on Role page" );
		role.clickOnCSVInRoles();
	}
	
	/**
	 * In tc_06 testcase admin will click on CSV button 
	 * and observe all data will get copy in pdf format or not with extension .pdf
	 */
	public void tc_06() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Performed click operation on copy button on Role page" );
		role.clickOnPDFInRoles();
	}
	
	/**
	 * In tc_07 testcase admin will click on Print button and will observe 
	 * admin will be able to print the Role data table
	 */
	public void tc_07() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Performed click operation on copy button on Role page" );
		role.clickOnPrintInRoles();
	}
	
	/**
	 * In tc_08 testcase admin will enter input in search box on roles page
	 * admin will get same date as per input in role data table
	 */
	public void tc_08() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Searching role in Roles page");
		role.enterTextInSearchBoxInRole();
		String searchRole_expectedUrl = "http://103.50.162.196/testing/role.php";
		String searchRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(searchRole_actualUrl, searchRole_actualUrl);
		
	}
	/**
	 * In tc_09 testcase admin will edit role and set new permission to re-enter role
	 * and able to see Role updated popup message
	 */
	public void tc_09() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Click on edit icon in roles page");
		role.clickOnEditIconInRole();
		String editRole_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String editRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(editRole_actualUrl, editRole_expectedUrl);
		LOG.info("Re-enter new Role in Role Name");
		role.enterTextInRoleName();
		String re_enterRoleName_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String re_enterRoleName_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(re_enterRoleName_actualUrl, re_enterRoleName_expectedUrl);
		LOG.info("Set new permission to Re-enter Role");
		role.permissions();
		String editPermissionRole_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String editPermissionRole_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(editPermissionRole_actualUrl, editPermissionRole_expectedUrl);
		LOG.info("Click on submit button After setting permissions to Role");
		role.clickOnSubmitInRoles();
		String edit_submit_expectedUrl = "http://103.50.162.196/testing/role.php";
		String edit_submit_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(edit_submit_actualUrl, edit_submit_expectedUrl);
		
	}
	/**
	 * In tc_10 testcase admin will able to delete role on Roles page 
	 * and able to see Role deleted Popup message
	 */
	public void tc_10() {
		String index_expectedUrl = "http://103.50.162.196/testing/index.php";
		String index_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(index_actualUrl, index_expectedUrl);
		LOG.info("Home Page -- Performing Mouse hover to setUp");
		role.mouseHoverToSetUp();
		LOG.info("Click on Roles under Setup");
		role.clickOnRolesUnderSetup();
		String roles_expectedUrl = "http://103.50.162.196/testing/role.php";
		String roles_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(roles_actualUrl, roles_expectedUrl);
		LOG.info("Click on delete icon in roles page");
		role.clickOnDeleteIconInRole();
		LOG.info("Role get deleted");
		
	}
}

	

