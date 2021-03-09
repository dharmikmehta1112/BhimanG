package com.bhiman.test.index;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.pages.index.IndexPage;
import com.bhiman.test.BaseTest;

public class IndexTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(IndexTest.class);

	@Test (groups = {"Regression"}, description = "To verify and validate the number of available options count on navigation bar.")
	public void getNavbarCount() {
		IndexPage in = new IndexPage();
		LOG.info("Reading navigation bar text on Index page.");
		Constants.count = in.getCountOfNavBarOptions();
		LOG.info("Number of available options count on navigation bar:: " +Constants.count);
		Assert.assertEquals(Constants.count, 8);
	}
	
	@Test (groups = {"Regression"}, description = "To verify and validate the text of available options on navigation bar.")
	public void readNavBarText() {
		IndexPage in = new IndexPage();
		LOG.info("Reading navigation bar text on Index page.");
		in.getTextOfNavBarOptions();		
	}
	
	@Test (groups = {"Regression"}, description = "To verify and validate the click on Admin dropdown.")
	public void verifyClickOnAdmin() {
		IndexPage in = new IndexPage();
		LOG.info("Clicking on admin dropdown on Index page.");
		in.clickOnAdmin();
		Constants.actual = "Admin";
		Constants.expected = in.getAdminText();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	
	
	

	
}