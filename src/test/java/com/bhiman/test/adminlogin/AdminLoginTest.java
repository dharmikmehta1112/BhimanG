package com.bhiman.test.adminlogin;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.pages.adminlogin.AdminLoginPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.ExcelReader;

public class AdminLoginTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(AdminLoginTest.class);
	
	@Test(dataProvider = "loginData")
	public void adminLogin(String mobileNo, String password, String expected_Result) {
		AdminLoginPage admin = new AdminLoginPage();
		admin.refreshLoginPage();
		//LOG.info("Enter input mobile no as username");
		admin.enterUsername(mobileNo);
		//LOG.info("Enter input as the password");
		admin.enterPassword(password);
		//LOG.info("click on Login button");
		admin.clickOnLoginButton();
		WaitsInHelp.threadSleepInMilliSeconds(3);
		Constants.expected = "http://103.50.162.196/testing/index.php";
		Constants.actual = UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected, "Login to application failed due to invalid URL.");
		LOG.info("Login to application successfully.");
	}

	@DataProvider(name = "loginData")
	public String[][] getData() throws IOException {
		LOG.info("Taking xlfile path from property file");
		String path = Constants.basePath + "\\src\\main\\resources\\ExcelData\\LoginCredentials.xlsx";
		LOG.info("Taking row count for login page");
		int rownum = ExcelReader.getRowCount(path, "LoginPage");
		LOG.info("Taking Cell count for login page for one row");
		int colcount = ExcelReader.getCellCount(path, "LoginPage", 1);
		String loginData[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum;i++) {
			for (int j = 0; j < colcount; j++) {
				loginData[i - 1][j] = ExcelReader.getCellData(path, "LoginPage", i, j);
				LOG.info("Taking data from cell ");
			}
		}
		return loginData;
	}
}
