package com.bhiman.cucumber.stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.testng.Assert;

import com.bhiman.main.Constants;
import com.bhiman.main.UIKeywords;
import com.bhiman.main.masters.Banks;
import com.bhiman.main.utility.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BanksSteps {
	
	Banks banks = new Banks();
	
	@Given("Mouse Hover to master for banks")
	public void mouse_hover_to_master_for_banks() {
		Banks banks = new Banks();
		banks.mouseHoverToMasters();
	}

	@Given("Verify Banks option")
	public void verify_banks_option() {
		Banks banks = new Banks();
		Constants.expected = "Banks";
		Constants.actual = banks.getTextOfBanks();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Banks")
	public void click_on_banks() {
		banks.clickOnBanks();
	}

	@And("Verify Banks URL for banks")
	public void verify_banks_url() {
		Constants.actual = UIKeywords.getPageUrl();
		Constants.expected = "http://103.50.162.196/testng/bank.php";
		Assert.assertEquals(Constants.actual, Constants.expected);
	}

	@Then("Click on Copy button for banks")
	public void click_on_copy_button_for_banks() {
		banks.clickOnCopyButton();
	}
	
	@Then("Click on Excel button for banks")
	public void click_on_excel_button_for_banks() {
		banks.clickOnExcelButton();
	}

	@Then("Click on CSV button for banks")
	public void click_on_csv_button_for_banks() {
		banks.clickOnCSVButton();
	}

	@Then("Click on PDF button for banks")
	public void click_on_pdf_button_for_banks() {
		banks.clickOnPDFButton();
	}

	@Then("Click on Print button for banks")
	public void click_on_print_button_for_banks() {
		banks.clickOnPrintButton();
	}
	
	@Then("Verify copy text as {String} for banks")
	public void verify_copy_text_as_text_for_banks(String text) {
		Constants.expected = text;
		Constants.actual = banks.getTextAfterClick();
		Assert.assertEquals(Constants.actual, Constants.expected);		
	}
	
	@Then("Verify excel file in path for banks")
	public void verify_excel_file_in_path_for_banks() {
		Constants.actual = "Banks.xlsx";
		String filePath = PropertyReader.getLocatorValue("banks_download_filePath")+".xlsx";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Then("Verify CSV file in path for banks")
	public void verify_csv_file_in_path_for_banks() {
		Constants.actual = "Banks.csv";
		String filePath = PropertyReader.getLocatorValue("banks_download_filePath")+".csv";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);
	}

	@Then("Verify PDF file in path for banks")
	public void verify_pdf_file_in_path_for_banks() {
		Constants.actual = "Banks.pdf";
		String filePath = PropertyReader.getLocatorValue("banks_download_filePath")+".pdf";
		File file = new File(filePath);
		Constants.flag = file.exists();
		assertTrue(Constants.flag, "File name: " +Constants.actual+ " is not downloaded at location: " +filePath);	 
	}

	@Then("Verify Print URL for banks")
	public void verify_print_url_for_banks() {
		Constants.expected = "about:blank";
		Constants.actual = banks.getSwitchWindowURL();
		Assert.assertEquals(Constants.actual, Constants.expected);
	}


}