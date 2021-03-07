package com.bhiman.test.index;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.index.Index;
import com.bhiman.test.BaseTest;

public class IndexTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(IndexTest.class);

	@Test (groups = {"Regression"}, description = "To verify and validate the number of available options count on navigation bar.")
	public void getNavbarCount() {
		Index in = new Index();
		LOG.info("Reading navigation bar text on Index page.");
		Constants.count = in.getCountOfNavBarOptions();
		Assert.assertEquals(Constants.count, 8);
	}
	
//	@Test (groups = {"Regression"}, description = "To verify and validate the text of available options on navigation bar.")
	public void readNavBarText() {
		Index in = new Index();
		LOG.info("Reading navigation bar text on Index page.");
		in.getTextOfNavBarOptions();
		
	}
	
	
	

	
}