package com.bhiman.test.masters;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.masters.Branches;
import com.bhiman.main.utility.PropertyReader;
import com.bhiman.test.BaseTest;

public class BranchesTest extends BaseTest {
	
	private static final Logger LOG = Logger.getLogger(BranchesTest.class);
	
	@Test (groups = {"Regression"}, description = "To verify and validate 'Branches' option in 'Masters'.")
	public void verifyBranchesInMasters() {
		LOG.info("Verify Branches option in Masters.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		Constants.expected = "Branches";
		Constants.actual = branch.getTextOfBranches();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test (groups = {"Regression"}, description = "To verify and validate after click on 'Branches' option in 'Masters'")
	public void verifyClickOnBanksInMasters() {
		LOG.info("Verify click on 'Branches' option in Masters");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testing/branch.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}
	
	@Test (groups = {"Regression"}, description = "To verify and validate click on 'Copy' button.")
	public void verifyClickOnCopyButton() {	
		LOG.info("Verifying click on 'Copy' button in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnCopyButton();
		Constants.expected = "Copy to clipboard";
		Constants.actual = branch.getTextAfterClick();
		Assert.assertEquals(Constants.actual, Constants.expected);		
	}
		
	@Test (groups = {"Regression"}, description = "To verify and validate click on 'Excel' button.")
	public static void verifyClickOnExcelButton() {
		LOG.info("Verifying click on 'Excel' button in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnExcelButton();
		Constants.actual = "Branches.xlsx";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}
		
	@Test (groups = {"Regression"}, description = "To verify and validate click on 'CSV' button.")
	public static void verifyClickOnCSVButton() {
		LOG.info("Verifying click on 'CSV' button in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnCSVButton();
		Constants.actual = "Branches.csv";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Test (groups = {"Regression"}, description = "To verify and validate click on 'PDF' button.")
	public static void verifyClickOnPDFButton() {
		LOG.info("Verifying click on 'PDF' button in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnPDFButton();
		Constants.actual = "Branches.pdf";
		String filePath = PropertyReader.getLocatorValue("branches_download_filePath")+".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Test (groups = {"Regression"}, description = "To verify and validate click on 'Print' button.")
	public static void verifyClickOnPrintButton() {
		LOG.info("Verifying click on 'Print' button in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnPrintButton();
		Constants.expected = "about:blank";
		Constants.actual = branch.getSwitchWindowURL();
		Assert.assertEquals(Constants.actual, Constants.expected);		
	}
	
//	@Test (groups = {"Regression"}, description = "To verify and validate search box field with valid input (text).")
	public void verifySearchBoxWithValidText() {
		LOG.info("Entering valid text on 'Search' textbox in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.enterTextOnSearchBox(PropertyReader.getLocatorValue("branches_search_valid_text"));
		
// To Do write code to assert				
	}
	
	@Test (groups = {"Regression"}, description = "To verify and validate search box field with invalid input (text).")
	public void verifySearchBoxWithInValidText() {
		LOG.info("Entering invalid text on 'Search' textbox in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.enterTextOnSearchBox(PropertyReader.getLocatorValue("branches_search_invalid_text"));
		Constants.expected = "No matching records found";
		Constants.actual = branch.getTextOFBranchesDataTableForInvalidSearch();
		Assert.assertEquals(Constants.actual, Constants.expected);	
	}

//	@Test (groups = {"Regression"}, description = "To verify and validate click on 'Edit' icon on Branches Data Table.")
	public static void verifyClickOnEditIcon() {
		LOG.info("Verifying click on 'Edit' icon of Action column of Bank Data Table in Branches page.");
		Branches branch = new Branches();
		branch.mouseHoverToMasters();
		branch.clickOnBranches();
		branch.clickOnEditIcon();
// To Do write code to assert		
	}

	

	
	
}