package com.bhiman.test.setup;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.setup.Roles;
import com.bhiman.test.BaseTest;

public class RolesTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(RolesTest.class);
	
	Roles role = PageFactory.initElements(Constants.driver, Roles.class);
	
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
		String addRolePermission_expectedUrl = "http://103.50.162.196/testing/role.php#";
		String addRolePermission_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(addRolePermission_actualUrl, addRolePermission_expectedUrl);
		LOG.info("Click on submit button After setting permissions to Role");
		role.clickOnSubmitInRoles();
		
		LOG.info("Click on View Role Button on view Role page");
		role.clickOnViewRole();
		
	}
}
