package com.bhiman.test.masters;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIAlerts;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.keywords.WaitsInHelp;
import com.bhiman.pages.masters.VendorsPage;
import com.bhiman.test.BaseTest;
import com.bhiman.utility.PropertyReader;

public class VendorsTest extends BaseTest {
	
private static final Logger LOG = Logger.getLogger(VendorsTest.class);
	
//TC-01
	@Test (groups = {"Regression"}, description = "Masters->Vendors: To verify and validate 'Vendors' option in 'Masters'.")
	public void verifyVendorsInMasters() {
		LOG.info("Masters->Vendors: Verify Vendors option in Masters.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		Constants.expected = "Vendors";
		Constants.actual = vendors.getTextOfVendors();
		Assert.assertEquals(Constants.actual, Constants.expected);
		LOG.info("Masters->Vendors: Vendors option available");
	}
	
	//TC-02
	@Test (groups = {"Regression"}, description = "Masters->Vendors: To verify and validate after click action on 'Vendors' option in 'Masters'")
	public void clickOnVendorsInMasters() {
		LOG.info("Masters->Vendors: Verify click on 'Vendors' option in Masters");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testing/vendor.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
		LOG.info("Masters->Vendors: Vendrs Page available");
	}
	
	//TC-03
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate click on 'Copy' button.")
	public void clickOnCopyButton() {	
		LOG.info("Master->Vendors: Verifying click on 'Copy' button in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnCopyButtonOnVendorsPage();
		Constants.expected = "Copy to clipboard";
		Constants.actual = vendors.getTextAfterClick();
		Assert.assertEquals(Constants.actual, Constants.expected);	
		WaitsInHelp.threadSleepInMilliSeconds(2000);
	}
	
	//TC-04
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate click on 'Excel' button.")
	public static void clickOnExcelButton() {
		LOG.info("Master->Vendors: Verifying click on 'Excel' button in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnExcelButtonOnVendorsPage();
		Constants.actual = "Vendors.xlsx";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.xlsx";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	}
	
	//TC-05
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate click on 'CSV' button.")
	public static void clickOnCSVButton() {
		LOG.info("Master->Vendors: Verifying click on 'CSV' button in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnCSVButtonOnVendorsPage();
		Constants.actual = "Vendors.csv";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.csv";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	}

	//TC-06
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate click on 'PDF' button.")
	public static void clickOnPDFButton() {
		LOG.info("Master->Vendors: Verifying click on 'PDF' button in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnPDFButtonOnVendorsPage();
		Constants.actual = "Vendors.pdf";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.pdf";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	}

	//TC-07
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate click on 'Print' button.")
	public static void clickOnPrintButton() {
		LOG.info("Master->Vendors: Verifying click on 'Print' button in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnPrintButtonOnVendorsPage();
		Constants.expected = "about:blank";
		Constants.actual = vendors.getSwitchWindowURL();
		Assert.assertEquals(Constants.actual, Constants.expected);		
		LOG.info("Master->Vendors: Print Preview displayed");
	}
	
	//TC-08
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate search box field with valid input (text).")
	public void searchBoxWithValidText() {
		LOG.info("Master->Vendors: Entering valid text in 'Search' textbox in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.enterTextOnSearchBox(PropertyReader.getLocatorValue("vendors_search_valid_text"));
		LOG.info("Master->Vendors: Searched valid text in 'Search' textbox in Vendors page.");
				
	}
	
	//TC-09
	@Test (groups = {"Regression"}, description = "Master->Vendors: To verify and validate search box field with invalid input (text).")
	public void searchBoxWithInValidText() {
		LOG.info("Master->Vendors: Entering invalid text on 'Search' textbox in Vendors page.");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.enterTextOnSearchBox(PropertyReader.getLocatorValue("vendors_search_invalid_text"));
		Constants.expected = "No matching records found";
		Constants.actual = vendors.getTextOFVendorsDataTableForInvalidSearch();
		Assert.assertEquals(Constants.actual, Constants.expected);	
		
	}

	//TC-10
	@Test(groups = {"Regression"}, description = "To verify Add Vendor form appearance.")
	public void verifyAddBrokerForm() {
		LOG.info("Master->Vendors: Filling Add Vendor form");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnAddVendorButton();
		Constants.expected="http://103.50.162.196/testing/vendor.php#";
		Constants.actual=UIKeywords.getPageUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
		LOG.info("Masters->Vendors->Add Vendor form appearing properly");
	}
	
	//TC-11
	@Test(groups = "Regression", description = "To fill Add Vendor form using sendkeys.")
	public void fillAddVendorForm() {
		LOG.info("Master->Vendors: Filling Add Vendor form");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnAddVendorButton();
		vendors.fillAddVendorFormWithData();
		vendors.clickOnSubmitBtn();
		Constants.expected = "Vendor Added.";
		Constants.actual = Constants.driver.findElement(By.xpath("//div[contains(text(),\"Vendor Added.\")]")).getText();
		Assert.assertEquals(Constants.actual, Constants.expected);
		
	}
	
	//TC-12
	@Test(groups = "Regression", description = "To Cancel filled Add Vendor form.")
	public void fillAddVendorFormCancelation() {
		LOG.info("Master->Vendors: Filling Add Vendor form");
		VendorsPage vendors = new VendorsPage();
		vendors.mouseHoverToMasters();
		vendors.clickOnVendors();
		vendors.clickOnAddVendorButton();
		vendors.fillAddVendorFormWithData();
		vendors.clickOnCancelButton();
		Constants.expected="Are you sure you want to reset the fields ?";
		Constants.actual=UIAlerts.getTextFromAlert();
		Assert.assertEquals(Constants.actual, Constants.expected);
		UIAlerts.acceptAlert();
		WaitsInHelp.threadSleepInMilliSeconds(2000);
		LOG.info("Form Canceled");
	}

}
