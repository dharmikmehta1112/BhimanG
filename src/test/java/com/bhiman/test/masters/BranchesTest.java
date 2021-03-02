package com.bhiman.test.masters;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Branches;

public class BranchesTest {
	
	private static final Logger LOG = Logger.getLogger(BranchesTest.class);
	
	@Test (groups = "Regression", description = "To verify and validate 'Branches' option in 'Masters'.")
	public void verifyBranchesInMasters() {
		LOG.info("Verify Branches option in Masters.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		Constants.expected = "Branches";
		Constants.actual = branch.getTextOfBranches();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test (groups = "Regression", description = "To verify and validate after click on 'Branches' option in 'Masters'")
	public void verifyClickOnBanksInMasters() {
		LOG.info("Verify click on 'Branches' option in Masters");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testng/bank.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	
	

}
