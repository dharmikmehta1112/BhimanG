package com.bhiman.test.masters;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;

import com.bhiman.main.masters.Users;
import com.bhiman.test.BaseTest;

public class UsersTest extends BaseTest {

	private static final Logger LOG = Logger.getLogger(UsersTest.class);
	

	
	
	@Test
	private void verifyUsersInMasters() {
		LOG.info("userPageTest_01");
		Users users = new Users();	
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	@Test
	private void verifyaddUserinUsers() {
		Users users = new Users();	
		users.mouseHoverToMastersforuser();
		users.clickOnUsers();
		users.clickOnAddUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	@Test
	private void verifyClickOnCopyButton() {	
		Users users = new Users();	
		LOG.info("Verifying click on 'Copy' button in user page.");
		String user_expectedUrl = "http://103.50.162.196/testing/user.php";
		users.mouseHoverToMastersforuser();	
		users.clickOnUsers();
		users.clickOnUserCopyButton();
		String user_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(user_actualUrl, user_expectedUrl);
	}
	@Test
	private void verifyClickOnExcelButton() {
		Users users = new Users();	
		LOG.info("Verifying click on 'Copy' button in user page.");
		String user_expectedUrl = "http://103.50.162.196/testing/user.php";
		users.mouseHoverToMastersforuser();	
		users.clickOnUsers();
		users.clickOnExcelButton();
		String user_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(user_actualUrl, user_expectedUrl);

	}
}
