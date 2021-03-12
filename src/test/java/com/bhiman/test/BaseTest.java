package com.bhiman.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.utility.PropertyReader;

/**
 * Contains setup {@BeforeMethod} and tearDown {@AfterMethod} annotated methods compulsory required 
 * to run before & after every @Test annotated Test cases.
 */

public class BaseTest extends UIKeywords {

	private static final Logger LOG = Logger.getLogger(BaseTest.class);
		
	@BeforeMethod		// Pre-condition
	public void setUp() {
		LOG.info("Before (setUp) method started.");
		UIKeywords.openBrowser(PropertyReader.getLocatorValue("browserName"));
		UIKeywords.openUrl(PropertyReader.getLocatorValue("url"));
		UIKeywords.maximizeWindow();
		LOG.info("Before (setUp) method completed.");
	} // end of Pre-condition
	
	@AfterMethod		// Post-condition
	public void tearDown() {
		LOG.info("After (tearDown) method started.");
		UIKeywords.closeAllBrowser();
		LOG.info("All Browser closed successfully.");
	} // end of Post-condition
  
}