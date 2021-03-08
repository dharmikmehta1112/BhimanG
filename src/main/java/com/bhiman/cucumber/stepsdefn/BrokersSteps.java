package com.bhiman.cucumber.stepsdefn;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Brokers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class BrokersSteps {
	Brokers brokers=new Brokers();
	
	@Given("Mouse Hover to master for brokers")
	public void mouse_hover_to_master_for_brokers() {
	    brokers.mouseHoverToMastersForBrokersPage();
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("Verify Brokers option")
	public void verify_brokers_option() {
		Constants.expected = "Brokers";
		Constants.actual = brokers.getTextOfBrokers();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Brokers")
	public void click_on_brokers() {
	    brokers.clickOnBrokers();
	   
	}

	@Then("Verify and validate Brokers URL")
	public void verify_and_validate_brokers_url() {
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testng/brokers.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	    
	}

	@Then("Click on Copy button on brokers")
	public void click_on_copy_button_on_brokers() {
		brokers.clickOnCopyAtBrokersPage();
	}

	@Then("Verify Copy to Clipboard Text")
	public void verify_copy_to_clipboard_text() {
	    System.out.println("Copying");
	}

	@Then("Click on Excel button on brokers")
	public void click_on_excel_button_on_brokers() {
	    brokers.clickOnExcelBtnAtBrokersPage();
	}

	@Then("Verify excel file in path for brokers")
	public void verify_excel_file_in_path_for_brokers() {
		Constants.actual = "Brokers.xlsx";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.xlsx";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}

	@Then("Click on CSV button on brokers")
	public void click_on_csv_button_on_brokers() {
		brokers.clickOnCSVBtnAtBrokersPage();
	}

	@Then("Verify CSV file in path for brokers")
	public void verify_csv_file_in_path_for_brokers() {
		Constants.actual = "Brokers.csv";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.csv";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}

	@Then("Click on PDF button on brokers")
	public void click_on_pdf_button_on_brokers() {
	    brokers.clickOnPDFBtnAtBrokersPage();
	}

	@Then("Verify PDF file in path for brokers")
	public void verify_pdf_file_in_path_for_brokers() {
		Constants.actual = "Brokers.pdf";
		String brokersFilePath = "C:\\Users\\VINITA\\Downloads\\Brokers.pdf";
		File file = new File(brokersFilePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +brokersFilePath);
	}

	@Then("Click on Print button on brokers")
	public void click_on_print_button_on_brokers() {
	    brokers.clickOnPrintBtnAtBrokersPage();
	}

	@Then("Verify Print URL for brokers")
	public void verify_print_url_for_brokers() {
	    System.out.println("Printing");
	}


}
