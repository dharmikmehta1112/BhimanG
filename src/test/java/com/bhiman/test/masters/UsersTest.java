package com.bhiman.test.masters;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Users;
import com.bhiman.test.BaseTest;

public class UsersTest extends BaseTest {
	@Test
	public void userPageTest_01() {
		//Users.clickonMaster();
		Users.mouseHoverToMastersforuser();
		Users.clickOnUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
	}
	@Test
	public void userPageTest_02() {
		Users.mouseHoverToMastersforuser();
		Users.clickOnUsers();
		Users.clickOnAddUsers();
		String Users_expectedUrl = "http://103.50.162.196/testing/user.php#";
		String Users_actualUrl = UIKeywords.getPageUrl();
		Assert.assertEquals(Users_actualUrl, Users_expectedUrl);
		

	}
}
