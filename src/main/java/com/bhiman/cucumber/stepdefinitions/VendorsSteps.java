package com.bhiman.cucumber.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;

import com.bhiman.keywords.Constants;
import com.bhiman.keywords.UIKeywords;
import com.bhiman.pages.masters.VendorsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VendorsSteps {
	VendorsPage vendors=new VendorsPage();
	
	@Given("Mouse Hover to master for vendors")
	public void mouse_hover_to_master_for_vendors() {
	    vendors.mouseHoverToMasters();
	}

	@Given("Verify Vendors option")
	public void verify_vendors_option() {
		Constants.expected = "Vendors";
		Constants.actual = vendors.getTextOfVendors();
		Assert.assertEquals(Constants.actual, Constants.expected);
		
	}

	@Then("Click on Vendors")
	public void click_on_vendors() {
	   vendors.clickOnVendors();
	}

	@Then("Verify and validate Vendors URL")
	public void verify_and_validate_vendors_url() {
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testing/vendor.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Copy button on vendors")
	public void click_on_copy_button_on_vendors() {
	    vendors.clickOnCopyButtonOnVendorsPage();
	    Constants.expected = "Copy to clipboard";
		Constants.actual = vendors.getTextAfterClick();
		Assert.assertEquals(Constants.actual, Constants.expected);	
	}

	@Then("Click on Excel button on vendors")
	public void click_on_excel_button_on_vendors() {
	   vendors.clickOnExcelButtonOnVendorsPage();
	}

	@Then("Verify excel file in path for vendors")
	public void verify_excel_file_in_path_for_vendors() {
		Constants.actual = "Vendors.xlsx";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.xlsx";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	    
	}

	@Then("Click on CSV button on vendors")
	public void click_on_csv_button_on_vendors() {
	    vendors.clickOnCSVButtonOnVendorsPage();
	}

	@Then("Verify CSV file in path for vendors")
	public void verify_csv_file_in_path_for_vendors() {
		Constants.actual = "Vendors.csv";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.csv";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	}

	@Then("Click on PDF button on vendors")
	public void click_on_pdf_button_on_vendors() {
	    vendors.clickOnPDFButtonOnVendorsPage();
	}

	@Then("Verify PDF file in path for vendors")
	public void verify_pdf_file_in_path_for_vendors() {
		Constants.actual = "Vendors.pdf";
		String vendorsFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.pdf";
		File file = new File(vendorsFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +vendorsFilePath);
	}

	@Then("Click on Print button on vendors")
	public void click_on_print_button_on_vendors() {
	    vendors.clickOnPrintButtonOnVendorsPage();
	}

	@Then("Verify Print URL for vendors")
	public void verify_print_url_for_vendors() {
		Constants.expected = "about:blank";
		Constants.actual = vendors.getSwitchWindowURL();
		Assert.assertEquals(Constants.actual, Constants.expected);		
		
	}


}
